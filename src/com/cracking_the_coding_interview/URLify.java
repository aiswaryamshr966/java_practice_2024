package com.cracking_the_coding_interview;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aiswarya
 */
public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith     ";
        String output = replaceSpaces(input.toCharArray(),13);

        System.out.println("The Input is: "+input);
        System.out.println("The Output is: "+output);
    }

    private static String replaceSpaces(char[] toCharArray, int trueLength) {
        int spaceCount = 0, index = 0, i = 0;
        for (i = 0; i < trueLength; i++) {
            if(toCharArray[i]==' ') spaceCount++;
        }

        index = trueLength + spaceCount*2;

        if(trueLength<toCharArray.length) toCharArray[trueLength] = '\0'; //End Array
        for(i=trueLength-1;i>=0;i--){
            if(toCharArray[i]==' '){
                toCharArray[index-1]='0';
                toCharArray[index-2]='2';
                toCharArray[index-3]='%';
                index=index-3;
            }else{
                toCharArray[index-1]=toCharArray[i];
                index--;
            }
        }

        return Arrays.stream(new String(toCharArray).split(""))
                    .collect(Collectors.joining());
    }
}
