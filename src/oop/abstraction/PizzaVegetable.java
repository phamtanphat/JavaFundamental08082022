package oop.abstraction;

public class PizzaVegetable extends Pizza{
    public PizzaVegetable(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.print("Pizza Vegetable prepare");
    }

    @Override
    void sauce() {
        System.out.print("Pizza Vegetable sauce");
    }

    @Override
    void bake() {
        System.out.print("Pizza Vegetable bake");
    }

    @Override
    void cut() {
        System.out.print("Pizza Vegetable Cut");
    }
}
