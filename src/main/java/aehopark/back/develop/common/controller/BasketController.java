package aehopark.back.develop.common.controller;

import aehopark.back.develop.apiPayload.ApiResponse;
import aehopark.back.develop.apiPayload.code.status.ErrorStatus;
import aehopark.back.develop.apiPayload.exception.handler.CommonHandler;
import aehopark.back.develop.common.domain.Basket;
import aehopark.back.develop.common.dto.BasketResDto;
import aehopark.back.develop.common.service.BasketService;
import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    private final ItemService itemService;


    @PostMapping("/basket/{userId}")
    public ApiResponse<Basket> postBasket(@PathVariable Long userId,
                                                        @RequestParam Long itemId,
                                                        @RequestParam Integer count) {

        Basket basket = basketService.save(userId, itemId, count);

        return ApiResponse.onSuccess(basket);
    }

}
