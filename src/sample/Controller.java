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
    //***USING THE PERCENTAGE SIGN AS A TEXT FOR A BUTTON (btnPercentage) causes the error "Filed to open the file in scene builder" (java.lang.NullPointerException)
    //***USE \% to display the percentage sign as a text in a button (because % is a key symbol in fxml)
    Button btnSign, btnDot, btnEqual, btnPlus, btnMinus, btnTimes, btnDiv, btnPercentage;
    @FXML
    Button btnBackspace, btnCancel;

    //Variable declaration
    String result = "";
    float op1 = 0;
    float op2 = 0;
    float r = 0;
    boolean operation = false;
    String lastBtnClick = ""; //last button clicked


    @FXML
    public void btn0Click(ActionEvent event) {
        result = result.concat("0");
        lblResult.setText(result);
        System.out.println("btn0");
    }

    @FXML
    public void btn1Click(ActionEvent event) {
        result = result.concat("1");
        lblResult.setText(result);
        System.out.println("btn1");
    }

    @FXML
    public void btn2Click(ActionEvent event) {
        result = result.concat("2");
        lblResult.setText(result);
        System.out.println("btn2");
    }

    @FXML
    public void btn3Click(ActionEvent event) {
        result = result.concat("3");
        lblResult.setText(result);
        System.out.println("btn3");
    }

    @FXML
    public void btn4Click(ActionEvent event) {
        result = result.concat("4");
        lblResult.setText(result);
        System.out.println("btn4");
    }

    @FXML
    public void btn5Click(ActionEvent event) {
        result = result.concat("5");
        lblResult.setText(result);
        System.out.println("btn5");
    }

    @FXML
    public void btn6Click(ActionEvent event) {
        result = result.concat("6");
        lblResult.setText(result);
        System.out.println("btn6");
    }

    @FXML
    public void btn7Click(ActionEvent event) {
        result = result.concat("7");
        lblResult.setText(result);
        System.out.println("btn7");
    }

    @FXML
    public void btn8Click(ActionEvent event) {
        result = result.concat("8");
        lblResult.setText(result);
        System.out.println("btn8");
    }

    @FXML
    public void btn9Click(ActionEvent event) {
        result = result.concat("9");
        lblResult.setText(result);
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


       // if (lastBtnClick.equals("plus")) {
      //      r = r + Float.parseFloat(lblResult.getText());
       // }

        switch (lastBtnClick) {
            case "plus":
                r = r + Float.parseFloat(lblResult.getText());
                break;
            case "minus":
                r = r - Float.parseFloat(lblResult.getText());
                break;
            case "times":
                r = r * Float.parseFloat(lblResult.getText());
                break;
            case "div":
                r = r / Float.parseFloat(lblResult.getText());
                break;
            default:
                //implement default
        }

        operation = false;
        result = "";
        lblResult.setText(Float.toString(r));
        r = 0;
    }

    @FXML
    public void btnPlusClick(ActionEvent event) {
        if (!operation) {
            op1 = Float.parseFloat(lblResult.getText());
            r = r + op1;
            operation = true;
        } else {
            op2 = Float.parseFloat(lblResult.getText());
            r = r + op2;
            operation = false;
        }
        result = "";
        lblResult.setText(Float.toString(r));
        lastBtnClick = "plus";
    }

    @FXML
    public void btnMinusClick(ActionEvent event) {
        if (!operation) {
            op1 = Float.parseFloat(lblResult.getText());

            if (r == 0)
                r = Math.abs(r - op1);
            else
                r = r - op1;

            operation = true;
        } else {
            op2 = Float.parseFloat(lblResult.getText());
            r = r - op2;
            operation = false;
        }
        result = "";
        lblResult.setText(Float.toString(r));
        lastBtnClick = "minus";
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
        if (result.length() > 1) {
            result = result.substring(0, result.length() - 1);
            lblResult.setText(result);
        } else {
            result = "";
            lblResult.setText("0");
        }
    }

    @FXML
    public void btnCancelClick(ActionEvent event) {
        result = lastBtnClick = "";
        r = op1 = op2 = 0;
        operation = false;
        lblResult.setText("0");
    }

}//Controller
