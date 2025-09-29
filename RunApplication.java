/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._prog6112_test;
import java.util.Scanner;
/**
 *
 * @author RC_Student_Lab
 */
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The cricketer name: ");
        String name = sc.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = sc.nextLine();

        System.out.print("Enter the total runs scored by " + name + " at " + stadium + ": ");
        int runs = sc.nextInt();

        // Create object and print report
        CricketRunsScored player = new CricketRunsScored(name, stadium, runs);
        player.printReport();

        sc.close();
    }
}

