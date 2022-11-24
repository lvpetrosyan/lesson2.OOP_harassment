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

    public abstract void hunt();

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
}

