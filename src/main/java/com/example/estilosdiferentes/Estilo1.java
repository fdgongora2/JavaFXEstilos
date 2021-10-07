package com.example.estilosdiferentes;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Estilo1 {
    @javafx.fxml.FXML
    private Label lblHoraActual;
    @javafx.fxml.FXML
    private Label lblHoraLondres;
    @javafx.fxml.FXML
    private GridPane root;

    @javafx.fxml.FXML
    public void onBtnHoraClicked(ActionEvent actionEvent) {
      System.out.println("Pulsado el botón Hora - " + actionEvent.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        lblHoraActual.setText(dtf.format(now));

        lblHoraActual.setFont(Font.font("Arial"));
    }

    @javafx.fxml.FXML
    public void onBtnHoraLondresClicked(ActionEvent actionEvent) {
        System.out.println("Pulsado el botón Hora Londres - " + actionEvent.toString());
    }

    @javafx.fxml.FXML
    public void onMenuSetEstilo1(ActionEvent actionEvent) {

        root.getStylesheets().add(getClass().getResource("estilo1.css").toExternalForm());
    }

    @javafx.fxml.FXML
    public void onMenuBorrarEstilos(ActionEvent actionEvent) {
        root.getStylesheets().clear();
    }
}
