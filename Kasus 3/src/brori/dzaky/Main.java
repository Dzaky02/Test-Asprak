package brori.dzaky;

import java.util.Scanner;

public class Main {
    void ASCBubbleSort(int A[]) {
        int sisa = A.length - 1;
        for (int i = 0; i < sisa; i++) {
            for (int j = 0; j < sisa; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    void DESExchangeSort(int A[]) {
        for (int i = 0; i < (A.length - 1); i++){
            for (int j = i + 1; j < A.length; j++){
                if (A[i] < A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    void tampil(int [] A){
        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Main m= new Main();
        System.out.print("Masukkan Besar Array : ");
        int [] a = new int[sc.nextInt()];

        for (int i=0; i<a.length; i++){
            System.out.print("Input angka ke - "+(i+1)+ " : ");
            int nilai = sc.nextInt();
            a[i] = nilai;
        }
        System.out.println("\nAscending\n" +
                "--------------------------------------------------");
        m.ASCBubbleSort(a);
        m.tampil(a);
        System.out.println("\nDescending\n" +
                "--------------------------------------------------");
        m.DESExchangeSort(a);
        m.tampil(a);

        System.out.println("\t\t[---===Copyright A.D.A===---]\n" +
                "\t\t[===---  Good Bye :)  ---===]");
    }
}
