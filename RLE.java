package it.edu.iisgubbio.matematica;
import java.util.Hashtable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RLE extends Application {
	Button bCalcola = new Button("CALCOLA");
	Label lImgNoCompressa = new Label("immagine NON compressa");
	Label lImgCompressa = new Label("immagine compressa");
	Label lCompressionRate = new Label("comperssion rate");
	TextField tImgNoCompressa = new TextField("");
	TextField tImgCompressa = new TextField("");
	TextField tCompressionRate = new TextField("");
	
	char immagine[][]=new char[3][3];
	
	Hashtable<Integer, String> my_dizionario = new Hashtable<Integer,String>();



	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lImgNoCompressa, 0,0);
		griglia.add(lImgCompressa, 0,1);
		griglia.add(lCompressionRate, 0,2);
		griglia.add(bCalcola, 5,1);
		griglia.add(tImgNoCompressa, 1,0);
		griglia.add(tImgCompressa, 1,1);
		griglia.add(tCompressionRate, 1,2);
		
		my_dizionario.put(10,"A");
		my_dizionario.put(11,"B");
		my_dizionario.put(12,"C");
		my_dizionario.put(13,"D");
		my_dizionario.put(14,"E");
		my_dizionario.put(15,"F");


		bCalcola.setOnAction(e ->calcola());



		Scene scena = new Scene (griglia);

		finestra.setTitle("INTERESSI");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		int nCompresso=0;
		char color=' ' ;
		for(int i=0;i<immagine.length;i++) {
			for(int j=1;j<immagine.length;j++) {
				if(j==0) {
					color=immagine[i][j];
				}
				if(j==0) {
					color=immagine[i][j];
				}
			}
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}

