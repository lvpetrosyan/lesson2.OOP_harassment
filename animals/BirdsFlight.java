package animals;

import java.util.Objects;

public class BirdsFlight extends Birds {
    private String typeGo;
    private String typeEat;
    public BirdsFlight(String name, int yearBirth, String livingEnviromental, String typeGo,  String typeEat) {
        super(name, yearBirth, livingEnviromental);
        if (typeGo == null || typeGo.isBlank() || typeGo.isBlank()) {
            this.typeGo = "Передвигается с помощью крыльев. Летает";
        } else {
            this.typeGo = typeGo;
        }
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "насекомые и ягоды";
        } else {
            this.typeEat = typeEat;
        }
    }

    public BirdsFlight(String name) {
        this(name, 0, "Наземно-воздушная среда","Передвигается с помощью крыльев. Летает", "насекомые и ягоды");
    }
    public String getTypeGo() {
        return typeGo;
    }

    public String getTypeEat() {
        return typeEat;
    }

    public void setTypeEat(String typeEat) {
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "насекомые и ягоды";
        } else {
            this.typeEat = typeEat;
        }
    }
    @Override
    public void eat() {
        System.out.println(getName()+ " употребляет в пищу: "+typeEat);

    }

    public void flight() {
        System.out.println(getName()+ " летает без ограничений по местности. " );

    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " спит в гнездах.");

    }

    @Override
    public void go() {
        System.out.println(getName()+ " передвигается с помощью крыльев. Летает");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " охотится в основном нападая с воздуха.");

    }
    @Override
    public String toString() {
        return  getName()+
                ", возраст: " + getYearBirth()+". Среда проживания - "+getLivingEnviromental()
                +" Тип передвижения: "+ typeGo;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getName(), birds.getName())&&
                getYearBirth()==birds.getYearBirth();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getYearBirth());
    }




}
