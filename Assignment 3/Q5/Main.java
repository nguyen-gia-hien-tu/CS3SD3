import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String contAnswer;
    String customerType;
    int MT;
    int ticket = 0;
    int serve;

    System.out.print("Enter the number of tickets (MT): ");
    MT = scanner.nextInt();
    
    while (true) {
      System.out.print("Do you want to continue the program (Y/N)? ");
      contAnswer = scanner.next();
      if (contAnswer.equals("N")) {
        break;
      }
      
      ticket = ticket % MT + 1;
      System.out.println("The counter is now serving customer with ticket " + ticket);
      do {
        System.out.print("Enter the type of the customer (Bold/Meek): ");
        customerType = scanner.next();
      } while (!customerType.equals("Bold") && !customerType.equals("Meek"));
      System.out.print("Enter the ticket number the customer has: ");
      serve = scanner.nextInt();
      while (ticket != serve) {
        if (1 <= serve && serve <= MT)
          System.out.println("It is not your turn!");
        else
          System.out.println("There is no such ticket number!");
        
        System.out.print("Enter the type of the customer (Bold/Meek): ");
        customerType = scanner.next();
        System.out.print("Enter the ticket number the customer has: ");
        serve = scanner.nextInt();
      }

      System.out.println("Customer with ticket number " + ticket + " is served");
    }

    scanner.close();
  }
}
