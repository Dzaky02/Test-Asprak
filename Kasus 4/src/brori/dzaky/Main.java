package brori.dzaky;

import java.util.Scanner;

public class Main {

    public static int[] hapusDuplikat(int[] array) {

        int end = array.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {
                    int x = j;
                    for (int k = j+1; k < end; k++, x++) {
                        array[x] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] hasil = new int[end];
        for(int i = 0; i < end; i++){
            hasil[i] = array[i];
        }
        return hasil;
    }

    void tampil(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.print("Masukkan Besar Array : ");
        int besar = sc.nextInt();
        int [] a = new int[besar];

        for (int i=0; i<besar; i++){
            System.out.print("Input angka ke - "+(i+1)+ " : ");
            int nilai = sc.nextInt();
            a[i] = nilai;
        }

        System.out.println("\nSebelum dihapus");
        m.tampil(a);
        System.out.println();

        System.out.println("Setelah dihapus");
        m.tampil(hapusDuplikat(a));

        System.out.println("[---===Copyright A.D.A===---]\n" +
                "[===---  Good Bye :)  ---===]");
    }
}
