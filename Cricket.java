/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._prog6112_test;

/**
 *
 * @author RC_Student_Lab
 */
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected int runsScored;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, int runsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.runsScored = runsScored;
    }

// Implement interface methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public int getRunsScored() {
        return runsScored;
    }
}
