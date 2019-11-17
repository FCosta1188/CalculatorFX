package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    //GUI declaration
    @FXML
    Label lblResult, lblExpression;
    @FXML
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @FXML
    Button btnSign, btnDot, btnEqual, btnPlus, btnMinus, btnTimes, btnDiv, btnPercentage;
    @FXML
    Button btnDelete, btnCancel;

    //Variable declaration
    String result;
    int op1, op2; //op1 stores current result


    @FXML
    public void btn0Click(ActionEvent event) {
        result = result.concat("0");
        lblResult.setText("btn0");
        System.out.println("btn0");
    }

    @FXML
    public void btn1Click(ActionEvent event) {
        result = result.concat("1");
        lblResult.setText("btn1");
        System.out.println("btn1");
    }

    @FXML
    public void btn2Click(ActionEvent event) {
        result = result.concat("2");
        lblResult.setText("btn2");
        System.out.println("btn2");
    }

    @FXML
    public void btn3Click(ActionEvent event) {
        result = result.concat("3");
        lblResult.setText("btn3");
        System.out.println("btn3");
    }

    @FXML
    public void btnSignClick(ActionEvent event) {

    }

    @FXML
    public void btnDotClick(ActionEvent event) {

    }

    @FXML
    public void btnEqualClick(ActionEvent event) {

    }

    @FXML
    public void btnPlusClick(ActionEvent event) {

    }

    @FXML
    public void btnMinusClick(ActionEvent event) {

    }

    @FXML
    public void btnTimesClick(ActionEvent event) {

    }

    @FXML
    public void btnDivClick(ActionEvent event) {

    }

}//Controller
