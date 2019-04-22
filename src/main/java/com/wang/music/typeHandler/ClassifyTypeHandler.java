package com.wang.music.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 王念
 * @create 2019-04-19 20:35
 * 类型转换器 Java:classify[]=>Mysql:varchar
 */
public class ClassifyTypeHandler implements TypeHandler<String[]> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        StringBuffer buffer=new StringBuffer();
        for (String string : strings) {
            buffer.append(string);
            buffer.append(",");
        }
        //去掉最后一个逗号
        buffer.deleteCharAt(buffer.length()-1);
        preparedStatement.setString(i,buffer.toString());

    }

    @Override
    public String[] getResult(ResultSet resultSet, String s) throws SQLException { ;
        return s.split(",");
    }

    @Override
    public String[] getResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i).split(",");
    }

    @Override
    public String[] getResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i).split(",");
    }
}
