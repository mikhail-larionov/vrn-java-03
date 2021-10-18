package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(11);
        figures[1] = new Rectangle(11, 14);
        figures[2] = new Circle(15);
        Calculator calculator = new Calculator();
        double res = calculator.calculateAllFiguresArea(figures);
        System.out.println(res);
    }
}