学习笔记
<br>第六周总结
<br>本周讲解内容为dp：动态规划
<br>动态规划的解题思路：
<br>1.自底向上
<br>2.找到重复子问题
<br>动态规划关键点：
<br>1.最优子结构 opt[n] = best_of(npt[n-1],opt[n-2],...)
<br>2.储存中间状态：opt[i]
<br>3.递推公式（美其名曰：状态转移方程或者DP方程）
<br>Fib：opt[i] = opt[n-1] + opt[n-2]
<br>二维路径:opt[i,j] = opt[i+1][j] + opt[i][j+1](且判断a[i,j]是否空地)