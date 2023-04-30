import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);

        Set<Integer> set = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0 && !set.contains(num)) {
                System.out.print(num + " ");
                set.add(num);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задача 3");
        List<String> words = new ArrayList<>(List.of("one", "one", "two"));
        Set<String> wordsUniq = new HashSet<>(words);
        System.out.println(wordsUniq + " ");
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                Integer count = map.get(string);
                map.put(string, count + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
    }
}
