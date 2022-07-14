package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库管理工具类
 * */
public class DBUtils {

    // 加载驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://182.61.50.41:3306/study";
        Connection connection = DriverManager.getConnection(url, "yjc", "WHOAMIyjc888**");
        return connection;
    }

    // 关闭资源
    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {

        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }

    }
}


