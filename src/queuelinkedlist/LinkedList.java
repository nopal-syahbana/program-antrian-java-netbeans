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
public class LinkedList {

    public AntrianMahasiswa head, tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void enqueue() {
        AntrianMahasiswa data = new AntrianMahasiswa();
        data.input();
        if (head == null) {
            head = data;
        } else {
            tail.next = data;
        }
        tail = data;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("\n\t\t\t\t\tWahh Datanya Kosong Nih!!!");
        } else {
            System.out.println("\n\t\t\t\t\tNomor antri Mahasiswa dengan NIM : " + head.nim + " atas nama " + head.nama);
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("\n\t\t\t\t\tWahh Datanya Kosong Nih!!!");
        } else {
            System.out.println("\n\t\t\t\t==========================================================================");
            System.out.println("\t\t\t\t|| NIM \t\t|| Nama \t\t\t|| Keperluan \t\t||");
            System.out.println("\t\t\t\t==========================================================================");
            for (AntrianMahasiswa x = head; x != null; x = x.next) {
                x.read();
            }
            System.out.println("\t\t\t\t==========================================================================");

        }
    }
}
