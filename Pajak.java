import java.util.Scanner;
public class Pajak {
    public static void main(String[] args) {
        double jumlahjam, tarifperjam, pajak, hasil;

        Scanner scan = new Scanner(System.in);
        System.out.println("jumlahjam");
        jumlahjam=scan.nextDouble();
        System.out.println("tarifperjam");
        tarifperjam=scan.nextDouble();
        System.out.println("pajak");
        pajak=scan.nextDouble();
       
        hasil= jumlahjam*tarifperjam;
        pajak= pajak/10*tarifperjam;

        hasil = hasil-pajak;
        System.out.println("hasil: "+hasil);


    


    }

}