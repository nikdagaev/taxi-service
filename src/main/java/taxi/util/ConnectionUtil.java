package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.service.CarServiceImpl;

public class ConnectionUtil {
    private static final String URL =
            "jdbc:mysql://localhost:3306/taxi?useUnicode=true&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "nikita199";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final Logger logger = LogManager.getLogger(ConnectionUtil.class);

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            logger.error("Can't find an SQL Driver {}", JDBC_DRIVER);
            throw new RuntimeException("Can't find an SQL Driver", e);
        }
        logger.info("SQL Driver {} was found", JDBC_DRIVER);

    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            logger.error("Can't create connection to DB by URL {}", URL);
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
