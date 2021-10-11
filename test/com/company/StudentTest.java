package com.company;

import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Should return the average grade of students")
    void getAverageGrade() {
        List<Double> grades1 = new ArrayList<>();
        grades1.add(95.7);
        grades1.add(96.4);
        grades1.add(99.1);
        grades1.add(88.7);
        double expected = grades1.stream().reduce(0.0, Double::sum) / grades1.size();
        Student student1 = new Student("1", "Grace Omaabo", grades1, Level.TWO);
        assertEquals(expected, student1.getAverageGrade());
    }
}