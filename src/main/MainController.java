package main;

import com.mahdi_abdurrahman.model.Validator;
import com.mahdi_abdurrahman.model.ValidatorHelper;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class MainController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    /**
     * handleSubmitButtonAction Method -
     */
    @FXML
    protected void handleSubmitButtonAction() {
        Window window = submitButton.getScene().getWindow();
        Validator validation = new Validator();
        String errorMsg = "";
        errorMsg += validation.isFullNameValid(nameField.getText(), "In Name field");
        errorMsg += validation.isEmailValid(emailField.getText(), "In Email field");
        errorMsg += validation.isPasswordValid(passwordField.getText(), "Password");

        if(errorMsg.isEmpty()) {
            ValidatorHelper.showAlertHelper(Alert.AlertType.INFORMATION, window, " Registration Successful",
                    "Welcome " + nameField.getText());

        } else {
            ValidatorHelper.showAlertHelper(Alert.AlertType.ERROR, window, " Invalid Data", errorMsg);

        }
    }//end of the handleSubmitButtonAction Method
}//end of the MainController Class
