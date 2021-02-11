   package List;
   
   import org.openqa.selenium.*;
   import org.testng.Assert;
   import java.util.List;

   
   public class ListExample{
   
   protected void checkTextInList(String xpath, String text) {
        boolean listEqualsText = false;
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        for (WebElement element : elements) {
            if (element.getText().contains(text)) listEqualsText = true;
        }
        assertTrue(listEqualsText);
    }
  }
  
  /* 
    NOTE: "for (WebElement element : elements)" is smilar to for(auto y : x) loop in C++
    but in here, "for (WebElement &element : elements)" can not be written like for(auto &y : x) in C++, because Java has not the feature which is pass by reference 
  */
