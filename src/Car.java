public class Car {
    // has: a code, a fixed route, a maximum capacity of passengers per
    //trip.
    private int maxCapacity;
    private String code;
    private Route route;
//Passenger (parent class) has: name, ID, reserved Car object, trip cost.
//Also, it has an abstract function that takes a car object to reserve it to the
//passenger and compute the trip cost and a function that should be overridden
//to display their information along with the car code and route price .
    public Car(String code, int maxCapacity, Route route) {
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.route = route;
    }

    public Car() {
    }

    public String  getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
