# 1480. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

<p style="color:rgb(0 184 163);background-color:rgb(0 184 163/.15)">
    Easy
</p>

#### Tags: Array, Dynamic Programming, Prefix Sum

<details>
    <summary><b>Hint</b></summary>
        hint here
</details>

#### What's new?

<pre>

</pre>

Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.

#### Example 1:

<pre>
<b>Input:</b> nums = [1,2,3,4]
<b>Output:</b> [1,3,6,10]
<b>Explanation:</b> Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
</pre>

#### Example 2:

<pre>
<b>Input:</b> nums = [1,1,1,1,1]
<b>Output:</b> [1,2,3,4,5]
<b>Explanation:</b> Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
</pre>

#### Example 3:

<pre>
<b>Input:</b> nums = [3,1,2,10,1]
<b>Output:</b> [3,4,6,16,17]
</pre>

#### Constraints:

* 1 <= nums.length <= 1000
* <code>-10<sup>6</sup> <= nums[i] <= 10<sup>6</sup>

| Accepted | Submissions | Acceptance Rate |
|----------|-------------|-----------------|
| **1.5M** | **1.7M**    | **87.0%**       |