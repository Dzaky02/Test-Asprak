package brori.dzaky;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  class Peserta implements Comparable<Peserta> {
        Integer nomer, nilai;
        String nama;

        public Peserta(int nilai) {
            this.nilai = nilai;
        }

        public Peserta(int nomer, String nama, int nilai) {
            this.nomer = nomer;
            this.nilai = nilai;
            this.nama = nama;
        }

        @Override
        public String toString() {
            return "Nomer Peserta = " + nomer + '\n' +
                    "Nama Peserta  = " + nama + '\n' +
                    "Nilai         = " + nilai + '\n' +
                    "--------------------------------------";
        }

        @Override
        public int compareTo(Peserta o) {
            Integer nilai = ((Peserta)o).nilai;
            return this.nilai.compareTo(nilai);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        ArrayList dataPeserta = new ArrayList();
        System.out.print("[=]---Input Nilai Peserta Lomba---[=]\n" +
                "--------------------------------------\n" +
                "|************************************|\n" +
                "|* Notice :                         *|\n" +
                "|* - Input diakhiri bila memasukkan *|\n" +
                "|*   nomor dengan '9999'.           *|\n" +
                "|* - Setelah program selesai secara *|\n" +
                "|*   otomatis mengeluarkan hasil    *|\n" +
                "|*   lomba.                         *|\n" +
                "|************************************|\n" +
                "----------[Copyright A.D.A]----------\n" +
                "Start (Y/T) ");
        String start = in.next();
        if (start.equalsIgnoreCase("y")){
            boolean ulang = true;
            while (ulang){
                System.out.print("[=]---Input Nilai Peserta Lomba---[=]\n" +
                                 "\t  =--[Total Input : "+dataPeserta.size()+"]--=\n" +
                        "Nomor Peserta : ");
                int no = in.nextInt();
                System.out.print("Nama Peserta  : ");
                String nam = in.next();
                System.out.print("Nilai         : ");
                int skor = in.nextInt();
                Peserta dat = new Peserta(no,nam,skor);
                dataPeserta.add(dat);
                if (no == 9999){
                    ulang = false;
                }
                System.out.println("----------[Copyright A.D.A]----------");
            }
            Peserta temp;
            if (dataPeserta.size()>1){
                for (int x=0; x<dataPeserta.size(); x++){
                    for (int i=0; i < dataPeserta.size()-x-1; i++) {
                        if (((Main.Peserta)dataPeserta.get(i)).compareTo((Main.Peserta)dataPeserta.get(i+1)) < 0){
                            temp = (Main.Peserta) dataPeserta.get(i);
                            dataPeserta.set(i,dataPeserta.get(i+1) );
                            dataPeserta.set(i+1, temp);
                        }
                    }
                }
            }
            System.out.println("[=]------Hasil Peserta Lomba------[=]\n" +
                    "=====================================\n" +
                    "\t\tJUARA I\n" +
                    "--------------------------------------");
            int bantu = 0;
            for (int i=0; i < dataPeserta.size()-1; i++) {
                if (((Main.Peserta)dataPeserta.get(i)).compareTo((Main.Peserta)dataPeserta.get(i+1)) == 0) {
                    System.out.println(dataPeserta.get(i));
                } else {
                    bantu = i+1;
                    System.out.println(dataPeserta.get(i));
                    break;
                }
            }
            System.out.println("\t\tJUARA II\n" +
                    "--------------------------------------");
            for (int i=bantu; i < dataPeserta.size()-1; i++) {
                if (((Main.Peserta)dataPeserta.get(i)).compareTo((Main.Peserta)dataPeserta.get(i+1)) == 0) {
                    System.out.println(dataPeserta.get(i));
                } else {
                    bantu = i+1;
                    System.out.println(dataPeserta.get(i));
                    break;
                }
            }
            System.out.println("\t\tJUARA III\n" +
                    "--------------------------------------\n");
            for (int i=bantu; i < dataPeserta.size(); i++) {
                if (i!=dataPeserta.size()-1 && ((Main.Peserta)dataPeserta.get(i)).compareTo((Main.Peserta)dataPeserta.get(i+1)) == 0) {
                    System.out.println(dataPeserta.get(i));
                } else {
                    System.out.println(dataPeserta.get(i));
                    break;
                }
            }
        }
        System.out.println("--------------[Thank You]-------------\n" +
                    "========------GOOD BYE!!------========");
    }
}
