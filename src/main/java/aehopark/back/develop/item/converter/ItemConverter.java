package aehopark.back.develop.item.converter;

import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.itemResponseDto;
import jakarta.persistence.Converter;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ItemConverter {
    public static itemResponseDto.itemViewDto convertToDto(Item item){
        return itemResponseDto.itemViewDto.builder()
                .pic(item.getPic())
                .price(item.getPrice())
                .build();
    }

}
