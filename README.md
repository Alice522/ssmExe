# Java Web项目练习
SSM框架下的Web项目小练习(适合SSM的初学者)

:smiley: 实现前台对后台数据的展示与操作（CRUD）

## 技术栈
Spring+SpringMVC+MyBatis+Thymeleaf+Vue+JS

服务器： Tomcat_9.0.60

数据库： MySQL_8.0.28

开发工具：IDEA_2021.3.3

## 使用说明

1. 导入数据库数据：**employees.sql**

2. 修改配置数据库连接文件：**mysql.properties**

3. 为项目添加Tomcat配置

## 界面功能展示

![页面](https://user-images.githubusercontent.com/46675231/161171823-d53cacc3-a072-4d12-b6d4-62cfd63fd607.png)
![添加员工](https://user-images.githubusercontent.com/46675231/161171879-efa8f2cd-623b-47da-89cb-306eb46d3d34.png)
![更新](https://user-images.githubusercontent.com/46675231/161171955-e8569acf-0ac6-426e-b9d5-75ef712a8f00.png)

## BUG记录

### 1. ClassNotFoundException
![500](https://user-images.githubusercontent.com/46675231/161172587-426fbb35-2fe5-4a82-860e-809d09da5e68.png)

- **报错内容：java.lang.ClassNotFoundException: org.apache.ibatis.io.Resources**

- **产生原因：在引入Mybatis依赖后，Artifacts中没有重新部署**

- **解决方案：删除Artifacts中已经构建好的部署，再重新创建一个，并重新配置Tomcat**

![Artifacts](https://user-images.githubusercontent.com/46675231/161173502-0ea073ed-a736-4e1e-b208-17b21b09c715.png)

### 2. BindingException
![BindingException](https://user-images.githubusercontent.com/46675231/161173627-44bc5dac-576d-483a-a3c9-970e1bf9d07c.png)


- **报错内容：org.apache.ibatis.binding.BindingException: Invalid bound statement**

- **产生原因：mapper配置文件中namespace的路径错误**

- **解决方案：正确输入对应mapper interface的路径**

![namespace](https://user-images.githubusercontent.com/46675231/161174109-b7abb036-a21c-4ab1-bb2c-32acdda7e3cf.png)

### 3. ReflectionException
![ReflectionException](https://user-images.githubusercontent.com/46675231/161175323-401a6b0e-24d4-4183-b8b2-ebcf2167d1b8.png)

![错误](https://user-images.githubusercontent.com/46675231/161175385-bcafda47-e371-4dd6-833d-156239c8ff61.png)


- **报错内容：nested exception is org.apache.ibatis.reflection.ReflectionException: There is no getter for property named 'employee' in 'class org.fj.mvc.pojo.Employee'**

- **产生原因：mapper配置文件中的参数错误**

- **解决方案：正确书写参数信息**

![更正](https://user-images.githubusercontent.com/46675231/161175466-410dcc9b-434d-4e4c-b53b-b85c4e663ee5.png)
