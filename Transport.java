import javax.swing.*;

public abstract class Transport {
    String marks;
    String model;
    int yearCreation;
    String country;
    String color;
    int maxSpeed;


    public Transport(String marks, String model, int yearCreation, String country, String color, int maxSpeed) {
        if (marks == null || marks.isEmpty() || marks.isBlank()) {
            this.marks = "defolt";
        } else {
            this.marks = marks;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "defolt";
        } else {
            this.model = model;
        }
        if (yearCreation <= 0) {
            this.yearCreation = 0;
        } else {
            this.yearCreation = yearCreation;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "defolt";
        } else {
            this.country = country;}
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = " ";
        } else {
            this.color = color;}
        if (maxSpeed <= 0) {
            this.maxSpeed = 160;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public  abstract void refill();

    public String getMarks() {
        return marks;
    }


    public String getModel() {
        return model;
    }


    public int getYearCreation() {
        return yearCreation;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "white";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 160;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
