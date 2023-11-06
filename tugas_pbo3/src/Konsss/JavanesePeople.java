/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konsss;

/**
 *
 * @author Irkhamnawan
 */
public class JavanesePeople extends People implements Pelajar, Freelance, Parttime {
    
    public void menuntutIlmu() {
        System.out.println("Sedang fokus menuntut ilmu");
    }
    
    public void kerjaDesain() {
        System.out.println("Sedang fokus membuat desain");
    }
    
    public void jagaWarung() {
        System.out.println("Sedang fokus menjaga warung");
    }
    
    public JavanesePeople() {
        this.setDomisili("Tinggal di Jawa");
    }
    
}
