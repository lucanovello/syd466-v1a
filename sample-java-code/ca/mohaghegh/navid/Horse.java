package ca.mohaghegh.navid;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
    }

    public void dance()
    {
        System.out.println("Dancing Horse");
    }


    @Override
    public String toString() {

        return "Horse{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", amountOfFoodPerDay=" + super.getamountOfFoodPerDay() +
                '}';
    }
}
