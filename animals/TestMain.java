package animals;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("МЛЕКОПИТАЮЩИЕ \n Травоядные.");
       EatGrass gazelle= new EatGrass("Газель Бонди",5,"Северная Африка");
       EatGrass giraffe= new EatGrass("Жираф Оскар",9,"Саванны Африки",60," ");
       EatGrass horse= new EatGrass("Конь Спирит",15,"Пустынный или степной район", 40,"яблоки, трава");
       EatGrass horse2= new EatGrass("Конь Спирит",14,"Пустынный или степной район", 40,"яблоки, трава");
       System.out.println(gazelle.toString());
       System.out.println(giraffe.toString());
       System.out.println(horse.toString());
       System.out.println(horse2.toString());
       System.out.println(horse.equals(horse2));
       gazelle.eat();
       giraffe.walk();
       horse.sleep();
       horse2.graze();
       gazelle.go();

        System.out.println("\n Хищники.");
        Predator hyena= new Predator("Гиена Тася",-83,"Юго-западная Азия");
        Predator tiger= new Predator("Тигр Барон",5,"Дальний Восток",55,"травоядные");
        Predator bear= new Predator("Медведь Соня",17,"лесные массивы",-32,"всеядные");
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());
        hyena.eat();
        tiger.walk();
        bear.sleep();
        bear.go();
        hyena.hunt();

        System.out.println("\n ЗЕМНОВОДНЫЕ.");
        Amphibians frog= new Amphibians("Жаба Клава",1,"р. Дон");
        Amphibians frog2= new Amphibians("Жаба Люся",1,"р. Дон");
        Amphibians fish= new Amphibians("Уж пресноводный");
        System.out.println(frog.equals(frog2));
        System.out.println(frog.toString());
        System.out.println(frog2.toString());
        System.out.println(fish.toString());
        fish.getName();
        fish.eat();
        fish.sleep();
        fish.go();
        fish.hunt();
        System.out.println("\n ПТИЦЫ \n Нелетающие");
        FligtlessBird peacock= new FligtlessBird("Павлин Петя");
        FligtlessBird penguin= new FligtlessBird("Пингвин Хонтор",4,"северный полюс","на лапках","рыба");
        FligtlessBird dodo= new FligtlessBird("Птица Додо",10,"в ледниковом периоде","на лапках"," ");
        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(dodo.toString());
        peacock.eat();
        penguin.walk();
        dodo.go();
        dodo.sleep();
        penguin.hunt();

        System.out.println("Летающие");
        BirdsFlight gull= new BirdsFlight("Чайка Чача",8," ",null,"рыба");
        BirdsFlight albatross= new BirdsFlight("Альбатрос Альба",9," ",null,"рыба");
        BirdsFlight falcon= new BirdsFlight("Сокол Мачо",10,"горы ","летает","мелкие животные");
        System.out.println(gull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());
        falcon.eat();
        gull.go();
        gull.sleep();
        albatross.flight();
        albatross.hunt();

    }
}
