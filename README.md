# Appliance Store Project 🏬

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![Maven](https://img.shields.io/badge/Maven-3.6+-orange)
![JUnit](https://img.shields.io/badge/JUnit-4-red)

Проект для учета товаров в магазине бытовой техники с возможностью:
- Учета поставок товара
- Организации распродаж
- Расширения ассортимента


## 🚀 Быстрый старт
### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone https://github.com/Versaria/appliance-store.git
cd appliance-store
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.appliancestore.ApplianceStore"
```

## 📂 Структура проекта
```
appliance-store/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── appliancestore/
│   │                   └── ApplianceStore.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── appliancestore/
│                       └── ApplianceStoreTest.java
├── target/
└── pom.xml
```

## 📋 Функционал
1. **Учет товаров**:
   - Хранение наименований техники и их количества
   - Генерация случайного количества товаров при поставке

2. **Акции и распродажи**:
   - Возможность выделения товара для акции
   - Автоматическое изменение порядка отображения товаров

3. **Управление ассортиментом**:
   - Добавление новых товаров
   - Объединение массивов товаров

## 📊 Покрытие тестами
Проект включает unit-тесты для проверки:
- Корректности работы с массивами товаров
- Правильности проведения акций
- Корректности расширения ассортимента

Запуск тестов:
```bash
mvn test
```

## 💻 Пример работы
```bash
=== Первая поставка товара ===
Наименование: Стиральная машина. Количество: 5
Наименование: Сушильная машина. Количество: 2
...
Наименование: Миксер. Количество: 7

=== Распродажа ===
Распродажа -20% на категорию месяца: Духовой шкаф

=== Новый ассортимент ===
Наименование: Духовой шкаф
...
Наименование: Тостер
```

## 📜 Лицензия
MIT License

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/new-dish`)
3. Сделайте коммит (`git commit -am 'Add new menu item'`)
4. Запушьте ветку (`git push origin feature/new-dish`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск тестов с отчетом
mvn test surefire-report:report

# Анализ кода
mvn pmd:pmd checkstyle:checkstyle
```
</details>
