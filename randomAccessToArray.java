	List <WebElement> cargoOptions = driver.findElements(By.xpath("//*[@class='cargoOptions']/div/div"));
	int lengthOfCargoList = cargoOptions.size();

	ArrayList <WebElement> costBiggerZero = new ArrayList<>();
	for (int j = 1; j<=lengthOfCargoList; ++j){
		if(formattedCost("//*[@class='cargoOptions']/div/div["+j+"]//span[2]")>0.00){
			costBiggerZero.add(findElementByXpath("//*[@class='cargoOptions']/div/div["+j+"]"));
		}
	}

	int lengthOfCostBiggerZero = costBiggerZero.size();

	if(lengthOfCostBiggerZero == 1){
		costBiggerZero.get(0).click();
	}else if(lengthOfCostBiggerZero > 1) {
		costBiggerZero.get(index(lengthOfCostBiggerZero)).click();
	}
