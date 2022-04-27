
public class ModUs_Alma {
    public static void main(String[] args) {
        int taban = 2, kuvvet = 3;

        long sonuc = 1;

        while (kuvvet != 0)
        {
            sonuc *= taban;
            --kuvvet;
        }

        System.out.println("CEVAP = " + sonuc);
        }
    }
