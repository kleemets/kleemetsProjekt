/**
 * Created by Leemets on 1.11.2015.
 */
import java.io.*;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.json.*;

public class Projekt{

    public static void main(String[] args) {
        JSONParser pars= new JSONParser();

        try {
            Object obj = pars.parse(new FileReader("C:\\Users\\Leemets\\Desktop\\dpd.json"));
       
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
