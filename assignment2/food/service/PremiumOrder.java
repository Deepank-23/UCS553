package food.service;
import food.model.FoodOrder;
public class PremiumOrder extends FoodOrder implements Discountable{
    public PremiumOrder(int orderid,String customername,double amount){
        super (orderid,customername,amount);
    }
    public double calculatedeliverycharge(){
        return 40;
    }

    public double applydiscount(){
        return getamount() *0.20;

    }
}

