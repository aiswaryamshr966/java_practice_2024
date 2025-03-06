package com.strings;

public class TypeWriter {
    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
        System.out.println(minTimeToType("Aiswarya Mishra"));
    }

    private static int minTimeToType(String word) {
        int time = 0;
        char current = 'a'; //Pointer starts at 'a'

        for(char c : word.toLowerCase().replaceAll("\\s+", "").toCharArray()){
            //Calculate the distance between current and target character
            int clockwiseDistance = Math.abs(c-current);
            int anticlockwiseDistance = 26-clockwiseDistance;

            //Add the similar distance to the time
            time += Math.min(clockwiseDistance,anticlockwiseDistance);

            //Add one second to type the character
            time++;

            //Update the current character
            current = c;
        }

        return time;
    }
}
