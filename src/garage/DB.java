package garage;

import java.util.ArrayList;

public class DB {
    private ArrayList<Vhicle> vhicles=new ArrayList();

    public DB(ArrayList<Vhicle> vhicles, Main main) {
        this.vhicles = vhicles;
    }

    public ArrayList<Vhicle> getVhicles() {
        return this.vhicles;
    }

    public void setVhicles(ArrayList<Vhicle> vhicles) {
        this.vhicles = vhicles;
    }

    public void addVhicle(Vhicle v){
        this.vhicles.add(v);
    }
}
