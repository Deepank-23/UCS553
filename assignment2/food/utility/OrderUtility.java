package food.utility;

import food.service.Discountable;
import food.model.FoodOrder;
public class OrderUtility {
    public static boolean validateAmount(double amount) {
        return amount >0;
    }

    public static boolean validatecustomername(String name){
        return name !=null && !name.trim().isEmpty();
    }

    public static void generateordersummary(FoodOrder order){
        double discount = (order instanceof Discountable) ? ((Discountable)order).applydiscount():0.0;
        double deliverycharge  = order.calculatedeliverycharge();
        double finalamount = order.getamount()-discount +deliverycharge;

        System.out.println("Orderid:"+order.getorderid());
        System.out.println("customer:" + order.getcustomername());
        System.out.println("bill amount" + order.getamount());
        System.out.println("discount:" + discount);
        System.out.println("Delivery charge :" + deliverycharge);
        System.out.println("Final Payable: " + finalamount);
        System.out.println("-----------------------------------");
    }

}
