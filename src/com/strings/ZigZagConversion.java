package com.strings;

public class ZigZagConversion {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Zigzag conversion result: " + convert(input, numRows));
    }

    private static String convert(String s, int numRows) {

        if (numRows==1 || s.length()<=numRows) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int row = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            sb[row].append(c);
            if (row == 0 || row == numRows - 1) goingDown = !goingDown;
            row += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder rowSb : sb) {
            result.append(rowSb);
        }
        return result.toString();
    }
}
