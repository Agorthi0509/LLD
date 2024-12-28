package Model;

public class Display {
    Direction direction;
    int currentFloor;
    public Display(Direction direction, int currentFloor){
        this.direction=direction;
        this.currentFloor=currentFloor;
    }

    public void showDisplay(){
        System.out.println("Current Floor : " +this.currentFloor+ " Direction " +this.direction );
    }
    public void setDisplay(int currentFloor, Direction direction){
        this.direction=direction;
        this.currentFloor=currentFloor;
    }
}
