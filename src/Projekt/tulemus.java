package Projekt;

import javax.swing.*;

/**
 * Created by Leemets on 24.11.2015.
 */
public class tulemus {

    public tulemus() {

        double kg = new Double(JOptionPane.showInputDialog("Palun sisesta paki kaal"));
        Long L = Math.round(kg);
        int kg2 = Integer.valueOf(L.intValue());
        System.out.println(kg2);


        if (kg2 >= 5) {


        }

    }
}

