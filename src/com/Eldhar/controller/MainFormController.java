/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Eldhar.controller;

import com.Eldhar.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Developer
 */
public class MainFormController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  

    @FXML
    private void A(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/LoginForm.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageA = new Stage();
            stageA.setScene(scene);
            stageA.setTitle("Form A");
            stageA.initOwner(borderPane.getScene().getWindow());
            stageA.initModality(Modality.APPLICATION_MODAL);
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void B(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/LoginForm.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageB = new Stage();
            stageB.setScene(scene);
            stageB.setTitle("Form B");
            stageB.initOwner(borderPane.getScene().getWindow());
            stageB.initModality(Modality.APPLICATION_MODAL);
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void C(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/LoginForm.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageC = new Stage();
            stageC.setScene(scene);
            stageC.setTitle("Form C");
            stageC.initOwner(borderPane.getScene().getWindow());
            stageC.initModality(Modality.APPLICATION_MODAL);
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
