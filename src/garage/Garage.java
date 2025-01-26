package garage;

class Garage {
    private DB database;
    Protocol_Garage protocol;


    public Garage(DB database,Protocol_Garage protocol) {
        this.database = database;
        this.protocol=protocol;


    }


    public DB getDatabase() {
        return database;
    }

    public void setDatabase(DB database) {
        this.database = database;
    }





    public void tick() {
        for (Vhicle vehicle : this.database.getVhicles()) {
            try {
                int fixTime = vehicle.getFixTime();
                System.out.println("Repairing " + vehicle.getName() + " (Time: " + fixTime + " seconds)");
                Thread.sleep(fixTime * 1000);
                this.protocol.fixed(vehicle);
            } catch (InterruptedException e) {
                System.out.println("Repair interrupted for " + vehicle.getName());
            }
        }
        System.out.println("All vehicles have been repaired!");
    }
}


