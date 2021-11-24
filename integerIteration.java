        List <WebElement> activeCampaigns = driver.findElements(By.xpath(xpath"));
        int lengthList = activeCampaigns.size();
        IntStream stream = IntStream.range(0, lengthList);
        int [] index = stream.toArray();
        for(int ignored : index){
            sleep(100L);
            scrollToElementByXpath("xpath");
            clickElementByXpath("xpath");
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("xpath")), "İşlem yapıldı."));
        }
