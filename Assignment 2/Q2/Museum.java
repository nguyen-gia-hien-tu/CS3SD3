import java.util.Scanner;

public class Museum {
  protected static Director director = new Director();
  protected static Control control = new Control();
  public static void main(String[] args) {
    director.openEast();
    director.openWest();

		checkInput();
  }

  public static void checkInput() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("You have the following options: Visitor Enter (1), Visitor Exit (2), Closing Time (3): ");
    int option = scanner.nextInt();

    while (option != 1 && option != 2 && option != 3) {
      System.out.println("There is no option that you entered. Please enter a valid option: ");
      option = scanner.nextInt();
    }

    if (option == 1) {
      visitorEnter();
    } else if (option == 2) {
      visitorExit();
    } else {
      closingTime();
    }

    scanner.close();
  }

  public static void visitorEnter() {
    System.out.println();
		if (director.isEastOpen()) {
    	System.out.println("A visitor entered");
			control.visitorEnter();
    	System.out.println("The number of visitors inside the museum is " + control.getNumVisitors());
		} else {
			System.out.println("East Door is closed, cannot enter");
		}
  
    checkInput();
  }

  public static void visitorExit() {
    System.out.println();
    if (control.getNumVisitors() == 0) {
      System.out.println("The museum is empty. No more visitors to exit");
      checkInput();      
    } else {
			System.out.println("A visitor exited");
      control.visitorExit();
      System.out.println("The number of visitors inside the museum is " + control.getNumVisitors());
			if (control.getNumVisitors() == 0 && !director.isEastOpen()) {
				System.out.println("The museum is now empty and it's closing time");
				director.closeWest();
				System.out.println("The system finished");
			} else {
				checkInput();
			}			
    }
    
  }

  public static void closingTime() {
		System.out.println();
		System.out.println("Closing Time. Only Permit Exit");
    director.closeEast();
		if (control.getNumVisitors() == 0) {
			System.out.println("The number of visitors inside the museum is " + control.getNumVisitors());
			System.out.println("The museum is now empty and it's closing time");
			director.closeWest();
			System.out.println("The system finished");
		} else {
			checkInput();
		}
  }
}