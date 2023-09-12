package ra;

public class OperatorDemo {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;
        //B1: number3 = number1 --> number3 = 10
        //B2: number1++ --> number1 = 11
        int number3 = number1++;//number3=10
        //B1: ++number2 --> number2 = 11
        //B2: number4 = number2 --> number4 = 11
        int number4 = ++number2;//number4=11
        System.out.println("Giá trị number1: " + number1);
        System.out.println("Giá trị number2: " + number2);
        System.out.println("Giá trị number3: " + number3);//number3=11
        System.out.println("Giá trị number4: " + number4);//number4=11
        int number5 = 20;
        boolean result = !(number5>22);
        //B1: number5>22 --> false
        //B2: !false --> true
        System.out.println("Kết quả so sánh: "+result);

        int number6 = 15;
        int number7 = 10;
        boolean resultLogic = (number6>12)&&(number7==14);
        //B1: number>12 --> result1: true
        //B2: number7==14 --> result2: false
        //B3: result1 && result2 --> true && false --> false
        //true && true --> true
        //true && false --> false
        //false && false --> false
        //true || true --> true
        //true || false --> true
        //false || false --> false
        //!true --> false
        //!false --> true
        System.out.println("Kết quả biểu thức điều kiện: "+resultLogic);

    }
}
