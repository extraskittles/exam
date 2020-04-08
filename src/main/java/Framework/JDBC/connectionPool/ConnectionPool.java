package Framework.JDBC.connectionPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionPool {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream is = ConnectionPool.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        connection.close();
        System.out.println(11);
    }
}
