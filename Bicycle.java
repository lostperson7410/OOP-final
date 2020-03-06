public class Bicycle implements Vehicle{
    int speed;
    int gear;

    public  Bicycle(int s,int g){

        this.speed = s;
        this.gear = g;

    }
@Override
    public String toString( ){
        return "Speed:"+ speed +"  Gear:"+ gear ; 
    }

    public void changeGear (int toGear){
        this.gear=toGear;
    }
    public void speedUp(int increaseSpeed){
        this.speed = speed + increaseSpeed;
        
    }
    
    public void applyBrakes(int decreaseSpeed){
        this.speed = speed-decreaseSpeed;
    }
}