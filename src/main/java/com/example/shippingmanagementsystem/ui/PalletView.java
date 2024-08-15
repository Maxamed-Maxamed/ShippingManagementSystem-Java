package com.example.shippingmanagementsystem.ui;

import com.example.shippingmanagementsystem.model.ShippingManagementSystem;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.shippingmanagementsystem.model.Pallet;
public class PalletView {

    private ShippingManagementSystem system;

    public PalletView(ShippingManagementSystem system) {
        this.system = system;
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Add Pallet");

        TextField txtDescription = new TextField();
        txtDescription.setPromptText("Description");

        TextField txtQuantity = new TextField();
        txtQuantity.setPromptText("Quantity");

        TextField txtUnitValue = new TextField();
        txtUnitValue.setPromptText("Unit Value");

        TextField txtTotalWeight = new TextField();
        txtTotalWeight.setPromptText("Total Weight");

        TextField txtTotalSize = new TextField();
        txtTotalSize.setPromptText("Total Size");

        Button btnAdd = new Button("Add Pallet");
        btnAdd.setOnAction(e -> {
            String description = txtDescription.getText();
            int quantity = Integer.parseInt(txtQuantity.getText());
            double unitValue = Double.parseDouble(txtUnitValue.getText());
            double totalWeight = Double.parseDouble(txtTotalWeight.getText());
            double totalSize = Double.parseDouble(txtTotalSize.getText());
            system.addPallet(description, quantity, unitValue, totalWeight, totalSize);
            stage.close();
        });

        VBox vbox = new VBox(10, txtDescription, txtQuantity, txtUnitValue, txtTotalWeight, txtTotalSize, btnAdd);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}
