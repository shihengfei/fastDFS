# fastDFS
IMG_SERVER_URL=http://192.168.25.133/

pom 依赖maven 工程
配置 springmvc
<!-- 配置 spring 文件上传组件 -->
	<!-- 定义文件上传解析器 -->
	<bean id="multipartResolver"
		class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<!-- 设定默认编码 -->
		<property name="defaultEncoding" value="UTF-8"></property>
		<!-- 设定文件上传的最大值5MB，5*1024*1024 -->
		<property name="maxUploadSize" value="5242880"></property>
	</bean>
	
<!-- 加载配置文件 -->
	<context:property-placeholder location="classpath:conf/*.properties" />
	
文件上传 Controller参考 FileUploadController.java

搭建好 fastDFS服务器后暴露的服务器地址，修改配置文件地址。返回图片地址。
