package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {
    double weight;
    double height;
    double width;
    int power_consumption;

    public Appliance() {
    }

    public Appliance(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public Appliance(double weight, double height, double width, int power_consumption) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.power_consumption = power_consumption;
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

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.weight, weight) == 0 && Double.compare(appliance.height, height) == 0 && Double.compare(appliance.width, width) == 0 && power_consumption == appliance.power_consumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, width, power_consumption);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", power_consumption=" + power_consumption +
                '}';
    }
}
