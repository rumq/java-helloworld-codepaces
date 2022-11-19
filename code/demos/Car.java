public class Car {
    String name;
    String model;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Honda");
        car.setModel("Civic");
        car.setYear(1995);
        System.out.println(car.getName());

    }

    private void setYear(int i) {
        this.year = i;

    }

    private void setModel(String string) {
        this.model = string;

    }

}
