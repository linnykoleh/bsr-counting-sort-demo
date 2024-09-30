# BST and Counting Sort

## Implement class for Balanced Binary Search Tree that can insert, find and delete elements.

[BalancedBinarySearch.java](src/main/java/demo/bsrcountingsortdemo/BalancedBinarySearch.java)

## Generate 100 random datasets and measure complexity.

[BsrCountingSortDemoApplication.java](src/main/java/demo/bsrcountingsortdemo/BsrCountingSortDemoApplication.java)

| Dataset | Insertion Time (ns) | Deletion Time (ns) |
|---------|---------------------|--------------------|
| 0       | 4316833             | 3320416            |
| 1       | 5661333             | 1895083            |
| 2       | 143041              | 219833             |
| 3       | 127625              | 221583             |
| 4       | 161417              | 221000             |
| 5       | 130541              | 220666             |
| 6       | 137625              | 221250             |
| 7       | 131292              | 221250             |
| 8       | 138250              | 220584             |
| 9       | 127833              | 216375             |
| 10      | 129417              | 229083             |
| 11      | 127000              | 218792             |
| 12      | 133583              | 228791             |
| 13      | 125500              | 226250             |
| 14      | 129792              | 217875             |
| 15      | 134667              | 219666             |
| 16      | 135333              | 219042             |
| 17      | 124958              | 215292             |
| 18      | 145667              | 219333             |
| 19      | 131625              | 223042             |
| 20      | 130750              | 222583             |
| 21      | 130166              | 227416             |
| 22      | 460417              | 393417             |
| 23      | 103750              | 191125             |
| 24      | 101250              | 188667             |
| 25      | 99084               | 185125             |
| 26      | 99166               | 181875             |
| 27      | 97458               | 181291             |
| 28      | 102667              | 198667             |
| 29      | 100917              | 185334             |
| 30      | 99833               | 185041             |
| 31      | 98291               | 181708             |
| 32      | 101416              | 184875             |
| 33      | 97583               | 185583             |
| 34      | 109166              | 181416             |
| 35      | 98584               | 189542             |
| 36      | 100625              | 180084             |
| 37      | 99750               | 181583             |
| 38      | 102084              | 183958             |
| 39      | 97666               | 186334             |
| 40      | 100417              | 181958             |
| 41      | 109000              | 188625             |
| 42      | 99583               | 189708             |
| 43      | 100500              | 194666             |
| 44      | 103125              | 187500             |
| 45      | 98875               | 180250             |
| 46      | 97208               | 181833             |
| 47      | 112041              | 178833             |
| 48      | 99542               | 177791             |
| 49      | 100625              | 180458             |
| 50      | 99000               | 180333             |
| 51      | 99792               | 180334             |
| 52      | 98209               | 176458             |
| 53      | 99292               | 176625             |
| 54      | 96209               | 179625             |
| 55      | 97166               | 13958917           |
| 56      | 110834              | 86542              |
| 57      | 101750              | 82583              |
| 58      | 270542              | 82333              |
| 59      | 121791              | 83750              |
| 60      | 103792              | 86375              |
| 61      | 326708              | 94250              |
| 62      | 117542              | 85291              |
| 63      | 101000              | 83750              |
| 64      | 103375              | 7470875            |
| 65      | 6297125             | 12092416           |
| 66      | 5549000             | 1285209            |
| 67      | 114583              | 84334              |
| 68      | 98459               | 82250              |
| 69      | 180000              | 819500             |
| 70      | 401208              | 256166             |
| 71      | 101125              | 86042              |
| 72      | 101500              | 95541              |
| 73      | 94000               | 80292              |
| 74      | 94250               | 74875              |
| 75      | 91625               | 74083              |
| 76      | 119208              | 73500              |
| 77      | 90291               | 74458              |
| 78      | 87083               | 73833              |
| 79      | 88667               | 73125              |
| 80      | 87584               | 72833              |
| 81      | 88167               | 74625              |
| 82      | 86334               | 72792              |
| 83      | 92125               | 75750              |
| 84      | 87291               | 72875              |
| 85      | 86417               | 73041              |
| 86      | 87042               | 71833              |
| 87      | 87333               | 308333             |
| 88      | 98042               | 269375             |
| 89      | 94334               | 80166              |
| 90      | 94166               | 79333              |
| 91      | 115459              | 79875              |
| 92      | 111042              | 78625              |
| 93      | 112083              | 86584              |
| 94      | 92958               | 78167              |
| 95      | 89916               | 77333              |
| 96      | 97250               | 76834              |
| 97      | 87125               | 76834              |
| 98      | 93417               | 93083              |
| 99      | 95708               | 80542              |



## Implement Counting Sort algorithm.

[CountingSortAlgorithm.java](src/main/java/demo/bsrcountingsortdemo/CountingSortAlgorithm.java)

## Figure out when Counting Sort doesn’t perform.

- Large range of input values: If the input values have a large range (i.e., the difference between the maximum and
  minimum values is large), Counting Sort becomes inefficient in terms of both time and space complexity.
- Floating-point or negative numbers: Counting Sort is not suitable for sorting floating-point numbers or negative
  numbers without modifications.
- Values such as strings or objects.