// char iteration on web with selenium in java

Actions actions = new Actions(driver);
List<WebElement> text = driver.findElements(By.cssSelector(codeLine));
for (WebElement row : text) {
    sleep(1);
    actions.click(row).build().perform();
    sleep(1);
    CharacterIterator characterIterator = new StringCharacterIterator(row.getText());
    while (characterIterator.next() != CharacterIterator.DONE) {
        Thread.sleep(20);
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
    }
}
