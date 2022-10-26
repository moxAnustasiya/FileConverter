package Xml;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveJson
{
    private static String FILENAME= null;

    public static void save(Hospital hosp, String nameJson)
    {
        FILENAME = nameJson;
        JSONObject jsonHosp = new JSONObject();
        JSONObject jsonPatients = new JSONObject();
        JSONArray patients = new JSONArray();
        for (int i = 0; i < hosp.getDepartments().size(); i++)
        {
            for (int j = 0; j < hosp.get(i).getWard().size(); j++)
            {
                for (int y = 0; y < hosp.get(i,j).getPatients().size(); y++)
                {
                    JSONObject patient = new JSONObject();
                    patient.put("id",hosp.get(i,j,y).getId());
                    patient.put("name",hosp.get(i,j,y).getName());
                    patient.put("surname",hosp.get(i,j,y).getSurname());
                    patient.put("diagnosis",hosp.get(i,j,y).getDiagnosis());
                    patient.put("ward number",hosp.get(i,j).getNum());
                    patient.put("department",hosp.get(i).getTitle());
                    patients.add(patient);
                }
            }
        }
        jsonPatients.put("Patients", patients);
        jsonHosp.put("Hospital", jsonPatients);
        try (FileWriter writer = new FileWriter(FILENAME))
        {
            writer.write(jsonHosp.toJSONString());
            writer.flush();
        }
        catch (IOException ex)
        {
            Logger.getLogger(SaveJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
