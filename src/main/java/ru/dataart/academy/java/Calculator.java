package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculable;
import ru.dataart.academy.java.figures.Figure;

import java.util.Arrays;

public class Calculator {
    public double calculateAllFiguresArea(Figure[] figures){
        return Arrays.stream(figures).map(Calculable::calculateArea)
                .mapToDouble(Double::doubleValue).sum();
    }
}
