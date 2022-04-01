package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
    private int battery_capacity;
    private double display_inches;
    private int memory_rom;
    private int flash_memory_capacity;
    private String color;

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public double getDisplay_inches() {
        return display_inches;
    }

    public void setDisplay_inches(int display_inches) {
        this.display_inches = display_inches;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public void setFlash_memory_capacity(int flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TabletPC(int battery_capacity, double display_inches, int memory_rom, int flash_memory_capacity, String color) {
        this.battery_capacity = battery_capacity;
        this.display_inches = display_inches;
        this.memory_rom = memory_rom;
        this.flash_memory_capacity = flash_memory_capacity;
        this.color = color;
    }

    public TabletPC() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return battery_capacity == tabletPC.battery_capacity && Double.compare(tabletPC.display_inches, display_inches) == 0 && memory_rom == tabletPC.memory_rom && flash_memory_capacity == tabletPC.flash_memory_capacity && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, display_inches, memory_rom, flash_memory_capacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                '}';
    }
}
