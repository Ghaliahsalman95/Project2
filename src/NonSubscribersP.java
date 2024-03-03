public class NonSubscribersP extends Passenger {
    private boolean hasCoupon = true;

    public NonSubscribersP(String name, String ID, Car car, boolean hasCoupon) {
        super(name, ID, car);
        this.hasCoupon = hasCoupon;
    }

    public NonSubscribersP(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public boolean isHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(boolean hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public NonSubscribersP() {
    }





    @Override
    public void computeTripCost() {
        //it has an abstract function that takes a car object to reserve it to the
        //passenger and compute the trip cost and a function that should be overridden
        //to display their information along with the car code and route price .


//Non-Subscribers passengers: have boolean value named discount coupon
//and gets a 10% discount on the trip cost if they have it.



//Trip cost = car_object.route_object.price - (car_object.route_object.price 0.1) --> in
//case the non-subscribers passengers have a discount coupon.
//Trip cost = car_object.route_object.price --> in case the non-subscribers passengers
//don’t have a discount coupon
            if (this.hasCoupon) {
                float cost = super.getCar().getRoute().getPrice() - (super.getCar().getRoute().getPrice() * .10f);
                super.setTripCost(cost);
                displayInfor();
            } else {
                float cost = super.getCar().getRoute().getPrice();
                super.setTripCost(cost);
                displayInfor();
            }





    }

    @Override
    public void displayInfor() {
        if (this.isHasCoupon()) {
            System.out.println("Passenger Name: " + super.getName() + '\t' + "ID: " + super.getID()
                    + '\n' + "Car Code: " + super.getCar().getCode() + '\t' + "Start Pick Up:" + super.getCar().getRoute().getStartPickup()
                    + '\n' + "Destination: " + super.getCar().getRoute().getDestination() + '\n' +
                    "Price:" + super.getCar().getRoute().getPrice() + '\t' + "After 10% Discount: "
                    +super.getTripCost()+'\n');
        } else System.out.println("Passenger Name: " + super.getName() + '\t' + "ID: " + super.getID()
                + '\n' + "Car Code: " + super.getCar().getCode() + '\t' + "Route:" + super.getCar().getRoute() + '\n' +
                "Price:" +super.getTripCost()+ '\t' + "Discount: 0%"+'\n');
    }

}


