package aehopark.back.develop.item.convertor;

import aehopark.back.develop.apiPayload.code.status.ErrorStatus;
import aehopark.back.develop.common.repository.CategoryRepository;
import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.ItemRequestDto;
import aehopark.back.develop.item.repository.ItemRepository;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
public class ItemConverter {

    private final CategoryRepository categoryRepository;

    public Item postDtoToItem(ItemRequestDto.PostItemDtoReq request) {
        return Item.builder()
                .itemName(request.getItemName())
                .category(categoryRepository.findById(request.getCategoryId()).orElseThrow(() -> new RuntimeException(String.valueOf(ErrorStatus._BAD_REQUEST))))
                .pic(request.getPic())
                .price(request.getPrice()).amount(request.getAmount())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .status(request.getStatus())
                .build();    }
}
