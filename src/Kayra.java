import java.util.Scanner;

public class Kayra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("en sevdiğin kişi kim");
        String cevap = scan.nextLine();
        if ("kayra".equals(cevap) || "Kayra".equals(cevap)) {
            System.out.println("Tebrikler! doğru cevap.");

        } else {
            while (!"kayra".equals(cevap) || !"Kayra".equals(cevap)) {
                System.out.println("Yanlış cevap! lütfen tekrar dene.");
                cevap = scan.nextLine();
                if ("kayra".equals(cevap) || "Kayra".equals(cevap)) {
                    System.out.println("Tebrikler! doğru cevap.");
                    break;
                }
            }
        }
    }
}



