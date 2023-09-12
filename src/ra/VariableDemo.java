package ra;

public class VariableDemo {
    public static void main(String[] args) {
        /*
         * Khai báo các biến chứa thông tin sinh viên:
         * - Mã sinh viên: String
         * - Tên sinh viên: String
         * - Tuổi: int
         * - Điểm trung bình: float
         * - Giới tính: boolean
         * - Điểm html, css, javascript: float        *
         *  KHAI BÁO BIẾN: Datatype VariableName;
         *  KHỞI TẠO GIÁ TRỊ BIẾN: VariableName = Value;
         *  KHAI BÁO VÀ KHỞI TẠO GIÁ TRỊ BIẾN: Datatype VariableName = Value;
         *  KHAI BÁO VÀ KHỞI TẠO GIÁ TRỊ NHIỀU BIẾN CÙNG KIỂU DỮ LIỆU:
         *  Datatype VariableName1 = Value1, VariableName2 = Value2,....,VariableNameN = ValueN;
         * */
        //1. Khai báo biến mã sinh viên
        String studentId;
        //-Khởi tạo giá trị cho biến mã sinh viên
        studentId = "SV001";
        //2. Khai báo và khởi tạo giá trị biến tên sinh viên
        String studentName = "Nguyễn Văn A";
        //3. Khai báo và khởi tạo biến tuổi sinh viên
        int age = 18;
        //4. Khai báo biến điểm trung bình sinh viên
        float avgMark;
        //5. Khai báo và khởi tạo biến điểm html, css, javascript trong 1 câu lệnh
        //9.1 --> double
        float markHtml = 9.1F, markCss = 10, markJavascript = 10;
        //Format code: Ctrl + Alt + L
        //7.8: double --> chuyển thành float --> tường minh ép kiểu dữ liệu
        //7.8F--> ép kiểu từ double thành float
        //(float)7.8
        float var_a = (float)7.8;//7.8: double > float
        //8: int --> tự chuyển thành float --> gán cho biến var_b: Ngầm định
        float var_b = 8;//8: int < float

    }
}
