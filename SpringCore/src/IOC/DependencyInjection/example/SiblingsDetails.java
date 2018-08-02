/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC.DependencyInjection.example;

/**
 *
 * @author vinayak
 */
public class SiblingsDetails {

    private int id;
    private String brotherName;
    private String sisterName;

    public SiblingsDetails(String brotherName, String sisterName) {
        this.brotherName = brotherName;
        this.sisterName = sisterName;
    }

    public SiblingsDetails(int id, String brotherName, String sisterName) {
        this.id = id;
        this.brotherName = brotherName;
        this.sisterName = sisterName;
    }

    @Override
    public String toString() {
        return "SiblingsDetails {" + "brotherName=" + brotherName + ", sisterName=" + sisterName + '}';
    }

}
