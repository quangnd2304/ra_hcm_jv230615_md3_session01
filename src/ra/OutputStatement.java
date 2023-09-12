package ra;

public class OutputStatement {
    public static void main(String[] args) {
        //1. In ra màn hình nội dung Xin chào lớp HCM_JV230615, sau khi in xong xuống dòng
        //Thread Stream out
        System.out.println("Xin chào lớp HCM_JV230615");
        //2. In ra màn hình nội dung Chào bạn Châu xinh đẹp, sau khi in xong không xuống dòng
        System.out.print("Xin chào bạn Châu xinh đẹp");
        System.out.println("Xuống dòng");
        //3. Khai báo biến number1 có giá trị là 10, in ra giá trị biến number1
        int number1 = 10;
        //String + integer --> String
        System.out.println("Giá trị của biến number1 là: "+number1);
        //4. In ra chuỗi có định dạng
        System.out.printf("Giá trị số nguyên: %d, số thực: %f, \tkiểu boolean: %b, kiểu String: %s\n",8,8.9,true,"abc",10);
        //System.out.printf: Chuỗi định dạng có bao nhiêu định dạng dữ liệu
        // thì phải truyền từng đó giá trị có kiểu dữ liệu tương ứng
        //5. In ra lỗi có nội dụng Lớp HCM_JV230615 không thông minh
        //Stream Thread Error
        System.err.println("Lớp HCM_JV230615 không thông minh");
    }
}
