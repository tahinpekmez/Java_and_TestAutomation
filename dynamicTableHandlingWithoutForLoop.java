// DYNAMIC WebElement Handling and Assertation of multiple thing without for loop

List <WebElement> webElementProductInfo = driver.findElements(By.xpath("//div/div[@class='controls']"));
int sizeOfList = webElementProductInfo.size();
for(int i =1; i<sizeOfList; ++i){
	String productInfo =driver.findElement(By.xpath("//div["+i+"]/div[@class='controls']")).getText();
	switch (i){
		case 1:
			Assert.assertEquals(productInfo, "str_1");
			break;
		case 2:
			Assert.assertEquals(productInfo, "str_2");
			break;
		case 3:
			Assert.assertEquals(productInfo, "str_3");
	}
}