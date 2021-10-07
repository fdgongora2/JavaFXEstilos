module com.example.estilosdiferentes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estilosdiferentes to javafx.fxml;
    exports com.example.estilosdiferentes;
}