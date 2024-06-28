package aehopark.back.develop.user.controller;

import aehopark.back.develop.apiPayload.ApiResponse;
import aehopark.back.develop.user.domain.User;
import aehopark.back.develop.user.dto.UserRequestDto;
import aehopark.back.develop.user.dto.UserResponseDto;
import aehopark.back.develop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@Validated
@RequestMapping("/users")
public class UserRestController {

    @Value("${spring.security.oauth2.client.registration.kakao.client-id}")
    private String clientId;

    @Value("${spring.security.oauth2.client.registration.kakao.redirect-uri}")
    private String redirectUri;

    @GetMapping("/login/page")
    public String loginPage(Model model){
        String location = "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=" + clientId + "&redirect_uri=" + redirectUri;
        model.addAttribute("location", location);

        return "login";
    }
}
