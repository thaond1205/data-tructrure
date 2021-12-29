package learn;

public class Bike {

    public int gear;
    public int speed;


    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void giamGa(int g){
        speed -= g;
    }

    public void tangGa(int t){
        speed += t;
    }

    public String toString(){
        return ("Gear: "+gear +" speed: "+speed);
    }

}
