package com.company;

import java.util.List;

public class Student {
    private final String id;
    private final String name;
    private List<Double> grades;

    public Student(String id, String name, List<Double> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return String.format("Student \nID: %s\nName: %s\nGrades: %s\nAverage: %s\n",
                id, name, grades, getAverageGrade());
    }
}
