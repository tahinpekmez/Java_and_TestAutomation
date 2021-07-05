        double totalDiscountOnBasket = Precision.round(formattedCost("xpath",2,7), 2); // substring method has been embedded 
        double precisionDiscountOnBasket = Precision.round(totalDiscountOnBasket, 2);
        double totalDiscount = discountCost1st + discountCost2nd + discountCost3rd;
        double precisionTotalDiscount = Precision.round(totalDiscount, 2);

        double totalCost = (cost1st + cost2nd + cost3rd) - totalDiscount;
        double basketTotalCost = formattedCost("xpath", 0, 6); // substring method has been embedded 
        if(precisionDiscountOnBasket - precisionTotalDiscount <= Math.abs(0.1)){
            Assert.assertTrue(true);
        }
        if(totalCost - basketTotalCost <= Math.abs(0.1)){
            Assert.assertTrue(true);
        }
