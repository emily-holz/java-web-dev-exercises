package exercises.technology;

public class Computer extends AbstractEntity {

    private double screenSize;
    private String color;
    private boolean updatedSoftware = false;


    public Computer(double aScreenSize, String aColor){
        super();
        this.screenSize = aScreenSize;
        this.color = aColor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUpdatedSoftware() {
        return updatedSoftware;
    }

    public void setUpdatedSoftware(boolean updatedSoftware) {
        this.updatedSoftware = updatedSoftware;
    }


    public void update() {
        updatedSoftware = true;
    }

}
