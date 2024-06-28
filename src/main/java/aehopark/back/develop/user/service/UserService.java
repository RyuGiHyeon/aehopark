package aehopark.back.develop.user.service;

import aehopark.back.develop.kakao.dto.KakaoUserInfoResponseDto;
import aehopark.back.develop.user.domain.User;

public interface UserService {

    User registration(KakaoUserInfoResponseDto userInfo);
}
