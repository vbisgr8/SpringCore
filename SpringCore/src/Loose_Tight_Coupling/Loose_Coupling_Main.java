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
public class Loose_Coupling_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Travller_To_Goa tTG = new Travller_To_Goa(new Bike());
        String msg = "'-Loose_Coupling_Main on the way to Goa-'";
        tTG.startJourney(msg);
    }
    
}