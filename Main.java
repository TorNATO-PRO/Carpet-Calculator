/*
 * @Author: Nathan Waltz
 * CptS 233: MicroAssignment #1
 * Date: 28 August 2020
 * gitRepo url: https://github.com/TorNATO-PRO/Carpet-Calculator.git
 *
 * An application to calculate the price of carpeting for rectangular rooms
 *
 */

import java.util.Scanner;

public class Main {

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;
        do {
            introduction();
            System.out.print("Please enter your length (in feet): ");
            double length = input.nextDouble();
            System.out.print("Please enter your width (in feet): ");
            double width = input.nextDouble();
            System.out.print("Lastly, please enter the cost per-square-foot: ");
            double cost = input.nextDouble();
            System.out.println();
            performTask(length, width, cost);
            System.out.print("Would you like to go again? ");
            again = input.next();
            System.out.println();
        } while (!again.contains("n"));
    }

    // private helper method to make code look cleaner
    private static void introduction() {
        System.out.println("-------------------------------------");
        System.out.println("|Welcome to my carpeting calculator!|");
        System.out.println("-------------------------------------");
    }

    // private helper method to carry out carpet calculations
    private static void performTask(double length, double width, double cost) {
        RoomDimension dimension = new RoomDimension(length, width);
        RoomCarpet carpet = new RoomCarpet(dimension, cost);
        System.out.println(dimension.toString());
        System.out.println(carpet.toString());
        System.out.println();
    }
}
