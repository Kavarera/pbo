/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Lab Informatika
 */
public class masbro extends Mamalia{

    private String nama,makanan,jenis;
    private int umur;
    masbro(String nama, String makanan, String jenis, int umur){
        super(nama,makanan,jenis,umur);
        System.out.println(super.getMakanan());
    }
    
}
