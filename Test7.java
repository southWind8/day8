package Day8;

import java.sql.SQLOutput;

/**
 * @ClassName Test7
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/28
 **/

public class Test7 {
    public static void main(String[] args) {

        int a = 10;//定义变量a，b并赋值
        int b = 20;
        System.out.println("互换前");//控制台输出变量a，b的值
        System.out.println(a);
        System.out.println(b);
        //定义一个第三方变量，不赋值
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("互换后");//控制台输出a，b互换后的值
        System.out.println(a);
        System.out.println(b);
    }
}
