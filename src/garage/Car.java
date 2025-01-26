package garage;

public class Car extends Vhicle{
    public Car(String name) {
        super(name);
    }

    public int getFixTime(){
        return 5;
    }
    public void fixed(){
        System.out.println("Car fixed");
    }
}
