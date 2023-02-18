import java.util.Scanner;

public class doc1songuyengom3chuso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số nguyên gồm ba chữ số: ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;

        String[] digitNames = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        System.out.println(digitNames[firstDigit] + " trăm " + digitNames[secondDigit] + " mươi " + digitNames[thirdDigit]);
    }
}
