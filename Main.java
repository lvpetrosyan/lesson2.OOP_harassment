public class Main {
    public static void main(String[] args) {
        Train train1=new Train("Ласточка","B-901",2011 ,"России","",301 ,3500,
                0,"Белорусского вокзала","Минск-Пассажирский",11);
        Train train2=new Train("Ленинград","D-125",2019 ,"России","",270  ,1700 ,
                0,"Ленинградского  вокзала","Ленинград-Пассажирский",8);
        System.out.println(train1.toString());
        System.out.println(train2.toString());
        Bus avtobus1= new Bus("Hyunday","a777",2020,"Ю. Корея","красный",120);
        Bus avtobus2= new Bus("Hyunday","6977",2017,"Ю. Корея","желтый",140);
        Bus avtobus3= new Bus("Daewoo","odd987",2000,"Ю. Корея","белый",180);
        System.out.println(avtobus1.toString());
        System.out.println(avtobus2.toString());
        System.out.println(avtobus3.toString());
        avtobus1.refill();
        train2.refill();

    }
}