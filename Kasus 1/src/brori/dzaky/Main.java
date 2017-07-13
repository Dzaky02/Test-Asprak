package brori.dzaky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a, kebalikan = "";
        boolean ulang=true;
        Scanner in = new Scanner(System.in);
        while (ulang){
            System.out.print("Masukkan suatu kata yang akan dicek : ");
            a = in.next();
            System.out.println("----------------------------------------");
            int length = a.length();

            for ( int i = length - 1; i >= 0; i-- )
                kebalikan = kebalikan + a.charAt(i);

            if (a.equalsIgnoreCase(kebalikan))
                System.out.println(a + " sama dengan " + kebalikan + "\n" +
                        "Kata yang anda input merupakan palindrom\n");
            else
                System.out.println(a + " dan " + kebalikan + " berbeda\n" +
                        "Kata yang anda input bukan palindrom\n");
            System.out.print("Coba lagi (Y/T)? ");
            String jawab = in.next();
            if (jawab.equalsIgnoreCase("T")){
                ulang=false;
            } if (jawab.equalsIgnoreCase("y")){
                kebalikan="";
            }
        }
        System.out.println("\t[---===Copyright A.D.A===---]\n" +
                "\t[===---  Good Bye :)  ---===]");
    }
}
