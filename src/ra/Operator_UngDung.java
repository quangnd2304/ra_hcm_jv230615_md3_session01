package ra;

public class Operator_UngDung {
    public static void main(String[] args) {
        /*
        * number1 = 10, number2 = 20, number3 = 30, number4 = 40
        * Thực hiện biểu thức sau:
        * (number1==20||number2==20)&&((number3>=30&&number4<=40)||(!(number2<=18)))
        * */
        //B1: number1==20 --> result1 = false
        //B2: number2==20 --> result2 = true
        //B3: result1 || result2 --> false || true --> result3 = true
        //B4: number3>=30 --> result4 = true
        //B5: number4<=40 --> result5 = true
        //B6: result4 && result5 --> true && true --> result6 = true
        //B7: number2<=18 --> result7 = false;
        //B8: !result7 --> !false--> result8 = true
        //B9: result6 || result8 --> true || true --> result9 = true
        //B10: result3 || result9 --> true || true --> resultFinal = true
    }
}
