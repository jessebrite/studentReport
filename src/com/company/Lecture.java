package com.company;

import java.util.List;

public class Lecture {
    private final String id;
    private final List<Double> averageGrades;

    public Lecture(String id, List<Double> averageGrades) {
        this.id = id;
        this.averageGrades = averageGrades;
    }


    public Double enter (Student student) {
        return student.getAverageGrade();
    }

    public double getHighestAverageGrade(double[] params) {
        double highest = 0;
        for ( double param : params) {
            if (param > highest)
                highest = param;
        }
//        for (int i = 0; i < averageGrades.size(); i++) {
//            if (i > highest) {
//                highest = i;
//            }
//        }
        return highest;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id='" + id + '\'' +
                ", averageGrades=" + averageGrades +
                '}';
    }
}