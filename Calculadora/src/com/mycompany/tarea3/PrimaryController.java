/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.tarea3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author marti
 */
public class PrimaryController implements Initializable {

    @FXML
    private TextField pantalla;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void numero2(ActionEvent event) {
        Digitopantalla("2");
    }

    @FXML
    private void numero1(ActionEvent event) {
        Digitopantalla("1");

    }

    @FXML
    private void numero3(ActionEvent event) {
       Digitopantalla("3");
    }

    @FXML
    private void resta(ActionEvent event) {
        Evaoperador("-");
        
    }

    @FXML
    private void borrar(ActionEvent event) {
        Digito = false;
        Numoperandos = 0;
        Operando1 = 0;
        Operando2 = 0;
        Operador = ' ';
        
    }

    @FXML
    private void numero4(ActionEvent event) {
        Digitopantalla("4");
    }

    @FXML
    private void numero5(ActionEvent event) {
        Digitopantalla("5");
    }

    @FXML
    private void numero6(ActionEvent event) {
        Digitopantalla("6");
    }

    @FXML
    private void suma(ActionEvent event) {
        Evaoperador("+");
    }

    @FXML
    private void borrar2(ActionEvent event) {
    }

    @FXML
    private void numero7(ActionEvent event) {
        Digitopantalla("7");
    }

    @FXML
    private void numero8(ActionEvent event) {
        Digitopantalla("8");
    }

    @FXML
    private void numero9(ActionEvent event) {
        Digitopantalla("9");
    }

    @FXML
    private void multiplicacion(ActionEvent event) {
        Evaoperador("*");
    }

    @FXML
    private void entre(ActionEvent event) {
        Evaoperador("/");
    }

    @FXML
    private void numero0(ActionEvent event) {
        Digitopantalla("0");        
    }

    @FXML
    private void masmenos(ActionEvent event){
    }

    @FXML
    private void division(ActionEvent event) {
        Evaoperador("/");
    }

    @FXML
    private void resultado(ActionEvent event) {
        Evaoperador("=");
        
    }  
    
    private boolean Digito = false;
    
   private int Numoperandos = 0;
   private double Operando1,Operando2;
   private char Operador = ' ';
   
   private void Digitopantalla(String numero){
       if(!Digito && numero.equals("0"))
           return;
       if(!Digito){
           pantalla.setText("");
           
       }
      String valActual = pantalla.getText();
      pantalla.setText(valActual+numero);
      Digito = true;
       
   }
  
   private void Evaoperador(String Operador){
       
       if(Digito)
           Numoperandos ++;
       
       if(Numoperandos == 1)
           Operando1 = Double.parseDouble(pantalla.getText());
       
       if(Numoperandos == 2){
           Operando2 = Double.parseDouble(pantalla.getText());
           
           switch(this.Operador){
               case '+' -> Operando1 = Operando1 + Operando2;
               case '-' -> Operando1 = Operando1 - Operando2;
               case '/' -> Operando1 = Operando1 / Operando2;
               case '*' -> Operando1 = Operando1 * Operando2;
               case '=' -> Operando1 = Operando2;
           
       }
           pantalla.setText(String.valueOf(Operando1));
           Numoperandos = 1;
           
       }
     Digito = false;  
     this.Operador =Operador.charAt(0);
   }
    
}
