## 在线算法判题系统的设计与分析

### 简介

基于 Spring Boot + Spring Cloud 微服务 + Docker（+ React + Ant Design）的在线算法评测系统。
在系统前台，管理员可以创建、管理题目；用户可以自由搜索题目、阅读题目、编写并提交代码。
在系统后端，能够根据管理员设定的题目测试用例在自主实现的代码沙箱中对代码进行编译、运行、判断输出是否正确。
其中，代码沙箱可以作为独立服务，提供给其他开发者使用。
> 代码仓库
> [前端代码](https://github.com/1125rx/oj-project-frontend)
> [后端代码](https://github.com/1125rx/oj-project-backend)
> [沙箱](https://github.com/1125rx/oj-project-sandbox)

### 开发计划

- [x] 项目初始化（3-5天）
  - [x] 数据库设计（3.1）
  - [x] 后端初始化，登陆注册、发布文章等基本功能的实现（3.1-3.3）
  - [x] 前端初始化，前后端联调，基本框架实现（3.3-3.4）
    - 前端初始化、登录注册实现（3.3-3.4）
    - ![image-20240310235333509](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310235333509.png)
    - ![image-20240310234522108](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310234522108.png)
    - ![image-20240310234559363](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310234559363.png)
- [x] 题目管理模块（3-5天）
  - [x] 开发题目相关接口（3.5-3.7）
    - 修改部分架构（3.5）
    - ![image-20240310234908198](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310234908198.png)
    - 实现题目管理（增删改查）模块（3.6-3.7）
    - 实现题目查询、判定设置模块（3.8）
  - [x] 整合代码编辑器，题目页面开发（自定义代码模板）
    - 实现前端查询页面（3.9）
    - ![image-20240310235107695](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310235107695.png)
    - 实现题目提交页面（3.10-3.11）
    - ![image-20240310235127122](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240310235127122.png)
  - [x] 题目增删改查的页面开发（3.12-3.14）
- [ ] 代码沙箱实现（5-7天）
  - [x] 核心流程开发（3.14-3.16）
    - ![image-20240318092309886](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240318092309886.png)
  - [x] 代码沙箱Java模块开发(3.16-3.17)
    - [x] 代码编译、运行、输出判断
    - [x] 超时控制、内存控制、沙箱隔离、安全性控制实现
      -  ![image-20240318093818287](https://raw.githubusercontent.com/1125rx/cloudImg/master/img/image-20240318093818287.png)
  - [ ] 代码沙箱C++模块开发
    - [ ] 代码编译、运行、输出判断
    - [ ] 超时控制、内存控制、沙箱隔离、安全性控制实现
  - [ ] 代码沙箱Python模块开发
    - [ ] 代码编译、运行、输出判断
    - [ ] 超时控制、内存控制、沙箱隔离、安全性控制实现
  - [ ] 代码沙箱Docker模块开发
    - [ ] Docker容器的创建、销毁
    - [ ] Docker容器的资源控制
- [ ] 判题机模块开发（5-7天）
  - [ ] 判题服务模块开发
- [ ] 功能模块补充（5-7天）
  - [ ] 实现发布竞赛功能
  - [ ] 完善前端代码
- [ ] 项目收尾（3-5天）	
