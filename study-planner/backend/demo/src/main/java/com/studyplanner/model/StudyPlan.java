package com.studyplanner.model;

public class StudyPlan {
    private String subject;
    private int hoursPerDay;
    private String difficultyLevel;

    public StudyPlan(String subject, int hoursPerDay, String difficultyLevel) {
        this.subject = subject;
        this.hoursPerDay = hoursPerDay;
        this.difficultyLevel = difficultyLevel;
    }

    public String getSubject() { return subject; }
    public int getHoursPerDay() { return hoursPerDay; }
    public String getDifficultyLevel() { return difficultyLevel; }
}
