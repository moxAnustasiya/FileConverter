import Json.JsontoXml;
import Xml.XmltoJson;

import java.io.File;
import java.util.Scanner;

public class MainTest
{
    public static void main(String[] args)
    {
        System.out.println("Введите имя файла с расширением xml: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverterService\\"
                +name+".xml";
        File file = new File(fileName);
        XmltoJson parserxml = new XmltoJson(file);
        parserxml.ParsingXMLtoJSON();
        fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverterService\\Пациент.json";
        file = new File((fileName));
        JsontoXml parserjson = new JsontoXml(file);
        parserjson.ParsingJsonToXML();
    }
}
