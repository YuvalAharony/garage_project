package garage;

public abstract class Vhicle implements Fixable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vhicle(String name) {
        this.name = name;
    }

    public abstract int getFixTime();
}
