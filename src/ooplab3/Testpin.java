package ooplab3;

public class Testpin {
 package ooplab3;

import java.util.Scanner;

    public class TestPIN {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter Pin Code: ");
            int choice  = keyboard.nextInt();
            if (choice == 1234) {
                System.out.println("Welcome!");
            }
            else {
                System.out.println("Locked");
            }
        }//main
    }//class
}
