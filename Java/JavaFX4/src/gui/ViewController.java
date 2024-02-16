package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson; // Recebe um tipo generico que tem que receber uma entidade

	private ObservableList<Person> obsList;
	
	@FXML
	private Button btAll;
	
	@FXML
	public void onBtAllAction() {
		for(Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}
	
	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem(); //Retorna o item que foi selecionado
		System.out.println(person);
	}

	@Override // Metodo que executa logo apos executar a aplicação
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> list = new ArrayList<>(); // Criada uma lista da entidade primeiro
		list.add(new Person(1, "Jo", "jo@gmail.com"));
		list.add(new Person(2, "Joa", "joa@gmail.com"));

		obsList = FXCollections.observableArrayList(list); // Passa elas para o obsList
		comboBoxPerson.setItems(obsList); // Finalmente para o comboBox

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));
	}
}
