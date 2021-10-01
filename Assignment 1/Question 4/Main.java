import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE RADIO SYSTEM");
        System.out.println("The following actions correspond with the following numbers:");
        System.out.println("on = 1, off = 2, reset = 3, scan = 4, lock = 5, end = 6");
        System.out.println();

        offState(scanner);

    }

    public static void offState(Scanner scanner) {
        System.out.println("The radio is currently at state OFF");
        System.out.println("You have the following options: on (1)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 1) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 1) {
            topState(scanner);
        }
    }

    public static void topState(Scanner scanner) {
        System.out.println("The radio is currently at state TOP");
        System.out.println("You have the following options: off (2), reset (3), scan (4)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 4) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 4) {
            scanningState(scanner);
        }
    }

    public static void scanningState(Scanner scanner) {
        System.out.println("The radio is currently at state SCANNING");
        System.out.println("You have the following options: off (2), reset (3), lock (5), end (6)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 5 && option != 6) {
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
        }
    }

    public static void stationState(Scanner scanner) {
        System.out.println("The radio is currently at state STATION");
        System.out.println("You have the following options: off (2), reset (3), scan (4)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3 && option != 4) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        } else if (option == 4) {
            scanningState(scanner);
        }
    }

    public static void bottomState(Scanner scanner) {
        System.out.println("The radio is currently at state BOTTOM");
        System.out.println("You have the following options: off (2), reset (3)");
        System.out.println("Please enter the number correspond to the action you want to choose: ");
        int option = scanner.nextInt();

        while (option != 2 && option != 3) {
            System.out.println("You do not have the action that you just entered. Please enter the valid number:");
            option = scanner.nextInt();
        }

        if (option == 2) {
            offState(scanner);
        } else if (option == 3) {
            topState(scanner);
        }
    }


}