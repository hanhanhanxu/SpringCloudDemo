SpringCloud微服务组件
Eureka就这样不用动了
Gateway只需要在配置中新增新服务的转发配置规则即可

每次启动时，先启动Eureka，在启动Gateway，最后启动业务服务web

Eureka地址：
http://localhost:10081/

通过网关访问业务：
http://localhost:10082/web/hs

直连访问业务：
http://localhost:10083/hs

通过网关访问生产者，生产者通过openFeign访问消费者
http://localhost:10082/producer/hello-c

api写在(SpringCloudApi)里，然后服务提供者继承接口实现方法，服务消费者只需要引用(SpringCloudApi)的即可使用接口

还缺少一个SpringCloud config，但他不能动态更新配置，所以通常使用SpringCloud Bus来做动态配置加载