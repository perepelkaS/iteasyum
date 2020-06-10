package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane mainPane = new BorderPane();
        // MenuBar -> Menu -> MenuItem
        MenuBar mainMenuBar = new MenuBar();
        Menu mainMenu = new Menu("Помощь");

        MenuItem aboutProgram = new MenuItem("О программе");
        aboutProgram.setOnAction(event -> System.out.println(event));
        mainMenu.getItems().add(aboutProgram);
        mainMenuBar.getMenus().add(mainMenu);
        mainPane.setTop(mainMenuBar);

        Button okButton = new Button("OK");
        mainPane.setBottom(okButton);

        FlowPane centerPane = new FlowPane();
        TextField textField = new TextField();
        centerPane.getChildren().addAll();
        new Label("asdasd",
          textField
        );

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(mainPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
