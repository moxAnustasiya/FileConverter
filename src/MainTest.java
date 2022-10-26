import Json.JsontoXml;
import Xml.XmltoJson;

import java.io.File;
import java.util.Scanner;

public class MainTest
{
    public static void main(String[] args)
    {
        System.out.println("Конвертация XML в JSON = 1\nКонвертация JSON в XML = 2\n");
        int i = Integer.parseInt(new Scanner(System.in).nextLine());
        switch (i)
        {
            case 1:
            {
                System.out.println("Введите имя файла с расширением XML: ");
                String name = new Scanner(System.in).nextLine();
                String fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverter\\"
                        + name + ".xml";
                File file = new File(fileName);
                System.out.println("Введите имя файла для сохранения в формате JSON");
                name = new Scanner(System.in).nextLine();
                fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverter\\"
                        + name + ".json";
                XmltoJson parserxml = new XmltoJson(file, fileName);
                parserxml.ParsingXMLtoJSON();
                break;
            }
            case 2:
            {
                System.out.println("Введите имя файла с расширением JSON: ");
                String name = new Scanner(System.in).nextLine();
                String fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverter\\" +
                        name + ".json";
                File file = new File((fileName));
                System.out.println("Введите имя файла для сохранения в формате XML");
                name = new Scanner(System.in).nextLine();
                fileName = "C:\\Users\\Антон\\Desktop\\ФИб5\\Практика\\Задание 2\\FileConverter\\"
                        +name+".xml";
                JsontoXml parserjson = new JsontoXml(file, fileName);
                parserjson.ParsingJsonToXML();
                break;
            }
            default:
            {
                System.out.println("Неверно введена цифра\nОшибка!");
            }
        }
    }
}
//БольницаXML