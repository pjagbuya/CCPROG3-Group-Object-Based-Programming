import java.util.Scanner;

public class MainDriver
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String uni = "Animo La Salle";
        ShoppingItem SI2 = new ShoppingItem("PSP", 2199.99, 16);
        ShoppingItem SI3 = new ShoppingItem("PSP", 2199.99, 17);
        ShoppingItem SI4 = new ShoppingItem("PSP", 2199.99, 18);
        ShoppingItem SI = new ShoppingItem("PSP", 2199.99, 15);
        double priceInput;       


        System.out.println("HELLO WORLD!!!");
        SI.accessAllowed();
        System.out.println(SI.getCount());
        System.out.println(SI.getName());
        System.out.println(SI.getPrice());
        System.out.println(SI.getStock());

        System.out.print("Change the Value of Price: ");
        priceInput = sc.nextDouble();
        SI.setPrice(priceInput);
        SI.applyDeduction(0.2);

        System.out.println(SI.toString());


        sc.close();
    }
}