package org.manueltavico.controller;

import javafx.scene.control.Label;

public class CalculadoraController {
    private String numeroUno = "";
    private String operador = "";
    private String numeroDos = "";
    private boolean calculoTerminado = false;
    
    public CalculadoraController(){
        
    }
    
    public void procesoDeEntrada(String entrada, Label pantalla){
        if (entrada.equals("C")) {
            numeroUno = "";
            operador = "";
            numeroDos = "";
            pantalla.setText("");
        }
     
        if (calculoTerminado && (entrada.matches("[0-9]") || entrada.equals("."))){
            numeroUno = "";
            operador = "";
            numeroDos = "";
        }
        calculoTerminado = false;
        
        if(entrada.matches("[0-9]") || entrada.equals(".")) {
            if(operador.isEmpty()){
                if(entrada.equals(".") && numeroUno.contains(".")) return;
                numeroUno += entrada;
            }else{
                if(entrada.equals(".") && numeroDos.contains(".")) return;
                numeroDos += entrada;
            } 
                        
            actualizarPantalla(pantalla);
        }else if (entrada.equals("+") || entrada.equals("x") || entrada.equals("-") || entrada.equals("÷") ||  entrada.equals("√") || entrada.equals("x²")) { 
            operador = entrada;
            actualizarPantalla(pantalla);
        }else if (entrada.equals("=")){
            if(operador.equals("+")){
                numeroUno = resultadoSuma( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }else if(operador.equals("-")){ 
                numeroUno = resultadoResta( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }else if(operador.equals("x")){
                numeroUno = resultadoMultiplicacion( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }else if(operador.equals("÷")){
                numeroUno = resultadoDivision( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }else if(operador.equals("√")){
                numeroUno = resultadoRaiz( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }else if(operador.equals("x²")){
                numeroUno = resultadoPotencia( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                calculoTerminado = true;
            }
                
            actualizarPantalla(pantalla);
        }
    }
   
    private void actualizarPantalla(Label pantalla){
        if(operador.isEmpty()){
            pantalla.setText( numeroUno);
        }else{
            pantalla.setText( numeroUno + " " + operador + " " + numeroDos );
        }
    }
    
    private String resultadoSuma(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        double suma = datoUno + datoDos;
        return formatearResultado(suma);
    }

    private String resultadoResta(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        double resta = datoUno - datoDos;
        return formatearResultado(resta);
    }
    
    private String resultadoMultiplicacion(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        double multiplicacion = datoUno * datoDos;
        return formatearResultado(multiplicacion);
    }
    
    private String resultadoDivision(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        if (datoDos == 0) {
            return "Error";
        }
        double division = datoUno / datoDos;
        return formatearResultado(division);
    }
    
    private String resultadoRaiz(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        if (datoDos == 0) {
            return "Error";
        }
        double raiz = datoUno / datoDos;
        return formatearResultado(raiz);
    } 

    private String resultadoPotencia(String numeroUno, String numeroDos){
        double datoUno = Double.parseDouble(numeroUno);
        double potencia = datoUno * datoUno;
        return formatearResultado(potencia);
    }

  
    private String formatearResultado(double valor) {
        if (valor % 1 == 0) {
            return String.valueOf((int) valor);
        }
        return String.valueOf(valor);
    }
}