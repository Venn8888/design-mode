package com.venn;

import java.util.Comparator;

/**
 * @author dwf
 * @date 2021/3/8 22:27
 */

public class Dog {

    private double food;

    private double weight;

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Dog(double food, double weight) {
        this.food = food;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                ", weight=" + weight +
                '}';
    }
}

class DogFoodComparator implements Comparator<Dog> {

    public int compare(Dog o1, Dog o2) {
        if (o1.getFood() < o2.getFood()) {
            return -1;
        } else if (o1.getFood() > o2.getFood()) {
            return 1;
        }
        return 0;
    }


}

class DogWeightComparator implements Comparator<Dog> {

    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else if (o1.getWeight() > o2.getWeight()) {
            return 1;
        }
        return 0;
    }

}