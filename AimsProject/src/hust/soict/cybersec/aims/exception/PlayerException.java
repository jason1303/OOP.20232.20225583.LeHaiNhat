package hust.soict.cybersec.aims.exception;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PlayerException extends Exception {

	public PlayerException() {
		// TODO Auto-generated constructor stub
	}

	public PlayerException(String message) {
		super(message);
		showAlert(message);
		
	}

	public PlayerException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PlayerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	private void showAlert(String message) {
		Alert warn = new Alert(AlertType.WARNING);
		warn.setTitle("Warning");
        warn.setHeaderText(message);
        warn.showAndWait();
	}

}
