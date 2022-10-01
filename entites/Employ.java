public class Employ {
    private String name;
    private Integer hours;
    private double valuePerHour;

    public Employ(){        
    }

    public Employ(String name, Integer hours, double valuePerHour){
        this.setName(name);
        this.setHours(hours);
        this.setValuePerHour(valuePerHour);
    }

    public double payment(){
        return this.getValuePerHour() * this.getHours();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString(){
       return String.format("Name: %s - $ %.2f", this.getName(), this.payment());
    }

}
