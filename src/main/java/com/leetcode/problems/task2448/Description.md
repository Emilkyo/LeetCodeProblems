2448 . Минимальная стоимость, чтобы сделать массив равным

<p style="color:rgb(255 55 95);background-color:rgb(255 55 95/.15)">
    Hard
</p>

#### Tags: sorting two relative arrays, lambda, prefix

<details>
    <summary><b>Hint</b></summary>
        hint here
</details>

#### What's new:

<pre>
    int[][] numsAndCost = new int[n][2];    <b>//   instead of two arrays</b>

    <b>//   using lambda for sorting indexes</b>
    Arrays.sort(indexes, (a, b) -> a[0] - b[0]);    
    
    <b>// Integer instead int</b>
    Integer[] indexes = new Integer[size];
    for (int i = 0; i < size; i++) {
        indexes[i] = i;
    }

    Arrays.sort(indexes, (a, b) -> n[a] - n[b]);

</pre>

You are given two **0-indexed** arrays `nums` and `cost` consisting each of `n` **positive** integers.

You can do the following operation **any** number of times:

* Increase or decrease **any** element of the array `nums` by `1`.
  The cost of doing one operation on the <code>i<sup>th</sup></code> element is `cost[i]`.

Return _the **minimum** total cost such that all the elements of the array `nums` become **equal**_.

#### Example 1:

<pre>
<b>Input:</b> nums = [1,3,5,2], cost = [2,3,1,14]
<b>Output:</b> 8
<b>Explanation:</b> We can make all the elements equal to 2 in the following way:

- Increase the 0<sup>th</sup> element one time. The cost is 2.
- Decrease the 1<sup>st</sup> element one time. The cost is 3.
- Decrease the 2<sup>nd</sup> element three times. The cost is 1 + 1 + 1 = 3.
  The total cost is 2 + 3 + 3 = 8.
  It can be shown that we cannot make the array equal with a smaller cost. 
</pre>

#### Example 2:

<pre>
<b>Input:</b> nums = [2,2,2,2,2], cost = [4,2,8,1,3]
<b>Output:</b> 0
<b>Explanation:</b> All the elements are already equal, so no operations are needed.
</pre>

#### Constraints:

* `n == nums.length == cost.length`
* `1 <= n <= 10<sup>5</sup>`
* <code>1 <= nums[i], cost[i] <= 10<sup>6</sup></code>

| Accepted  | Submissions | Acceptance Rate |
|-----------|-------------|-----------------|
| **29.9K** | **71.3K**   | **41.8%**       |