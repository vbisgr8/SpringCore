/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loose_Tight_Coupling;

/**
 *
 * @author vinayak
 */
public class Tight_Coupling_Main {

    public static void main(String[] args) {
        Travller_To_Gokarna tTG = new Travller_To_Gokarna();
        String msg = "'-Tight_Coupling_Main on the way to Gokarna-'";
        tTG.startJourney(msg);
    }
}
