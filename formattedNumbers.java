    public double doubleFormattedCost(WebElement element){
        DecimalFormat df = new DecimalFormat("#.#");
        String testProductCost = element.getText().substring(1).replace(",", ".");
        Double doubleTestProductCost = Double.parseDouble(testProductCost);
        String formattedTestProductCost = df.format(doubleTestProductCost);
        return Double.parseDouble(formattedTestProductCost);
    }
