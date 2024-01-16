package src;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Theatre {

    static int[] rowOne = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] rowTwo = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] rowThree = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static ArrayList<Ticket> ticketList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the New Theater\n");

        int option;
        while (true) {
            System.out.println("");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");
            System.out.println("5) Save to file");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort ticket by price");
            System.out.println("     0) Quit");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Enter option: ");

            option = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 0}, "invalid input please enter valid input :");


            switch (option) {
                case 1:
                    buy_ticket();
                    break;
                case 2:
                    print_seating_area();
                    break;
                case 3:
                    cancel_ticket();
                    break;
                case 4:
                    show_available();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    load();
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    System.exit(0);//to terminate the program
                    break;
                default:

                    break;
            }
        }
    }


    public static void buy_ticket() {

        System.out.println("Enter a row number (1,2,3): ");
        int rowNumber = getIntInput(new Integer[]{1, 2, 3}, "Invalid row number. ");
        Person person = getPersonDetails();
        if (rowNumber == 1) {
            System.out.println("Enter a seat number (1-12): ");
            int seatNumber1 = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                    "Invalid seat number. ");
            if (rowOne[seatNumber1 - 1] == 0) {
                System.out.println("You bought a ticket");
                rowOne[seatNumber1 - 1] = 1;
                Ticket ticket = new Ticket(rowNumber,seatNumber1,0.0,person);
                ticketList.add(ticket);
                print_seating_area();
            } else {
                System.out.println("Seat is occupied");
            }

        } else if (rowNumber == 2) {
            System.out.println("Enter a seat number: ");
            int seatNumber2 = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16},
                    "Invalid seat number. ");
            if (rowTwo[seatNumber2 - 1] == 0) {
                System.out.println("You bought a ticket");
                rowTwo[seatNumber2 - 1] = 1;
                Ticket ticket = new Ticket(rowNumber,seatNumber2,0.0,person);
                ticketList.add(ticket);
                print_seating_area();
            } else {
                System.out.println("Seat is occupied");
            }

        } else if (rowNumber == 3) {
            System.out.println("Enter a seat number: ");
            int seatNumber3 = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                    "Invalid seat number. ");
            if (rowTwo[seatNumber3 - 1] == 0) {
                System.out.println("You bought a ticket");
                rowTwo[seatNumber3 - 1] = 1;
                Ticket ticket = new Ticket(rowNumber,seatNumber3,0.0,person);
                ticketList.add(ticket);
                print_seating_area();
            } else {
                System.out.println("Seat is occupied");
            }

        }
    }

    public static void print_seating_area() {

        System.out.println("     *********** ");
        System.out.println("     *  STAGE  * ");
        System.out.println("     *********** ");
        System.out.print("    ");
        for (int i = 0; i < rowOne.length; i++) {
            if (rowOne[i] == 0) {
                System.out.print("O");
            }
            if (rowOne[i] == 1) {
                System.out.print("X");
            }
            if ((rowOne.length / 2) - 1 == i) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.print("  ");
        for (int i = 0; i < rowTwo.length; i++) {

            if (rowTwo[i] == 0) {
                System.out.print("O");
            }
            if (rowTwo[i] == 1) {
                System.out.print("X");
            }
            if ((rowTwo.length / 2) - 1 == i) {
                System.out.print(" ");
            }

        }
        System.out.println("");
        for (int i = 0; i < rowThree.length; i++) {

            if (rowThree[i] == 0) {
                System.out.print("O");
            }
            if (rowThree[i] == 1) {
                System.out.print("X");
            }
            if ((rowThree.length / 2) - 1 == i) {
                System.out.print(" ");
            }

        }
        System.out.println("");
    }

    public static void cancel_ticket() {

        System.out.println("Enter a row number(1,2,3): ");
        int rowNumber = getIntInput(new Integer[]{1, 2, 3}, "Invalid row number. ");

        if (rowNumber == 1) {
            System.out.println("Enter a seat number: ");
            int seat_number = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12},
                    "Invalid seat number. ");
            if (rowOne[seat_number - 1] == 1) {
                System.out.println("Your booking is cancelled successfully.");
                rowOne[seat_number - 1] = 0;
            } else {
                System.out.println("The seat you entered hasn't booked yet");
            }
        } else if (rowNumber == 2) {
            System.out.println("Enter a seat number: ");
            int seat_number = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16},
                    "Invalid seat number. ");
            if (rowTwo[seat_number - 1] == 1) {
                System.out.println("Your booking is cancelled successfully.");
                rowTwo[seat_number - 1] = 0;
            } else {
                System.out.println("The seat you entered hasn't booked yet");
            }
        } else if (rowNumber == 3) {
            System.out.println("Enter a seat number: ");
            int seat_number = getIntInput(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                    "Invalid seat number. ");
            if (rowThree[seat_number - 1] == 1) {
                System.out.println("Your booking is cancelled successfully.");
                rowThree[seat_number - 1] = 0;
            } else {
                System.out.println("The seat you entered hasn't booked yet");
            }
        }
    }

    private static void show_available() {
        System.out.println("Enter option: 4 ");
        System.out.print("Seats available in row 1: ");
        for (int i = 0; i < rowOne.length; i++) {
            if (rowOne[i] == 0) {
                System.out.print(i + 1);
                if (i == rowOne.length - 1) {
                    System.out.print(".");
                } else {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");
        System.out.print("Seats available in row 2: ");
        for (int i = 0; i < rowTwo.length; i++) {
            if (rowTwo[i] == 0) {
                System.out.print(i + 1);
                if (i == rowTwo.length - 1) {
                    System.out.print(".");
                } else {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");
        System.out.print("Seats available in row 3: ");
        for (int i = 0; i < rowThree.length; i++) {
            if (rowThree[i] == 0) {
                System.out.print(i + 1);
                if (i == rowThree.length - 1) {
                    System.out.print(".");
                } else {
                    System.out.print(",");
                }
            }
        }
    }

    private static void save() {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("rowOne.txt"));
            outputStream.writeObject(rowOne);

            outputStream = new ObjectOutputStream(new FileOutputStream("rowTwo.txt"));
            outputStream.writeObject(rowTwo);

            outputStream = new ObjectOutputStream(new FileOutputStream("rowThree.txt"));
            outputStream.writeObject(rowThree);

            outputStream.close();//for closing stream
            System.out.println("saved successfully. ");
        } catch (IOException e) {
            System.out.println("save failed. ");
        }
    }

    private static void load(){
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("rowOne.txt"));
            int[] array1 = (int[]) inputStream.readObject();
            inputStream = new ObjectInputStream(new FileInputStream("rowTwo.txt"));
            int[] array2 = (int[]) inputStream.readObject();
            inputStream = new ObjectInputStream(new FileInputStream("rowThree.txt"));
            int[] array3 = (int[]) inputStream.readObject();
            inputStream.close();

            System.arraycopy(array1, 0, rowOne, 0, array1.length);
            System.arraycopy(array2, 0, rowTwo, 0, array2.length);
            System.arraycopy(array3, 0, rowThree, 0,array3.length);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Used Integer class because int does not support Arrays.aslist
    private static int getIntInput(Integer[] inputs, String errorMsg) {
        int input;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(errorMsg);
                continue;
            }
            List<Integer> inputList = Arrays.asList(inputs);
            if (!inputList.contains(input)) {
                System.out.println(errorMsg);
                continue;
            }
            return input;
        }
    }
    private static Person getPersonDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Enter your surname: ");
        String surName=input.nextLine();
        System.out.println("Enter your email: ");
        String email= input.nextLine();
        return new Person(name,surName,email);
    }

}
