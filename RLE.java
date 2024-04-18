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

	Hashtable<Integer, Integer> my_dizionario = new Hashtable<Integer,Integer>();



	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lImgNoCompressa, 0,0);
		griglia.add(lImgCompressa, 0,1);
		griglia.add(lCompressionRate, 0,2);
		griglia.add(bCalcola, 5,1);
		griglia.add(tImgNoCompressa, 1,0);
		griglia.add(tImgCompressa, 1,1);
		griglia.add(tCompressionRate, 1,2);

		my_dizionario.put(1,1);
		my_dizionario.put(2,2);
		my_dizionario.put(3,2);
		my_dizionario.put(4,3);

		immagine[0][0]='V';
		immagine[0][1]='B';
		immagine[0][2]='B';
		immagine[1][0]='G';
		immagine[1][1]='G';
		immagine[1][2]='G';
		immagine[2][0]='B';
		immagine[2][1]='V';
		immagine[2][2]='N';


		bCalcola.setOnAction(e ->calcola());



		Scene scena = new Scene (griglia);

		finestra.setTitle("INTERESSI");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		int bit=0;
		int compresso=0;
		int noCompresso=24*9;
		double rate=0;
		for(int ix=0;ix<3;ix++) {
			for(int iy=0;iy<3;iy++) {
				bit+=24;	
			}
		}
		for(int ix=0;ix<3;ix++) {
			for(int iy=1;iy<3;iy++) {
				if(immagine[ix][iy]==(immagine[ix][iy-1])) {
					compresso+=my_dizionario.get(2);
				}else {
					compresso=compresso+24+my_dizionario.get(1);
				}
			}
			compresso+=24;
		}
		rate=100-(compresso/(double)noCompresso*100);
		compresso=compresso-1;
		tImgNoCompressa.setText(bit+"");
		tImgCompressa.setText(compresso+"");
		tCompressionRate.setText(rate+"");

	}
	public static void main(String[] args) {
		launch(args);
	}
}

