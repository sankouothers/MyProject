package org.wang.restmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by ozintel06 on 2017/7/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  07/27/2017 15:27
 */
@Configuration @EnableSwagger2 public class SwaggerConfig {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * demoApi.
   *
   * @return  Docket
   */
  @Bean public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(mallApiInfo()).select().apis(RequestHandlerSelectors
        .basePackage("org.wang.restmall.controller")) // 以扫描包的方式
      .paths(PathSelectors.any()).build();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // 多个Docket实例的例子,可以做到每个请求前缀都单独列出,做为一个单元的 API 的测试
// @Bean
// public Docket userApi() {
// return new Docket(DocumentationType.SWAGGER_2)
// .groupName("User model")
// .genericModelSubstitutes(DeferredResult.class)
// .useDefaultResponseMessages(false)
// .forCodeGeneration(false)
// .pathMapping("/")
// .select()
// .paths(Predicates.not(PathSelectors.regex("/error")))
// .build()
// .select().paths(Predicates.or(regex("/user.*"))).build()
// .ignoredParameterTypes(ApiIgnore.class)
// .apiInfo(mallApiInfo());
// }

  private ApiInfo mallApiInfo() {
// return new ApiInfo(                                      //有序的信息 备注
// "Electronic Health Record(EHR) Platform API",        // 大标题
// "EHR Platform's REST API, for system administrator", // 描述
// "1.0",                                               // 版本
// "NO terms of service",                               // 服务条款
// "362479845@qq.com",                                  // 作者
// "The Apache License, Version 2.0",                   // 链接显示文字
// "http://www.apache.org/licenses/LICENSE-2.0.html"    // 网站链接
// );

    return
      new ApiInfoBuilder()              // API 信息备注
      .title("Mall API")                // 设置文档的标题
      .description("REST Mall API")     // 设置文档的描述
      .version("1.0")                   // 设置文档的版本信息
      .contact(new Contact("Pin Wang","http://www.wang.com","873275512@qq.com"))   // 设置作者 creator
      .termsOfServiceUrl("www.pin.com") // 设置文档的License信息
      .build();
  }
} // end class SwaggerConfig
