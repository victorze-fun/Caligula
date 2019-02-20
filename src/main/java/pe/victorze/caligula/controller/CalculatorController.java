package pe.victorze.caligula.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

    private double number1;

    private double number2;

    private String operator;

    @FXML
    private Label screenLabel;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button dotButton;

    @FXML
    private Button ceButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button subtractionButton;

    @FXML
    private Button additionButton;

    @FXML
    private Button divisionButton;

    @FXML
    void additionButton_Click(ActionEvent event) {
        initializationNumber1();
        screenLabel.setText("");
        operator = "+";
    }

    @FXML
    void subtractionButton_Click(ActionEvent event) {
        initializationNumber1();
        screenLabel.setText("");
        operator = "-";
    }

    @FXML
    void multiplicationButton_Click(ActionEvent event) {
        initializationNumber1();
        screenLabel.setText("");
        operator = "x";
    }

    @FXML
    void divisionButton_Click(ActionEvent event) {
        initializationNumber1();
        screenLabel.setText("");
        operator = "/";
    }

    @FXML
    void equalButton_Click(ActionEvent event) {
        initializationNumber2();
        switch(operator) {
            case "+":
                screenLabel.setText(String.format("%.1f", (number1 + number2)));
                break;
            case "-":
                screenLabel.setText(String.format("%.1f", (number1 - number2)));
                break;
            case "x":
                screenLabel.setText(String.format("%.2f", (number1 * number2)));
                break;
            case "/":
                if (number2 != 0)
                    screenLabel.setText(String.format("%.2f", (number1 / number2)));
                break;
            default:
        }
    }

    @FXML
    void ceButton_Click(ActionEvent event) {
        reset();
    }

    private void reset() {
        number1 = 0;
        number2 = 0;
        screenLabel.setText("");
    }

    private void initializationNumber1() {
        try {
            number1 = Double.parseDouble(screenLabel.getText());
        } catch (NumberFormatException e) {
        }
    }

    private void initializationNumber2() {
        try {
            number2 = Double.parseDouble(screenLabel.getText());
        } catch (NumberFormatException e) {
        }
    }

    @FXML
    void dotButton_Click(ActionEvent event) {
         addNumberInScreen(dotButton.getText());
    }

    @FXML
    void eightButton_Click(ActionEvent event) {
         addNumberInScreen(eightButton.getText());
    }

    @FXML
    void fiveButton_Click(ActionEvent event) {
         addNumberInScreen(fiveButton.getText());
    }

    @FXML
    void fourButton_Click(ActionEvent event) {
         addNumberInScreen(fourButton.getText());
    }

    @FXML
    void nineButton_Click(ActionEvent event) {
         addNumberInScreen(nineButton.getText());
    }

    @FXML
    void oneButton_Click(ActionEvent event) {
         addNumberInScreen(oneButton.getText());
    }

    @FXML
    void sevenButton_Click(ActionEvent event) {
         addNumberInScreen(sevenButton.getText());
    }

    @FXML
    void sixButton_Click(ActionEvent event) {
         addNumberInScreen(sixButton.getText());
    }

    @FXML
    void threeButton_Click(ActionEvent event) {
         addNumberInScreen(threeButton.getText());
    }

    @FXML
    void twoButton_Click(ActionEvent event) {
         addNumberInScreen(twoButton.getText());
    }

    @FXML
    void zeroButton_Click(ActionEvent event) {
         addNumberInScreen(zeroButton.getText());
    }

    @FXML void initialize() {
        reset();
    }

    private void addNumberInScreen(String buttonText) {
        screenLabel.setText(screenLabel.getText() + buttonText);
    }
}
