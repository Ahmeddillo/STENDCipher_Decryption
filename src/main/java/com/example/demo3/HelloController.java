package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class HelloController {

    @FXML
    private TextField textInput1; // Mesaj için giriş alanı
    @FXML
    private TextField textInput2; // Anahtar 1 için giriş alanı
    @FXML
    private TextField textInput3; // Anahtar 2 için giriş alanı
    @FXML
    private Label resultLabel; // Sonuç etiketi

    @FXML
    protected void handleButtonAction() {
        try {
            // Kullanıcıdan alınan metni alıyoruz
            String ct = textInput1.getText();
            String key1 = textInput2.getText();
            String key2 = textInput3.getText();

            long number1 = Long.parseLong(ct);
            long number2 = Long.parseLong(key1);
            long number3 = Long.parseLong(key2);
            long S = number1 - number3;
            long T = S - number2;

            String s1 = String.valueOf(T);



            resultLabel.setText("The Message is: " + xaviD(s1) );
        } catch (NumberFormatException e) {
            resultLabel.setText("Hata: Geçersiz anahtar formatı!");
        }
    }

    @FXML
    protected String xaviD(String input) {
        if (input == null || input.isEmpty()) {
            return "0"; // Eğer input boşsa, "0" döneriz.
        }

        StringBuilder result = new StringBuilder();

        // Karakterlerin dönüşümünü yapıyoruz ve string olarak birleştiriyoruz

        char[] c = input.toCharArray();

        for (int i = 0; i < input.length()-1; i+=2) {
            String Value;



            if (c[i] == '0'){

                if (c[i+1] == '0'){
                    Value = "m";
                    result.append(Value);
                }
                else if (c[i+1] == '1'){
                    Value = "v";
                    result.append(Value);
                }
                else if (c[i+1] == '2'){
                    Value = "e";
                    result.append(Value);
                }
                else if (c[i+1] == '3'){
                    Value = "f";
                    result.append(Value);
                } else if (c[i+1] == '4') {
                    Value = "g";
                    result.append(Value);
                }
                else if (c[i+1] == '5') {
                    Value = "2";
                    result.append(Value);
                }
                else if (c[i+1] == '6') {
                    Value = "3";
                    result.append(Value);
                }
                else if (c[i+1] == '7') {
                    Value = "4";
                    result.append(Value);
                }
                else if (c[i+1] == '8') {
                    Value = "5";
                    result.append(Value);
                }
                else if (c[i+1] == '9') {
                    Value = "6";
                    result.append(Value);
                }
            }

            else if (c[i] == '1') {

                if (c[i + 1] == '0') {
                    Value = "7";
                    result.append(Value);
                }
                else if (c[i+1] == '1'){
                    Value = "8";
                    result.append(Value);
                }
                else if (c[i + 1] == '2') {
                    Value = "0";
                    result.append(Value);
                }
                else if (c[i + 1] == '3') {
                    Value = "1";
                    result.append(Value);
                }
                else if (c[i + 1] == '5') {
                    Value = "z";
                    result.append(Value);
                }
                else if (c[i + 1] == '6') {
                    Value = "a";
                    result.append(Value);
                }
                else if (c[i + 1] == '7') {
                    Value = "b";
                    result.append(Value);
                }
                else if (c[i + 1] == '8') {
                    Value = "c";
                    result.append(Value);
                }


            }
            else if (c[i] == '2') {
                if (c[i + 1] == '0') {
                    Value = "n";
                    result.append(Value);
                }
                else if (c[i + 1] == '1'){
                    Value = "9";
                    result.append(Value);
                }

            }
            else if (c[i] == '3') {
                if (c[i + 1] == '0') {
                    Value = "o";
                    result.append(Value);
                }
                else if (c[i + 1] == '3'){
                    Value = "x";
                    result.append(Value);
                }
            }
            else if (c[i] == '4') {
                if (c[i + 1] == '4') {
                    Value = "y";
                    result.append(Value);
                }
            }
            else if (c[i] == '5') {
                if (c[i + 1] == '0') {
                    Value = "h";
                    result.append(Value);
                }
                else if (c[i + 1] == '5'){
                    Value = "q";
                    result.append(Value);
                }
            }
            else if (c[i] == '6') {
                if (c[i + 1] == '0') {
                    Value = "i";
                    result.append(Value);
                }
                else if (c[i + 1] == '6'){
                    Value = "r";
                    result.append(Value);
                }
            }
            else if (c[i] == '7') {
                if (c[i + 1] == '0') {
                    Value = "j";
                    result.append(Value);
                }
                else if (c[i + 1] == '2'){
                    Value = " ";
                    result.append(Value);
                }
                else if (c[i + 1] == '5'){
                    Value = "w";
                    result.append(Value);
                }
                else if (c[i + 1] == '7'){
                    Value = "s";
                    result.append(Value);
                }
                else if (c[i + 1] == '8'){
                    Value = "d";
                    result.append(Value);
                }
            }
            else if (c[i] == '8') {
                if (c[i + 1] == '0') {
                    Value = "k";
                    result.append(Value);
                }
                else if (c[i + 1] == '8'){
                    Value = "t";
                    result.append(Value);
                }
            }
            else if (c[i] == '9') {
                if (c[i + 1] == '0') {
                    Value = "l";
                    result.append(Value);
                }
                else if (c[i + 1] == '9'){
                    Value = "u";
                    result.append(Value);
                }
            }

        }

        return result.toString();
    }
}
