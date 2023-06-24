# 956. [Tallest Billboard](https://leetcode.com/problems/tallest-billboard/)

<p style="color:rgb(255 55 95);background-color:rgb(255 55 95/.15)">
    Hard
</p>

#### Tags: HashMap, Dynamic programming

<details>
    <summary><b>Hint</b></summary>
        hint here
</details>
<p></p>
<details>
    <summary><b>What's new?</b></summary>
<pre>
code inside
</pre> 
</details>



You are installing a billboard and want it to have the largest height. The billboard will have two steel supports, one
on each side. Each steel support must be an equal height.

You are given a collection of `rods` that can be welded together. For example, if you have rods of lengths `1`, `2`,
and `3`,
you can weld them together to make a support of length `6`.

Return _the largest possible height of your billboard installation_. If you cannot support the billboard, return `0`.

#### Example 1:

<pre>
Input: rods = [1,2,3,6]
Output: 6
Explanation: We have two disjoint subsets {1,2,3} and {6},which have the same sum = 6.
</pre>

#### Example 2:

<pre>
Input: rods = [1,2,3,4,5,6]
Output: 10
Explanation: We have two disjoint subsets {2,3,5} and {4,6}, which have the same sum = 10.
</pre>

#### Example 3:

<pre>
Input: rods = [1,2]
Output: 0
Explanation: The billboard cannot be supported, so we return 0.
</pre>

#### Constraints:

1 <= rods.length <= 20
1 <= rods[i] <= 1000
sum(rods[i]) <= 5000

| Accepted  | Submissions | Acceptance Rate |
|-----------|-------------|-----------------|
| **45.5K** | **88K**     | **51.7%**       |