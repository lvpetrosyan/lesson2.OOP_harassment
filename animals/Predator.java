package animals;

import java.util.Objects;

public class Predator extends Mammals{
    private String typeEat;
    public Predator(String name, int yearBirth, String livingEnviromental, int speed,String typeEat) {
        super(name, yearBirth, livingEnviromental, speed);
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "травоядные";
        } else {
            this.typeEat = typeEat;
        }
    }

    public Predator(String name, int yearBirth, String livingEnviromental) {
        this(name, yearBirth, livingEnviromental,40,"траводяные");
    }
    @Override
    public String toString() {
        return  getName()+
                ", возраст: " + getYearBirth()+". Среда проживания - "+getLivingEnviromental()
                +" , скорость передвижения "+  getSpeed()+" км/ч. Тип пищи: "+ typeEat;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getName(), predator.getName())&&Objects.equals(getLivingEnviromental(),predator.getLivingEnviromental())&&
                getYearBirth()==predator.getYearBirth();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getLivingEnviromental(),getYearBirth());
    }

    @Override
    public void walk() {
        System.out.println("Гуляет по лесистой местности. "+getName());
    }

    @Override
    public void eat() {
        System.out.println("Основа питания - мясо. "+getName());

    }

    @Override
    public void sleep() {
        System.out.println("Спит в закрытх участках. " +getName());

    }

    @Override
    public void go() {
        System.out.println("Перемещается среди деревьев и в саваннах. "+getName());

    }
    public void hunt(){
        System.out.println("Охотится на: "+typeEat);
    }

    public String getTypeEat() {
        return typeEat;
    }
}
