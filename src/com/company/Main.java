package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> grades1 = new ArrayList<>();
        grades1.add(90.7);
        grades1.add(91.4);
        grades1.add(80.1);
        grades1.add(97.7);
        Student student1 = new Student("1", "James", grades1);

        List<Double> grades2 = new ArrayList<>();
        grades2.add(88.7);
        grades2.add(87.4);
        grades2.add(80.1);
        grades2.add(44.7);
        Student student2 = new Student("2", "John", grades2);

//        System.out.println(student1.getAverageGrade());

        List<Double> averageGrades = new ArrayList<>();
        averageGrades.add(student1.getAverageGrade());
        averageGrades.add(student2.getAverageGrade());

        Lecture lecture = new Lecture("12", averageGrades);
        System.out.println(student1);
        System.out.println(student2);
//        System.out.println(lecture.enter(student1));
        System.out.println(lecture);
//        System.out.println("The highest number: " + lecture.getHighestAverageGrade());
    }
}
