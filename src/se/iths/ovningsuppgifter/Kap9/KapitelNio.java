package se.iths.ovningsuppgifter.Kap9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class KapitelNio {
    public static void main(String[] args) {
        List<Countries> countries = new ArrayList<>();
                countries.add(new Countries("Sverige", "Stockholm", 10.07, 450295));
                countries.add(new Countries("Norge", "Oslo", 5.27, 323802));
                countries.add(new Countries("Island", "Reykjavik", 0.33, 102775));
                countries.add(new Countries("Danmark", "Köpenhamn", 5.75, 42931));
                countries.add(new Countries("Finland", "Helsinki", 5.51, 338424));
                countries.add(new Countries("Belgien", "Bryssel", 11.30, 30528));
                countries.add(new Countries("Tyskland", "Berlin", 82.18, 357168));
                countries.add(new Countries("Frankrike", "Paris", 66.99, 640679));
                countries.add(new Countries("Storbritannien", "London", 60.80, 209331));
                countries.add(new Countries("Niue", "Alofi", 0.0016, 261));
                countries.add(new Countries("Mongoliet", "Ulan Batar", 3.08, 1566000));
                countries.add(new Countries("Polen", "Warszawa", 38.63, 312679));
                countries.add(new Countries("Spanien", "Madrid", 46.5, 505990));
                countries.add(new Countries("Portugal", "Lissabon", 10.31, 92212));
                countries.add(new Countries("Italien", "Rom", 60.59, 301338));
                countries.add(new Countries("Grekland", "Aten", 11.18, 131957));
                countries.add(new Countries("Luxemburg", "Luxemburg", 0.58, 2586));
                countries.add(new Countries("Liechtenstein", "Vaduz", 0.038, 160));
                exercise3(countries);
                exercise4(countries);
                exercise5(countries);
                exercise6(countries);
                //exercise6(countries);
                exericse7(countries);
                exercise8(countries);
                exercise9(countries);
                exercise10(countries);
                exercise11(countries);
                exercise12(countries);
                exercise13(countries);
                System.out.println("__________________________________________");
                countries.stream()
                        .
    }

    private static void exercise3(List<Countries> countries) {
        countries.stream().limit(1).forEach(System.out::println);
        countries.stream().skip(countries.size()-1).forEach(System.out::println);
    }

    private static void exercise4(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .map(Countries::country)
                .sorted()
                .forEach(System.out::println);
    }

    private static void exercise5(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .map(Countries::population)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void exercise6(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .map(Countries::population)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(System.out::println);
    }

    private static void exericse7(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                        .map(Countries::population)
                        .filter(pop -> pop > 5)
                                .forEach(System.out::println);
    }

    private static void exercise8(List<Countries> countries) {
        System.out.println("__________________________________________");
        System.out.println("10 000");
        countries.stream()
                        .map(Countries::area)
                        .filter(area -> area > 10000)
                        .forEach(System.out::println);
        System.out.println("__________________________________________");
        System.out.println("100 000");
        countries.stream()
                        .map(Countries::area)
                        .filter(area -> area > 100000)
                        .forEach(System.out::println);
        System.out.println("__________________________________________");
        System.out.println("1 000 000");
        countries.stream()
                        .map(Countries::area)
                        .filter(area -> area > 1000000)
                        .forEach(System.out::println);
    }

    private static void exercise9(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .filter(p -> startSameLetters(p))
                .forEach(System.out::println);
    }

    private static void exercise10(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .filter(p -> countryLengthLargerThanCity(p))
                .forEach(System.out::println);
    }

    private static void exercise11(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .sorted(Comparator.comparing(Countries::population))
                .limit(5)
                .forEach(System.out::println);
    }

/*
    private static void exercise6(List<Countries> countries) {
        System.out.println("__________________________________________");
        OptionalDouble average = countries.stream()
        .flatMapToInt(countries1 -> IntStream.of(countries1.area()))
        .average();

        OptionalDouble nr = countries.stream()
                .mapToInt(Countries::area)
                .filter(c -> c < average)
                .count();

        System.out.println(nr);
    }

    */

    private static void exercise12(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .filter(p -> p.population() >= 7)
                .sorted(Comparator.comparing(Countries::population))
                .limit(5)
                .forEach(System.out::println);
    }

    private static void exercise13(List<Countries> countries) {
        System.out.println("__________________________________________");
        countries.stream()
                .filter(c -> c.area() > 500000)
                .sorted(Comparator.comparing(Countries::area).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    private static boolean startSameLetters(Countries p) {
        return p.city().substring(0, 1).equals(p.country().substring(0, 1));
    }

    private static boolean countryLengthLargerThanCity(Countries p) {
        return p.country().length() > p.city().length();
    }
}
