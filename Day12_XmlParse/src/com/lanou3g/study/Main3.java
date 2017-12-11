package com.lanou3g.study;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        //创建一个document对象
        Document document = DocumentHelper.createDocument();
        //在doccument对象中，添加一个元素
        //元素的名字为syudent
        //并且，将添加的这个元素
        //返回给element这个引用
        Element element = document.addElement("students");
        element.addText("我是一堆学生");
        Element student = element.addElement("student");
        student.addAttribute("name","张三");
        student.addText("我是张三的文本");
        Element score = student.addElement("score");
        score.addText("3000");
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src\\output.xml"),outputFormat);

        xmlWriter.write(document);
        //将这个工具关闭，并且把工具里的内容，写进目标文件中
        xmlWriter.close();
    }
}
