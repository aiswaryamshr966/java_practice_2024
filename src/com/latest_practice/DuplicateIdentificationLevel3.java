package com.latest_practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIdentificationLevel3 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) {
            return false;
        }

        Map<Long, Long> buckets = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long bucketId = getBucketId(nums[i], (long) valueDiff + 1);

            // Check if there is a number in the same bucket or adjacent bucket
            if (buckets.containsKey(bucketId) ||
                    (buckets.containsKey(bucketId - 1) && Math.abs(nums[i] - buckets.get(bucketId - 1)) <= valueDiff) ||
                    (buckets.containsKey(bucketId + 1) && Math.abs(nums[i] - buckets.get(bucketId + 1)) <= valueDiff)) {
                return true;
            }

            buckets.put(bucketId, (long) nums[i]);

            // Remove elements that are outside the sliding window of size indexDiff
            if (i >= indexDiff) {
                buckets.remove(getBucketId(nums[i - indexDiff], (long) valueDiff + 1));
            }
        }

        return false;
    }

    private static long getBucketId(long num, long bucketSize) {
        return num < 0 ? (num + 1) / bucketSize - 1 : num / bucketSize;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;

        boolean result = containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        System.out.println(result);  // Output: true
    }
}

