package Day8;

import java.sql.SQLOutput;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/28
 **/

public class Test4 {
    public static void main(String[] args) {
        byte num1=-128;//定义2个byte变量，分别赋值为byte里的最大值与最小值，并输出在控制台
        byte num2= 127;
        System.out.println(num1);
        System.out.println(num2);
        short num3=-32768;//定义2个short类型变量，分别赋值short类型范围的值，并输出在控制台
        short num4=32767;
        System.out.println(num3);
        System.out.println(num4);
        int num5=-2147483648;//定义2个int类型变量，分别赋值为int类型范围内的值，并输出在控制台
        int num6=2147483647;
        System.out.println(num5);
        System.out.println(num6);
        long num7=-2147483648;//定义两个 long类型的变量，分别赋值int类型范围的值，并输出在控制台
        long num8=2147483647;
        System.out.println(num7);
        System.out.println(num8);

    }
}
