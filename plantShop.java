package PlantShop;
import java.util.Scanner;

public class plantShop {
    public static void main(String[]args) {
        int loop = 1, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Plant Shop");
        while (loop == 1) {
            System.out.println("**Menu**");
            System.out.println("1. Dandelion");
            System.out.println("2. Cactus");
            System.out.println("3. Rose");
            System.out.println("4. Daisy");
            System.out.println("5. Sunflower");
            System.out.println("6. Checkout");
            int choice, amount, size;
            System.out.print("\nEnter number of item you want to buy:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Price: S=$2, M=$3, L=$5");
                System.out.print("please choose the size(1=S, 2=M, 3=L):");
                size = sc.nextInt();
                System.out.print("Enter quantity of item:");
                amount = sc.nextInt();
                if (size == 1) {
                    sum = sum + 2 * amount;
                }
                else if (size == 2) {
                    sum = sum + 3 * amount;
                }
                else if (size == 3 ){
                    sum = sum + 5 * amount;
                }
                else{
                    System.out.println("Unknown Commands.");
                }
            }
            else if (choice == 2) {
                System.out.println("Price: S=$3, M=$5, L=$7");
                System.out.print("please choose the size(1=S, 2=M, 3=L):");
                size = sc.nextInt();
                System.out.print("Enter quantity of item:");
                amount = sc.nextInt();
                if (size == 1) {
                    sum = sum + 3 * amount;
                }
                else if (size == 2) {
                    sum = sum + 5 * amount;
                }
                else if (size == 3 ){
                    sum = sum + 7 * amount;
                }
                else{
                    System.out.println("Unknown Commands.");
                }
            }
            else if (choice == 3) {
                System.out.println("Price: S=$1, M=$2, L=$3");
                System.out.print("please choose the size(1=S, 2=M, 3=L):");
                size = sc.nextInt();
                System.out.print("Enter quantity of item:");
                amount = sc.nextInt();
                if (size == 1) {
                    sum = sum + 1 * amount;
                }
                else if (size == 2) {
                    sum = sum + 2 * amount;
                }
                else if (size == 3 ){
                    sum = sum + 3 * amount;
                }
                else{
                    System.out.println("Unknown Commands.");
                }
            }
            else if (choice == 4) {
                System.out.println("Price: S=$1, M=$2, L=$4");
                System.out.print("please choose the size(1=S, 2=M, 3=L):");
                size = sc.nextInt();
                System.out.print("Enter quantity of item:");
                amount = sc.nextInt();
                if (size == 1) {
                    sum = sum + 1 * amount;
                }
                else if (size == 2) {
                    sum = sum + 2 * amount;
                }
                else if (size == 3 ){
                    sum = sum + 4 * amount;
                }
                else{
                    System.out.println("Unknown Commands.");
                }
            }
            else if (choice == 5) {
                System.out.println("Price: S=$4, M=$8, L=$12");
                System.out.print("please choose the size(1=S, 2=M, 3=L):");
                size = sc.nextInt();
                System.out.print("Enter quantity of item:");
                amount = sc.nextInt();
                if (size == 1) {
                    sum = sum + 4 * amount;
                }
                else if (size == 2) {
                    sum = sum + 8 * amount;
                }
                else if (size == 3 ){
                    sum = sum + 12 * amount;
                }
                else{
                    System.out.println("Unknown Commands.");
                }
            }
            else if (choice == 6){
                System.out.println("Exiting");
                loop = 0;
            }
            else{
                System.out.println("Unknown commands, please try again.");
            }

            if (loop!=0){
                System.out.println("Current price = $" + sum);
            }
        }
        System.out.println("Total price = $" + sum);
        sc.close();
    }
}
