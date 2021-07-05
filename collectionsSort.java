            productMethods = new ProductMethods(driver);
            
            List<WebElement> costs = driver.findElements(By.xpath("xpath"));
            ArrayList<Double> productCost = new ArrayList<>();
            
            for (WebElement money : costs) {
                productCost.add(productMethods.doubleFormattedCost(money));
            }

            Collections.sort(productCost);
            Assert.assertEquals(productMethods.doubleFormattedCost("xpath"), productCost.get(0));

            if (findElementByXpath("//*[@selected='selected']").getText().equals("Fiyata Göre (Önce En Düşük)")) {
                Assert.assertTrue(true);
