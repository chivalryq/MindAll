# 回文

在O(n^2)时间内，用动态规划的方法求一个判断字符串任意子串是否是回文的二维布尔数组
```java
boolean[][] getIsPalindrome(String s) {
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];

        for (boolean[] a : isPalindrome) {
            Arrays.fill(a, false);
        }
        //注意先循环右边界
        for (int right = 0; right < s.length(); right++) {
            for (int left = 0; left <= right; left++) {
                if (right == left) isPalindrome[left][right] = true;
                else if (right == left + 1) {
                    if (s.charAt(left) == s.charAt(right)) isPalindrome[left][right] = true;
                } else {
                    if (isPalindrome[left + 1][right - 1] && s.charAt(right) == s.charAt(left))
                        isPalindrome[left][right] = true;
                }
            }
        }
        return isPalindrome;
    }
```
再基于这个做。求最长回文串、分割方案、最长分割
