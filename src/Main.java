import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Enter your name: ");
        String custName = scan.nextLine();
        System.out.println("Enter your address: ");
        String custaddress = scan.nextLine();
        System.out.println("Enter your cash on hand: ");
        int custCashOnHand = scan.nextInt();
        System.out.println("Congrats you got a bonus of 500!!!");

        Customer cust = new Customer(custName,custaddress,custCashOnHand);

        System.out.println("Your cash on hand: " +cust.getCashOnHand()+"\n\n");

        System.out.println("Vehicles list: ");
        System.out.println("1. Honda Accord - 17000");
        System.out.println("2. BMW M3 - 25000");

        System.out.println("Enter your choice you want to buy: ");
        int ch = scan.nextInt();

        System.out.println("Do you want to take a loan (true/false): ");
        boolean finance = scan.nextBoolean();
        switch (ch){
            case 1:
                Vehicle veh1 = new Vehicle("Honda","Accord",17000);
                cust.purchaseCar(veh1,emp,finance);
                break;
            case 2:
                Vehicle veh2 = new Vehicle("BMW","M3",25000);
                cust.purchaseCar(veh2,emp,finance);
                break;
            default:
                System.out.println("Enter a valid input");
        }

      //  Vehicle veh = new Vehicle("Honda","Accord",17000);



        }
    }
