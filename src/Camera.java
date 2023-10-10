public class Camera {

    private String brand;
    private int megaPixels;
    private int displaySize;
    private boolean colored = true;
    private Lens lens;
    private static int camCounter;


    public Camera(String brand, int megaPixels, int displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        camCounter++;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public static int getCamCounter() {
        return camCounter;
    }

    public String getColor() {
        if (colored == true) {
            return "Colored";
        }
        return "Black and white";
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Megapixel: " + megaPixels + "mp, Displaysize: " +  displaySize + ", Color: " + getColor() + ", Lens: " + lens;
    }
}





