### 在图上DFS

先污染后治理，在dfs函数的前两句判断是否过界 避免在里面if，类似这样

```java
    int mark(int x, int y) {
        if (!check(x, y)) return 0;
        if (map[x][y] != 1) return 0;
        //mark
        map[x][y] = islandIndex;
        int area = 1;
        return area
                + mark(x + 1, y)
                + mark(x - 1, y)
                + mark(x, y + 1)
                + mark(x, y - 1);
    }

```

