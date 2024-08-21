import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double jumlahbarang, hargabarang, diskon, total;

        Scanner scan= new Scanner(System.in);
        System.out.println("jumlah barang");
        jumlahbarang=scan.nextDouble();
        System.out.println("hargabarang");
        hargabarang=scan.nextDouble();
        System.out.println("diskon");
        diskon=scan.nextDouble();
        

        total= hargabarang*jumlahbarang;
        diskon=diskon/100*total;

        total = total-diskon;
        System.out.println("total: "+total);

        
        

        



    }

}