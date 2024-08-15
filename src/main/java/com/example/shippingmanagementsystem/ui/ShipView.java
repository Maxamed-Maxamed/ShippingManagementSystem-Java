package com.example.shippingmanagementsystem.ui;
import com.example.shippingmanagementsystem.model.ShippingManagementSystem;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ShipView {

    private ShippingManagementSystem system;

    public ShipView(ShippingManagementSystem system) {
        this.system = system;
    }

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("Add Container Ship");

        TextField txtName = new TextField();
        txtName.setPromptText("Ship Name");

        TextField txtIdentifier = new TextField();
        txtIdentifier.setPromptText("Ship Identifier");

        TextField txtFlagState = new TextField();
        txtFlagState.setPromptText("Flag State");

        TextField txtPhotoURL = new TextField();
        txtPhotoURL.setPromptText("Photo URL");

        Button btnAdd = new Button("Add Ship");
        btnAdd.setOnAction(e -> {
            String name = txtName.getText();
            String identifier = txtIdentifier.getText();
            String flagState = txtFlagState.getText();
            String photoURL = txtPhotoURL.getText();
            system.addContainerShip(name, identifier, flagState, photoURL);
            stage.close();
        });

        VBox vbox = new VBox(10, txtName, txtIdentifier, txtFlagState, txtPhotoURL, btnAdd);
        vbox.setPadding(new Insets(10));
        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

}
