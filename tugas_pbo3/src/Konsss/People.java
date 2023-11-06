/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konsss;

/**
 *
 * @author Irkhamnawan
 */
public class People {
    
    public People(){ 
        this.domisili = "Indonesia";
    }
    
    private String makananKhas;
    private String bajuAdat;
    private String domisili = "Indonesia";

    /**
     * @return the makananKhas
     */
    public String getMakananKhas() {
        return makananKhas;
    }

    /**
     * @param makananKhas the makananKhas to set
     */
    public void setMakananKhas(String makananKhas) {
        this.makananKhas = makananKhas;
    }

    /**
     * @return the bajuAdat
     */
    public String getBajuAdat() {
        return bajuAdat;
    }

    /**
     * @param bajuAdat the bajuAdat to set
     */
    public void setBajuAdat(String bajuAdat) {
        this.bajuAdat = bajuAdat;
    }

    /**
     * @return the domisili
     */
    public String getDomisili() {
        return domisili;
    }

    /**
     * @param domisili the domisili to set
     */
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    
    public String istirahat() {
        return "Sedang istirahat";
    }
    
    public String istirahat(String jam) {
        return "Sedang istirahat " + "Pukul " + jam;
    }
    
    public String istirahat(int jam) {
        return "Sedang istirahat " + "Pukul " + String.valueOf(jam);
    }
    
}
