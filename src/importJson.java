
import com.google.gson.Gson;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

/**
 * Created by Leemets on 16.11.2015.
 */
public class importJson {
    public static void main(String[] args)throws FileNotFoundException, NoSuchFieldException, IllegalAccessException{

        FileReader reader = new FileReader("/Users/Leemets/Desktop/dpd.json");

        Gson gson= new Gson();
        KaaluObjekt[] andmed = gson.fromJson(reader, KaaluObjekt[].class);

    }

}
class KaaluObjekt
{
    double kg;
    double m3;
    Tsoonid estonia;
    Tsoonid latvia;
    Tsoonid lithuania;
}
class Tsoonid
{
    double zone1;
    double zone2;
    double zone3;
    double zone4;

}

