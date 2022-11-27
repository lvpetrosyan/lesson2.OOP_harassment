package animals;

import java.util.Objects;

public class Amphibians extends Animal {
    private String livingEnviromental;


    public Amphibians(String name, int yearBirth, String livingEnviromental) {
        super(name, yearBirth);
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "водоемы";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }

    public String getLivingEnviromental() {
        return livingEnviromental;
    }

    public void setLivingEnviromental(String livingEnviromental) {
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "водоем";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }

    public Amphibians(String name) {
        this(name, 0, "водоемы");
    }


    public void hunt() {
        System.out.println("Охотится на насекомых. ");
    }

    @Override
    public void eat() {
        System.out.println("Ест насекомых.");

    }

    @Override
    public void sleep() {
        System.out.println("Спит в водоемах");

    }

    @Override
    public void go() {
        System.out.println("Плавает в воде");

    }


    @Override
    public String toString() {
        return getName() +
                ", возраст: " + getYearBirth() + ". Среда проживания - " + getLivingEnviromental();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians amphibians = (Amphibians) o;
        return Objects.equals(getName(), amphibians.getName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
