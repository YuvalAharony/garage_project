package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Protocol_Garage{
    private static ArrayList<Vhicle> vheicles=new ArrayList();
    private static DB myVehicles=new DB(vheicles,new Main());
    @Override
    public void fixed(Vhicle v) {

            v.fixed();

    }
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        int index=0;
        while(index!=-1){
            System.out.println("pls enter a number between 1-3:\n" +
                            "1 for MotorCycle\n" +
                            "2 for Car\n" +
                            "3 for Truck\n" +
                            "(-1 to finish)");
            index=scanner.nextInt();
            scanner.nextLine();
            if(index==-1){
                break;
            }
            System.out.println("pls enter a name for current Vhicle");
            String name=scanner.nextLine();
            switch(index){
                case 1:
                    myVehicles.addVhicle(new MotorCycle(name));
                    break;
                case 2:
                    myVehicles.addVhicle(new Truck(name));
                    break;
                case 3:
                    myVehicles.addVhicle(new Car(name));
                    break;

            }
        }
        Garage garage = new Garage(myVehicles, new Main());
        System.out.println("Starting the garage\n");
        garage.tick();
    }



}