# spring-boot-demo
spring boot 开发模板

基础功能：
1. 统一返回对象
2. 全局异常捕获和自定义异常
3. mybatis-generator 代码生成
4. redis集成
5. shiro集成
6. swagger集成
7. 集成Querydsl

运行准备：
项目需要使用IDEA安装lombok插件

mybatis-generator使用：<br>
Run --> Edit Configurations --> 点击 + 选择 maven --> Command line 输入：mybatis-generator:generate -e

Querydsl解释：<br>
Querydsl 是一个能使用静态类型构建类似于SQL的查询的框架。
JPAAnnotationProcessor(pom插件中配置) 查找带有 javax.persistence.Entity 注解的实体类型并为其生成查询实体类型。<br>
生成方法：通过maven编译： mvn compile<br>
生成路径：pom插件中配置的target路径

Querydsl集成步骤：
1. pom 中添加 Querydsl 的依赖包和插件
2. 通过IDEA反向生成JPA实体类
3. maven编译生成查询实体类型
4. 使用方法参考DemoController --> querydslList

**工程中集成两种持久层框架（mybatis和querydsl）,选择其中任意一种就行。