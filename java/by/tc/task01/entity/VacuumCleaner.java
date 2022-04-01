package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private Boolean motor_speed_regulation;
    private int cleaning_width;

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public String getFilter_type() {
        return filter_type;
    }

    public void setFilter_type(String filter_type) {
        this.filter_type = filter_type;
    }

    public String getBag_type() {
        return bag_type;
    }

    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }

    public String getWand_type() {
        return wand_type;
    }

    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    public Boolean getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    public void setMotor_speed_regulation(Boolean motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }

    public int getCleaning_width() {
        return cleaning_width;
    }

    public void setCleaning_width(int cleaning_width) {
        this.cleaning_width = cleaning_width;
    }

    public VacuumCleaner(int power_consumption, String filter_type, String bag_type, String wand_type, Boolean motor_speed_regulation, int cleaning_width) {
        super(power_consumption);
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
    }

    public VacuumCleaner() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return power_consumption == that.power_consumption && cleaning_width == that.cleaning_width && Objects.equals(filter_type, that.filter_type) && Objects.equals(bag_type, that.bag_type) && Objects.equals(wand_type, that.wand_type) && Objects.equals(motor_speed_regulation, that.motor_speed_regulation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, filter_type, bag_type, wand_type, motor_speed_regulation, cleaning_width);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + power_consumption +
                ", filter_type='" + filter_type + '\'' +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width +
                '}';
    }
}
