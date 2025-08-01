package com.example.appliancestore;

import java.util.Random;

public class ApplianceStore {
    private String[] appliances;
    private int[] quantities;

    public ApplianceStore() {
        this.appliances = new String[]{
                "Стиральная машина", "Сушильная машина", "Холодильник", "Утюг",
                "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность",
                "Духовой шкаф", "Блендер", "Миксер"
        };
        this.quantities = new int[10];
        initializeQuantities();
    }

    private void initializeQuantities() {
        Random random = new Random();
        for (int i = 0; i < quantities.length; i++) {
            quantities[i] = random.nextInt(11);
        }
    }

    public void printInventory() {
        for (int i = 0; i < appliances.length; i++) {
            System.out.println("Наименование: " + appliances[i] + ". Количество: " + quantities[i]);
        }
    }

    public void setPromotionalItem(int index) {
        if (index >= 0 && index < appliances.length) {
            String temp = appliances[0];
            appliances[0] = appliances[index];
            appliances[index] = temp;
            System.out.println("Распродажа -20% на категорию месяца: " + appliances[0]);
        }
    }

    public String[] expandInventory(String[] newItems) {
        String[] expanded = new String[appliances.length + newItems.length];
        System.arraycopy(appliances, 0, expanded, 0, appliances.length);
        System.arraycopy(newItems, 0, expanded, appliances.length, newItems.length);
        this.appliances = expanded;
        return expanded;
    }
}