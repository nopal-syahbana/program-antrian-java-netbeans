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

public class AntrianMahasiswa {

    public int nim;
    public String nama, keperluan;
    public AntrianMahasiswa next;

    static Scanner inputnim = new Scanner(System.in);
    static Scanner name = new Scanner(System.in);

    public void input() {
        System.out.println();
        System.out.print("\t\t\t\t\tMasukkan NIM          : ");
        nim = inputnim.nextInt();
        System.out.print("\t\t\t\t\tMasukkan Nama         : ");
        nama = name.nextLine();
        System.out.print("\t\t\t\t\tMasukkan keperluan    : ");
        keperluan = name.nextLine();
        next = null;
    }

    public void read() {

        System.out.println("\t\t\t\t|| " + nim + "\t|| " + nama + " \t\t|| " + keperluan + "\t\t||");

    }
}
