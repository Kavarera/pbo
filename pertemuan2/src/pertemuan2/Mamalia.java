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
public abstract class Mamalia {
    private String nama;
    private String jenis;
    private int umur;
    private String makanan;
    String getNama(){return this.nama;}
    int getUmur(){return this.umur;}
    String getJenis(){return this.jenis;}
    String getMakanan(){return this.makanan;}
    Mamalia(String n,String j, String m, int u){
        this.nama=n;
        this.jenis =j;
        this.makanan = m;
        this.umur = u;
    }
}
