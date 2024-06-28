package aehopark.back.develop.common.dto;

import lombok.Getter;

public class BasketReqDto {

    @Getter
    @Setter
    public static class BasketPostDto{
        Long itemId;
        Integer count;

        public BasketPostDto(Long itemId, Integer count) {
            this.itemId = itemId;
            this.count = count;
        }
    }
}
