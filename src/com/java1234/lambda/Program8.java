package com.java1234.lambda;

/**
 * @program: lambda_pro
 * @ClassName Program8
 * @description: 方法引用练习
 * @author: tyf19970214
 * @create: 2020-08-16 22:35
 * @Version 1.0
 **/
public class Program8 {

    public final static String vage="西红柿";

    public static void main(String[] args) {

        Care care=Program8::cookFood;
        Care care1=Program8::cookFood;

        System.out.println(care.rice("鸡蛋"));
        System.out.println(care1.rice("面条"));

    }


    public static String cookFood(String food){//公共方法
        return food+vage;
    }


    interface Care{
        String rice(String food);
    }

}
