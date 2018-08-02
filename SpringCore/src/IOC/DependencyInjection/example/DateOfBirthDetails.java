/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC.DependencyInjection.example;

import java.util.Date;

/**
 *
 * @author vinayak
 */
public class DateOfBirthDetails {

    private int id;
    private Date brotherDOB;
    private Date sisterDOB;

    public DateOfBirthDetails(int id, Date brotherDOB, Date sisterDOB) {
        this.id = id;
        this.brotherDOB = brotherDOB;
        this.sisterDOB = sisterDOB;
    }

    @Override
    public String toString() {
        return "DateOfBirthDetails {" + "brotherDOB=" + brotherDOB + ", sisterDOB=" + sisterDOB + '}';
    }

}
