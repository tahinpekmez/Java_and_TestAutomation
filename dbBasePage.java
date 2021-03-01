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
