package food.service;

import food.model.FoodOrder;


public class RegularOrder extends FoodOrder implements Discountable {
    public RegularOrder(int orderid,String customername ,double amount){
        super(orderid,customername,amount);
    }
    
  
    public double calculatedeliverycharge(){
        return 80;
    }


    public double applydiscount(){
        return getamount()*0.1;
    }
}


