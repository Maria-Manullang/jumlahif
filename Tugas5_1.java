package com.Pertemuan8;
import java.util.Scanner;

public class Tugas5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input bilangan 1 =");
        int bilangan1 = input.nextInt();
        System.out.print("input bilangan 2 =");
        int bilangan2 = input.nextInt();

        if (bilangan2>bilangan1){
        int sum=0;
        for(int i=bilangan1;i<=bilangan2;i++){
            System.out.print(i+" ");
            sum=sum+i;
        }
            System.out.println(" ");
            System.out.println("Jumlah Bilangan: "+sum);
    }else{
            System.out.println(" ");
            System.out.println("Maaf bilangan 2 yang dimasukkan harus lebih besar dari bilangan 1");
        }
    }
}