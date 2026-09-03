package food;
import food.model.FoodOrder;
import food.service.PremiumOrder;
import food.service.RegularOrder;
import food.utility.OrderUtility;

public class Main {
    public static void main(String[] args){
        FoodOrder[] orders = new FoodOrder[6];
        orders[0] = new RegularOrder(1, "Alice", 500);
        orders[1] = new PremiumOrder(2, "Bob", 1000);
        orders[2] = new RegularOrder(3, "Charlie", 750);
        orders[3] = new PremiumOrder(4, "Diana", 1200);
        orders[4] = new RegularOrder(5, "Eve", 300);
        orders[5] = new PremiumOrder(6, "Frank", 2000);

        for (FoodOrder order : orders) {
            OrderUtility.generateordersummary(order);
        }

        System.out.println("Total Orders: " + FoodOrder.gettotalorder());
    }
    
}
