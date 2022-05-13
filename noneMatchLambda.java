        List<WebElement> firstPageProductTitle = driver.findElements(By.xpath("//*[@class='productName detailUrl']/a"));
        ArrayList<String> detail = new ArrayList<>();

        for (WebElement title : firstPageProductTitle) {
            detail.add(title.getText());
        }
        Stream <Object> a = Arrays.stream(detail.toArray());
        Assert.assertTrue(a.noneMatch(s -> s.equals("test list")));
