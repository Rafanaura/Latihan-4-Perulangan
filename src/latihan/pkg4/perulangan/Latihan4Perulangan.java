/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4.perulangan;

/**
 *
 * @author MOKLET-2
 */
public class Latihan4Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suku_awal= 5;
        int selisih= 5;
        int nilai_akhir;
        int update_nilai;
        int total;
        
        for(int a=0; a<5; a++){
            for(int i=0; i<a; i++){
                update_nilai= suku_awal;
                suku_awal += selisih;
                System.out.print(" "+update_nilai);
            }
            System.out.println(" ");
        }
    }
    
}
