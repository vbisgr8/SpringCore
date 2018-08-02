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
public class Travller_To_Gokarna {
    Bike b = new Bike();    // it's dependent on bike object that's why it's tightly coupled (In short where we are creating new object() there we are dependent to that particular object you can see in Travller_To_Goa class we are passing directly object no need creat object. so we can pass any object so it will not depend on that particular bike object)
    public void startJourney(String msg){
        b.start(msg);
    }
}
