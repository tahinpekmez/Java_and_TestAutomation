package presence;

import org.testng.Assert;

public class IsElementPresence{

   boolean isELementPresenceText = false;
    public void isElementPresentOnPage(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).getText();

        } catch (java.util.NoSuchElementException e) {
            Assert.assertFalse("the element is not here, This will succeed.",isELementPresent);
        }

    }
    boolean isELementPresenceXpath = false;
    public void isElementPresentOnPageXpath(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));

        } catch (java.util.NoSuchElementException e) {
            Assert.assertFalse("the element is not here, This will succeed." ,isELementPresentXpath);
        }

    }
