package garage;

public class Truck extends Vhicle{
    public Truck(String name) {
        super(name);
    }

    public int getFixTime(){
        return 10;
    }
    public void fixed(){
        System.out.println("Truck fixed");
    }
}
