package com.company;

import java.util.List;

public class NaughtyStudent extends Student {


	public NaughtyStudent(String id, String name, List<Double> grades, Level level) {
		super(id, name, grades, level);
	}

	public double increaseAverageGrade() {
		return getAverageGrade() + (getAverageGrade() * 0.1);
	}
}
