# springboot_oracle_mybatis_xml_example
spring boot oracle mybatis xml example

极简化的 

    spring boot + 
    mybatis(使用XML mapper) +
    oracle + 
    maven mybatis generator plugin


> 安装使用说明
   
    由于Oracle的驱动无法从mvn上下载，需要手动下载驱动JAR包。
    本demo使用Oracle 11g 所以下载的ojdbc6。

> 下载Oracle驱动

> 下载 mvn 然后执行命令，将驱动包，安装到本地仓库中：
```bash
./mvn install:install-file -Dfile=ojdbc6.jar  -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar
```

> 本项目即可以正常执行

> 打war包部署到Tomcat说明
    
    1 使用 mvn package 命令打成war包。
    2 直接部署到Tomcat 8+ 上即可。
      ！如果是部署到Tomcat 7 上需要下载javax.el-api-3.0.0，添加到Tomcat的lib中。