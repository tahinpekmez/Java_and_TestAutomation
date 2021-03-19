List<WebElement> rows = driver.findElements(By.tagName("tr"));
driver.findElement(By.xpath("//tbody/tr[" + (rows.size()-1) + "]/td/following-sibling::td/div//*[@onclick='return deleteConfirm();']")).click();
driver.switchTo().alert().accept();
        
List<WebElement> rowsAfterDelete = driver.findElements(By.tagName("tr"));
		
		// Check precense of "deletedElement"
if (driver.findElement(By.xpath("//tbody/tr["+ (rowsAfterDelete.size()-1)+"]/td/following-sibling::td[2]")).getText() != "elementIsDeleted") {
	Assert.assertTrue(true);
	}
}
