学习笔记

# 递归

递归是通过函数体进行循环。

## 递归模板

### 逻辑

1. 终止条件

2. 处理当层逻辑

3. 探到下层

4. 合并子结果

5. 清理当前层

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



# 分治

分治还是递归，本质上就是找重复性以及分解问题。

## 分治模板

### 逻辑

1. 终止条件

2. 处理当层逻辑

3. 探到下层

4. 合并子结果

5. 清理当前层

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

# 回溯

回溯做到在每一层试错，分布地解决一个问题。通常用递归的方法来实现，找到一个可能存在的答案或尝试所有可能的分布方法后宣告该问题没有答案。

## 剪枝

回溯算法会应用“剪枝”加快搜索速度，有时候需要做预处理来达到剪枝的目的。预处理虽然消耗时间，但能大幅节省剪枝的时间。由于回溯的时间复杂度很高，所以需要采用空间换时间的思路。





