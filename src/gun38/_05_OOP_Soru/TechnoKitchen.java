package gun38._05_OOP_Soru;

public class TechnoKitchen {

    public static void hazirla(food f)
    {
        System.out.println(f.getClass().getSimpleName());
        if (f instanceof adanaKebap){
            ((adanaKebap)f).marinade();
            ((adanaKebap)f).grill();
        }
        else
        if (f instanceof lahmacun){
                ((lahmacun)f).dough();
                ((lahmacun)f).addMeat();
                ((lahmacun)f).bake();
            }
        else
        if (f instanceof borsh){
            ((borsh)f).boil();
            ((borsh)f).eatTomorrow();
        }
        else
        if (f instanceof palov){
                ((palov)f).fry();
                ((palov)f).boil();
        }
        f.taste();
        System.out.println();
    }
}
