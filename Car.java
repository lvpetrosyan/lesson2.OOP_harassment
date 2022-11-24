public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String typeBody;
    private String registratNumber;
    private int seatsNumber;
    private boolean weels;
    private Key key;
    private Insurance insurance;

    public Car(String marks,
               String model,
               int yearCreation,
               String country,
               String color,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String typeBody,
               String registratNumber,
               int seatsNumber
               ) {
        super(marks, model, yearCreation, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission == "") {
            this.transmission = "avto";
        } else {
            this.transmission = transmission;
        }

        if (typeBody == null || typeBody == "") {
            this.typeBody = "sedan";
        } else {
            this.typeBody = typeBody;
        }
        if (registratNumber == null || registratNumber == "") {
            this.registratNumber = "xx000xx000";
        } else {
            this.registratNumber = registratNumber;
        }
        if (seatsNumber <= 0) {
            this.seatsNumber = 5;
        } else {
            this.seatsNumber = seatsNumber;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }
    public Car(String marks, String model, String color, int yearCreation, String country){
        super(marks,model,yearCreation,country,"белый",160);
        this.engineVolume=1.5;
        this.transmission="авто";
        this.typeBody="avto";
        this.registratNumber="OOO777OOO";
        this.seatsNumber=4;
            }
    @Override
    public void refill() {
        System.out.println("Заправлять дизелем или бензином на заправке.");
        System.out.println("заряжать на специальных электроду-парковках.");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }


    public String getTypeBody() {
        return typeBody;
    }


    public String getRegistratNumber() {
        return registratNumber;
    }

    public void setRegistratNumber (String registratNumber) {
            if (registratNumber == null || registratNumber == "") {
                this.registratNumber = "x000xx000";
            } else {

                this.registratNumber = registratNumber;
            }
    }

    public static class Key {
        private boolean playEngine;
        private boolean accessKey;

        public Key(boolean playEngine, boolean accessKey) {
            this.playEngine = playEngine;
            this.accessKey = accessKey;
        }

        public Key() {
            this(false, false);
        }



    }

    public static class Insurance {
        private int dateTo;
        private int price;
        private String number;

        public Insurance(int dateTo, int price, String number) {
            if (dateTo <= 0) {
                this.dateTo = 30;
            } else {
                this.dateTo = dateTo;
            }
            if (price <= 0) {
                this.price = 5000;
            } else {
                this.price = price;
            }
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "defolt";
            } else {
                this.number = number;
            }
        }
        public Insurance() {
            this(30,5000,"defolt");
        }

        public void checkDate() {
            if (dateTo <= 0) {
                System.out.println("страховка просрочена");
            }

        }

        public void check() {
            char[] chars = number.toCharArray();
            if (number.length() < 9 || number.length() > 10) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public int getDateTo() {
            return dateTo;
        }

        public int getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

    }


    public int getSeatsNumber() {
        return seatsNumber;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}




