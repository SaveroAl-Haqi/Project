/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        //deklarasi variable
        String Nama;
        String Nim;
        String Kelas;
        String Alamat;
        //memberikan nilai pada variable secara dinamis
        //memanggil class scanner
        Scanner input_bio=new Scanner (System.in);
        //nama
        System.out.print("Nama:");
        Nama=input_bio.nextLine();
        //nim
        System.out.print("Nim:");
        Nim=input_bio.nextLine();
        //Kelas
        System.out.print("Kelas:");
        Kelas=input_bio.nextLine();
        //Alamat
        System.out.print("Alamat:");
        Alamat=input_bio.nextLine();
        //cetak nama, nim, kelas, dan alamat
        System.out.println("Nama"+Nama);
        System.out.println("Nim"+Nim);
        System.out.println("Kelas"+Kelas);
        System.out.println("Alamat"+Alamat);
    }
    
}
