public final class OutsourcedEmploy extends Employ{
    private double adicionalCharge;

    public OutsourcedEmploy(){        
    }
    public OutsourcedEmploy(String name, Integer hours, double valuePerHours, double adicional){
        super(name,hours,valuePerHours);  
        this.setAdicionalCharge(adicional);      
    }

    public double payment(){
        return super.payment() + (110 * this.getAdicionalCharge() / 100); 
    }
    
    public double getAdicionalCharge() {
        return adicionalCharge;
    }

    public void setAdicionalCharge(double adicionalCharge) {
        this.adicionalCharge = adicionalCharge;
    } 

    @Override
    public String toString(){
        return super.toString();
    }
}
