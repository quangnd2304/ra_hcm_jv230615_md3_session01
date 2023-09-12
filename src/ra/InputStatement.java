package ra;


import java.util.Scanner;

public class InputStatement {
    public static void main(String[] args) {
        //Nhập vào tên sinh viên và in ra màn hình console
        //Bước 1: Nhập vào tên sinh viên
        //1.1. Khới tạo đối tượng Scanner của package java.util
        Scanner scanner = new Scanner(System.in);
        //1.2. Thông báo nhập
        System.out.println("Nhập vào tên sinh viên:");
        //1.3. Lấy dữ liệu nhập gán vào biến
        String studentName = scanner.nextLine();
        //Nhập vào mã sinh viên - String và in ra màn hình
        System.out.println("Nhập vào mã sinh viên: ");
        String studentId = scanner.nextLine();
        //Nhập vào tuổi sinh viên và in ra
        System.out.println("Nhập vào tuổi sinh viên:");
        int age = scanner.nextInt();
        //Nhập vào điểm trung bình của sinh viên - float
        System.out.println("Nhâp vào điểm trung bình:");
        float avgMark = scanner.nextFloat();
        scanner.nextLine();
        //Nhập vào địa chỉ sinh viên - String
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        //Bước 2: In thông tin tên sinh viên ra màn hình
        System.out.println("Tên sinh viên là: " + studentName);
        System.out.println("Mã sinh viên là: " + studentId);
        System.out.println("Tuổi sinh viên là: " + age);
        System.out.println("Điểm trung bình: "+avgMark);
        System.out.println("Địa chỉ sinh viên: "+address);
    }
}
