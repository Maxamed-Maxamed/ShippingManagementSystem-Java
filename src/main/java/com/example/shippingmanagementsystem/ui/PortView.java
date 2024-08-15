package com.example.shippingmanagementsystem.ui;

import com.example.shippingmanagementsystem.model.ShippingManagementSystem;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.shippingmanagementsystem.model.Port;
public class PortView {

    private ShippingManagementSystem system;

    public PortView(ShippingManagementSystem system) {
        this.system = system;
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Add Port");

        TextField txtName = new TextField();
        txtName.setPromptText("Port Name");

        TextField txtCode = new TextField();
        txtCode.setPromptText("Port Code");

        TextField txtCountry = new TextField();
        txtCountry.setPromptText("Country");

        Button btnAdd = new Button("Add Port");
        btnAdd.setOnAction(e -> {
            String name = txtName.getText();
            String code = txtCode.getText();
            String country = txtCountry.getText();
            system.addPort(name, code, country);
            stage.close();
        });

        VBox vbox = new VBox(10, txtName, txtCode, txtCountry, btnAdd);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

}
