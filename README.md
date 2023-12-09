# 新的三层架构

### 关于 web 和 Restful

这次我们尝试不在Spring体系下玩, 采用最简单的Restful的方式来做

* jax-rs是标准
* jersey是实现和扩展
* tomcat/jetty/grizzly等是http服务容器

## [JAX-RS(Or JSR311)](https://www.oracle.com/technical-resources/articles/java/jax-rs.html)

The Java API for RESTful Web Services (JAX-RS) -- Rapidly Build Lightweight Web Services

jax-rs is just an API : https://www.baeldung.com/jax-rs-spec-and-implementations

jax-rs的常见Annotation说明: https://docs.oracle.com/javaee/6/tutorial/doc/gilik.html

### Jersey

[About Jersey](https://github.com/eclipse-ee4j/jersey)

Jersey is a REST framework that provides JAX-RS Reference Implementation and more. Jersey provides its own APIs that
extend the JAX-RS toolkit with additional features and utilities to further simplify RESTful service and client
development. Jersey also exposes numerous extension SPIs so that developers may extend Jersey to best suit their needs.

Goals of Jersey project can be summarized in the following points:

    Track the JAX-RS API and provide regular releases of production quality Reference Implementations that ships with GlassFish;
    Provide APIs to extend Jersey & Build a community of users and developers; and finally
    Make it easy to build RESTful Web services utilising Java and the Java Virtual Machine.
