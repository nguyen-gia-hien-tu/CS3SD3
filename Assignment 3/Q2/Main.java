import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numPumps = 2;
    int numCustomers = 3;
    int gasAmount;
    int customerPay;

    System.out.println("*****************GAS STATION*****************");
    for (int i = 1; i <= 2; i++) {
      System.out.println("Vehicle " + i + " is entering the station");
      System.out.print("How much is the gas (in integer)? ");
      gasAmount = scanner.nextInt();
      System.out.print("How much did the customer pay? ");
      customerPay = scanner.nextInt();
      if (gasAmount != customerPay) {
        System.out.println("The customer did not pay the correct amount!");
        System.out.println("The program terminates!");
        break;
      } else {
        System.out.println("The vehicle is being filled with gas.");
        System.out.println("Filling gas done. The customer left.");
      }
    }
  }
}