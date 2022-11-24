public class Train extends Transport {
    int priceTicket;
    int timeTravel;
    String nameStation;
    String endStop;
    int sumWagons;



    public Train(String marks,
                 String model,
                 int yearCreation,
                 String country,
                 String color,
                 int maxSpeed,

                 int priceTicket,
                 int timeTravel,
                 String nameStation,
                 String endStop,
                 int sumWagons) {
        super(marks, model, yearCreation, country, color, maxSpeed);
        if (priceTicket <= 0) {
            this.priceTicket = 2500;
        } else {
            this.priceTicket = priceTicket;
        }
        if (timeTravel <= 0) {
            this.timeTravel = 90;
        } else {
            this.timeTravel = timeTravel;
        }
        if (nameStation == null || nameStation.isEmpty() || nameStation.isBlank()) {
            this.nameStation = "defolt";
        } else {
            this.nameStation = nameStation;
        }
        if (endStop == null || endStop.isEmpty() || endStop.isBlank()) {
            this.endStop = "defolt";
        } else {
            this.endStop = endStop;
        }
        if (sumWagons <= 0) {
            this.sumWagons = 10;
        } else {
            this.sumWagons = sumWagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("Заправлять дизелем или бензином на заправке.");
    }

    @Override
    public String toString() {
        return "Поезд " +
                marks + " модель "
                + model + ", " + yearCreation +
                " год выпуска в России, " +
                "скорость передвижения — " + maxSpeed +
                " км/ч, отходит от " +
                nameStation +
                " вокзала и следует до станции " + endStop +
                ". Цена поездки — " + priceTicket +
                " рублей, в поезде " + sumWagons +
                " вагонов.";

    }


    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        if (priceTicket <= 0) {
            this.priceTicket = 2500;
        } else {
            this.priceTicket = priceTicket;
        }
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        if (timeTravel <= 0) {
            this.timeTravel = 90;
        } else {
            this.timeTravel = timeTravel;
        }
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        if (nameStation == null || nameStation.isEmpty() || nameStation.isBlank()) {
            this.nameStation = "defolt";
        } else {
            this.nameStation = nameStation;
        }
    }

    public String getEndStop() {
        return endStop;
    }

    public void setEndStop(String endStop) {
        if (endStop == null || endStop.isEmpty() || endStop.isBlank()) {
            this.endStop = "defolt";
        } else {
            this.endStop = endStop;
        }
    }

    public int getSumWagons() {
        return sumWagons;
    }

    public void setSumWagons(int sumWagons) {
        if (sumWagons <= 0) {
            this.sumWagons = 10;
        } else {
            this.sumWagons = sumWagons;
        }
    }
}
