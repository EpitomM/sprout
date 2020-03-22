# SpringBoot框架实现的农业网站
## 项目效果展示
### 登录界面
![图片](https://uploader.shimo.im/f/IyfozACbzrwv3WMY.png!thumbnail)

### 注册界面
![图片](https://uploader.shimo.im/f/IqCp3LUr9MIVMoAH.png!thumbnail)

### 农民模块
#### 查看专家发布文章
![图片](https://uploader.shimo.im/f/qMrCQrjj89kd8WFt.png!thumbnail)

#### 查看所有文章
![图片](https://uploader.shimo.im/f/4Y1MLG7UuVAjnKVg.png!thumbnail)

#### 查看农产品价格行情
![图片](https://uploader.shimo.im/f/VR3HR7qjgZAm0XEf.png!thumbnail)

#### 查看记者发布的新闻
![图片](https://uploader.shimo.im/f/GieyWK0QRSA16k4A.png!thumbnail)

#### 查看所有新闻
![图片](https://uploader.shimo.im/f/9o0uAQliqSU7gdB0.png!thumbnail)

### 专家模块
#### 查看自己发布过的历史文章
![图片](https://uploader.shimo.im/f/9fvRat9SbIQJKzq8.png!thumbnail)

#### 发布文章
![图片](https://uploader.shimo.im/f/cZhPGdCsv7cS1R7z.png!thumbnail)

## 项目导入 
1. 建库建表

运行 sql 目录下的 farming.sql文件创建所需数据库

2. IDEA 内导入项目
#### 2.1 导入过程
可参考 [https://github.com/EpitomM/csti_register](https://github.com/EpitomM/csti_register) 的 导入项目过程中的 2.1、2.2 部分内容。

#### 2.2 修改配置信息
![图片](https://uploader.shimo.im/f/RZd3bZzrj2EsKeBo.png!thumbnail)

**2.2.1 MySQL版本问题**

注意：我这里安装 MySQL 版本是 5.6.45

![图片](https://uploader.shimo.im/f/mhsHV7xK3GIAuba9.png!thumbnail)

如果电脑本地安装的是 mysql8.0 及以上，驱动地址要改为如下：

```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
并且还要设置时区：
```
spring.datasource.url=
jdbc:mysql://localhost:3306/farming?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL
```
注 pom.xml 内版本也要对应：
```
<!-- mysql驱动包依赖 -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.11</version>
</dependency>
```
