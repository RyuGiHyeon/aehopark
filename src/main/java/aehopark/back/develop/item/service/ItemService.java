package aehopark.back.develop.item.service;

import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.ItemRequestDto;

public interface ItemService {
    Item joinItem(ItemRequestDto.PostItemDtoReq request);
}
