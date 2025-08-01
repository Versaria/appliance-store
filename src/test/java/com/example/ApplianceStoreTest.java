package com.example.appliancestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplianceStoreTest {
    @Test
    void testInventoryInitialization() {
        ApplianceStore store = new ApplianceStore();
        assertNotNull(store);
        assertDoesNotThrow(store::printInventory);
    }

    @Test
    void testSetPromotionalItem() {
        ApplianceStore store = new ApplianceStore();
        assertDoesNotThrow(() -> store.setPromotionalItem(7));
    }

    @Test
    void testExpandInventory() {
        ApplianceStore store = new ApplianceStore();
        String[] newItems = {"Кофемашина", "Чайник", "Тостер"};
        String[] expanded = store.expandInventory(newItems);
        assertEquals(13, expanded.length);
        assertEquals("Кофемашина", expanded[10]);
    }
}