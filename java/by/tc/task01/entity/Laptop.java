package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private int battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private String cpu;
    private double Display_inches;

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getDisplay_inches() {
        return Display_inches;
    }

    public void setDisplay_inches(double display_inches) {
        Display_inches = display_inches;
    }

    public Laptop() {
    }

    public Laptop(int battery_capacity, String os, int memory_rom, int system_memory, String cpu, double display_inches) {
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpu = cpu;
        Display_inches = display_inches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return battery_capacity == laptop.battery_capacity && memory_rom == laptop.memory_rom && system_memory == laptop.system_memory && Double.compare(laptop.Display_inches, Display_inches) == 0 && Objects.equals(os, laptop.os) && Objects.equals(cpu, laptop.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, os, memory_rom, system_memory, cpu, Display_inches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpu='" + cpu + '\'' +
                ", Display_inches=" + Display_inches +
                '}';
    }
}
