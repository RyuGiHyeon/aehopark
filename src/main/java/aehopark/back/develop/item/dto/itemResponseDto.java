package aehopark.back.develop.item.dto;

import aehopark.back.develop.item.domain.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class itemResponseDto {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class itemViewDto {
        String pic;
        Long price;

    }
}
