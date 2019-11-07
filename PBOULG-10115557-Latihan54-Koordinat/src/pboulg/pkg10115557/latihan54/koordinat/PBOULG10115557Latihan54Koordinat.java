/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan54.koordinat;

/**
 *
 * @author RyanJuan\
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program Menampilkan Titik Koordinat warna dan warnanya
 */
public class PBOULG10115557Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     WarnaKoordinat wk;
        wk = new WarnaKoordinat("jingga",10,4);
        wk.setWarna("jingga");
        wk.setX(10);
        wk.setY(4);
        
        System.out.println("Warna Koordinat : "+wk.getWarna());
        System.out.println("Warna Koordinat Sumbu x : "+wk.getX()+", y : "
                +wk.getY());
    
    }
    
}
