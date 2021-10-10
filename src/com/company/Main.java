package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Double> grades1 = new ArrayList<>();
		grades1.add(95.7);
		grades1.add(96.4);
		grades1.add(99.1);
		grades1.add(88.7);
		Student student1 = new Student("1", "Grace Omaabo", grades1, Level.TWO);
//		System.out.println(student3);

		List<Double> grades2 = new ArrayList<>();
		grades2.add(84.1);
		grades2.add(94.4);
		grades2.add(87.1);
		grades2.add(93.2);
		NaughtyStudent student2 = new NaughtyStudent("2", "Anas Aremeyaw", grades2, Level.ONE);

		List<Double> grades3 = new ArrayList<>();
		grades3.add(94.7);
		grades3.add(93.4);
		grades3.add(89.1);
		grades3.add(98.7);
		Student student3 = new Student("3", "Amos Nsiah", grades3, Level.ONE);
//		System.out.println(student3);

		List<Double> grades4 = new ArrayList<>();
		grades4.add(84.7);
		grades4.add(90.4);
		grades4.add(87.1);
		grades4.add(90.7);
		NaughtyStudent student4 = new NaughtyStudent("4", "Cynthia Ashong", grades4, Level.ONE);

		List<Double> grades5 = new ArrayList<>();
		grades5.add(90.2);
		grades5.add(96.4);
		grades5.add(99.1);
		grades5.add(96.3);
		Student student5 = new Student("5", "Axolu Etornam", grades5, Level.TWO);

//		System.out.println(student4);
//		System.out.println(student4.increaseAverageGrade());
//		System.out.println(student4.getAverageGrade());
//        System.out.println(student1.getAverageGrade());

		List<Nameable> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
//		System.out.println(students);

		Bag<Student> stu = new Bag();

		List<Double> averageGrades = new ArrayList<>();

		Lecture lecture = new Lecture("12", averageGrades);
//        System.out.println(lecture.enter(student1));
//        System.out.println(lecture);
//		System.out.println("The highest number: " + lecture.getHighestAverageGrade(students));

		List<String> studentNames = new ArrayList<>();
		studentNames.add("Anas Aremeyaw");
//		studentNames.add("Amos Nsiah");
//		studentNames.add("Cynthia Ashong");

		Register register = new Register(students);
		register.printReport(students);
		register.sort(students);
		System.out.println("After sorting.....\n");
//		register.printReport(students);
//		System.out.println(student1.getLevel());
//		System.out.println(register.getRegister(students));
//		System.out.println(register.getRegisterByLevel(students, Level.ONE));
//		register.printReport(students);
//		System.out.println(register.getStudentByName(students, "Anas Aremeyaw"));
//		System.out.println(register.getStudentsByName(students, studentNames));
	}
}
