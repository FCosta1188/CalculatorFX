package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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


    public static String trimDecZeroes(String s) {
        String [] sArray = s.split(".");
        s = sArray[1];

        for (int i = 0; i < sArray[1].length(); i++) { //loop through the decimal portion of the number
            if ((s.endsWith("0")) && (s.length() >= 2)) { //to avoid out of bound
                s = s.substring(0, s.length() - 2);
            } else if ((s.endsWith("0")) && (s.length() == 1)) {
                s = "";
                break;
            } else { //s does not end with 0
                break;
            }
        }

        if (s.equals(""))
            return sArray[0]; //int portion of the number
        else
            return sArray[0].concat("." + s); //int.trimmedDec
    }


    @FXML
    public void btn0Click(ActionEvent event) {
        result = result.concat("0");
        lblResult.setText(result);
    }

    @FXML
    public void btn1Click(ActionEvent event) {
        result = result.concat("1");
        lblResult.setText(result);
    }

    @FXML
    public void btn2Click(ActionEvent event) {
        result = result.concat("2");
        lblResult.setText(result);
    }

    @FXML
    public void btn3Click(ActionEvent event) {
        result = result.concat("3");
        lblResult.setText(result);
    }

    @FXML
    public void btn4Click(ActionEvent event) {
        result = result.concat("4");
        lblResult.setText(result);
    }

    @FXML
    public void btn5Click(ActionEvent event) {
        result = result.concat("5");
        lblResult.setText(result);
    }

    @FXML
    public void btn6Click(ActionEvent event) {
        result = result.concat("6");
        lblResult.setText(result);
    }

    @FXML
    public void btn7Click(ActionEvent event) {
        result = result.concat("7");
        lblResult.setText(result);
    }

    @FXML
    public void btn8Click(ActionEvent event) {
        result = result.concat("8");
        lblResult.setText(result);
    }

    @FXML
    public void btn9Click(ActionEvent event) {
        result = result.concat("9");
        lblResult.setText(result);
    }

    @FXML
    public void btnSignClick(ActionEvent event) {

    }

    @FXML
    public void btnDotClick(ActionEvent event) {
        result = result.concat(".");
        lblResult.setText(result);
        System.out.println("btnDot");
    }

    @FXML
    public void btnEqualClick(ActionEvent event) {

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
        lblResult.setText(Float.toString(r)); //Float.toString also trims zeroes on the left
        //lblResult.setText(trimDecZeroes(Float.toString(r)));
        r = 0;
    }

    @FXML
    public void btnPlusClick(ActionEvent event) {
        /*
        if (!operation) {
            op1 = Float.parseFloat(lblResult.getText());
            r = r + op1;
            operation = true;
        } else {
            op2 = Float.parseFloat(lblResult.getText());
            r = r + op2;
            operation = false;
        }
        */
        r += Float.parseFloat(lblResult.getText());
        result = "";
        lblResult.setText(Float.toString(r));
        lastBtnClick = "plus";
    }

    @FXML
    public void btnMinusClick(ActionEvent event) {
        if (r == 0)
            r = Float.parseFloat(lblResult.getText());
        else
            r -= Float.parseFloat(lblResult.getText());
        result = "";
        lblResult.setText(Float.toString(r));
        lastBtnClick = "minus";
    }

    @FXML
    public void btnTimesClick(ActionEvent event) {
        r *= Float.parseFloat(lblResult.getText());
        result = "";
        lblResult.setText(Float.toString(r));
        lastBtnClick = "times";
    }

    @FXML
    public void btnDivClick(ActionEvent event) {
        if (Float.parseFloat(lblResult.getText()) == 0) {
            lblExpression.setText("Cannot divide by 0");
            lblResult.setText("0");
        } else {
            r /= Float.parseFloat(lblResult.getText());
            lblResult.setText(Float.toString(r));
        }
        result = "";
        lastBtnClick = "times";
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

    //Key presses (https://docs.oracle.com/javafx/2/api/javafx/scene/input/KeyCode.html)
    public void keyPress(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER)
            btnEqual.fire();
        if (keyEvent.getCode() == KeyCode.BACK_SPACE)
            btnBackspace.fire();
        if (keyEvent.getCode() == KeyCode.DELETE)
            btnCancel.fire();
        else if (keyEvent.getCode() == KeyCode.DECIMAL) //numpad
            btnDot.fire();
        else if (keyEvent.getCode() == KeyCode.ADD) //numpad
            btnPlus.fire();
        else if (keyEvent.getCode() == KeyCode.PLUS)
            btnPlus.fire();
        else if (keyEvent.getCode() == KeyCode.SUBTRACT) //numpad
            btnMinus.fire();
        else if (keyEvent.getCode() == KeyCode.MINUS)
            btnMinus.fire();
        else if (keyEvent.getCode() == KeyCode.MULTIPLY) //numpad
            btnTimes.fire();
        else if (keyEvent.getCode() == KeyCode.DIVIDE) //numpad
            btnDiv.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT0)
            btn0.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD0)
            btn0.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT1)
            btn1.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD1)
            btn1.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT2)
            btn2.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD2)
            btn2.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT3)
            btn3.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD3)
            btn3.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT4)
            btn4.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD4)
            btn4.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT5)
            btn5.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD5)
            btn5.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT6)
            btn6.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD6)
            btn6.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT7)
            btn7.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD7)
            btn7.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT8)
            btn8.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD8)
            btn8.fire();
        else if (keyEvent.getCode() == KeyCode.DIGIT9)
            btn9.fire();
        else if (keyEvent.getCode() == KeyCode.NUMPAD9)
            btn9.fire();
    }


}//Controller
