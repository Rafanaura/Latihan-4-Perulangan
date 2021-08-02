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
public class latihan4b {
     public static void main(String[] args) {
    int sukuawal= 5;
    int selisih= 5;
    int updatenilai;
    int total= 0;
    
    for (int a=0; a < 5; a++){
        for (int i=a; i < 5; i++){
            updatenilai = sukuawal;
            sukuawal += selisih;
            
            System.out.print(" " +updatenilai);
            total += updatenilai;
        }
        System.out.println(" ");
}
     }
}
