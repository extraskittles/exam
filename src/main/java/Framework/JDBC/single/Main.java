package Framework.JDBC.single;


import java.sql.*;

public class Main {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/ssm?serverTimezone=GMT";
    private static final String userName  = "root";
    private static final String password= "root";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(dbUrl, userName, password);
        String sql="SELECT * FROM account where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,36);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }
        preparedStatement.close();
        connection.close();
    }
}
