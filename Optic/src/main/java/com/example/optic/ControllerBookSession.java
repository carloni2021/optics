package com.example.optic;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerBookSession {
    @FXML
    private Pane id;
    private double xOffset = 0;
    private double yOffset = 0;

    public void exitButton(ActionEvent e){
        Platform.exit();
    }
    public void reduceButton(ActionEvent e){
        Stage obj = (Stage) id.getScene().getWindow();
        obj.setIconified(true);
    }
    public void drag(MouseEvent e){
        Stage obj = (Stage) id.getScene().getWindow();
        obj.setX(e.getScreenX() + xOffset);
        obj.setY(e.getScreenY() + yOffset);
    }
    public void toProfile(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Optic.class.getResource("userProfile.fxml"));
        Stage obj = (Stage) id.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1200, 720);
        scene.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                obj.setX(event.getScreenX() - xOffset);
                obj.setY(event.getScreenY() - yOffset);
            }
        });
        scene.setFill(Color.TRANSPARENT);
        obj.setScene(scene);
        obj.show();
    }
    public void toHome(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Optic.class.getResource("userHomeMap.fxml"));
        Stage obj = (Stage) id.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1200, 720);
        scene.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                obj.setX(event.getScreenX() - xOffset);
                obj.setY(event.getScreenY() - yOffset);
            }
        });
        scene.setFill(Color.TRANSPARENT);
        obj.setScene(scene);
        obj.show();
    }
    public void toLogin(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Optic.class.getResource("login.fxml"));
        Stage obj = (Stage) id.getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1200, 720);
        scene.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                obj.setX(event.getScreenX() - xOffset);
                obj.setY(event.getScreenY() - yOffset);
            }
        });
        scene.setFill(Color.TRANSPARENT);
        obj.setScene(scene);
        obj.show();
    }
}