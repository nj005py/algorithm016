学习笔记

动态规划的本质是寻找重复性

## 递归代码模板
```java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```

## 分治代码模板
```java
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```


## 动态规划、递归、分治异同

- 动态规划和递归、分治没有根本上的区别（关键看有无最优的子结构）
- 共性：找到重复子问题
- 差异性：最优子结构、中途可以淘汰次优解

## 分治与动态规划的区别：是否有最优子结构

- 分治：没有最优子结构，需要把所有的子问题计算并进行合并
- 动态规划：有最优子结构，中途需要淘汰次优解