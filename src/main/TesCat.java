package main;

import java.util.Scanner;
import cat.Cat;

public class TesCat {
    public static void main(String[] args) {
        String nama;
        int umur;
        double berat;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama kucing = ");

        nama = input.nextLine();

        System.out.print("Umur kucing = ");
        umur = input.nextInt();

        System.out.print("Berat kucing = ");
        berat = input.nextDouble();

        Cat udin = new Cat(nama, berat, umur);
        udin.setName(nama);
        udin.setAge(umur);
        udin.setWeight(berat);

        System.out.println("\nSaya punya kucing bernama " + udin.getName() + " umur kucing saya adalah " + udin.getAge()
                + " tahun, dengan berat badan kucing adalah  " + udin.getWeight() + " kg");
    }
}
