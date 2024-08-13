module com.example.shippingmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.shippingmanagementsystem to javafx.fxml;
    exports com.example.shippingmanagementsystem;
}