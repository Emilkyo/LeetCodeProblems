# 1027. [Longest Arithmetic Subsequence](https://leetcode.com/problems/longest-arithmetic-subsequence/)

<p style="color:#FFC01E;background-color:rgb(255 192 30/.15)">
    Medium
</p>

#### Tags: Array, Sorting

<details>
    <summary><b>Hint</b></summary>
        hint here
</details>

#### What's new?

<pre>

</pre>

Given an array `nums` of integers, return _the length of the longest arithmetic subsequence in `nums`_.

**Note** that:

* A **subsequence** is an array that can be derived from another array by deleting some or no elements without changing
  the order of the remaining elements.
* A sequence `seq` is arithmetic if `seq[i + 1] - seq[i]` are all the same value (for `0 <= i < seq.length - 1`).

#### Example 1:

<pre>
<b>Input:</b> nums = [3,6,9,12]
<b>Output:</b> 4
<b>Explanation:</b>  The whole array is an arithmetic sequence with steps of length = 3.
</pre>

#### Example 2:

<pre>
<b>Input:</b> nums = [9,4,7,2,10]
<b>Output:</b> 3
<b>Explanation:</b>  The longest arithmetic subsequence is [4,7,10].
</pre>

#### Example 3:

<pre>
<b>Input:</b> nums = [20,1,15,3,10,5,8]
<b>Output:</b> 4
<b>Explanation:</b>  The longest arithmetic subsequence is [20,15,10,5].
</pre>

#### Constraints:

* `2 <= nums.length <= 1000`
* `0 <= nums[i] <= 500`

| Accepted | Submissions | Acceptance Rate |
|----------|-------------|-----------------|
| **123K** | **258K**    | **47.7%**       |