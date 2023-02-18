import java.util.Scanner;

public class kiemtrasochinhphuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so chinh phuong: ");
        int number = input.nextInt();

        // tính căn bậc 2 của số đó
        double squareRoot = Math.sqrt(number);

        // kiểm tra xem căn bậc 2 có phải là số nguyên hay không
        if (squareRoot == (int)squareRoot) {
            System.out.println(number + " la so chinh phuong.");
        } else {
            System.out.println(number + " khong phai la so chinh phuong.");
        }
    }
}
             