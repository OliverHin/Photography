public class Lens {

    private int minFocalLength;
    private int maxFocalLength;
    private static int lensCounter;

    public Lens(int minFocalLength, int maxFocalLength) {
        this.minFocalLength = minFocalLength;
        setMaxFocalLength(maxFocalLength);
        lensCounter++;
    }


    public static int getLensCounter() {
        return lensCounter;
    }

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        if (maxFocalLength < minFocalLength) {
            throw new IllegalArgumentException("Max focal length must be bigger than min focal length");
        }
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        if (maxFocalLength < minFocalLength) {
            throw new IllegalArgumentException("Max focal length must be bigger than min focal length");
        }
        this.maxFocalLength = maxFocalLength;

    }

    @Override
    public String toString(){
        return "Min focal length is: " + minFocalLength + " and max focal length is: " + maxFocalLength;
    }
}
