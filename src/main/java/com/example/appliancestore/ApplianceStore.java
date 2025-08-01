package com.example.appliancestore;

import java.util.Random;

public class ApplianceStore {
    public static void main(String[] args) {
        // Задача 1: Учет товара
        String[] appliances = {
                "Стиральная машина",
                "Сушильная машина",
                "Холодильник",
                "Утюг",
                "Посудомоечная машина",
                "Микроволновая печь",
                "Варочная поверхность",
                "Духовой шкаф",
                "Блендер",
                "Миксер"
        };

        int[] amount = new int[appliances.length];
        Random random = new Random();

        for (int i = 0; i < amount.length; i++) {
            amount[i] = random.nextInt(11);
        }

        System.out.println("=== Первая поставка товара ===");
        for (int i = 0; i < appliances.length; i++) {
            System.out.println("Наименование: " + appliances[i] + ". Количество: " + amount[i]);
        }

        // Задача 2: Распродажа
        String outdatedPromotional = appliances[0];
        appliances[0] = appliances[7];
        appliances[7] = outdatedPromotional;
        System.out.println("\n=== Распродажа ===");
        System.out.println("Распродажа -20% на категорию месяца: " + appliances[0]);

        // Задача 3: Расширение ассортимента
        String[] additionalAppliances = {"Кофемашина", "Чайник", "Тостер"};
        String[] newAppliances = new String[appliances.length + additionalAppliances.length];

        System.arraycopy(appliances, 0, newAppliances, 0, appliances.length);
        System.arraycopy(additionalAppliances, 0, newAppliances, appliances.length, additionalAppliances.length);

        System.out.println("\n=== Новый ассортимент ===");
        for (String appliance : newAppliances) {
            System.out.println("Наименование: " + appliance);
        }
    }
}