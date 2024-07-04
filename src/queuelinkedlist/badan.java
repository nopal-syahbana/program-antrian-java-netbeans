/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;
/**
 *
 * @author Naufal Syahbana
 */
import java.util.Scanner;
public class badan {

    public static void main(String[] args) {

        int menu;
        Scanner input=new Scanner(System.in);
        LinkedList LL=new LinkedList();

        System.out.println("\n\t\t===================================================================================================");
        System.out.println("\t\t\t\t\t SELAMAT DATANG DI UNIVERSITAS MUHAMMADIYAH GRESIK ");
        System.out.println("\t\t\t\t\t     Berikut adalah program antrian mahasiswa ");
        System.out.println("\t\t===================================================================================================");

        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\tPilih menu : ");
            System.out.println("\t\t\t\t1. Ambil nomor antri");
            System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
            System.out.println("\t\t\t\t3. Lihat data antrian Mahasiswa");
            System.out.println("\t\t\t\t4. Exit ");
            System.out.print("\t\t\t\t     Masukkan Pilihan : ");
            menu=input.nextInt();
            if(menu==1){
                LL.enqueue();
            }else if(menu==2){
                LL.dequeue();
            }else if(menu==3){
                LL.view();
            }else if(menu==4){
                System.out.println("\n\t\t\t\tAnda Keluar dari Program");
            }else{
                System.out.println("\n\t\t\t\tMenu yang anda masukkan SALAHH !!!!");
            }
        }while(menu!=4);
    }
}