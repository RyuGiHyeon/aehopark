package aehopark.back.develop.common.service;

import aehopark.back.develop.apiPayload.code.status.ErrorStatus;
import aehopark.back.develop.apiPayload.exception.handler.CommonHandler;
import aehopark.back.develop.common.domain.Basket;
import aehopark.back.develop.common.dto.BasketReqDto;
import aehopark.back.develop.common.repository.BasketRepository;
import aehopark.back.develop.item.repository.ItemRepository;
import aehopark.back.develop.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;
    private final UserRepository userRepository;
    private final ItemRepository itemRepository;

    public Basket save(Long userId, BasketReqDto.BasketPostDto request) {

        Basket basket = Basket.builder()
                .user(userRepository.findById(userId)
                        .orElseThrow(() -> new CommonHandler(ErrorStatus.MEMBER_NOT_FOUND)))
                .count(request.getCount())
                .item(itemRepository.findById(request.getItemId())
                        .orElseThrow(() -> new CommonHandler(ErrorStatus.ITEM_NOTFOUND)))
                .build();

        return basketRepository.save(basket);
    }
}
