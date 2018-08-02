package Loose_Tight_Coupling;
import Loose_Tight_Coupling.ToDo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinayak
 */
class Bike implements ToDo{

    @Override
    public void start(String massage) {
        System.out.println(" Bike is going to start wear your helmets "+massage);
    }

}
