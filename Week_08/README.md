学习笔记

# 布隆过滤器的实现及应用

## Bloom Filter
一个很长的二进制向量和一系列随机映射函数。布隆过滤器可以用于检索 一个元素是否在一个集合中。
- 查询结果：不存在----一定不存在；存在----不一定存在；
- 应用：
  1. 比特币网络
  2. 分布式系统(Map-Reduce) — Hadoop、search engine
  3. Redis 缓存
  4. 垃圾邮件、评论等的过滤

# LRU Cache
LRU Cache： • 两个要素: 大小 、替换策略 • Hash Table + Double LinkedList • O(1) 查询 O(1) 修改、更新

LFU - least frequently used LRU - least recently used