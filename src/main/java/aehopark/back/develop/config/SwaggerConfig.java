package aehopark.back.develop.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI UMCstudyAPI() {
        // API 정보 설정
        Info info = new Info()
                .title("UMC Server WorkBook API")
                .description("UMC Server WorkBook API 명세서")
                .version("1.0.0");

        // 보안 요구 사항 설정 (JWT 토큰을 요구하는 경우)
        SecurityRequirement securityRequirement = new SecurityRequirement().addList("JWT");

        // 보안 스키마 설정 (Bearer Token 방식의 JWT)
        SecurityScheme securityScheme = new SecurityScheme()
                .name("Authorization")
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");

        // 컴포넌트에 보안 스키마 추가
        Components components = new Components()
                .addSecuritySchemes("JWT", securityScheme);

        // OpenAPI 객체 생성
        return new OpenAPI()
                .addServersItem(new Server().url("/"))
                .info(info)
                .addSecurityItem(securityRequirement)
                .components(components);
    }
}