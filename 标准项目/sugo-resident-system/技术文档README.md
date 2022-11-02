# code-projects
code-projects

1-程序业务架构


2-程序技术架构要求

	1）html+js+css+jquery搭建前台（进行中）
	
	2）前台服务为nginx，负载均衡
	
	3）springboot多Module微服务，mysql分表分库，springcloud分布式系统
	4）rabbitMQ负责相应慢的请求定时跑
	
	5）每月1号凌晨2：00定时生成公私钥，并缓存到redis中，当前没有redis先存储到数据库，后期转移到redis中
	6）每次登录页面直接获取公钥
	7）登录接口解析加密密码并md5加密，并与数据库存储的密码对比，如果一致表示成功
	8）登录接口生成token，并返回给前台存储到sessionStorage
	
	9）前台有验证码生成后存入到redis并设置超时时间1min,超时自动刷新，验证码如果错误，自动刷新验证码
	10）前台有短信验证码后存入到redis并设置超时时间3min，
	11）定时任务使用springcloud自带的@Schedule注解实现
	12）注册中心使用eureka
	13）前台开发一个定时任务手动管理模块，控制手动触发定时任务
