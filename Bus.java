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
}
