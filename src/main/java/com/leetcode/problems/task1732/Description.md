# 1732. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)

<p style="color:rgb(0 184 163);background-color:rgb(0 184 163/.15)">
    Easy
</p>

There is a biker going on a road trip. The road trip consists of `n + 1` points at different altitudes. The biker starts
his trip on point `0` with altitude equal `0`.

You are given an integer array `gain` of length `n` where `gain[i]` is the **net gain in altitude** between points `i`
and `i + 1` for all `(0 <= i < n)`. Return _the **highest altitude** of a point._

#### Example 1:

<pre>
<b>Input:</b> gain = [-5,1,5,0,-7]
<b>Output:</b> 1
<b>Explanation:</b> The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
</pre>

#### Example 2:

<pre>
<b>Input:</b> gain = [-4,-3,-2,-1,4,3,2]
<b>Output:</b> 0
<b>Explanation:</b> The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
</pre>

#### Constraints:

* `n == gain.length`
* `1 <= n <= 100`
* `-100 <= gain[i] <= 100`

| Accepted   | Submissions | Acceptance Rate |
|------------|-------------|-----------------|
| **159.5K** | **196.5K**  | **81.2%**       |