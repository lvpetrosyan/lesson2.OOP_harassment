package animals;

public abstract class Animal {
    private String name;
    private int yearBirth;

    public Animal(String name, int yearBirth) {
        if (name == null || name.isBlank() || name.isBlank()) {
            this.name = "anonim";
        } else {
            this.name = name;
        }
        if (yearBirth <=0) {
            Math.abs(yearBirth);
        } else {
            this.yearBirth = yearBirth;
        }
    }

    public Animal(String name) {
        this(name,0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isBlank()) {
            this.name = "anonim";
        } else {
            this.name = name;
        }
    }

    public int getYearBirth() {
        return yearBirth;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void go();
}
