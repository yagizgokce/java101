package notOrtalama.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fiz,kim,tr,trh,muz;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();

        System.out.print("Turkce Notunuzu : ");
        tr = input.nextInt();

        System.out.print("Tarih Notunuzu : ");
        trh = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muz = input.nextInt();

        int sum = (mat+fiz+kim+tr+trh+muz);
        double average = sum/6;

        System.out.println("Ortalamaniz : " + average);

        boolean result = average >= 60;

        System.out.print(result ? "Sinifi Gectiniz" : "Sinifta Kaldiniz");

    }
}
