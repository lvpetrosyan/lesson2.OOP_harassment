package animals;

import java.util.Objects;

public abstract class Mammals extends Animal {
    private String livingEnviromental;
    private int speed;

    public Mammals(String name, int yearBirth, String livingEnviromental, int speed) {
        super(name, yearBirth);
        if (speed <= 0) {
            this.speed = 15;
        } else {
            this.speed = speed;
        }
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "DEFOLT";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }

    public Mammals(String name, int yearBirth, String livingEnviromental) {
        this(name, yearBirth, livingEnviromental, 15);

    }

    public String getLivingEnviromental() {
        return livingEnviromental;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLivingEnviromental(String livingEnviromental) {
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "DEFOLT";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 15;
        } else {
            this.speed = speed;
        }
    }

    public abstract void walk();


    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

    @Override
    public String toString() {
        return getName() +
                ", возраст: " + getYearBirth() + ". Среда проживания - " + livingEnviromental
                + " , скорость передвижения " + getSpeed() + " км/ч";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EatGrass eatGrass = (EatGrass) o;
        return Objects.equals(getName(), eatGrass.getName()) && Objects.equals(livingEnviromental, eatGrass.getLivingEnviromental()) &&
                getYearBirth() == eatGrass.getYearBirth();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), livingEnviromental, getYearBirth());
    }
}
