public abstract class Shape2D extends Shape{
    private boolean isFilled;

    public Shape2D(String name) {
        super(name);
    }


    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape2D{" +
                "isFilled=" + isFilled +
                '}';
    }
}
