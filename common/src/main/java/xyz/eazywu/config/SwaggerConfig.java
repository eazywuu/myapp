package xyz.eazywu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 创建API文档信息
                .apiInfo(createApiInfo())
                // 启动swagger文档生成器
                .select()
                /*
                 *RequestHandlerSelectors,配置要扫描接口的方式
                 * 参数说明:
                 * basePackage:基于包扫描
                 * class:基于类扫描
                 * any():扫描全部
                 */
                .apis(RequestHandlerSelectors.basePackage("xyz.eazywu.controller"))
                // 所有Controller都支持Swagger
                //.paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     */
    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder()
                // 文档标题
                .title("益智App：1+2=3")
                // 文档相信信息
                .description("Android+Springboot分离文档")
                // 文档版本信息
                .version("1.0")
                // 构建文档
                .build();
    }
}
