package com.lanou3g.yesterday.realtoday;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Quiz {
    private  int num = 0;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        Quiz quiz = new Quiz();
        System.out.println(quiz.reversal("乐快多在自由自,3948745978327387,987654321！福祝上献界世的好美为"));
        File file= new File("G:\\java\\io\\file\\temp");
        file.createTempFile("java文件",".java",file);

    }
    public String reversal(String str){

        char[] chars = str.toCharArray();
        if (num < chars.length / 2){
            char temp = chars[num];
            chars[num] = chars[chars.length - 1 - num];
            chars[chars.length - 1 - num] = temp;
            str = String.valueOf(chars);
            num++;
            str = reversal(str);
        }
            return str;

    }
}
