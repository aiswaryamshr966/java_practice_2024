package com.cracking_the_coding_interview;

public class UniqueCharactersString {
    public static void main(String[] args) {
        String name = "Aiswarya Mishra";

        boolean result1 = isUniqueCharsUsingStreams(name);

        if (result1) {
            System.out.println("Unique String");
        } else {
            System.out.println("Not Unique String");
        }

        //More Efficient Approach
        boolean result = isUniqueChars(name);

        if (result) {
            System.out.println("Unique String");
        } else {
            System.out.println("Not Unique String");
        }
    }

    private static boolean isUniqueCharsUsingStreams(String name) {
        String nameRedifined = name.chars()
                .mapToObj(c->(char)c)
                .distinct()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(name);
        System.out.println(nameRedifined);

        if (name.length() == nameRedifined.length()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isUniqueChars(String name) {
        if (name.length()>128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < name.length(); i++) {
            int val = name.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
