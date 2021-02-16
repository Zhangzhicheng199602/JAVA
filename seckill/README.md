- src
  - main
    - java
      - com.seckillproject
        - controller
          - viewobject    `前端模型对象`
          - UserController
        - dao
        - dataobject
        - service
          - impl    `实现`
            - UserServiceImpl.java    `userService实现`
            - model    `SpringMVC中业务交互模型`
             - UserModel
          - UserService.java    `userService接口`
        - App
    - resources
      - mapping
      - application.properties    `配置文件`
        ```properties
        #端口号
        server.port=8080
        
        # mapper路径
        mybatis.mapperLocations=classpath:mapping/*.xml mapper
        ```
      - mybatis-generator.xml  mybatis自动生成器配置文件
  - test    

- pom.xml    `包管理配置文件`
- seckill.iml