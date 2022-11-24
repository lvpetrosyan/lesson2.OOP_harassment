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


    public abstract void walk();


    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

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
}
