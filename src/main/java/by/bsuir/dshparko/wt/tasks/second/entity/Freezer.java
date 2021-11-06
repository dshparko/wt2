package by.bsuir.dshparko.wt.tasks.second.entity;

import java.util.Objects;

public class Freezer extends Appliance {
    private double depth;
    private double height;
    private double width;
    private double freezerCapacity;

    public Freezer(double price,double depth,double height, double width, double freezerCapacity){
        super(price);
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.freezerCapacity = freezerCapacity;
    }
    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Freezer freezer = (Freezer) o;
        return freezerCapacity == freezer.freezerCapacity && Double.compare(freezer.depth, depth) == 0 && Double.compare(freezer.height, height) == 0 && Double.compare(freezer.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freezerCapacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Freezer{" +
                "price=" + super.getPrice() +
                ", freezer capacity=" + freezerCapacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
