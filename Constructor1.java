class Vehicle{
    private byte wheel;
    double price;
    String color;

    Vehicle(){
        wheel=2;
        price=1000;
        color="Black";
    }
    Vehicle(byte w, double p, String c){
        wheel=w;
        price=p;
        color=c;
    }
    public void displayVehicle(){
        System.out.printf("Wheel:%d,Price:%f,Color:%s", wheel, price, color);
    }
}

public class Constructor1{
   
    public static void main (String [] args){
        Vehicle bike = new Vehicle();
        bike.displayVehicle();

        //byte w=4;
        Vehicle car = new Vehicle((byte)4, 1500, "red");
        car.displayVehicle();
        // car.wheel=8;
        car.displayVehicle();

    }
}