package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private int number_Of_Speakers;
    private int frequence_range;
    private int cord_lentgh;

    public Speakers(int number_Of_Speakers, int frequence_range, int cord_lentgh) {
        this.number_Of_Speakers = number_Of_Speakers;
        this.frequence_range = frequence_range;
        this.cord_lentgh = cord_lentgh;
    }

    public int getNumber_Of_Speakers() {
        return number_Of_Speakers;
    }

    public void setNumber_Of_Speakers(int number_Of_Speakers) {
        this.number_Of_Speakers = number_Of_Speakers;
    }

    public int getFrequence_range() {
        return frequence_range;
    }

    public void setFrequence_range(int frequence_range) {
        this.frequence_range = frequence_range;
    }

    public int getCord_lentgh() {
        return cord_lentgh;
    }

    public void setCord_lentgh(int cord_lentgh) {
        this.cord_lentgh = cord_lentgh;
    }

    public Speakers() {
    }

    public Speakers(int power_consumption, int number_Of_Speakers, int frequence_range, int cord_lentgh) {
        this.power_consumption = power_consumption;
        this.number_Of_Speakers = number_Of_Speakers;
        this.frequence_range = frequence_range;
        this.cord_lentgh = cord_lentgh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return power_consumption == speakers.power_consumption && number_Of_Speakers == speakers.number_Of_Speakers && frequence_range == speakers.frequence_range && cord_lentgh == speakers.cord_lentgh;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, number_Of_Speakers, frequence_range, cord_lentgh);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_Of_Speakers=" + number_Of_Speakers +
                ", frequence_range=" + frequence_range +
                ", cord_lentgh=" + cord_lentgh +
                '}';
    }
}
