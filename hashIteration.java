List <WebElement> options = driver.findElements(By.xpath("enter the xpath which you should"));
ArrayList <String> values = new ArrayList<>();

for(WebElement stringValues : options){
    values.add(stringValues.getText());
}

Iterator <String> itr = values.iterator();

while (itr.hasNext()){

    Select select = new Select(driver.findElement(By.id("enter the id")));
    select.selectByVisibleText(itr.next());
