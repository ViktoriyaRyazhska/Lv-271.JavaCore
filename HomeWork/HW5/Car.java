package HW5;

public class Car {
        private String type;
        private int year;
        private String engineCapacity;

        public Car(){}
        public Car(String type,int year,String engineCapacity){
            this.type = type;
            this.year = year;
            this.engineCapacity=engineCapacity;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public String toString() {
        return "Car type=" + type + ", Year=" + year + " EngineCapacity="+engineCapacity;
    }
}
