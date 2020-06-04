package com.company;

import java.util.Random;

public class Archer {
    private String name;
    private int age;
    private int experience;
    private Qualification qualification;

    public Archer(String name, int age, int experience) {
        this.name = name;
        if (age >= experience + 10) {
            this.age = age;
            this.experience = experience;
        }
        if (experience >= 20)
            this.qualification = Qualification.VETERAN;
        else if (experience >= 5)
            this.qualification = Qualification.EXPERIENCED;
        else if (experience > 0)
            this.qualification = Qualification.BEGINNER;
    }

    public boolean shoot() {
        Random random = new Random();
        int range = random.nextInt(99) + 1;
        double coefficient = 1;
        if (this.qualification.equals(Qualification.BEGINNER)) {
            coefficient = 0.01 * this.experience;
        } else if (this.qualification.equals(Qualification.EXPERIENCED)) {
            coefficient = 0.05 * this.experience;
        } else if (this.qualification.equals(Qualification.VETERAN)) {
            coefficient = 0.9 - 0.01 * this.age;
        }
        if (range <= coefficient * 100) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAgeAndExperience(int age, int experience) {
        if (age >= experience + 10) {
            this.age = age;
            this.experience = experience;
        }
    }

    public int getExperience() {
        return experience;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Archer archer = (Archer) o;

        if (age != archer.age) return false;
        if (experience != archer.experience) return false;
        if (name != null ? !name.equals(archer.name) : archer.name != null) return false;
        return qualification == archer.qualification;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + experience;
        result = 31 * result + (qualification != null ? qualification.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", qualification=" + qualification +
                '}';
    }
}
