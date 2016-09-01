package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class Bicycle implements Vehicle, WheeliaAble {
    double speed;

    public Bicycle(){
        this.speed = 0;
    }


    @Override
    public void applyBrakes() {
        this.speed-=5;

    }

    @Override
    public void speedUp(int delta) {
        this.speed+=delta;

    }

    @Override
    public void slowDown(int delta) {
        this.speed-=delta;

    }

    @Override
    public boolean popAWheelie(int duration) {
        while(duration != 0){
            System.out.println("I'm poppping a wheeeelieeee");
            duration--;
        }
        return true;
    }
}
