package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML //Delcara um atributo controller
	private Button btTest;
	
	@FXML
	public void onBtTestAction() { //Metodo que leva o mesmo nome do atributo
		System.out.println("Click"); //Apos isso tem de ser associado no SceneBuilder, no Controller e no Code
		Alerts.showAlert("Alert title", null, "A", AlertType.INFORMATION);
	}
}
