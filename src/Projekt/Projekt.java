package Projekt;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileNotFoundException;


/**
 * Created by Leemets on 16.11.2015.
 */
public class Projekt {

    public Projekt() {

        //Loob ekraan, mille pealkiri on Hinna kalkulatsioon ning ei lase ekraani suurust muuta
        Stage lava1 = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 300, 250);
        lava1.setScene(stseen);
        lava1.setTitle("Hinna kalkulatsioon");
        lava1.setResizable(false);
        lava1.show();


        Label riik = new Label("Vali pakisaatmist sihtkoht");
        riik.setTranslateY(5);
        riik.setTranslateX(10);


        ChoiceBox<String> cb = new ChoiceBox(FXCollections.observableArrayList("Estonia", "Latvia", "Lithuania"));
        cb.setTranslateX(25);
        cb.setTranslateY(25);

        pane.getChildren().addAll(cb, riik);

        cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (newValue.equals("Estonia")){
                    lava1.close();
                   new Estonia();



                }else if (newValue.equals("Latvia")){
                    lava1.close();
                    new Latvia();


                }else {
                    newValue.equals("Lithuania");
                    lava1.close();
                    new Lithuania();

                }
            }

        });


    }

}
