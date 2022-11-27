package animals;

import java.util.Objects;

public class FligtlessBird extends Birds{
    private String typeGo;
    private String typeEat;
    public FligtlessBird(String name, int yearBirth, String livingEnviromental, String typeGo,  String typeEat) {
        super(name, yearBirth, livingEnviromental);
        if (typeGo == null || typeGo.isBlank() || typeGo.isBlank()) {
            this.typeGo = "Передвигается на лапах";
        } else {
            this.typeGo = typeGo;
        }
        if (typeEat == null || typeEat.isBlank() || typeEat.isBlank()) {
            this.typeEat = "насекомые и ягоды";
        } else {
            this.typeEat = typeEat;
        }
    }

    public FligtlessBird(String name) {
        this(name, 0, "Наземная среда","Передвигается на лапах", "насекомые и ягоды");
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

    public void walk() {
        System.out.println(getName()+ " ходит преимущественно на открытой местности. " );

    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " спит в гнездах.");

    }

    @Override
    public void go() {
        System.out.println(getName()+ " передвигается на ногах");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " охотится догоняя и вылавливая добычу.");

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
