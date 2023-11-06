/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mainn;

import Konsss.People;
import Konsss.JavanesePeople;
import Konsss.SundanesePeople;

/**
 *
 * @author Irkhamnawan
 */
public class Jalannn {
    public static void main(String[] args) {
        
        JavanesePeople anta = new JavanesePeople();
        anta.setBajuAdat("Batik");
        anta.setMakananKhas("Rawon");
        System.out.println("Anta " + anta.getDomisili());
        System.out.println("Anta memakai baju " + anta.getBajuAdat());
        System.out.println("Anta suka makan " + anta.getMakananKhas());
        anta.menuntutIlmu();
        anta.kerjaDesain();
        anta.jagaWarung();
        System.out.println("Anta " + anta.istirahat("02.00"));
        System.out.println("                                          ");
        System.out.println("==========================================");
        System.out.println("                                          ");
        
        SundanesePeople mutia = new SundanesePeople();
        mutia.setBajuAdat("Kebaya");
        mutia.setMakananKhas("Batagor");
        System.out.println("Mutia " + mutia.getDomisili());
        System.out.println("Mutia memakai baju " + mutia.getBajuAdat());
        System.out.println("Mutia suka makan " + mutia.getMakananKhas());
        System.out.println("Mutia " + mutia.istirahat(9));
        System.out.println("                                          ");
        System.out.println("==========================================");
        System.out.println("                                          ");
        
        People udin = new People();
        System.out.println("Udin berada di " + udin.getDomisili());
        System.out.println("Udin " + udin.istirahat());
        
    }
}
