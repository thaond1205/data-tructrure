package learn;

public class Mount extends Bike{

    int height;
    public Mount(int gear, int speed, int startHeight) {
        super(gear, speed );
        height = startHeight;
    }

    public void setHeight(int value) {
        height = value;
    }

    @Override
    public String toString() {
        return super.toString()+ "mountain{" +
                "height=" + height +
                '}';
    }
}
