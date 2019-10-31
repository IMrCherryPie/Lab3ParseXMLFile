package com.dgtu.task1;

public class AnswerOptions {
    private String name; // Уникальное имя варианта ответа
    private int cost; // Стоимость ответа, еоличество получаемых баллов
    private String textAnswer; // Текст ответа

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }
}
