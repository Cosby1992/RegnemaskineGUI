package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Controller {

    ArrayList<String> numberArray = new ArrayList<String>();

    private int sum;


    @FXML
    private TextField talDisplay;



    public void clearArray(ActionEvent actionEvent) {
        numberArray.clear();
        sum = 0;
        System.out.println("The ArrayList is now cleared!");
        talDisplay.clear();
    }


    public void plusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();

        if (s.matches("[0-9]+")) {
            numberArray.add(s);
            talDisplay.clear();
            System.out.println(s + " er nu tilføjet i Arraylisten numberArray! " + numberArray.toString());
        } else {
            talDisplay.setText("You have to type numbers only!");

        }
    }


    public void equalsMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();

        if (!s.matches("[0-9]+")) {
            talDisplay.setText("You have to type numbers only!");
        } else if(s.matches("[0-9]+")) {

            numberArray.add(s);
            talDisplay.clear();
            System.out.println(s + " er nu tilføjet i Arraylisten numberArray! " + numberArray.toString());

            talDisplay.clear();


            try {
                for (String number : numberArray) {
                    System.out.println(number);
                    sum += Integer.parseInt(number);
                }
                talDisplay.setText(Integer.toString(sum));
                System.out.println(Integer.toString(sum));

            } catch (NumberFormatException e) {
                System.out.println("Obs: noget gik galt. Sørg for alle inputs er tal!");
                System.out.println("e.getCause = " + e.getCause() + " ||||  e.getMessage = " + e.getMessage());

            }
        }
    }

    public void testUdskrift(ActionEvent actionEvent) {

        talDisplay.setText("TEST = OK");

    }


    public void minusMetode(ActionEvent actionEvent) {

    }

    public void multiMetode(ActionEvent actionEvent) {

    }
}
