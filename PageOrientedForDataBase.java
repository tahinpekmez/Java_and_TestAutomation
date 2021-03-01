// BASE PAGE
package MySQL;
import org.openqa.selenium.WebDriver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class BasePageQueries {
    Connection conn = null;
    Statement stmt = null;
    ResultSet resultSet = null;
    WebDriver driver;
    String dataBaseUrl = "jdbc:mysql://x.x.x.x";
    String dataBaseUserName = "userName";
    String dataBasePassword = "passWord";
    public PreparedStatement preparedStatement;
}

// BASE TEST
package MySQL;
import static org.testng.Assert.assertEquals;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.sql.SQLException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTestsDeleteQueries extends BasePageQueries{
    
    @BeforeTest
    public void SetUpConnection() throws SQLException, ClassNotFoundException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(dataBaseUrl, dataBaseUserName, dataBasePassword);

    }

    @AfterTest
    public void CloseTheConnection()  {

        // Code to close each and all Object related to Database connection
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }

        driver.quit();
    }

}

// TEST
package MySQL;
import org.testng.annotations.Test;
import java.sql.SQLException;
public class QueriesTests extends BaseTestsDeleteQueries {
    @Test
    public void DeleteBasket() {
        // Execute a query
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void DeleteBasketV7(){
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void DeleteCampaign() {
        // Execute a query
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void DeleteCampaignV7(){
        // Execute a query
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void DeleteMoneyPoint() {
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void DeleteMoneyPointV7() {
        try {
            String query = "QUERy";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void UpdateTestProduct1() {
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void UpdateTestProduct2() {
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void UpdateTestProduct3() {
        try {
            String query = "QUERY";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
