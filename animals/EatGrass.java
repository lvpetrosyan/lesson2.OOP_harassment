package animals;

import java.util.Objects;

public class EatGrass extends Mammals{
    private String typeEat;
    public EatGrass(String name, int yearBirth, String livingEnviromental, int speed,String typeEat) {
        super(name, yearBirth, livingEnviromental, speed);
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "травка";
        } else {
            this.typeEat = typeEat;
        }
    }
    public EatGrass(String name, int yearBirth, String livingEnviromental) {
        this(name, yearBirth, livingEnviromental,15,"трава");
    }
    public String getTypeEat() {
        return typeEat;
    }

    public void setTypeEat(String typeEat) {
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "травка";
        } else {
            this.typeEat = typeEat;
        }
    }

    public void graze(){
        System.out.println("Пасется на лугу. "+getName());
    }

    @Override
    public void walk() {
        System.out.println("Гуляет в сухих лесах. " +getName());

    }

    @Override
    public void eat() {
        System.out.println("Кушает травянистые растения. "+getName());

    }

    @Override
    public void sleep() {
        System.out.println("Спит на мягкой травке. "+getName());

    }

    @Override
    public void go() {
        System.out.println("Перемещается среди деревьев и в саваннах. "+getName());

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
        EatGrass eatGrass = (EatGrass) o;
        return Objects.equals(getName(), eatGrass.getName())&&Objects.equals(getLivingEnviromental(),eatGrass.getLivingEnviromental())&&
                getYearBirth()==eatGrass.getYearBirth();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getLivingEnviromental(),getYearBirth());
    }
}
