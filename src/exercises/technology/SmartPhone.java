package exercises.technology;

public class SmartPhone extends Computer {

    private String carrier;

    public SmartPhone(String aCarrier, double aScreenSize, String aColor){
        super(aScreenSize, aColor);
        this.carrier = aCarrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void updateCarrier(String newCarrier){
        carrier = newCarrier;
    }

}
