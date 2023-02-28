package gun36._01_ornek;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        teslaCar tesla=new teslaCar("Model S",310);
        toyotoPirus toyota=new toyotoPirus("Pirus",1300);
        bus bus=new bus("Iveco",7000);

        ArrayList<vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(bus);


        for(vehicle v : arabalar){

            System.out.println(v.getClass().getSimpleName());

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof teslaCar){
                System.out.println(((teslaCar) v).changeBattery());
                System.out.println(((teslaCar)v).drive());
            }
            if (v instanceof toyotoPirus){
                System.out.println(((toyotoPirus)v).changeBattery());
                System.out.println(((toyotoPirus)v).drive());
                System.out.println(((toyotoPirus)v).changeOil());
            }
            if (v instanceof bus){
                System.out.println(((bus)v).changeDizel());
                System.out.println(((bus)v).drive());
            }
        }
    }
}
