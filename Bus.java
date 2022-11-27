import java.util.Objects;

public class Bus extends Transport {
    public Bus(String marks, String model, int yearCreation, String country, String color, int maxSpeed) {
        super(marks, model, yearCreation, country, color, maxSpeed);
    }
    @Override
    public void refill() {
        System.out.println("Заправлять дизелем на заправке.");}

    @Override
    public String toString() {
        return "Автобус " +
                 marks +
                ", модель " + model +
                ". Год выпуска: " + yearCreation +
                ", производство " + country  +
                ". Цвет - " + color  +
                ", скорость " + maxSpeed;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(marks, train.marks)&& Objects.equals(model, train.model) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks, model);
    }
}
