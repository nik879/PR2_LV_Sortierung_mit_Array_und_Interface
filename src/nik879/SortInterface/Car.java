package nik879.SortInterface;

public class Car implements Comparable<Car> {
    private String carType;
    private int productionYear;
    private int drivenKilometer;

    public Car(String carType, int productionYear, int drivenKilometer) {
        this.carType = carType;
        this.productionYear = productionYear;
        this.drivenKilometer = drivenKilometer;
    }

    public String getCarType() {
        return carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(this.productionYear < o.productionYear) return -1;
        if(this.productionYear > o.productionYear) return 1;
        return 0;
    }
}
