package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControllerLogin {
    @FXML
    TextField txtUsuario,txt_Password;

    public void login(ActionEvent event){
        String i=txtUsuario.getText();
        String m=txt_Password.getText();
        if (i.equals("yo")&& m.equals("12345")){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                Scene scene=new Scene(root,1000,500);
                Main.stage.setScene(scene);
                Main.stage.centerOnScreen();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            Alert alerta=new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Pasteleria M&M");
            alerta.setContentText("Datos Incorretos");
            alerta.show();
        }

    }






























}
