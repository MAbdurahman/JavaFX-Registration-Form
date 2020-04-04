package com.mahdi_abdurrahman.model;

import javafx.scene.control.Alert;
import javafx.stage.Window;

public class ValidatorHelper {

    public static void showAlertHelper(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();

    }//end of the showAlertHelper Method
}//end of the ValidatorHelper Class
