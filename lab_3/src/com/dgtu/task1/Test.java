package com.dgtu.task1;

import java.util.ArrayList;

public class Test {
    private String nameTest;
    private String theme;
    private int countQuestionInTest;
    private int timeTest; //В секундах
    private int PointsTest; // Количество баллов за тест, которое можно получить. мах

    private ArrayList<Question> question = new ArrayList<>(); // Список вопросов

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getCountQuestionInTest() {
        return countQuestionInTest;
    }

    public void setCountQuestionInTest(int countQuestionInTest) {
        this.countQuestionInTest = countQuestionInTest;
    }

    public int getTimeTest() {
        return timeTest;
    }

    public void setTimeTest(int timeTest) {
        this.timeTest = timeTest;
    }

    public int getPointsTest() {
        return PointsTest;
    }

    public void setPointsTest(int pointsTest) {
        PointsTest = pointsTest;
    }

    public ArrayList<Question> getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question.add(question);
    }


}
