# 1071. [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings)

<p style="color:rgb(0 184 163);background-color:rgb(0 184 163/.15)">
    Easy
</p>

#### Tags: Math, String, GCD - НОД (наибольший общий делитель)

<details>
<summary>Hint </summary>
The greatest common divisor must be a prefix of each string, so we can try all prefixes.
</details>

For two strings `s` and `t`, we say "`t` divides `s`" if and only if `s = t + ... + t` (i.e., `t` is concatenated with
itself one or
more times).

Given two strings `str1` and `str2`, return _the largest string `x` such that `x` divides both `str1` and `str2`_.

#### Example 1:

<pre>
<b>Input:</b> str1 = "ABCABC", str2 = "ABC"
<b>Output:</b> "ABC"
</pre>

#### Example 2:

<pre>
<b>Input: </b> str1 = "ABABAB", str2 = "ABAB"
<b>Output:</b> "AB"
</pre>

#### Example 3:

<pre>
<b>Input:</b> str1 = "LEET", str2 = "CODE"
<b>Output:</b> ""
</pre>

#### Constraints:

* `1 <= str1.length, str2.length <= 1000`
* `str1` and `str2` consist of English uppercase letters.

| Accepted   | Submissions | Acceptance Rate |
|------------|-------------|-----------------|
| **187.4K** | **340.6K**  | **55.0%**       |