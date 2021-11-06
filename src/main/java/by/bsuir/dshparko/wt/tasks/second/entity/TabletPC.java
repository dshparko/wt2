package by.bsuir.dshparko.wt.tasks.second.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
    private double price;
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private Color color;
    public TabletPC(double price, double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity, Color color){
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public  double getBatteryCapacity(double batteryCapacity){
        return batteryCapacity;
    }

    public double getDisplayInches(double displayInches){
        return displayInches;
    }

    public double getMemoryRom(double memoryRom){
        return memoryRom;
    }

    public double getFlashMemoryCapacity(double flashMemoryCapacity){
        return flashMemoryCapacity;
    }

    public Color getColor(Color color){
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return color == tabletPC.color && Double.compare(tabletPC.displayInches, displayInches) == 0 && flashMemoryCapacity == tabletPC.flashMemoryCapacity && Double.compare(tabletPC.memoryRom, memoryRom) == 0 && Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "price=" + super.getPrice() +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
