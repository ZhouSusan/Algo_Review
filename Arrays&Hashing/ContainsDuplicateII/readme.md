## [#219. Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii)

Given an integer array `nums` and an integer `k`, return `true` _if there are **two distinct indices** `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`_.

**Example 1:**
````
Input: nums = [1,2,3,1], k = 3
Output: true
````

**Example 2:**
````
Input: nums = [1,0,1,1], k = 1
Output: true
````

**Example 3:**
````
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
````
**Constraints:**
* `1 <= nums.length <= 100000`
* `-1000000000 <= nums[i] <= 1000000000`
* `0 <= k <= 100000`
