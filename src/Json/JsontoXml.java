package Json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import static Json.ReadJSON.read;

public class JsontoXml
{
    private static JSONObject object = new JSONObject();
    private static Hospital hospital;
    public static String nameXml = null;
    public JsontoXml(File file, String nameXml)
    {
        JSONParser parser = new JSONParser();
        try
        {
            this.object = (JSONObject) parser.parse(new FileReader(file.getAbsoluteFile()));
        }
        catch (IOException | ParseException ex)
        {
            Logger.getLogger(JsontoXml.class.getName());
        }
        this.nameXml = nameXml;
    }
    public static void ParsingJsonToXML()
    {
        Reading();
        Saving();
    }
    private static void Reading()
    {
        hospital = read(object);
    }
    private static void Saving()
    {
        SaveXML.save(hospital, nameXml);
    }
}
