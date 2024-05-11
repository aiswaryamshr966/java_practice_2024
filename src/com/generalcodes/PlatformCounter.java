package com.generalcodes;

import java.util.Arrays;

public class PlatformCounter {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int platformsRequired = findPlatforms(arrival,departure);

        System.out.println("Number Of Platforms Required: "+platformsRequired);
    }

    //Returns minimum number of platforms required
    private static int findPlatforms(int[] arrival, int[] departure) {
        int n = arrival.length;

        //platformRequired indicates number of platforms needed at a time
        int platformRequired = 1;
        int result = 1;

        //sort arrival and departure arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        //similar to merge in merge sort process
        //all events in sorted order
        int i=1,j=0;
        while (i<n && j<n){
            //if next event in sorted order is arrival
            //increment count of platforms needed
            if (arrival[i]<=departure[j]){
                platformRequired++;
                i++;
            }
            //Else decrement count of platforms needed
            else if (arrival[i]>departure[j]) {
                platformRequired--;
                j++;
            }

            //update result if needed
            if (platformRequired>result) result = platformRequired;
        }
        return result;
    }
}
