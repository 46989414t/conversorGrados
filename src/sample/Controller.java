package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Controller {

    @FXML
    public TextField introCelcius;
    public TextField Farenheit;
    public Button btConvertir;
    public boolean pressCent;

    //double fa = double.Parse(Farenheit);
    //double cel = (double)introCelcius;

    public void initialize() {
        introCelcius.setText("0");
        Farenheit.setText("0");
    }
    public void centTrue(Event event) {
        pressCent=true;
    }

    public void onConvertir(ActionEvent actionEvent) {

        if (pressCent){
            double cel = Double.parseDouble(introCelcius.getText());

            double fa = (cel * 1.8 + 32);

            Farenheit.setText(String.valueOf(fa));

            //introCelcius.requestFocus();
            System.out.println("pressCent true: "+pressCent);
            pressCent=false;
        }else if (!pressCent){
            double fa = Double.parseDouble(Farenheit.getText());
            double cel = (fa-32)/1.8;
            introCelcius.setText(String.valueOf(cel));
            System.out.println("pressCent false: " + pressCent);
            pressCent=false;
        }
    }
}