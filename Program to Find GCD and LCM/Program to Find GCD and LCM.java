import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {

    // İki sayının EBOB'unu (GCD) hesaplayan fonksiyon
    public static int ebob(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // İki sayının EKOK'unu (LCM) hesaplayan fonksiyon
    public static int ekok(int a, int b, int ebob) {
        return (a * b) / ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        // EBOB hesaplanır
        int ebobValue = ebob(num1, num2);

        // EKOK hesaplanır
        int ekokValue = ekok(num1, num2, ebobValue);

        // Sonuçlar ekrana yazdırılır
        System.out.println("EBOB (" + num1 + ", " + num2 + ") = " + ebobValue);
        System.out.println("EKOK (" + num1 + ", " + num2 + ") = " + ekokValue);

        scanner.close();

    }
}

