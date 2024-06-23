import java.util.Scanner; // Kullanıcıdan girdi almak için Scanner sınıfını import ediyoruz.

@SuppressWarnings("ALL")

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kullanıcıdan ilk kenarı girmesi isteniyor
        System.out.println("1. Kenarı Giriniz: ");
        int a = scan.nextInt();

        // Kullanıcıdan ikinci kenarı girmesi isteniyor
        System.out.println("2. Kenarı Giriniz: ");
        int b = scan.nextInt();

        // Girilen kenarların karelerinin toplamının karekökü alınıyor
        // Bu, dik üçgenin hipotenüsünü hesaplamak için kullanılıyor
        double c = Math.sqrt((a * a) + (b * b));

        // Hesaplanan hipotenüs değeri ekrana yazdırılıyor
        System.out.println("Hipotenüs : " + c);
    }
}


