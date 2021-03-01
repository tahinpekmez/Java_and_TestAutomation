// DOM Load
// LAMBDA = parameter -> expression       
wait.until(webDriver ->
                ((JavascriptExecutor)webDriver)
                        .executeScript("return document.readyState")
                        .equals("complete"));

// Ajax Load
// LAMBDA = parameter -> expression
        wait.until((ExpectedCondition<Boolean>) driver ->
                driver.findElements(By.cssSelector(".waiting, .tb-loading"))
                        .size() == 0);
