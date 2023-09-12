package ra;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //Nhập vào thông tin sách gồm mã sách, tên sách, giá, tác giả và in thông tin ra màn hình
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách:");
        String bookId = scanner.nextLine();
        System.out.println("Nhập vào tên sách:");
        String bookName = scanner.nextLine();
        System.out.println("Nhập vào giá sách:");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào tác giả sách:");
        String author = scanner.nextLine();
        //In thông tin sách
        System.out.println("***************THÔNG TIN SÁCH**************");
        System.out.printf("Mã sách: %s - Tên sách: %s\n",bookId,bookName);
        System.out.printf("Giá sách: %f - Tác giả: %s\n",price,author);
    }
}
