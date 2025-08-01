package com.example.appliancestore;

public class Main {
    public static void main(String[] args) {
        ApplianceStore store = new ApplianceStore();

        System.out.println("=== Первоначальный ассортимент ===");
        store.printInventory();

        System.out.println("\n=== Установка акционного товара ===");
        store.setPromotionalItem(7); // Духовой шкаф

        System.out.println("\n=== Расширение ассортимента ===");
        String[] newItems = {"Кофемашина", "Чайник", "Тостер"};
        String[] expanded = store.expandInventory(newItems);
        for (String item : expanded) {
            System.out.println("Наименование: " + item);
        }
    }
}