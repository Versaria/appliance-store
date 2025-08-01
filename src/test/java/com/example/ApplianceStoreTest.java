package com.example.appliancestore;

import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ApplianceStoreTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ApplianceStore store;

    @BeforeEach
    void setUp() {
        store = new ApplianceStore();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testInventoryPrinting() {
        store.printInventory();
        assertTrue(outContent.toString().contains("Стиральная машина"));
        assertTrue(outContent.toString().contains("Количество:"));
    }

    @Test
    void testPromotionalItem() {
        store.setPromotionalItem(7);
        assertTrue(outContent.toString().contains("Распродажа -20% на категорию месяца: Духовой шкаф"));
        assertEquals("Духовой шкаф", store.getAppliances()[0]);
    }

    @Test
    void testInventoryExpansion() {
        String[] newItems = {"Кофемашина", "Чайник", "Тостер"};
        String[] expanded = store.expandInventory(newItems);
        assertEquals(13, expanded.length);
        assertEquals("Тостер", expanded[12]);
    }
}