package io.andre;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
  @Test
  public void testLeetCode0001TwoSum() {
    int[] expected1 = new int[] {0, 1};
    int[] nums1 = new int[] {2, 7, 11, 15};
    int target1 = 9;

    int[] actual1 = App.leetCode0001TwoSum(nums1, target1);

    assertArrayEquals(expected1, actual1);

    int[] expected2 = new int[] {1, 2};
    int[] nums2 = new int[] {3, 2, 4};
    int target2 = 6;

    int[] actual2 = App.leetCode0001TwoSum(nums2, target2);

    assertArrayEquals(expected2, actual2);

    int[] expected3 = new int[] {0, 1};
    int[] nums3 = new int[] {3, 3};
    int target3 = 6;

    int[] actual3 = App.leetCode0001TwoSum(nums3, target3);

    assertArrayEquals(expected3, actual3);
  }
}
