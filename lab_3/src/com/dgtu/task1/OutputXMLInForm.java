package com.dgtu.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class OutputXMLInForm {
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 250;
//    private static ArrayList<Test> testList;

    public static void main(String[] args) {
        File file = new File("D:\\7 семестр\\Ступина\\lab_3\\src\\com\\dgtu\\xml's\\test.xml");
        CreateTestList(file);
    }

    private static Test CreateTestList(File fXmlFile) {
        Test test = new Test();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            Element elementRoot = doc.getDocumentElement(); //Получаем кррневой  элемент
            test.setNameTest(elementRoot.getAttribute("name"));
            test.setTheme(elementRoot.getAttribute("theme"));
            test.setCountQuestionInTest(new Integer(elementRoot.getAttribute("countQuestions")));
            test.setTimeTest(new Integer(elementRoot.getAttribute("time")));
            test.setPointsTest(new Integer(elementRoot.getAttribute("allPoints")));

            NodeList steplNodeList = doc.getElementsByTagName("step");

            for(int ii = 0; ii < steplNodeList.getLength(); ii++) {
                if (steplNodeList.item(ii).getNodeType() == Node.ELEMENT_NODE) {
                    Element stepElement = (Element) steplNodeList.item(ii); //Получили первый и последующие элменты Step
                    Question questionNowStep = new Question();
                    questionNowStep.setNameQuestion(stepElement.getAttribute("name"));
                    questionNowStep.setPointsQuestion(new Integer(stepElement.getAttribute("points")));
                    questionNowStep.setTimeQuestion(new Integer(stepElement.getAttribute("time")));
                    questionNowStep.setDifficulty(new Integer(stepElement.getAttribute("difficulty")));
                    questionNowStep.setTextQuestion(stepElement.getTextContent());

                    NodeList childNodeList = stepElement.getChildNodes();   //Получили список детей текущего элемента Step
                    for (int jj = 0; jj < childNodeList.getLength(); jj++) {
                        if (childNodeList.item(jj).getNodeType() == Node.ELEMENT_NODE) {
                            Element elementAnswer = (Element) childNodeList.item(jj);
                            AnswerOptions answerNowStep = new AnswerOptions();
                            answerNowStep.setCost(new Integer(elementAnswer.getAttribute("cost")));
                            answerNowStep.setName(elementAnswer.getAttribute("name"));
                            answerNowStep.setTextAnswer(elementAnswer.getTextContent());
                            questionNowStep.setAnswerOption(answerNowStep);
                        }
                    }
                    test.setQuestion(questionNowStep);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
    }
}
