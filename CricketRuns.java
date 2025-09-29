/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._prog6112_test;

/**
 *
 * @author RC_Student_Lab
 */
import static java.nio.charset.CodingErrorAction.REPORT;
import java.util.Scanner;

public class CricketRuns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        
        int[][] runs = new int[batsmen.length][stadiums.length];

        
        for (int i = 0; i < batsmen.length; i++) {
            for (int j = 0; j < stadiums.length; j++) {
                System.out.print("Enter the number of runs scored by " + batsmen[i] +
                        " at " + stadiums[j] + ": ");
                runs[i][j] = sc.nextInt();
            }
        }

System.out.println("================= RUNS SCORED REPORT =================");

        
        for (int i = 0; i < batsmen.length; i++) {
            for (int j = 0; j < stadiums.length; j++) {
                System.out.println(batsmen[i] + " runs scored at " +
                        stadiums[j].toUpperCase() + ": " + runs[i][j]);
            }
            System.out.println();
        }

        
        int[] totalRunsAtStadiums = new int[stadiums.length];
        for (int j = 0; j < stadiums.length; j++) {
            int sum = 0;
            for (int i = 0; i < batsmen.length; i++) {
                sum += runs[i][j];
            }
            totalRunsAtStadiums[j] = sum;
        }

System.out.println("=========== TOTAL RUNS AT STADIUMS ===========");
        for (int j = 0; j < stadiums.length; j++) {
            System.out.println(stadiums[j].toUpperCase() + ": " + totalRunsAtStadiums[j]);
        }

        
        int maxRuns = totalRunsAtStadiums[0];
        String maxStadium = stadiums[0];
        for (int j = 1; j < stadiums.length; j++) {
            if (totalRunsAtStadiums[j] > maxRuns) {
                maxRuns = totalRunsAtStadiums[j];
                maxStadium = stadiums[j];
            }
        }

        System.out.println("STADIUM WITH THE MOST RUNS: " + maxStadium.toUpperCase());

        sc.close();
    }
}
