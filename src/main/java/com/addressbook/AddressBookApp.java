package com.addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddressBookApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Create a new instance of the main window
        MainWindow mainWindow = new MainWindow();
        
        // Set the title and size of the main window
        stage.setTitle("Address Book");
        stage.setScene(new Scene(mainWindow, 800, 600));
        stage.show();
    }
}
