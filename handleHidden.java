public void hiddenElementClick(WebElement element){
    ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", element);
}
