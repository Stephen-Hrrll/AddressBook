package com.addressbook;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class MainWindow extends BorderPane {
    public MainWindow() {
        // Create a tab pane to hold the different pages
        TabPane tabPane = new TabPane();
        
        // Create the tabs for each page and add them to the tab pane
        Tab allContactsTab = new Tab("All Contacts", new AllContactsPage());
        Tab addContactTab = new Tab("Add Contact", new AddContactPage());
        Tab findContactTab = new Tab("Find Contact", new FindContactPage());
        Tab editContactTab = new Tab("Edit/Delete Contact", new EditDeleteContactPage());
        tabPane.getTabs().addAll(allContactsTab, addContactTab, findContactTab, editContactTab);
        
        // Add the tab pane to the center of the main window
        setCenter(tabPane);
    }
}
