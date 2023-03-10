package Exercise9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
    public DBUtility() {}

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    public static Connection getConnection() {
        Connection connection = threadLocal.get();
        
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST","root","*password*");
                connection.setAutoCommit(false);
                threadLocal.set(connection);
                return connection;
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                return null;
            }
        }
        else {
            return connection;
        }
    }

    public static void closeConnection(Exception exception) {
        Connection connection = threadLocal.get();

        if(connection != null) {
            try {
                if(exception == null)
                    connection.commit();
                else
                    connection.rollback();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                threadLocal.remove();
            }
        }
    }
}