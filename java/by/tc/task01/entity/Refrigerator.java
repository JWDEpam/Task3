package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private int freezer_capacity;
    private int overall_capacity;


    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getFreezer_capacity() {
        return freezer_capacity;
    }

    public void setFreezer_capacity(int freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public int getOverall_capacity() {
        return overall_capacity;
    }

    public void setOverall_capacity(int overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Refrigerator() {
    }

    public Refrigerator(int power_consumption, double weight , int freezer_capacity, int overall_capacity, double height, double width) {
        super(weight, height, width, power_consumption);
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return power_consumption == that.power_consumption && freezer_capacity == that.freezer_capacity && overall_capacity == that.overall_capacity && Double.compare(that.weight, weight) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, freezer_capacity, overall_capacity, weight, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
