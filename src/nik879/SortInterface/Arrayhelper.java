package nik879.SortInterface;

public class Arrayhelper {
    public static void main(String[] args) {

        Car Honda = new Car("Honda Civic", 2002, 102_000);
        Car Audi = new Car("Audi A5", 2015, 160_000);
        Car Mercedes = new Car("Mercedes R500", 1988, 18_000);
        Car[] Cars = {Honda, Audi, Mercedes};
        arrangeOrder(Cars);

    }

    public static void arrangeOrder(Car[] Cars) {

        System.out.println("Unsortiert:");

        for (Car car : Cars) {
            System.out.println(car);
        }

        System.out.println("\n"+"---");

        Car temp = null;

        for (int i = 0; i < Cars.length; i++) {
            for (int j = 0; j < Cars.length-1; j++) {
                if (Cars[j].getProductionYear() > Cars[j + 1].getProductionYear()) {
                    temp = Cars[j];
                    Cars[j] = Cars[j + 1];
                    Cars[j + 1]=temp;
                }
            }
        }
        System.out.println("sortiert:");
        for (Car car : Cars) {
            System.out.println(car);
        }


    }


}
