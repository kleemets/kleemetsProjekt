import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;


/**
 * Created by Leemets on 16.11.2015.
 */
public class Projekt extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

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
                    Label a1= new Label("Tallinn 10000-19999");
                    Label b1= new Label("Jõhvi 41531-42599");
                    Label b2 = new Label("Jüri 75301");
                    Label b3= new Label("Lagedi/Peetri/Rae 75303-75312");
                    Label b4= new Label("Maardu 74102-74199");
                    Label b5= new Label("Pärnu 80010-80401");
                    Label b6= new Label("Rakvere 44301-44317");
                    Label b7= new Label("Saku 75501");
                    Label b8= new Label("Saue 76401");
                    Label b9= new Label("Keila 76505-76601");
                    Label b10= new Label("Tabasalu/Harku 76901-76902");
                    Label b11= new Label("Tartu 50000-60102");
                    Label b12= new Label("Tartumaa 60512-60545");
                    Label b13= new Label("Tartumaa2 61400-61499");
                    Label b14= new Label("Tartumaa3 61700-61999");
                    Label b15= new Label("Tartumaa4 62100-62299");
                    Label b16= new Label("Viimsi 74001-74002");
                    Label b17= new Label("Viljandi 71001-71033");
                    Label c1 = new Label("Elva 61501-61510");
                    Label c2 = new Label("Haapsalu 90401-90403");
                    Label c3 = new Label("Jõgeva 48302-48309");
                    Label c4 = new Label("Kärdla 92401-92429");
                    Label c5 = new Label("Kohtla-Järve 30102-30328");
                    Label c6 = new Label("Kuressaare 93801-93820");
                    Label c7 = new Label("Märjamaa 78301-78318");
                    Label c8 = new Label("Narva 20103-21020");
                    Label c9 = new Label("Otepaa 67401-67407");
                    Label c10 = new Label("Paide 72701-72720");
                    Label c11 = new Label("Põltsamaa 48102-48106");
                    Label c12 = new Label("Põlva 63302-63399");
                    Label c13 = new Label("Rapla 79502-79515");
                    Label c14 = new Label("Sillamäe 40201-40233");
                    Label c15 = new Label("Türi 72201-72215");
                    Label c16 = new Label("Valga 68201-68209");
                    Label c17 = new Label("Võru 65602-65620");
                    Label d1 = new Label("Muu Eesti");

                    GridPane linnad = new GridPane();
                    linnad.setGridLinesVisible(true);


                    ToggleGroup g = new ToggleGroup();
                    ToggleButton tsoon1= new ToggleButton("Tsoon 1");
                    ToggleButton tsoon2= new ToggleButton("Tsoon 2");
                    ToggleButton tsoon3 = new ToggleButton("Tsoon 3");
                    ToggleButton tsoon4 = new ToggleButton("Tsoon 4");
                    tsoon1.setToggleGroup(g);
                    tsoon2.setToggleGroup(g);
                    tsoon3.setToggleGroup(g);
                    tsoon4.setToggleGroup(g);

                    linnad.add(tsoon1,1,1);
                    linnad.add(tsoon2,2,1);
                    linnad.add(tsoon3,3,1);
                    linnad.add(tsoon4,4,1);

                    linnad.add(a1,1,2);
                    linnad.add(b1,2,2);
                    linnad.add(b2,2,3);
                    linnad.add(b3,2,4);
                    linnad.add(b4,2,5);
                    linnad.add(b5,2,6);
                    linnad.add(b6,2,7);
                    linnad.add(b7,2,8);
                    linnad.add(b8,2,9);
                    linnad.add(b9,2,10);
                    linnad.add(b10,2,11);
                    linnad.add(b11,2,12);
                    linnad.add(b12,2,13);
                    linnad.add(b13,2,14);
                    linnad.add(b14,2,15);
                    linnad.add(b15,2,16);
                    linnad.add(b16,2,17);
                    linnad.add(b17,2,18);
                    linnad.add(c1,3,2);
                    linnad.add(c2,3,3);
                    linnad.add(c3,3,4);
                    linnad.add(c4,3,5);
                    linnad.add(c5,3,6);
                    linnad.add(c6,3,7);
                    linnad.add(c7,3,8);
                    linnad.add(c8,3,9);
                    linnad.add(c9,3,10);
                    linnad.add(c10,3,11);
                    linnad.add(c11,3,12);
                    linnad.add(c12,3,13);
                    linnad.add(c13,3,14);
                    linnad.add(c14,3,15);
                    linnad.add(c15,3,16);
                    linnad.add(c16,3,17);
                    linnad.add(c17,3,18);
                    linnad.add(d1,4,2);

                    Scene stseen2 = new Scene(linnad);
                    lava1.setScene(stseen2);



                }else if (newValue.equals("Latvia")){
                    Button test2 = new Button();
                    test2.setText("LÄTI!!");
                    Pane linnad2=new Pane();
                    Scene stseen3 = new Scene(linnad2, 300, 400);
                    lava1.setScene(stseen3);
                    linnad2.getChildren().add(test2);
                }else {
                    newValue.equals("Lithuania");
                    Button test3 = new Button();
                    test3.setText("Leedu!");
                    Pane linnad3 = new Pane();
                    Scene stseen4 = new Scene(linnad3, 200,300);
                    lava1.setScene(stseen4);
                    linnad3.getChildren().add(test3);

                }
            }




        });



    }


}
