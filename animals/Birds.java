package animals;

import java.util.Objects;

public abstract class Birds extends Animal {
    private String livingEnviromental;


    public Birds(String name, int yearBirth, String livingEnviromental) {
        super(name, yearBirth);
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "Наземно-воздушная среда";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }

    public Birds(String name) {
        this(name, 0, "Наземно-воздушная среда");
    }


    public String getLivingEnviromental() {
        return livingEnviromental;
    }

    public void setLivingEnviromental(String livingEnviromental) {
        if (livingEnviromental == null || livingEnviromental.isBlank() || livingEnviromental.isBlank()) {
            this.livingEnviromental = "Наземно-воздушная среда";
        } else {
            this.livingEnviromental = livingEnviromental;
        }
    }
    public abstract void hunt();
    public String toString() {
        return  getName()+
                ", возраст: " + getYearBirth()+". Среда проживания - "+ livingEnviromental;
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

