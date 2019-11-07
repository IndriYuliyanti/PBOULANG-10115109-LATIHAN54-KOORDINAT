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
public class Warnakoordinat {
    public String Namawarna;
    
    public Warnakoordinat(String Namawarna, int x, int y){
        super(x,y);
        this.Namawarna = Namawarna;
        
    }
    Warnakoordinat(){
        
    }

    public String getNamawarna() {
        return Namawarna;
    }

    public void setNamawarna(String Namawarna) {
        this.Namawarna = Namawarna;
    }
    
    
}
