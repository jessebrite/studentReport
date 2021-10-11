package com.company;

import java.util.List;

public class Student implements Nameable, HasLevel {
    private String id;
    private String name;
    private List<Double> grades;
    private Level level;

    public Student(String id, String name, List<Double> grades, Level level) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.level = level;
    }

    public Double getAverageGrade() {
    	return grades.stream().reduce(0.0, Double::sum) / grades.size();
    }

    @Override
    public String toString() {
        return String.format("Student \nID: %s\nName: %s\nGrades: %s\nAverage: %s\nLevel: %s\n",
                id, name, grades, getAverageGrade(), level);
    }

    // Overriding the getName method in Nameable interface
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
