import java.util.Scanner; // Kullanıcıdan girdi almak için Scanner sınıfını import ediyoruz.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir cümle girmesini istiyoruz.
        System.out.print("Bir cümle giriniz: ");
        String sentence = scanner.nextLine().toLowerCase();

        // Kullanıcıdan bir harf seçmesini istiyoruz.
        System.out.print("Harf seçiniz: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        int frekans = 0;

        // Cümledeki her karakteri kontrol etmek için bir döngü başlatıyoruz.
        for(int i = 0; i < sentence.length(); ++i) {
            if (sentence.charAt(i) == letter) {
                ++frekans;
            }
        }

        // Harfin kaç kez geçtiğini ekrana yazdırıyoruz.
        System.out.println("Girilen cümlede " + letter + " harfi " + frekans + " kez geçmektedir.");
    }
} 
