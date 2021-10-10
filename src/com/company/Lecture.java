package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lecture {
	private final String id;
	private final List<Double> averageGrades;

	public Lecture(String id, List<Double> averageGrades) {
		this.id = id;
		this.averageGrades = averageGrades;
	}


	public Double enter(Student student) {
		return student.getAverageGrade();
	}

	public Double getHighestAverageGrade(List<Student> students) {
		Optional<Student> highest = students
			.stream()
			.max(Comparator.comparing(Student::getAverageGrade));
		return highest.get().getAverageGrade();
	}

	@Override
	public String toString() {
		return "Lecture{" +
			"id='" + id + '\'' +
			", averageGrades=" + averageGrades +
			'}';
	}
}