package presence;

import org.testng.Assert; // Just for adding the code in below, to your project

public class IsElementPresence{

   boolean isELementPresenceText = true;
    public void isElementPresentOnPage(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).getText();

        } catch (java.util.NoSuchElementException e) {
            isELementPresenceText = false;
            Assert.assertFalse("the element is not here, This will succeed.",isELementPresent);
        }

    }
    boolean isELementPresenceXpath = true;
    public void isElementPresentOnPageXpath(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));

        } catch (java.util.NoSuchElementException e) {
            isELementPresenceText = false;
            Assert.assertFalse("the element is not here, This will succeed." ,isELementPresentXpath);
        }

    }
