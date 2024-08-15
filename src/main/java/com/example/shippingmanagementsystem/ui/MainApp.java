package com.example.shippingmanagementsystem.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.shippingmanagementsystem.model.ShippingManagementSystem;

import static javafx.application.Application.*;

public class MainApp {

    private ShippingManagementSystem system = new ShippingManagementSystem();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shipping Management System");

        Button btnAddPort = new Button("Add Port");
        btnAddPort.setOnAction(e -> new PortView(system).show());

        Button btnAddShip = new Button("Add Ship");
        btnAddShip.setOnAction(e -> new ShipView(system).show());

        Button btnAddContainer = new Button("Add Container");
        btnAddContainer.setOnAction(e -> new ContainerView(system).show());

        Button btnAddPallet = new Button("Add Pallet");
        btnAddPallet.setOnAction(e -> new PalletView(system).show());

        VBox vbox = new VBox(10, btnAddPort, btnAddShip, btnAddContainer, btnAddPallet);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
