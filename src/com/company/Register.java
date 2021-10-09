package com.company;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
	List<Nameable> nameable;

	public Register(List<Nameable> nameable) {
		this.nameable = nameable;
	}

	public void getRegister(List<Nameable> nameable) {
		List<String> collect = nameable
			.stream()
			.map(Nameable::getName)
			.collect(Collectors.toList());

		// print to the console
		collect.forEach(System.out::println);
	}

	public void getRegisterByLevel(List<Nameable> nameables, Level level) {
		List<Nameable> collect = nameables.stream()
			.filter(x -> x.getLevel().equals(level))
			.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

	public void printReport(List<Nameable> nameables) {
		Map<Level, List<Nameable>> collect = nameables.stream().collect(Collectors.groupingBy(Nameable::getLevel));
		collect.forEach((level, nameables1) -> {
			System.out.println(level);
			nameables1.forEach(System.out::println);
		});
	}
}
