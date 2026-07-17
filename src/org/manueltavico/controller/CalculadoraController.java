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
     
        if (calculoTerminado && entrada.matches("[0-9]")){
             numeroUno = "";
            operador = "";
            numeroDos = "";
        }
        calculoTerminado = false;
        
        if(entrada.matches("[0-9]")) {
            if(operador.isEmpty()){
                numeroUno += entrada;
            }else{
                 numeroDos += entrada;
            } 
                        
            actualizarPantalla(pantalla);
        }else if (entrada.equals("+") || entrada.equals("x") || entrada.equals("-") || entrada.equals("÷") ||  entrada.equals("√")) { 
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
            }
            else if(operador.equals("÷")){
                numeroUno = resultadoDivision( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
            }
                else if(operador.equals("√")){
                numeroUno = resultadoRaiz( numeroUno,  numeroDos);
                operador = "";
                numeroDos = "";
                
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
        String resultado;
        int datoUno = Integer.parseInt(numeroUno);
        int datoDos = Integer.parseInt(numeroDos);
        int suma = datoUno+datoDos;
        
        return resultado = String.valueOf(suma);
    }

    // Nuevo método para procesar la resta
    private String resultadoResta(String numeroUno, String numeroDos){
        String resultado;
        int datoUno = Integer.parseInt(numeroUno);
        int datoDos = Integer.parseInt(numeroDos);
        int resta = datoUno - datoDos;
        
        return resultado = String.valueOf(resta);
    }
    
    private String resultadoMultiplicacion(String numeroUno, String numeroDos){
        String resultado;
        int datoUno = Integer.parseInt(numeroUno);
        int datoDos = Integer.parseInt(numeroDos);
        int multiplicacion = datoUno * datoDos;
        
        return resultado = String.valueOf(multiplicacion);
    }
    
    private String resultadoDivision(String numeroUno, String numeroDos){
        String resultado;
        int datoUno = Integer.parseInt(numeroUno);
          int datoDos = Integer.parseInt(numeroDos);
          int division = datoUno / datoDos;
          
          return resultado = String.valueOf(division);
        
    }
    
     private String resultadoRaiz(String numeroUno, String numeroDos){
        String resultado;
        int datoUno = Integer.parseInt(numeroUno);
          int datoDos = Integer.parseInt(numeroDos);
          int Raiz = datoUno / datoDos;
          
          return resultado = String.valueOf(Raiz);
     } 
}
     