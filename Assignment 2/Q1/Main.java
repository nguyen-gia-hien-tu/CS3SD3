import java.util.Scanner;

public class Main {
  private static int numCookies;
  private static int numCola;
  private static int numCookiesBackup;
  private static int numColaBackup;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of cookies: ");
    numCookies = in.nextInt();
    numCookiesBackup = numCookies;
    System.out.print("Enter the number of cola: ");
    numCola = in.nextInt();
    numColaBackup = numCola;

    checkInput(in);

    in.close();
  }

  public static void printCookieCola() {
    System.out.println("The number of cookies in the cookie dispenser is: " + numCookies);
    System.out.println("The number of cola in the cola dispenser is: " + numCola);
  }

  public static void checkInput(Scanner scanner) {
    System.out.println("You have the following options for philosopher: think (1), get cookie (2), get cola (3)");
    System.out.print("Please enter the number correspond to the action you want to choose: ");
    int option = scanner.nextInt();
  
    while (option != 1 && option != 2 && option != 3) {
      System.out.print("The philosopher does not have the action that you entered. Please enter the valid number: ");
      option = scanner.nextInt();
    }

    if (option == 1) {
      thinkingState(scanner);
    } else if (option == 2) {
      cookieState(scanner);
    } else if (option == 3) {
      colaState(scanner);
    }
  }

  public static void thinkingState(Scanner scanner) {
    System.out.println();
    printCookieCola();
    System.out.println("The philosopher is currently thinking");
  
    printCookieCola();
    checkInput(scanner);
  }

  public static void cookieState(Scanner scanner) {
    System.out.println();
    printCookieCola();

    if (numCookies == 0) {
      System.out.println("The servant is refilling the cookie dispenser");
      numCookies = numCookiesBackup;
      printCookieCola();
    }
    
    System.out.println("The philosopher is getting cookie");
    System.out.println("The philosopher is eating cookie");
    numCookies--;
    printCookieCola();

    checkInput(scanner);
  }

  public static void colaState(Scanner scanner) {
    System.out.println();
    printCookieCola();

    if (numCola == 0) {
      System.out.println("The servant is refilling the cola dispenser");
      numCola = numColaBackup;
      printCookieCola();
    }
    
    System.out.println("The philosopher is getting cola");
    System.out.println("The philosopher is drinking cola");
    numCola--;
    printCookieCola();

    checkInput(scanner);
  }

}