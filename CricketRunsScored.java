/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._prog6112_test;

/**
 *
 * @author RC_Student_Lab
 */
class CricketRunsScored extends Cricket {
    public CricketRunsScored(String batsmanName, String stadiumName, int runsScored) {
        super(batsmanName, stadiumName, runsScored);
    }

    // Print report
    public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("***************************");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}
