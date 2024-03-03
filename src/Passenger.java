public abstract class Passenger {
   // Passenger (parent class) has: name, ID, reserved Car object, trip cost.
    //Also,
    //attributes are
    private String name;
    private String ID;
    private Car car;
    private double tripCost;
//---------------------------------------
 public Passenger(String name, String ID, Car car) {
  this.name = name;
  this.ID = ID;
  this.car = car;
 }
//----------------------------------------------------------
 public Passenger(String name, String ID, Car car, double tripCost) {
  this.name = name;
  this.ID = ID;
  this.car = car;
  this.tripCost = tripCost;
 }

 public Passenger() {

 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getID() {
  return ID;
 }

 public void setID(String ID) {
  this.ID = ID;
 }

 public Car getCar() {
  return car;
 }
//--------------------------ReserveCar----------------------------
 public void setCar(Car car) throws Exception{
  if (car.getMaxCapacity()==0){throw new Exception("Capacity is ZERO");}
  this.car = car;
  this.computeTripCost();
 }
//------------------------------------
 public double getTripCost() {
  return tripCost;
 }

 public void setTripCost(double tripCost) {
  this.tripCost = tripCost;
 }


    public abstract void computeTripCost() throws Exception;
    //public
public abstract void displayInfor();


}
