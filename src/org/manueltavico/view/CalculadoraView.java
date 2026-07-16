package org.manueltavico.view;
 
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
 
public class CalculadoraView {
    private VBox view;
    private Label pantalla;
    private GridPane cuadroBotones;

    //controller

    public CalculadoraView(){
        view = new VBox (15);
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #25D6F5");
        pantalla = new Label ("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT);
        pantalla.setPrefSize(235, 50);
        cuadroBotones = new GridPane(); 
        cuadroBotones.setHgap(12);//interlineado entre elementos de la cuadricula 
        cuadroBotones.setVgap(12);
        cuadroBotones.setAlignment(Pos.CENTER);//alineado al centro

        //primer boton


        Button btnUno = new Button("1");
        btnUno.setPrefSize(50, 50);
        btnUno.setStyle("-fx-background-color: #A1B6C3; -fx-text-fill:white; -ft-background-radops:5px");

        Button btnDos = new Button("2");
        btnDos.setPrefSize(50, 50);
        
        Button btnTres = new Button("3");
        btnTres.setPrefSize(50, 50);
        
        Button btnCuatro = new Button("4");
        btnCuatro.setPrefSize(50, 50);
        
        Button btnCinco = new Button("5");
        btnCinco.setPrefSize(50, 50);
        
   Button btnSeis = new Button("6");
        btnSeis.setPrefSize(50, 50);
        
        Button btnSiete = new Button("7");
        btnSiete.setPrefSize(50, 50);
        
        Button btnOcho = new Button("8");
        btnOcho.setPrefSize(50, 50);
        
        Button btnNueve = new Button("9");
        btnNueve.setPrefSize(50, 50);
        
        Button btnCero = new Button("0");
        btnCero.setPrefSize(50, 50);
        
     Button btnSuma = new Button("+");
        btnSuma.setPrefSize(50, 50);
        
        Button btnResta = new Button("-");
        btnResta.setPrefSize(50, 50);
        
        Button btnMultiplicacion = new Button("x");
        btnMultiplicacion.setPrefSize(50, 50);
        
        Button btnDividir = new Button("÷");
        btnDividir.setPrefSize(50, 50);
        
        Button btnRaiz = new Button("√");
        btnRaiz.setPrefSize(50,50);
        
        Button btnPotencia = new Button("x²");
        btnRaiz.setPrefSize(50,50);

        Button btnPunto = new Button(".");
        btnPunto.setPrefSize(50,50);
        
        Button btnIgual = new Button("=");
        btnIgual.setPrefSize(50,50);
        
        Button btnClear = new Button("C");
        btnClear.setPrefSize(50,50);
        
   cuadroBotones.add(btnUno, 0, 4);
        cuadroBotones.add(btnDos, 1, 4);
        cuadroBotones.add(btnTres, 2, 4);
        cuadroBotones.add(btnCuatro, 0, 3);
        cuadroBotones.add(btnCinco, 1, 3);
        cuadroBotones.add(btnSeis, 2, 3);
        cuadroBotones.add(btnSiete, 0, 2);
        cuadroBotones.add(btnOcho, 1, 2);
        cuadroBotones.add(btnNueve, 2, 2);
        cuadroBotones.add(btnCero, 1, 5);
        cuadroBotones.add(btnSuma, 3, 4);
        cuadroBotones.add(btnResta, 3, 3);
        cuadroBotones.add(btnMultiplicacion, 3, 2);
        cuadroBotones.add(btnPunto, 2, 5);
        cuadroBotones.add(btnIgual, 3, 5);
        cuadroBotones.add(btnClear, 0, 5);

        // cuadroBotones.add(btnDividir, 3, 2);
        // cuadroBotones.add(btnRaiz, 0, 0);
        view.getChildren().addAll(pantalla, cuadroBotones); 

    }

    public VBox getView() {

        return view; 

    }
}
