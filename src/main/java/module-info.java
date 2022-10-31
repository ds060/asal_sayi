module com.example.asal_sayi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asal_sayi to javafx.fxml;
    exports com.example.asal_sayi;
}