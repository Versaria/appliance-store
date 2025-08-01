package com.example.appliancestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplianceStoreTest {

    @Test
    void testApplianceArrays() {
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };

        assertEquals(10, appliances.length);
        assertEquals("Холодильник", appliances[2]);
    }

    @Test
    void testPromotionalItem() {
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };

        String outdatedPromotional = appliances[0];
        appliances[0] = appliances[7];
        appliances[7] = outdatedPromotional;

        assertEquals("Духовой шкаф", appliances[0]);
        assertEquals("Стиральная машина", appliances[7]);
    }

    @Test
    void testExtendedAssortment() {
        String[] appliances = {
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };
        String[] additionalAppliances = {"Кофемашина", "Чайник", "Тостер"};
        String[] newAppliances = new String[appliances.length + additionalAppliances.length];

        System.arraycopy(appliances, 0, newAppliances, 0, appliances.length);
        System.arraycopy(additionalAppliances, 0, newAppliances, appliances.length, additionalAppliances.length);

        assertEquals(13, newAppliances.length);
        assertEquals("Стиральная машина", newAppliances[0]);
        assertEquals("Кофемашина", newAppliances[10]);
        assertEquals("Тостер", newAppliances[12]);
    }
}