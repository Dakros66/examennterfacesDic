package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;


public class SceneController implements Initializable{

	  @FXML
	    private ImageView logo;

	  @FXML
	    private JFXButton logout;

	  @FXML
	    private JFXButton signin;
	   @FXML
	    private Pane pane1;
	    @FXML
	   private Pane pane2;

	@Override
public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	RotateTransition transicion = new RotateTransition(Duration.seconds(100), logo);
	transicion.setByAngle(360*8);
	transicion.play();
	translate(0.1f, pane2, 1200);

	signin.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				translate(0.3f, pane2, -1200);
			}
		});

		logout.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				translate(0.3f, pane2, 1200);
			}
		});


	}

	public void translate(float duracion, Node node, int t) {
		TranslateTransition transicion = new TranslateTransition(Duration.seconds(duracion), node);
		transicion.setByY(t);
		transicion.play();
	}



}
