package com.lanou3g.yesterday.realtoday;

import com.lanou3g.yesterday.realtoday.exception.EatException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File fire = new File("G:\\java\\io\\src\\io\\file\\temp\\package-info.java");
        if (!fire.getParentFile().exists()) {
            // 如果不存在，则创建目录
            fire.getParentFile().mkdirs();
        }
        System.out.println(fire.exists());
        fire.delete();
        FileOutputStream fos = new FileOutputStream(fire);
        byte[] b = "abc,这是我写入的证据。打开后，可以看到hight ".getBytes();
        fos.write(b);
        // 关闭流
        fos.close();
//        showSimple();
        //自定义异常
//        showSecond();
        ChunLai chunLai = new ChunLai();
        try {

            chunLai.eat(800);

        } catch (EatException e) {
            try {
                chunLai.eat(800);
            } catch (EatException e1) {
                e1.printStackTrace();
            }
        }
    }

    private static void showSecond() {
//        try {
//            new ChunLai().eat(230);
//        } catch (NotEnoughException e) {
//            try {
//                new ChunLai().eat(230);
//            } catch (NotEnoughException e1) {
//                e1.printStackTrace();
//            } catch (TooMuchException e1) {
//                e1.printStackTrace();
//            }
//        } catch (TooMuchException e) {
//            e.printStackTrace();
//        }
    }

    private static void showSimple() {
        String name = "23244545";
        int n = 10;
        try {
            System.out.println(Integer.parseInt(name));
        } catch (Exception e) {
            System.out.println("assfdf");
        }

        /*
          在try中，写可能会出现异常的代码
          如果执行该代码时出现异常
          则代码会跳转至catch块中
         */
        try {
            int result = n / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());
            //方法执行到return的时候哦
            //就会返回一个值
            //这里的返回值类型为void
            //表示没有返回值，直接写一个return就行了
            return;
        } finally {
            //在finally中，是一定会执行的代码
            //就是不管是报错了还是没报错
            //都会执行
            System.out.println("哈哈哈哈哈哈哈哈哈");
        }
    }
}
