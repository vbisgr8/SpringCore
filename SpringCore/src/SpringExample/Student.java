/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringExample;

/**
 *
 * @author vinayak
 */
public class Student {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void getData(){
        System.out.println(" Hello "+name);
    }
}
