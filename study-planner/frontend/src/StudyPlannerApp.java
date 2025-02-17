package com.studyplanner.ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class StudyPlannerApp extends Application {
    @Override
    public void start(Stage stage) {
        Label title = new Label("AI Study Planner");
        Button fetchPlansButton = new Button("Fetch Study Plans");
        TextArea displayArea = new TextArea();
        displayArea.setEditable(false);

        fetchPlansButton.setOnAction(e -> {
            try {
                JSONArray studyPlans = StudyService.fetchStudyPlans();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < studyPlans.length(); i++) {
                    JSONObject plan = studyPlans.getJSONObject(i);
                    sb.append("Subject: ").append(plan.getString("subject"))
                      .append(", Hours per day: ").append(plan.getInt("hoursPerDay"))
                      .append("\n");
                }
                displayArea.setText(sb.toString());
            } catch (Exception ex) {
                displayArea.setText("Error fetching data.");
            }
        });

        VBox vbox = new VBox(10, title, fetchPlansButton, displayArea);
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Study Planner");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
