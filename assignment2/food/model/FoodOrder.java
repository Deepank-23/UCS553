package food.model;

public abstract class FoodOrder {
    private int orderid;
    private String customername;
    private double amount;
    protected static String restaurantname;
    private static int ordercount = 0;
    
    public FoodOrder(int orderid,String customername, double amount){
        this.orderid = orderid;
        this.customername = customername;
        this.amount = amount;
        ordercount++;
    }

    public int getorderid() {return orderid;}
    public String getcustomername() {return customername;}
    public double getamount() {return amount; }

    public void setAmount(double amount ){ this.amount = amount;}
    public void setcustomername( String customername){ this.customername = customername;}

    public static int gettotalorder(){
        return ordercount;
    }
    public abstract double calculatedeliverycharge();
}
