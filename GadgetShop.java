import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.RadioButton;
import javafx.scene.control.Tooltip;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;

public class GadgetShop extends Application {
    public void start(Stage stage) {
        //Create text on the screen for better readability
        Label model = new Label("Model:");
        Label price = new Label("Price:");
        Label weight = new Label("Weight:");
        Label size = new Label("Size:");
        Label credit = new Label("Credit:");
        Label memory = new Label("Memory:");
        Label phoneNumber = new Label("Phone Number:");
        Label duration = new Label("Duration:");
        Label download = new Label("Download:");
        Label displayNumber = new Label("Display Number:");
        
        //Assign an arrayList for field attributes
        ArrayList<Gadget> gadgets = new ArrayList<Gadget>();
        
        //Create text field on the screen for user input
        TextField modelField = new TextField();
        TextField priceField = new TextField();
        TextField weightField = new TextField();
        TextField sizeField = new TextField();
        TextField creditField = new TextField();
        TextField memoryField = new TextField();
        TextField phoneNumberField = new TextField();
        TextField durationField = new TextField();
        TextField downloadSizeField = new TextField();
        TextField displayNumberField = new TextField();
        
        //Create buttons on the screen for user actions
        Button mobileButton = new Button("Add Mobile");
        Button mp3Button = new Button("Add MP3");
        Button clearButton = new Button("Clear"); 
        Button displayAllButton = new Button("Display All");
        Button makeACallButton = new Button("Make a Call");
        Button downloadMusicButton = new Button("Download Music");
        
        //Positions the UI elements inside the window
        model.setLayoutX(70);
        model.setLayoutY(55);
        
        modelField.setLayoutX(170);
        modelField.setLayoutY(50);
        
        price.setLayoutX(70);
        price.setLayoutY(105);
        
        priceField.setLayoutX(170);
        priceField.setLayoutY(100);
        
        weight.setLayoutX(70);
        weight.setLayoutY(160);
        
        weightField.setLayoutX(170);
        weightField.setLayoutY(155);

        size.setLayoutX(70);
        size.setLayoutY(205);
        
        sizeField.setLayoutX(170);
        sizeField.setLayoutY(200);
        
        credit.setLayoutX(70);
        credit.setLayoutY(255);
        
        creditField.setLayoutX(170);
        creditField.setLayoutY(250);
        
        memory.setLayoutX(70);
        memory.setLayoutY(305);
        
        memoryField.setLayoutX(170);
        memoryField.setLayoutY(300);
        
        phoneNumber.setLayoutX(70);
        phoneNumber.setLayoutY(355);
        
        phoneNumberField.setLayoutX(170);
        phoneNumberField.setLayoutY(350);
        
        duration.setLayoutX(70);
        duration.setLayoutY(405);
        
        durationField.setLayoutX(170);
        durationField.setLayoutY(400);
        
        download.setLayoutX(70);
        download.setLayoutY(455);
        
        downloadSizeField.setLayoutX(170);
        downloadSizeField.setLayoutY(450);
        
        displayNumber.setLayoutX(70);
        displayNumber.setLayoutY(505);
        
        displayNumberField.setLayoutX(170);
        displayNumberField.setLayoutY(500);
        
        mobileButton.setLayoutX(70);
        mobileButton.setLayoutY(560);
        
        mp3Button.setLayoutX(170);
        mp3Button.setLayoutY(560);
        
        clearButton.setLayoutX(270);
        clearButton.setLayoutY(560);
        
        displayAllButton.setLayoutX(70);
        displayAllButton.setLayoutY(600);
        
        makeACallButton.setLayoutX(170);
        makeACallButton.setLayoutY(600);
        
        downloadMusicButton.setLayoutX(270);
        downloadMusicButton.setLayoutY(600);
        
        //Setting up Radio button positions for light theme and dark theme
        RadioButton lightThemeButton = new RadioButton();
        RadioButton darkThemeButton = new RadioButton();
        
        //Add these two labels next to the radio buttons 
        Label lightThemeLabel = new Label("Enable Light Theme:");
        Label darkThemeLabel = new Label("Enable Dark Theme:");
        
        //Position the labels next to the radio buttons
        lightThemeButton.setLayoutX(670);
        lightThemeButton.setLayoutY(40);
        
        lightThemeLabel.setLayoutX(550);
        lightThemeLabel.setLayoutY(40);
        
        darkThemeButton.setLayoutX(670);
        darkThemeButton.setLayoutY(70);
        
        darkThemeLabel.setLayoutX(550);
        darkThemeLabel.setLayoutY(70);
        
        //Setting up Tooltips for all 10 fields
        Tooltip modelTip = new Tooltip("Enter a Device Model (e.g., iPhone15 Pro, Sony NW-A306)");
        Tooltip priceTip = new Tooltip("Enter a Price (e.g., 299.99, 899.99)");
        Tooltip weightTip = new Tooltip("Enter a Weight (e.g., 1, 2)");
        Tooltip sizeTip = new Tooltip("Enter a Size (e.g., 146.6 × 70.6 × 8.25 mm, 98.4 × 56.5 × 11.8 mm)");
        Tooltip creditTip = new Tooltip("Enter a Credit (e.g., 10, 50, 100, 200)");
        Tooltip memoryTip = new Tooltip("Enter the Total Memory Size (Measured in GB or Gigabytes)");
        Tooltip phoneNumberTip = new Tooltip("Enter a Phone Number (e.g., +44 7712 583947, +44 7925 184603)");
        Tooltip durationTip = new Tooltip("Enter your Phone Call Duration (e.g, 2, 3, 5, 10)");
        Tooltip downloadTip = new Tooltip("Enter the Music Size (Measured in GB or Gigabytes)");
        Tooltip displayNumberTip = new Tooltip("Enter a valid display Number; otherwise, the output will be -1");
        
        //Add the tooltip messages into the text fields
        modelField.setTooltip(modelTip);
        priceField.setTooltip(priceTip);
        weightField.setTooltip(weightTip);
        sizeField.setTooltip(sizeTip);
        creditField.setTooltip(creditTip);
        memoryField.setTooltip(memoryTip);
        phoneNumberField.setTooltip(phoneNumberTip);
        durationField.setTooltip(durationTip);
        downloadSizeField.setTooltip(downloadTip);
        displayNumberField.setTooltip(displayNumberTip);
        
        //Reduce the delay of the tooltip medssage popup to 100 milliseconds instead of 1000 milliseconds
        modelTip.setShowDelay(javafx.util.Duration.millis(100));
        priceTip.setShowDelay(javafx.util.Duration.millis(100));
        weightTip.setShowDelay(javafx.util.Duration.millis(100));
        sizeTip.setShowDelay(javafx.util.Duration.millis(100));
        creditTip.setShowDelay(javafx.util.Duration.millis(100));
        memoryTip.setShowDelay(javafx.util.Duration.millis(100));
        phoneNumberTip.setShowDelay(javafx.util.Duration.millis(100));
        durationTip.setShowDelay(javafx.util.Duration.millis(100));
        downloadTip.setShowDelay(javafx.util.Duration.millis(100));
        displayNumberTip.setShowDelay(javafx.util.Duration.millis(100));
        
        //Create and setup a Search Bar
        TextField searchBar = new TextField();
        searchBar.setPromptText("Enter a Device Model");
        searchBar.setLayoutX(550);
        searchBar.setLayoutY(100);

        //Dynamic list that automatically updates when its data changes
        ObservableList<String> items = FXCollections.observableArrayList(gadgets.toString());
        
        //Show the data and filtered data from the user search keywords
        FilteredList<String> filteredItems = new FilteredList<>(items, source -> true);
        
        //Create and setup a dropdown-menu for the search bar
        ListView<String> dropdown_menu = new ListView<>(filteredItems);
        dropdown_menu.setVisible(false);
        dropdown_menu.setLayoutX(550);
        dropdown_menu.setLayoutY(130);
        
        //Show the device model and dropdown menu when the user types before pressing Enter key
        searchBar.setOnAction(e -> {
            filteredItems.setPredicate(source -> source.toLowerCase().contains(searchBar.getText().toLowerCase()) && !source.equals("[]")); 
            dropdown_menu.setVisible(!filteredItems.isEmpty()); // show only when typing
            System.out.println(filteredItems);
        });
    
        //Layout container that holds UI components 
        Pane root = new Pane();
             root.getChildren().addAll(
             model, price, weight, size, credit, memory, phoneNumber, duration, download, displayNumber,
             modelField, priceField, weightField, sizeField, creditField, memoryField, phoneNumberField, durationField, 
             downloadSizeField, displayNumberField, mobileButton, mp3Button, clearButton, displayAllButton, makeACallButton,
             downloadMusicButton, lightThemeButton, darkThemeButton, lightThemeLabel, darkThemeLabel, searchBar, dropdown_menu
             );
        
        //User will select light theme button
        lightThemeButton.setOnAction(e -> {
            
            darkThemeButton.setSelected(false);  //Deselect the dark theme button
            
            //Custom the UI on light theme
            root.setStyle("-fx-background-color: #FFFFFF"); 
            model.setStyle("");
            price.setStyle("");
            weight.setStyle("");
            size.setStyle("");
            credit.setStyle("");
            memory.setStyle("");
            phoneNumber.setStyle("");
            duration.setStyle("");
            download.setStyle("");
            displayNumber.setStyle("");
            lightThemeLabel.setStyle("");
            darkThemeLabel.setStyle("");

            //Remove the CSS style class from these buttons back to it's default 
            mobileButton.getStyleClass().remove("mobileButton");
            mp3Button.getStyleClass().remove("mp3Button");
            clearButton.getStyleClass().remove("clearButton");
            displayAllButton.getStyleClass().remove("displayAllButton");
            makeACallButton.getStyleClass().remove("makeACallButton");
            downloadMusicButton.getStyleClass().remove("downloadMusicButton");
        });
        
        //User will select dark theme button
        darkThemeButton.setOnAction(e -> {
            
            lightThemeButton.setSelected(false); //Deselect the light theme button
            
            //Customise the UI on dark theme
            root.setStyle("-fx-background-color: #1E1E1E;"); 
            model.setStyle("-fx-text-fill: #E0E0E0;");
            price.setStyle("-fx-text-fill: #E0E0E0;");
            weight.setStyle("-fx-text-fill: #E0E0E0;");
            size.setStyle("-fx-text-fill: #E0E0E0;"); 
            credit.setStyle("-fx-text-fill: #E0E0E0;");
            memory.setStyle("-fx-text-fill: #E0E0E0;");
            phoneNumber.setStyle("-fx-text-fill: #E0E0E0;");
            duration.setStyle("-fx-text-fill: #E0E0E0;");
            download.setStyle("-fx-text-fill: #E0E0E0;");
            displayNumber.setStyle("-fx-text-fill: #E0E0E0;");
            lightThemeLabel.setStyle("-fx-text-fill: #E0E0E0;");
            darkThemeLabel.setStyle("-fx-text-fill: #E0E0E0;");

            //Adds a style class to the node
            mobileButton.getStyleClass().add("mobileButton");
            mp3Button.getStyleClass().add("mp3Button");
            clearButton.getStyleClass().add("clearButton");
            displayAllButton.getStyleClass().add("displayAllButton");
            makeACallButton.getStyleClass().add("makeACallButton");
            downloadMusicButton.getStyleClass().add("downloadMusicButton");
        });
        
        //Buttons and Action Peformed Methods
        mobileButton.setOnAction(e -> {
           try {
                //Check for empty Strings 
                if(modelField.getText().trim().isBlank() || priceField.getText().trim().isBlank() || 
                   weightField.getText().trim().isBlank() || sizeField.getText().trim().isBlank() || 
                   creditField.getText().trim().isBlank()) {
                    throw new IllegalArgumentException(
                        "Enter the required fields: model, price, weight, size, and credit"
                    );
                }
            
                //Check for invalid inputs (e.g., weight or credit as double)
                double price_error = Double.parseDouble(priceField.getText().trim());
                int weight_error = Integer.parseInt(weightField.getText().trim());
                int credit_error = Integer.parseInt(creditField.getText().trim());
            
            } catch (NumberFormatException error) {
                System.out.println("Error: Please enter valid numbers for price, weight, and credit");
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
           }
            
           //Create a Mobile constructor to get the field data from user input
           Mobile Data = new Mobile(
           modelField.getText(), 
           Double.parseDouble(priceField.getText()), 
           Integer.parseInt(weightField.getText()), 
           sizeField.getText(), 
           Integer.parseInt(creditField.getText())
           );
            
           //Display the Mobile data onto the console window
           System.out.println(Data.getModel());
           System.out.println(Data.getPrice());
           System.out.println(Data.getWeight());
           System.out.println(Data.getSize());
           System.out.println(Data.getCredit());
           
           gadgets.add(Data); //Add the Mobile elements into the gadgets ArrayList
           
           //Add the device Model into the ObservableList for dropdown menu 
           items.add(Data.getModel());
            
           //Format the Mobile Array
           System.out.println("-------------------------------------------------------------------------------------------");
           System.out.println(Data.toString());
           System.out.println("-------------------------------------------------------------------------------------------");
        }); 

        //The user will press the "Add MP3" Button
        mp3Button.setOnAction(e -> {
           try {
                // Check for empty Strings 
                if(modelField.getText().isBlank() || priceField.getText().isBlank() || 
                   weightField.getText().isBlank() || sizeField.getText().isBlank() || 
                   memoryField.getText().isBlank()) {
                    throw new IllegalArgumentException(
                        "Enter the required fields: model, price, weight, size, and memory"
                    );
                }
                
                //Check for invalid inputs (e.g., weight or memory as double)
                double price_error = Double.parseDouble(priceField.getText().trim());
                int weight_error = Integer.parseInt(weightField.getText().trim());
                int memory_error = Integer.parseInt(memoryField.getText().trim());
            
            } catch (NumberFormatException error) {
                System.out.println("Error: Please enter valid numbers for price, weight, and memory");
            } catch (IllegalArgumentException error) {
               System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
           }

           //Create a MP3 constructor to get the field data from the user
           MP3 data = new MP3(
           modelField.getText(), 
           Double.parseDouble(priceField.getText()), 
           Integer.parseInt(weightField.getText()), 
           sizeField.getText(), 
           Integer.parseInt(memoryField.getText())
           );
            
           //Display the MP3 data onto the console window
           System.out.println(data.getModel());
           System.out.println(data.getPrice());
           System.out.println(data.getWeight());
           System.out.println(data.getSize());
           System.out.println(data.getMemory());
           
           gadgets.add(data); //Add the MP3 elements into the gadgets ArrayList
           
           //Add the device Model into the ObservableList for dropdown menu 
           items.add(data.getModel());
            
           //Format the MP3 Array
           System.out.println("-------------------------------------------------------------------------------------------");
           System.out.println(data.toString());
           System.out.println("-------------------------------------------------------------------------------------------");
        });

        //The user will press the "Clear" button to remove text from the textFields without having to do each manually
        clearButton.setOnAction(e -> {
            modelField.clear();
            priceField.clear();
            weightField.clear();
            sizeField.clear();
            creditField.clear();
            memoryField.clear();
            phoneNumberField.clear();
            durationField.clear();
            downloadSizeField.clear();
            displayNumberField.clear();
        });

        //The user will press the "Display All" to get every single Mobile or MP3 Data
        displayAllButton.setOnAction(e -> {   
            try {
              //Check if the array is empty because the user hasn't press Mobile or MP3 button
              if(gadgets.size() == 0) {
                  throw new IllegalArgumentException("Press Mobile or MP3 Button");
              }
            } catch(IllegalArgumentException error) {
                  System.out.println(error.getMessage());
            }
           //Display all Index and gadgets in the ArrayList
             for(int i = 0; i < gadgets.size(); i++) {
                System.out.println(i + " " + gadgets.get(i).toString()); //Display the index and elements from the gadgets ArrayList
                displayNumberField.setText(String.valueOf(i)); //Add the index into the displayNumber text field
            }     
        });

        //The user will press the "Make A Call" button
        makeACallButton.setOnAction(e -> {
            try {
                //Check if the gadget ArrayList is empty 
                if(gadgets.size() == 0) {
                   throw new IllegalStateException("ArrayList is empty! To fix it press Mobile Button");
                }
                //Check if the user entered phone number or duration
                if(phoneNumberField.getText().trim().isBlank() || durationField.getText().trim().isBlank()) {
                   throw new IllegalArgumentException("Enter Phone Number and Duration");
                }

            } catch (IndexOutOfBoundsException error) {
                   System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
            }

            //Get the text data from the user input
            String display_number = displayNumberField.getText();
            String phone_number = phoneNumberField.getText();
            String duration_ = durationField.getText();
            
            // try/catch statement to check if the user inputs a invalid duration number (e.g., 5.5)
            try {
               int duration_error = Integer.parseInt(duration_);
            } catch(NumberFormatException error) {
               //When the error is shown, display a dialog box to show the error
               Alert alert = new Alert(AlertType.INFORMATION);
               alert.setTitle("Duration Call");
               alert.setHeaderText("Invalid Duration number!");
               alert.setContentText("Enter a Suitable Duration number");
               alert.showAndWait();
            }

            //IF the display number is Empty OR display number is less than 0 OR display number is more than the gadget size THEN show a Dialog Box
            if(display_number.isEmpty() || Integer.parseInt(display_number) < 0 || Integer.parseInt(display_number) >= gadgets.size()) { 
               //Dsiplay the dialog if the condition is met
               Alert alert = new Alert(AlertType.INFORMATION);
               alert.setTitle("Display Number");
               alert.setHeaderText("Invalid Display Number!");
               alert.setContentText("Enter a Suitable Display Number from your Array List");
               alert.showAndWait();
            } else if(!display_number.contains("-1")) {
               Mobile user = (Mobile) gadgets.get(Integer.parseInt(display_number)); //Downcast Gadget to Mobile to get Mobile-specific methods
               user.makeCall(phone_number, Integer.parseInt(duration_)); //Call the makeCall() method from Mobile class which returns the calcualted credit
               System.out.println(user.toString()); //Display the Mobile details with the remaining credits
            }

            //try/catch statement to check the displayNumberField contains -1
            try {
                //Check if displayNumber contains -1
                int idx = Integer.parseInt(display_number);
                if(idx == -1) {
                   throw new NumberFormatException("Press Display All button"); 
                }
                                
            } catch (NumberFormatException error) {
                   System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
            }
        });

        //The user will press the "Download Music" button
        downloadMusicButton.setOnAction(e -> {
            try {
                //Check if the gadget ArrayList is empty 
                if(gadgets.size() == 0) {
                   throw new IllegalStateException("ArrayList is empty! To fix it press MP3 Button");
                }
                //Check if the user entered download size and memory size
                if(memoryField.getText().trim().isBlank() || downloadSizeField.getText().trim().isBlank()) {
                   throw new IllegalArgumentException("Enter Memory size and Download size");
                }
            } catch (IndexOutOfBoundsException error) {
                   System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
            }

            //Get the text data from the user input
            String display_number = displayNumberField.getText();
            int download_size = Integer.parseInt(downloadSizeField.getText());

            //IF the display number is Empty OR display number is less than 0 OR display number is more than the gadget size THEN show a Dialog Box
            if(display_number.isEmpty() || Integer.parseInt(display_number) < 0 || Integer.parseInt(display_number) >= gadgets.size()) {
               //Show the Dialog one the condition is met
               Alert alert = new Alert(AlertType.INFORMATION);
               alert.setTitle("Display Number");
               alert.setHeaderText("Invalid Display Number!");
               alert.setContentText("Enter a Suitable Display Number from your Array List");
               alert.showAndWait();
            } else if(!display_number.contains("-1")) {
                MP3 user = (MP3) gadgets.get(Integer.parseInt(display_number)); //Downcast Gadget to MP3 to get MP3-specific methods
                user.downloadMusic(download_size); //Call the downloadMusic() method from MP3 class which returns the memory size of the music
                System.out.println(user.toString()); //Display the MP3 details with the available memory
            }

            //try/catch statement to check the displayNumberField contains -1
            try {
                //Check if displayNumber contains -1
                int idx = Integer.parseInt(display_number);
                if(idx == -1) {
                   throw new NumberFormatException("Press Display All button");
                }
                                
            } catch (NumberFormatException error) {
                   System.out.println(error.getMessage()); //Display the message from IllegalArugmentException parameter
            }
        });
        
        //The container that holds all UI content inside the window.
        Scene scene = new Scene(root, 820, 820);
        
        //Adds a CSS stylesheet to the scene
        scene.getStylesheets().add(getClass().getResource("GadgetShopCustomisation.css").toExternalForm());  

        //Set the window title
        stage.setTitle("Gadget Shop");
        stage.setScene(scene); //Load the scene
        stage.show(); //Display the Window    
    }
}
