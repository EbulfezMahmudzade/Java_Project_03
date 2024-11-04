package task03;

import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan satır sayısını alın
        System.out.print("Satır sayısını girin: ");
        int numRows = scanner.nextInt();

        // Pascal üçgenini oluşturup ekrana yazdırın
        printPascalTriangle(numRows);

        scanner.close();
    }

    // Pascal üçgenini oluşturan fonksiyon
    public static void printPascalTriangle(int numRows) {
        System.out.println("Pascal Üçgeni:");

        for (int i = 0; i < numRows; i++) {
            // Her satırın başına uygun sayıda boşluk ekleyerek ortalamak
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.print(" ");
            }
            int number = 1;
            // Her satırdaki sayıları oluşturan iç içe döngü5
            for (int j = 0; j <= i; j++) {
                // Sayıyı yazdır
                System.out.print(number + " ");
                // Pascal üçgenindeki sayıyı hesapla
                number = number * (i - j) / (j + 1);
            }
            // Bir satır tamamlandığında yeni satıra geç
            System.out.println();
        }
    }
}
