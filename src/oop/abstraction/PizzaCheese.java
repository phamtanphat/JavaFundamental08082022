package oop.abstraction;

public class PizzaCheese extends Pizza{
    public PizzaCheese(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.print("Pizza Cheese prepare");
    }

    @Override
    void sauce() {
        System.out.print("Pizza Cheese sauce");
    }

    @Override
    void bake() {
        System.out.print("Pizza Cheese bake");
    }

    @Override
    void cut() {
        System.out.print("Pizza Cheese Cut");
    }
}
