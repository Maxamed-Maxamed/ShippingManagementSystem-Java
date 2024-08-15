package com.example.shippingmanagementsystem.ui;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.shippingmanagementsystem.model.ShippingManagementSystem;

public class ContainerView {

    private ShippingManagementSystem system;

    public ContainerView(ShippingManagementSystem system) {
        this.system = system;
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Add Container");

        TextField txtNumber = new TextField();
        txtNumber.setPromptText("Container Number");

        TextField txtSize = new TextField();
        txtSize.setPromptText("Container Size (10, 20, or 40 feet)");

        Button btnAdd = new Button("Add Container");
        btnAdd.setOnAction(e -> {
            String number = txtNumber.getText();
            int size = Integer.parseInt(txtSize.getText());
            system.addContainer(number, size);
            stage.close();
        });

        VBox vbox = new VBox(10, txtNumber, txtSize, btnAdd);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);
        stage.show();
    }
}
