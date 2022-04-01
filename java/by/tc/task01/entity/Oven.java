package by.tc.task01.entity;


import java.util.Objects;

public class Oven extends Appliance{
    private int capacity;
    private double depth;

    public Oven(Double width, Double height, Double weight, int power_consumption, Double depth, int capacity) {
        super(weight, height, width, power_consumption);
        this.depth = depth;
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


    public Oven() {}

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        super();
        this.power_consumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return capacity == oven.capacity && Double.compare(oven.depth, depth) == 0 && weight == oven.weight && Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0 && power_consumption == oven.power_consumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, depth, weight, height, width, power_consumption);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "capacity=" + capacity +
                ", depth=" + depth +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", power_consumption=" + power_consumption +
                '}';
    }
}
