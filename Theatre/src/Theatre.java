import java.util.Scanner;

public class Theatre {

    // creating the rows of seats

    public String[] rowOne = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O" };
    public String[] rowTwo = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O" };
    public String[] rowThree = { "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O",
            "O", "O", "O" };
    public Boolean mainloop = true;

    public void buy_ticket() {

        System.out.println("Please select a row (1-3):");
        Scanner row = new Scanner(System.in);
        int selectRow = row.nextInt();

        if (selectRow == 1) {
            System.out.println("You have selected row 1.");
            System.out.println("Please select a seat (1-12):");
            Scanner seat = new Scanner(System.in);
            int selectSeat = seat.nextInt();
            if (selectSeat <= 12) {
                if (rowOne[selectSeat - 1] == "O") {
                    System.out.println("You bought a ticket");
                    rowOne[selectSeat - 1] = "X";
                } else {
                    System.out.println("Seat is occupied");
                }
            } else if (selectSeat >= 13) {
                System.out.println("The chosen seat does not exist.");
            }
        }

        else if (selectRow == 2) {
            System.out.println("You have selected row 2.");
            System.out.println("Please select a seat (1-16):");
            Scanner seat2 = new Scanner(System.in);
            int selectSeat2 = seat2.nextInt();
            if (selectSeat2 <= 16) {
                if (rowTwo[selectSeat2 - 1] == "O") {
                    System.out.println("You bought a ticket");
                    rowTwo[selectSeat2 - 1] = "X";
                } else {
                    System.out.println("Seat is occupied");
                }
            } else if (selectSeat2 >= 17) {
                System.out.println("The chosen seat does not exist.");
            }
        } else if (selectRow == 3) {
            System.out.println("You have selected row 3.");
            System.out.println("Please select a seat (1-20):");
            Scanner seat3 = new Scanner(System.in);
            int selectSeat3 = seat3.nextInt();
            if (selectSeat3 <= 20) {
                if (rowThree[selectSeat3 - 1] == "O") {
                    System.out.println("You bought a ticket");
                    rowThree[selectSeat3 - 1] = "X";
                } else {
                    System.out.println("Seat is occupied");
                }
            } else if (selectSeat3 >= 21) {
                System.out.println("The chosen seat does not exist.");
            }
        }
    }

    public void print_seating_area() {

        System.out.println("      *********");
        System.out.println("      * STAGE *");
        System.out.println("      *********\n");
        // prints the rows
        for (int j = 0; j < 1; j++) {
            System.out.print("    ");
            for (int i = 0; i < rowOne.length; i++) {
                System.out.print(rowOne[i]);
                if (i == 5) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n  ");
            for (int i = 0; i < rowTwo.length; i++) {
                System.out.print(rowTwo[i]);
                if (i == 7) {
                    System.out.print(" ");

                }
            }
            System.out.println();
            for (int i = 0; i < rowThree.length; i++) {
                System.out.print(rowThree[i]);
                if (i == 9) {
                    System.out.print(" ");
                    
                }
            }
        }
    }

    public void cancel_ticket() {

        System.out.println("Please select a row (1-3):");
        Scanner row = new Scanner(System.in);
        int selectRow = row.nextInt();

        if (selectRow == 1) {
            System.out.println("You have selected row 1.");
            System.out.println("Please select a seat (1-12):");
            Scanner seat = new Scanner(System.in);
            int selectSeat = seat.nextInt();
            if (selectSeat <= 12) {
                if (rowOne[selectSeat - 1] == "X") {
                    System.out.println("Your ticket has been cancelled");
                    rowOne[selectSeat - 1] = "O";
                } else {
                    System.out.println("Seat is not occupied");
                }
            } else if (selectSeat >= 13) {
                System.out.println("The chosen seat does not exist.");
            }
        }

        else if (selectRow == 2) {
            System.out.println("You have selected row 2.");
            System.out.println("Please select a seat (1-16):");
            Scanner seat2 = new Scanner(System.in);
            int selectSeat2 = seat2.nextInt();
            if (selectSeat2 <= 16) {
                if (rowTwo[selectSeat2 - 1] == "X") {
                    System.out.println("Your ticket has been cancelled");
                    rowTwo[selectSeat2 - 1] = "O";
                } else {
                    System.out.println("Seat is not occupied");
                }
            } else if (selectSeat2 >= 17) {
                System.out.println("The chosen seat does not exist.");
            }
        } else if (selectRow == 3) {
            System.out.println("You have selected row 3.");
            System.out.println("Please select a seat (1-20):");
            Scanner seat3 = new Scanner(System.in);
            int selectSeat3 = seat3.nextInt();
            if (selectSeat3 <= 20) {
                if (rowThree[selectSeat3 - 1] == "X") {
                    System.out.println("Your ticket has been cancelled");
                    rowThree[selectSeat3 - 1] = "O";
                } else {
                    System.out.println("Seat is not occupied");
                }
            } else if (selectSeat3 >= 21) {
                System.out.println("The chosen seat does not exist.");
            }
        }
    }

    public void show_available() {
        System.out.print("Seats available in row 1: ");
        for (int i = 0; i < rowOne.length; i++) {
            if (rowOne[i] == "O") {
                System.out.print((i + 1) + ", ");

            } else if (rowOne[i] == "X") {
                continue;
            }
        }
        System.out.print("\nSeats available in row 2: ");
        for (int j = 0; j < rowTwo.length; j++) {
            if (rowTwo[j] == "O") {
                System.out.print((j + 1) + ", ");

            } else if (rowTwo[j] == "X") {
                continue;
            }
        }
        System.out.print("\nSeats available in row 3: ");
        for (int k = 0; k < rowThree.length; k++) {
            if (rowThree[k] == "O") {
                System.out.print((k + 1) + ", ");

            } else if (rowThree[k] == "X") {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Theatre myObjTheatre = new Theatre();
        System.out.println("Welcome to the New Theatre");

        while (myObjTheatre.mainloop) {
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("    1) Buy a ticket");
            System.out.println("    2) Print seating area");
            System.out.println("    3) Cancel a ticket");
            System.out.println("    4) List available seats");
            System.out.println("    5) Save to file");
            System.out.println("    6) Load from file");
            System.out.println("    7) Print ticket information and total price");
            System.out.println("    8) Sort tickets by price");
            System.out.println("    O) Quit");
            System.out.println("------------------------------------");
            System.out.print("Enter option: ");

            // takes the user input to select an option
            Scanner menuOption = new Scanner(System.in);
            int option = menuOption.nextInt();

            if (option == 1) {
                myObjTheatre.buy_ticket();
            } else if (option == 2) {
                myObjTheatre.print_seating_area();
            } else if (option == 3) {
                myObjTheatre.cancel_ticket();
            } else if (option == 4) {
                myObjTheatre.show_available();
            } else if (option == 0) {
                myObjTheatre.mainloop = false;
            }
        }
    }
}
