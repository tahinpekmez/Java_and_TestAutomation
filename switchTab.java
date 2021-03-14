
    protected void switchToTab(int index) {
        
            waitForNewWindow(driver, 10);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0)).close();
            driver.switchTo().window(tabs.get(index));
        }