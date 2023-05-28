import java.util.Scanner;

public class Pageant {
    public static void main(String[] args) {
        Contestant[] contestants = new Contestant[5];
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 0; i < contestants.length; i++) {
            System.out.print("Input name of contestant #" + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Input the country of contestant #" + (i + 1) + ": ");
            String country = sc.nextLine();
            System.out.print("Input the age of contestant #" + (i + 1) + ": ");
            int age = Integer.parseInt(sc.nextLine());

            contestants[i] = new Contestant(name, country, age);
        }

        System.out.print("Enter talent 1 for the first contestant: ");
        String talent1 = sc.nextLine();
        System.out.print("Enter talent 2 for the first contestant: ");
        String talent2 = sc.nextLine();

        contestants[0].addTalent(talent1);
        contestants[0].addTalent(talent2);

        System.out.println("Can the first contestant compete in singing? " + contestants[0].canCompete(25));
        
        sc.close();
    }
}
