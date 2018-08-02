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
public class Travller_To_Goa {
    ToDo tD;

    Travller_To_Goa(ToDo tD) {
        this.tD = tD;
    }
    public void startJourney(String msg){
        tD.start(msg);
    }
}
