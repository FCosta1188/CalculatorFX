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
    Button btnBackspace, btnCancel;

    //Variable declaration
    String result = "";
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
    public void btn4Click(ActionEvent event) {
        result = result.concat("4");
        lblResult.setText("btn4");
        System.out.println("btn4");
    }

    @FXML
    public void btn5Click(ActionEvent event) {
        result = result.concat("5");
        lblResult.setText("btn5");
        System.out.println("btn5");
    }

    @FXML
    public void btn6Click(ActionEvent event) {
        result = result.concat("6");
        lblResult.setText("btn6");
        System.out.println("btn6");
    }

    @FXML
    public void btn7Click(ActionEvent event) {
        result = result.concat("7");
        lblResult.setText("btn7");
        System.out.println("btn7");
    }

    @FXML
    public void btn8Click(ActionEvent event) {
        result = result.concat("8");
        lblResult.setText("btn8");
        System.out.println("btn8");
    }

    @FXML
    public void btn9Click(ActionEvent event) {
        result = result.concat("9");
        lblResult.setText("btn9");
        System.out.println("btn9");
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

    @FXML
    public void btnPercentageClick(ActionEvent event) {

    }

    @FXML
    public void btnBackspaceClick(ActionEvent event) {

    }

    @FXML
    public void btnCancelClick(ActionEvent event) {

    }

}//Controller
