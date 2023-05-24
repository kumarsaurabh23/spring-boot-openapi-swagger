# spring-boot-openapi-swagger

For the integration between spring-boot and swagger-ui, below dependency is used

```
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.0.4</version>
    </dependency>
```
The Swagger UI page will then be available at http://server:port/swagger-ui/index.html and the OpenAPI description will be available at the following url for json format: http://server:port/v3/api-docs
