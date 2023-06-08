# 1502.[Can Make Arithmetic Progression From Sequence](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)

<p style="color:rgb(0 184 163);background-color:rgb(0 184 163/.15)">
    Easy
</p>

#### Tags: Array, Sorting

<details>
    <summary><b>Hint</b></summary>
        hint here
</details>

A sequence of numbers is called an **arithmetic progression** if the difference between any two consecutive elements is
the same.
Given an array of numbers `arr`, return `true` _if the array can be rearranged to form an **arithmetic progression**_.
Otherwise, return false.

#### Example 1:

<pre>
    <b>Input:</b> arr = [3,5,1]
    <b>Output:</b> true
    <b>Explanation:</b> We can reorder the elements as [1,3,5] or [5,3,1] 
    with differences 2 and -2 respectively, between each consecutive elements.
</pre>

#### Example 2:

<pre>
    <b>Input:</b> arr = [1,2,4]
    <b>Output:</b> false
    <b>Explanation:</b> There is no way to reorder the elements to obtain an arithmetic progression.
</pre>

#### Constraints:

* `2 <= arr.length <= 1000`
* <code> -10<sup>6</sup> <= arr[i] <= 10<sup>6</sup> </code>

| Accepted   | Submissions | Acceptance Rate |
|------------|-------------|-----------------|
| **203.7K** | **288.8K**  | **70.5%**       |
