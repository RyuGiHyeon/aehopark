package aehopark.back.develop.item.controller;

import aehopark.back.develop.apiPayload.ApiResponse;
import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.ItemRequestDto;
import aehopark.back.develop.item.dto.ItemResponseDto;
import aehopark.back.develop.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/item") // 저장 Post - "/items"
    public ApiResponse<ItemResponseDto.PostItemDtoRes> joinItem(@RequestBody ItemRequestDto.PostItemDtoReq request){
        Item item = itemService.joinItem(request);

        return ApiResponse.onSuccess(new ItemResponseDto.PostItemDtoRes(item));

    }
}
