package Framework.Mybatis.TypeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTypeHandler extends BaseTypeHandler<String[]> {


    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        StringBuffer stringBuffer = new StringBuffer();
        for(String str:strings){
            stringBuffer.append(str).append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        preparedStatement.setString(i,stringBuffer.toString());
    }

    public String[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        if(string==null){
            return null;
        }
        String[] strings = string.split(",");
        return strings;
    }

    public String[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return new String[0];
    }

    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return new String[0];
    }
}
