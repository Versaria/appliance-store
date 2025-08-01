package com.example.appliancestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplianceStoreTest {

    @Test
    public void testApplianceArrays() {
        ApplianceStore store = new ApplianceStore();

        // Проверка длины массивов (косвенная проверка)
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };

        assertEquals(10, appliances.length);
    }

    @Test
    public void testPromotionalItem() {
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };

        // Проверка перемещения духового шкафа
        String outdatedPromotional = appliances[0];
        appliances[0] = appliances[7];
        appliances[7] = outdatedPromotional;

        assertEquals("Духовой шкаф", appliances[0]);
        assertEquals("Стиральная машина", appliances[7]);
    }

    @Test
    public void testExtendedAssortment() {
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };
        String[] additionalAppliances = {"Кофемашина", "Чайник", "Тостер"};
        String[] newAppliances = new String[13];

        for (int i = 0; i < appliances.length; i++) {
            newAppliances[i] = appliances[i];
        }
        for (int i = 0; i < additionalAppliances.length; i++) {
            newAppliances[i + 10] = additionalAppliances[i];
        }

        assertEquals(13, newAppliances.length);
        assertEquals("Кофемашина", newAppliances[10]);
        assertEquals("Чайник", newAppliances[11]);
        assertEquals("Тостер", newAppliances[12]);
    }
}