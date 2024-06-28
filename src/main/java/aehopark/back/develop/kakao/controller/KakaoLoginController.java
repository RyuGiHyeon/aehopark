//package aehopark.back.develop.kakao.controller;
//
//import aehopark.back.develop.kakao.dto.KakaoUserInfoResponseDto;
//import aehopark.back.develop.kakao.service.KakaoService;
//import aehopark.back.develop.user.service.UserService;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.io.IOException;
//
//@Slf4j
//@Controller
//@RequestMapping("/login")
//@AllArgsConstructor
//public class KakaoLoginController {
//
//    private final KakaoService kakaoService;
//
//    private final UserService userService;
//
//    @GetMapping("/callback")
//    public ResponseEntity<?> callback(@RequestParam("code") String code) throws IOException {
//        String accessToken = kakaoService.getAccessTokenFromKakao(code);
//
//        KakaoUserInfoResponseDto userInfo = kakaoService.getUserInfo(accessToken);
//
//        // 회원가입 로직 추가
//        userService.registration(userInfo);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
