package com.minju.cafeOrder.menu.dto;

public class MenuResponse {

    public record MenuDto(
            int id,
            String name,
            String description,
            Category category,
            int price
    ) {
        public static MenuDto from(Menu menu) {
            return new MenuDto(
                    menu.getId(),
                    menu.getName(),
                    menu.getDescription(),
                    menu.getCategory(),
                    menu.getPrice()
            );
        }
    }
}
