本项目所学：
    1. DispatcherServlet
        指定配置文件路径
        开启load-on-start
    2. @Controller创建的对象相当于servlet
    3. @RequestMapping
        类上面或方法上面

步骤：
1. 加入依赖：spring-webmvc、jsp、servlet
2. 在web.xml中注册springMVC的核心对象DispatcherServlet
3. 创建一个发起请求的页面
4. 使用DI创建控制器类
    4.1 类上面使用@Controller创建控制器对象
    4.2 方法的上面使用@RequestMapping匹配请求路径
5. 创建一个显示结果的jsp
6. 创建springMVC配置文件
    6.1 声明组件扫描器，指定@Controller注解所在的包名
    6.2 声明视图解析器，帮助处理视图
