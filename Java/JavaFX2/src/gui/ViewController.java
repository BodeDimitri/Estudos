package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtN1;
	
	@FXML
	private TextField txtN2;
	
	@FXML 
	private Button btSum;
	
	@FXML
	private Label labelResut;
	
	@FXML
	public void onBtSum() { 
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtN1.getText()); //getText retorna o que esta dentro do field mas como string
			double number2 = Double.parseDouble(txtN2.getText());
			double result = (number1 + number2);
			labelResut.setText(String.format("%.2f", result)); //Settext e mudar o texto de determinado label
		} catch (NumberFormatException e) { //Erro que so aceita numeros
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}
}
