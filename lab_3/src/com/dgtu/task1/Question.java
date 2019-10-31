package com.dgtu.task1;

import java.util.ArrayList;

public class Question {
    private String nameQuestion; //Имя вопроса, необходимо для радио баттонов
    private int pointsQuestion; //Макчимально количество балов за правильный ответ
    private int timeQuestion; //Время на вопрос, в секундах
    private int difficulty; // Сложность вопроса, на момент создания не назначение не ясно
    private String textQuestion; // Текст вопроса

    private ArrayList<AnswerOptions> answerOption = new ArrayList<>(); // Список ответов

    public String getNameQuestion() {
        return nameQuestion;
    }

    public void setNameQuestion(String nameQuestion) {
        this.nameQuestion = nameQuestion;
    }

    public int getPointsQuestion() {
        return pointsQuestion;
    }

    public void setPointsQuestion(int pointsQuestion) {
        this.pointsQuestion = pointsQuestion;
    }

    public int getTimeQuestion() {
        return timeQuestion;
    }

    public void setTimeQuestion(int timeQuestion) {
        this.timeQuestion = timeQuestion;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public ArrayList<AnswerOptions> getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(AnswerOptions answerOption) {
        this.answerOption.add(answerOption);
    }
}
