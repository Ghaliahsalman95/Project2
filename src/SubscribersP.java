public class SubscribersP extends Passenger {
    public SubscribersP(String name, String ID, Car car) {
        super(name, ID, car);
    }
    public SubscribersP() {
        super();
    }
    @Override
    public void computeTripCost() throws Exception {
        //it has an abstract function that takes a car object to reserve it to the
        //passenger and compute the trip cost and a function that should be overridden
        //to display their information along with the car code and route price .


//Subscribers passengers: take 50% discount on trip cost when they reserve a
//car

//Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1) --> in
//case the non-subscribers passengers have a discount coupon.
//Trip cost = car_object.route_object.price --> in case the non-subscribers passengers
//don’t have a discount coupon

        float cost = this.getCar().getRoute().getPrice() - (this.getCar().getRoute().getPrice() * .50f);
        super.setTripCost(cost);
        displayInfor();


    }

    @Override
    public void displayInfor() {


        System.out.println("Passenger Name: " + super.getName() + '\t' + "ID: " + super.getID()
                + '\n' + "Car Code: " + getCar().getCode() + '\t' + "Start Pick Up:" + getCar().getRoute().getStartPickup()
                + '\n' + "Destination: " + super.getCar().getRoute().getDestination() + '\n' +
                "Price:" + super.getCar().getRoute().getPrice() + '\t' + "After 50% Discount: "
                +super.getTripCost()+'\n');

    }
}