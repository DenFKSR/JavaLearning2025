package javaCollection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //List
            List<String> fruits = new ArrayList<>();
            fruits.add("яблоко");
            fruits.add("груша");
            fruits.add("банан");
            fruits.add("персик");
        System.out.println(fruits);
        System.out.println(fruits.size());


        List<String> vegetables = new LinkedList<>();
        vegetables.add("potato");
        vegetables.add("tomato");
        vegetables.add("pumkin");
        vegetables.add("potato");
        System.out.println(vegetables);

        //убирает дубли в списке
        Set<String> car = new HashSet<>();
        car.add("bmw");
        car.add("mercedes");
        car.add("audi");
        car.add("bmw");
        System.out.println(car);



        Set<String> car2 = new LinkedHashSet<>();//оставляет порядок добавления
        car2.add("bmw");
        car2.add("mercedes");
        car2.add("audi");
        car2.add("bmw");
        System.out.println(car2);


        Set<String> car3 = new TreeSet<>();//позволяет легко сортировать элементы
        car3.add("bmw");
        car3.add("mercedes");
        car3.add("audi");
        car3.add("bmw");
        System.out.println(car2);

        Map<String, Integer> unitArmy = new HashMap<>();
        unitArmy.putIfAbsent("пехота", 300); // команда putIfAbsent чтобы не перетерало значение
        unitArmy.put("танки", 15);
        unitArmy.put("град", 10);
        unitArmy.putIfAbsent("пехота", 200);
        System.out.println(unitArmy);


        // сохраняет порядок добавления
        Map<String, Integer> unitArmy2 = new LinkedHashMap<>();
        unitArmy2.putIfAbsent("пехота", 300); // команда putIfAbsent чтобы не перетерало значение
        unitArmy2.put("танки", 15);
        unitArmy2.put("град", 10);
        unitArmy2.putIfAbsent("пехота", 200);
        System.out.println(unitArmy2);



        // сохраняет порядок добавления
        Map<String, Integer> unitArmy3 = new TreeMap<>();
        unitArmy3.putIfAbsent("пехота", 300); // команда putIfAbsent чтобы не перетерало значение
        unitArmy3.put("танки", 15);
        unitArmy3.put("град", 10);
        unitArmy3.putIfAbsent("пехота", 200);
        System.out.println(unitArmy3);

    }
}
