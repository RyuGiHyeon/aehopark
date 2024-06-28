package aehopark.back.develop.user.controller;

import aehopark.back.develop.apiPayload.ApiResponse;
import aehopark.back.develop.user.dto.UserRequestDto;
import aehopark.back.develop.user.dto.UserResponseDto;
import aehopark.back.develop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    @PostMapping("/signin")
    public ApiResponse<UserResponseDto> joinSocial(@RequestBody UserRequestDto.JoinDto)

}
