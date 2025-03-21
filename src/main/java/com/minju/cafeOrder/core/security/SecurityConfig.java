package com.minju.cafeOrder.core.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minju.cafeOrder.core.api.ApiResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

//@EnableWebSecurity
//@Configuration
@Slf4j
public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        // 1. CSRF 비활성화 (프론트 분리 환경)
//        http.csrf(AbstractHttpConfigurer::disable);
//
//        // 2. iframe 거부 설정
//        http.headers(header -> header.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
//
//        // 3. CORS 설정
//        http.cors(cors -> cors.configurationSource(configurationSource()));
//
//        // 4. Stateless 세션 관리 (JWT 활용 가능)
//        http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//        // 5. 폼 로그인 비활성화
//        http.formLogin(AbstractHttpConfigurer::disable);
//
//        // 6. 요청 권한 설정
//        http.authorizeHttpRequests(authorize -> authorize
//                .requestMatchers("/api/order/**").authenticated()  // 주문 관련 API만 인증 필요
//                .anyRequest().permitAll() // 나머지 모든 요청은 허용
//        );
//
//        // 7. HTTP 기본 인증 비활성화
//        http.httpBasic(AbstractHttpConfigurer::disable);
//
//        // 8. 인증 실패 처리 (401 응답)
//        http.exceptionHandling(handling -> handling.authenticationEntryPoint((request, response, authException) -> {
//            ApiResponse<String> apiResponse = new ApiResponse<>(401, "인증되지 않았습니다.");
//            response.setStatus(HttpStatus.UNAUTHORIZED.value());
//            response.setContentType("application/json; charset=utf-8");
//            ObjectMapper om = new ObjectMapper();
//            response.getWriter().println(om.writeValueAsString(apiResponse));
//        }));
//
//        // 9. 권한 실패 처리 (403 응답)
////        http.exceptionHandling(handling -> handling.accessDeniedHandler((request, response, accessDeniedException) -> {
////            var e = new Exception403("권한이 없습니다.");
////            response.setStatus(e.status().value());
////            response.setContentType("application/json; charset=utf-8");
////            ObjectMapper om = new ObjectMapper();
////            response.getWriter().println(om.writeValueAsString(e.body()));
////        }));
//
//        return http.build();
//    }
//
//    // CORS 설정
//    public CorsConfigurationSource configurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration(); // cors 설정 객체 생성
//        configuration.addAllowedHeader("*"); // 모든 헤더 허용
//        configuration.addAllowedMethod("*"); // 모든 http 메소드 허용
//        configuration.setAllowedOrigins(List.of("*")); // 허용된 출처 설정
//        configuration.setAllowCredentials(true); // 쿠키 허용
//        configuration.addExposedHeader("Authorization");
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration); // 모든 경로에 cors 설정
//        return source;
//    }
}
