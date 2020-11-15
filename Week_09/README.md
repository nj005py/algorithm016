学习笔记
# 高级动态规划
递归：函数自己调用自己
分治：分而治之，使用递归
## 分治递归总结
- 人肉递归低效、很累
- 找到最近最简单方法，将其拆分成可重复解决的问题
- 数学归纳法思维

本质：寻找重复性 -> 计算机指令集

## 动态规划
1. 简化复杂问题，拆分成子问题
2. 分治 + 最优子结构
3. 顺推形式：动态递推

# 字符串算法
java与python的String是immutable的，加字符、减字符都会新生成String，好处是线程安全的。
## java遍历字符串
- 使用String的charAt()方法
- 将String转换CharArray，遍历char数据


## Atoi代码示例
```java
// Java
public int myAtoi(String str) {
    int index = 0, sign = 1, total = 0;
    //1. Empty string
    if(str.length() == 0) return 0;
    //2. Remove Spaces
    while(str.charAt(index) == ' ' && index < str.length())
        index ++;
    //3. Handle signs
    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
        sign = str.charAt(index) == '+' ? 1 : -1;
        index ++;
    }
    
    //4. Convert number and avoid overflow
    while(index < str.length()){
        int digit = str.charAt(index) - '0';
        if(digit < 0 || digit > 9) break;
        //check if total will be overflow after 10 times and add digit
        if(Integer.MAX_VALUE/10 < total ||            
        	Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        total = 10 * total + digit;
        index ++;
    }
    return total * sign;
}
```

高级字符串算法，字符串与动态规划相结合。