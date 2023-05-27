import java.math.RoundingMode;  
import java.text.DecimalFormat;  

/**
 * @author
 */

public class ShoppingItem {
    
    private String name;

    private final int ID;
    
    private double price;

    private int stock;

    private static int count;

    private double roundToTwo(double num){
        DecimalFormat decfor = new DecimalFormat("0.00");
        return Double.parseDouble(decfor.format(num));
    
    
    }



    public ShoppingItem(String n, double p, int id){

        name = n;
        price = roundToTwo(p);
        this.ID = id;
        count++;

    }

    public void applyDeduction(double prcnt){
        double newPrice = (1-prcnt)*this.price;

        this.price = newPrice;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){

        return price;

    }

    public int getStock(){

        return stock;

    }

    public void setStock(int stock){
        if (stock >= 0){
            this.stock = stock;
        }
        
    }

    public void setName(String name){
        if(name != null){

            this.name = name;

        }
        
    }

    public void setPrice(double p){
        if (p>=0){
            price = roundToTwo(p);
        }
        
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString(){

        return name +" (ID: "+ ID +"):"+" costs Php "+ price +
               " and has " + stock + " in stock.";

    }

    public void accessAllowed(){
        System.out.println("Access is allowed");
    }


}
