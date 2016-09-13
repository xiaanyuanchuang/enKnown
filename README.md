# enKnown
企业知识检索系统

## 目标
模块化，松耦合的企业级的知识管理系统

## 基本描述

### 模块化
1. 框架模块
2. 验证模块
3. 文档存储模块
4. 检索模块

### 模块组合
框架模块（控制显示、调度） + 验证模块（访问拦截） + 功能模块（具体功能管理）

## 功能

### 框架模块
1. 注册服务
2. 对应不同的服务进行不同的调度

### 验证模块
1. 根据验证请求进行访问验证

### 文档存储模块
1. 存储原始文档
2. 生成文档目录

### 检索模块
1. 聚合不同类型的文档生成文档的倒排索引
2. 根据检索关键字的不同对文档内容进行检索返回最优的检索内容

## 技术架构

1. 框架      : Play Framework 2.5.6
2. 数据库    : mysql 5.7
3. 前端框架  : bootstrap v3.x
4. 索引和分析: lucene 6.2.x
