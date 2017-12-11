package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
   static SAXReader reader = new SAXReader();
   static Document document = null;


    public static void main(String[] args) throws Exception {


         document = reader.read(new File("src\\data.xml"));
         List<Student> students = listElements();
//        allEles(document.getRootElement());

        System.out.println(Arrays.toString(students.toArray()));
    }

    public static void allEles(Element e){
        List<Attribute> attributes = e.attributes();
        for (int i = 0; i < attributes.size(); i++){
            Attribute attr = attributes.get(i);
            System.out.println("当前元素的名为："+attr.getName()+"当前元素的值为："+attr.getValue());

        }
        String text = e.getText();
        System.out.println("当前元素的文本为：" +text);

        List<Element> elements = e.elements();
        if (elements.size()== 0) {
            return;
        }
        for (int i = 0; i < elements.size(); i++) {
            //获得第i个
            Element ele = elements.get(i);
            //扔到ele中
            allEles(ele);
        }
    }


    private static List<Student> listElements() throws DocumentException {

        Element rootElement = document.getRootElement();
        List<Element> student = rootElement.elements("student");
        List<Student> studentData = new ArrayList<>();
        for(int i = 0; i < student.size() ; i++){
            Element ele = student.get(i);
            Student stu = new Student();
            Attribute name = ele.attribute("name");
            //获得name属性的值
            String nameValue = name.getValue();
            //设置到stu这个对象中
            stu.setName(nameValue);
            Element score = ele.element("score");
            //拿到score标签中的文本
            String txt = score.getText();
            //"1001"--->1001
            stu.setScore(Integer.parseInt(txt));
            //把数据健全的学生对象，装进集合中
            studentData.add(stu);
            System.out.println("学生的名为："+nameValue +"\t 学生的分数为："+txt);
            //
        }
        return studentData;
    }
}
