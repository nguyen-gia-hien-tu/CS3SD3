import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE RADIO SYSTEM");
        System.out.println("The following actions correspond with the following numbers:");
        System.out.println("on = 1, off = 2, reset = 3, scan = 4, lock = 5, end = 6, quit = 7");
        System.out.println();

        offState(scanner);

        scanner.close();

        /**
        FSP for the radio system in question 3:

        RADIO = OFF,
        OFF = (on -> TOP),
        TOP = (off -> OFF
              |reset -> TOP
              |scan -> SCANNING),
        SCANNING = (off -> OFF
                   |reset -> TOP
                   |lock -> STATION
                   |end -> BOTTOM),
        STATION = (off -> OFF
                  |reset -> TOP
                  |scan -> SCANNING),
        BOTTOM = (off -> OFF
                 |reset -> TOP).
        */
    }

    // Corresponds to the state OFF
    public static void offState(Scanner scanner) {
        System.out.println("The radio is currently at state OFF");
        System.out.println("You have the following options: on (1), quit (7)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 1 && option != 7) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 1) {
            topState(scanner);
        } else if (option == 7) {
            quitRadio();
        }
    }

    // Corresponds to the state TOP
    public static void topState(Scanner scanner) {
        System.out.println("The radio is currently at state TOP");
        System.out.println("You have the following options: off (2), reset (3), scan (4), quit (7)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 4 && option != 7) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 4) {
            scanningState(scanner);
        } else if (option == 7) {
            quitRadio();
        }
    }

    // Corresponds to the state SCANNING
    public static void scanningState(Scanner scanner) {
        System.out.println("The radio is currently at state SCANNING");
        System.out.println("You have the following options: off (2), reset (3), lock (5), end (6), quit (7)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 5 && option != 6 && option != 7) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 5) {
            stationState(scanner);
        } else if (option == 6) {
            bottomState(scanner);
        } else if (option == 7) {
            quitRadio();
        }
    }

    // Corresponds to the state STATION
    public static void stationState(Scanner scanner) {
        System.out.println("The radio is currently at state STATION");
        System.out.println("You have the following options: off (2), reset (3), scan (4), quit (7)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 4 && option != 7) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 4) {
            scanningState(scanner);
        } else if (option == 7) {
            quitRadio();
        }
    }

    // Corresponds to the state BOTTOM
    public static void bottomState(Scanner scanner) {
        System.out.println("The radio is currently at state BOTTOM");
        System.out.println("You have the following options: off (2), reset (3), quit (7)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 7) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 7) {
            quitRadio();
        }
    }

    // Quit the program
    public static void quitRadio() {
        System.out.println("You have quitted the program");
    }
}