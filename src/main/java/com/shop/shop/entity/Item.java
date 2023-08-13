package com.shop.shop.entity;

import com.shop.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Item {
    private Long Id;
    private String itemNm;
    private int price;
    private int stockNumber;
    private String itemDetail;
    private ItemSellStatus itemSellStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
