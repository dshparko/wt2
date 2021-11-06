package by.bsuir.dshparko.wt.tasks.second.entity.criteria;

public final class SearchCriteria {
    public enum General {
        NAME
    }

    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }
    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }
    public enum Freezer {
        PRICE, FREEZER_CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }

    public enum OvenWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    public enum LaptopWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    public enum TabletPCWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }

    public enum FreezerWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, FREEZER_CAPACITY, DEPTH, HEIGHT, WIDTH
    }

    private SearchCriteria() {
    }
}
