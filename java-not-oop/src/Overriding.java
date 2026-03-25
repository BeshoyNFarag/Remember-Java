
public class Overriding {
    class Vehicle{
        public void getType(){
            System.out.println("Generic Vehicle");
        }
    }

    class Car extends Vehicle{

        @Override
        public void getType(){
            System.out.println("Car Class");
        }
    }


    public void main(String[] args) {
        Vehicle vehicle =  new Vehicle();
        Car car = new Car();
        vehicle.getType();
        car.getType();

    }
}
