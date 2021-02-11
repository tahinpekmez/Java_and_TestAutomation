        package parse;
        
        import org.openqa.selenium.WebElement;  // Just for adding the code to your project. 
        
        public class PaseString{
            public parse(){
        
        String totalCost = findElementByXpath("//*[@id='divSiparisTutarOzet']//*[@id='divToplamOdeme']").getText().substring(1).replace(",", ".");
        double totalCostDouble = Double.parseDouble(totalCost);
        double percentageCost = (totalCostDouble/10)*2;
        System.out.println(percentageCost);
        }
      }
