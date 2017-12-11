package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException {
        //用来帮我们将.xml文件
        //弄到java世界中来的一个工具类
        SAXReader saxReader = new SAXReader();
        //File：文件
        //括号中的字符串，是要找到那个文件，就填入那个文件的路径
        Document document = saxReader.read(new File("src\\Data.xml"));
        //获得文档的根节点
        //就是data.xml中的<students>标签
        Element root = document.getRootElement();
        //获得<students>中的<student>标签
        Element student = root.element("student");
        List student1 = root.elements("student");

        //获得<student>标签下的name属性
        Attribute name = student.attribute("name");
        //获得name属性的值
        String value = name.getValue();
        System.out.println(value);
    }

    public static void allEles(Element e){
        List<Attribute> attributes =
                e.attributes();

        for (int i = 0; i < attributes.size(); i++) {
            Attribute attr =
                    attributes.get(i);

            System.out.println(
                    "属性名为："+attr.getName()
                            +"\t属性值为："+attr.getValue());
        }

        String text = e.getText();
        System.out.println("当前元素的文本为："+text);


        List<Element> elements =
                e.elements();

        //如果没有子标签，则结束这个方法
        if(elements.size() == 0){
            return;
        }


        for (int i = 0; i < elements.size(); i++) {
            //获得第i个子标签

            Element ele = elements.get(i);

            //扔到allELes这个方法中
            allEles(ele);
        }





    }

}
