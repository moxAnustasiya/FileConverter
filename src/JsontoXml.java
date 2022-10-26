import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class JsontoXml
{
    private static JSONObject object = new JSONObject();
    private static Hospital hospital;
    public JsontoXml(File file)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object object = (JSONObject) parser.parse(new FileReader(file.getName()));
            this.object = (JSONObject) object;
        }
        catch (IOException | ParseException ex) {
            Logger.getLogger(JsontoXml.class.getName());}
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
        SaveXML.save(hospital);
    }
}