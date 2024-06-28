package aehopark.back.develop.item.controller;

import aehopark.back.develop.apiPayload.ApiResponse;
import aehopark.back.develop.apiPayload.code.status.ErrorStatus;
import aehopark.back.develop.item.converter.ItemConverter;
import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.itemResponseDto;
import aehopark.back.develop.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/item/{id}")
    public ApiResponse<itemResponseDto.itemViewDto> getItemById(@PathVariable Long id) {
        Item item = itemService.findItem(id).orElseThrow(() -> new RuntimeException(String.valueOf(ErrorStatus._BAD_REQUEST)));
        return ApiResponse.onSuccess(ItemConverter.convertToDto(item));
    }

}
