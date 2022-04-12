import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                Persegi persegi = new Persegi(scan.nextInt());
                persegi.luasPersegi();
                break;
            case 2:
                Segitiga segitiga = new Segitiga(scan.nextInt(), scan.nextInt());
                segitiga.luasSegitiga();
                break;
            case 3:
                int input = scan.nextInt();
                Lingkaran lingkaran = new Lingkaran(input);
                if (input % 7 == 0) {
                    lingkaran.luasLingkaran1();
                } else {
                    lingkaran.luasLingkaran2();
                }
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }

    }

}

class Persegi {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;

    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        System.out.print(luas);
        return luas;
    }
}

class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;

    }

    public int luasSegitiga() {
        int luas = (alas * tinggi) / 2;
        System.out.print(luas);
        return luas;
    }

}

class Lingkaran {
    int r;

    Lingkaran(int r) {
        this.r = r;

    }

    public int luasLingkaran1() {

        int luas = (int) (22 / 7 * r * r);
        System.out.print((double) luas);
        return luas;

    }

    public int luasLingkaran2() {
        int luas = (int) (3.14 * r * r);
        System.out.print((double) luas);
        return luas;

    }

}