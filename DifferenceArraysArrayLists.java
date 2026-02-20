/* 
 Fuel Efficiency Calculator
 Author: Nicholas S. Damuth
 School of Technology and Engineering, National University
 CSC262: Programming in JAVA
 Artee Dubey
 February 20, 2026
*/

import java.util.ArrayList;
import java.util.Arrays;

class Banner {
    final static int WINDOW_LENGTH = 100;
    // Retained here rather than abstracted into its own package for the purpose of keeping all the code in a single file
    private static String _framed_center(String text, int width, String border) {
        border = (border != null) ? border : "*";
        int inner = width - 2;
        int padding = inner - text.length();
        int left = padding / 2;
        int right = padding - left;

        return border + " ".repeat(left) + text + " ".repeat(right) + border;
    }
    public static String _auto_frame(String banner) {
        return _framed_center(banner, WINDOW_LENGTH, null);
    }
    public void print() {
        // Generic banner for class
        String[] banners = {"Difference Arrays ArrayList", "Nicholas S. Damuth", "School of Technology and Engineering, National University", "CSC262: Programming in JAVA", "Artee Dubey", "February 20, 2026"};
        System.out.printf("%s%n", "*".repeat(WINDOW_LENGTH));
        for (String banner : banners) {
            System.out.println(_auto_frame(banner));
        }
        System.out.printf("%s%n", "*".repeat(WINDOW_LENGTH));
    }
}

public class DifferenceArraysArrayLists {

    private static void difference_one(Number[] ints, ArrayList<Number> arr) {
        System.out.println("Memory Address vs Garbage Collection");
        System.out.println(String.format(" Printing a Number[] Array with %s at memory address %s", Arrays.toString(ints), ints));
        System.out.println(String.format(" Printing a ArrayList<Number> with %s. No memory address for Arraylist", arr, arr));
        System.out.println(String.format("   \u2192 Hashcode for ArrayList : %s", 
                            arr.getClass().getName() + "@"+ Integer.toHexString(System.identityHashCode(arr))));
        System.out.println(String.format("  System identify hashcode for Array : %s", System.identityHashCode(ints)));
        System.out.println(String.format("  System identify hashcode for ArrayList : %s\n",System.identityHashCode(arr)));
    }
    private static void difference_two(Number[] ints, ArrayList<Number> arr) {
        System.out.println("Memory Size of Array vs ArrayList");
        System.out.println(String.format(" Memory Size of the Array version : %s bytes", ObjectSizeFetcher.getObjectSize(ints)));
        System.out.println(String.format(" Shallow Memory Size of the Arraylist version : %s bytes", ObjectSizeFetcher.getObjectSize(arr)));
        long size = 0;
        for (Number num: arr) {
            size = size + ObjectSizeFetcher.getObjectSize(num);
        }
        System.out.println(String.format(" Deep Memory Size of the Arraylist version : %s bytes\n", size));
    }
    private static void difference_three(Number[] ints, ArrayList<Number> arr) {
        System.out.println("Dynamic Modification of Arraylist");
        ints[0] = 9;
        arr.remove(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.set(0, 9);
        difference_one(ints, arr);
        difference_two(ints, arr);
    }
    static Number[] ints = new Number[]{0, 0, 0, 0};
    static ArrayList<Number> arr = new ArrayList<>(Arrays.asList(ints));
    public static void main(String[] args) {
        Banner banner = new Banner();
        banner.print();
        difference_one(ints, arr);
        difference_two(ints, arr);
        difference_three(ints, arr);
    }
}
