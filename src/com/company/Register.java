package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    List<Nameable> nameable;

    public Register(List<Nameable> nameable) {
        this.nameable = nameable;
    }

    public List<String> getRegister(List<Nameable> nameable) {
        return nameable
                .stream()
                .map(Nameable::getName)
                .collect(Collectors.toList());
    }

    public List<Nameable> getRegisterByLevel(List<Nameable> nameable, Level level) {
        return nameable.stream()
                .filter(x -> x.getLevel().equals(level))
                .collect(Collectors.toList());
    }

    // this code doesn't work yet
//    public List<Nameable> getStudentsByName(List<Nameable> nameable, List<String> names) {
//        return nameable.stream().filter(x -> x.getName().equals(names)).collect(Collectors.toList());
//    }

    public Optional<Nameable> getStudentByName(List<Nameable> nameable, String name) {
        return nameable.stream().filter(x -> x.getName().equals(name)).findFirst();
    }

    public void sort(List<Nameable> nameable) {
        nameable.sort(Comparator.comparing(Nameable::getName));
    }

    // This gets all students by Level
    // After applying sort(), it prints students sorted by name, still grouped by Level
    public void printReport(List<Nameable> nameable) {
        Map<Level, List<Nameable>> collect =
                nameable.stream().collect(Collectors.groupingBy(Nameable::getLevel));
        collect.forEach((level, nameable1) -> {
            System.out.println(level);
            nameable1.forEach(System.out::println);
        });
    }
}
