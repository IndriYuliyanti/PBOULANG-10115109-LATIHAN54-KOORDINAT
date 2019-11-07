/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan54.koordinat;

/**
 *
 * @author User
 */
public class Pboulang10115109Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Warnakoordinat warnakor = new Warnakoordinat();
        warnakor.setNamawarna("JINGGA");
        System.out.println("Warna koordinat :"+warnakor.getNamawarna());
        
        Koordinat koordinat = new Koordinat();
        koordinat.setX(10);
        koordinat.setY(4);
        System.out.println("koordinat sumbu x :"+koordinat.getX()+(",  ")+ ("y:  ")+koordinat.getY());
        
        
        
        
    }
    
}
