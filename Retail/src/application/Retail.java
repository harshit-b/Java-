
package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Kilometer Converter application
 */

public class Retail extends Application
{
   // Fields
   private TextField wholesaleprice;
   private TextField percentage;
   private Label resultLabel;
   
   public static void main(String[] args)
   {
     
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter the wholesale price of the product:");
      Label promptLabel2 = new Label("Enter the percentage of the product:");
      
      // Create a TextField for input.
      wholesaleprice = new TextField();
      percentage = new TextField();
      
      // Create a Button to perform the conversion.
      Button calcButton = new Button("OK");
      
      // Register the event handler.
      calcButton.setOnAction(new CalcButtonHandler());
      
      // Create an empty Label to display the result.
      resultLabel = new Label();
      
      // Put the promptLabel and the kiloTextField in an HBox.
      HBox hbox = new HBox(10, promptLabel, wholesaleprice);
      HBox hbox2 = new HBox(10, promptLabel2, percentage);
      
      // Put the HBox, calcButton, and resultLabel in a VBox.
      VBox vbox = new VBox(10, hbox,hbox2, calcButton, resultLabel);
      
      // Set the VBox's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      vbox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(vbox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Retail price calculator");
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for calcButton
    */
    
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Get the kilometers.
         Double wholesale_price = Double.parseDouble(wholesaleprice.getText());
         Double percentage_inp = Double.parseDouble(percentage.getText());
         
         // Convert the kilometers to miles.
         Double retail_price = (percentage_inp/100)*wholesale_price +wholesale_price ;
         
         // Display the results.
         resultLabel.setText(String.format(" the retail price of the product is %,.2f $", retail_price));
      }
   }
}
