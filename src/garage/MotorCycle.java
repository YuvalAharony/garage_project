package garage;

public class MotorCycle extends Vhicle{
    public MotorCycle(String name) {
        super(name);
    }

    public int getFixTime(){
        return 3;
    }
    public void fixed(){
        System.out.println("MororCycle fixed");
    }
}
