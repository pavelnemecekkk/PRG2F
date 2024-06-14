package OOP_TEST02;

public class TravelPlan {
 Geolocation start;
 Geolocation destination;
 Plane letadlo;




    public TravelPlan(Geolocation start, Geolocation destination, Plane letadlo) {
        this.start = start;
        this.destination = destination;
        this.letadlo = letadlo;
    }




    public static void getPlan(Geolocation start, Geolocation destination, Plane letadlo){
        int vzdalenost;
        double time;
        System.out.println("Cesta od z " + start + " do " + destination);
        vzdalenost = (int) Math.sqrt(Math.pow(start.x - destination.y,2) + Math.pow(start.y - destination.x,2));
        time = vzdalenost /  letadlo.velocity;
        System.out.println("Délka cesty je: " + vzdalenost);
        System.out.println("Trvá to: " + time * 60 + " minut");


    }



    public static void main(String[] args) {
        Geolocation n1 = new Geolocation(55.2,32.2);
        Geolocation n2 = new Geolocation(45.2,15.2);
        Plane Boing555 = new Plane("Boing55", 100);
        getPlan(n1,n2,Boing555);

    }
}


//Třídy:
//        Geolocation
//
//        Plane
//
//        TravelPlan
//
//        Zadání:
//
//        Vytvořte třídu Geolocation, která představuje pozici na mapě. Pro jednoduchost předpokládejme, že lokace jsou 2 body - x & y (to mohou být desetinná čísla).
//        Třída má konstruktor. Třída má metodu toString(), ta vrací body ve formátu "(x,y)".
//
//        Dále vytvořte třídu Plane, která reprezentuje letadlo. Letadlo má jako atributy název a rychlost (name, velocity). Pro třídu vytvořte konstruktor
//
//        Poté vytvořte třídu TravelPlan, která má jako atributy dvě lokace (start, destination) a jedno letadlo.
//        Třída má konstruktor
//        Nakonec vytvořte metodu getPlan(), která do konzole vypíše:
//        "Cesta od z *toString() lokace start* do *toString() lokace destination* :"
//        "Vzdálenost: *výpočet* "
//        "Doba letu: *výpočet* "
//
//
//
//        Bonus:
//
//        Vytvořte třídu City, která představuje město. Město má název a lokaci.
//        Město má konstruktor a toString() metodu, která vrací: "*název města*  (*x* a *y*)" např: New York (23.4, 22.1)
//
//        V TravelPlan nahraďte atribut dvou lokací atributy dvou měst.
//
//        Zároveň představte proměnnou pricePerHou, která reprezentuje cenu za jednu hodinu letadla ve vzduchu.
//        Do výpisu v TravelPlan vypište i cenu této cesty.


