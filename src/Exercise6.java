package org.example.learnjavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;

public class Exercise6 extends Application {
    private int targetNumber;
    private final Random random = new Random();

    private TextField inputField;
    private Label feedbackLabel;
    private Button guessButton;
    private Button playAgainButton;

    @Override
    public void start(Stage stage) {
        initNewGame();

        Label titleLabel = new Label("Tebak Angka (1 - 100)");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        titleLabel.setTextFill(Color.web("#1A365D"));

        inputField = new TextField();
        inputField.setPromptText("Masukkan angkamu...");
        inputField.setMaxWidth(200);
        inputField.setAlignment(Pos.CENTER);
        inputField.setFont(Font.font("Arial", 16));

        guessButton = new Button("Tebak Angka");
        guessButton.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        guessButton.setStyle("-fx-background-color: #3182CE; -fx-text-fill: white; -fx-cursor: hand;");

        feedbackLabel = new Label("Silakan mulai menebak!");
        feedbackLabel.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 16));
        feedbackLabel.setTextFill(Color.GRAY);

        playAgainButton = new Button("Main Lagi");
        playAgainButton.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        playAgainButton.setStyle("-fx-background-color: #48BB78; -fx-text-fill: white; -fx-cursor: hand;");
        playAgainButton.setVisible(false);

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #F7FAFC;");

        root.getChildren().addAll(titleLabel, inputField, guessButton, feedbackLabel, playAgainButton);

        guessButton.setOnAction(e -> handleGuess());
        playAgainButton.setOnAction(e -> initNewGame());

        Scene scene = new Scene(root, 350, 355);
        stage.setTitle("Game Tebak Angka");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void initNewGame() {
        targetNumber = random.nextInt(100) + 1;
        System.out.println("[CHEAT] Angka rahasia: " + targetNumber);

        if (inputField != null) {
            inputField.clear();
            inputField.setDisable(false);
            feedbackLabel.setText("Silakan mulai menebak!");
            feedbackLabel.setTextFill(Color.GRAY);
            guessButton.setDisable(false);
            playAgainButton.setVisible(false);
        }
    }

    private void handleGuess() {
        String inputText = inputField.getText().trim();

        if (inputText.isEmpty()) {
            feedbackLabel.setText("Input tidak boleh kosong!");
            feedbackLabel.setTextFill(Color.ORANGE);
            return;
        }

        try {
            int userGuess = Integer.parseInt(inputText);

            if (userGuess < 1 || userGuess > 100) {
                feedbackLabel.setText("Masukkan angka antara 1 - 100!");
                feedbackLabel.setTextFill(Color.ORANGE);
            } else if (userGuess > targetNumber) {
                feedbackLabel.setText("Terlalu Tinggi! ❌");
                feedbackLabel.setTextFill(Color.web("#E53E3E"));
            } else if (userGuess < targetNumber) {
                feedbackLabel.setText("Terlalu Rendah! ❌");
                feedbackLabel.setTextFill(Color.web("#E53E3E"));
            } else {
                feedbackLabel.setText("🎉 BENAR! Angkanya " + targetNumber);
                feedbackLabel.setTextFill(Color.web("#38A169"));

                inputField.setDisable(true);
                guessButton.setDisable(true);
                playAgainButton.setVisible(true);
            }
        } catch (NumberFormatException e) {
            feedbackLabel.setText("Masukkan angka yang valid!");
            feedbackLabel.setTextFill(Color.ORANGE);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}