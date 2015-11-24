package Projekt;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * Created by Leemets on 16.11.2015.
 */
public class importJson {

    public importJson () throws FileNotFoundException, NoSuchFieldException, IllegalAccessException{

        FileReader reader = new FileReader("/Users/Leemets/Desktop/dpd.json");

        Gson gson= new Gson();
        KaaluObjekt[] andmed = gson.fromJson(reader, KaaluObjekt[].class);


        double hind = 0;

        for (int i = 0; i < andmed.length; i++) {
            if (andmed[i].kg == 5) {
                // Tegelt saab otse ka: andmed[i].latvia.zone2
                // Aga kui tahta muutujatega väärtust kätte saada on veits keerukam:
                Object riigiAndmed = andmed[i].getClass().getDeclaredField("estonia").get(andmed[i]); // andmed[5kg]->latvia
                Object tsooniAndmed = riigiAndmed.getClass().getDeclaredField("zone1").get(riigiAndmed); // latvia->zone2
                hind = (double) tsooniAndmed; // (double) zone2
            }
        }
        System.out.println(hind);




}

    class KaaluObjekt
{
    double kg;
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
}

