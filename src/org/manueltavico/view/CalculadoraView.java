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