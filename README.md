tool-common
===========

共有全局功能项目

版本变更说明
---
### 1.0.3
修改ProjectConstant，将静态变量改为单例对象，并修改了变量名获取方式。<br>
添加onlineEnvSet，值为[{ "dev", "test", "real" }]。<br>
添加全部全局变量的默认值。<br>

### 1.1.0
添加了servlet context path的值到ProjectConstant。<br>
去除了parent依赖，将所有的配置都复制到项目的pom.xml。<br>

### 1.2.0
修改了readme.md的说明格式。<br>
添加了BaseException异常基类。<br>

### 1.3.0
修改BaseException，覆盖Exception中的getMessage方法，返回或获取异常对象的提示信息。<br>
添加BaseException中的方法，添加需要调试的异常提示信息。<br>

### 包
#### com.gxws.tool.common.constant 
全局变量

#### com.gxws.tool.common.data.dto
datamodel类的主类，包含了数据交互的日志信息

#### com.gxws.tool.common.uuid
uuid生成规则