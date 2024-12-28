package Model;
//consider Elevatorcar dumb which follows the controller instructions
public class ElevatorCar {
    InternalButton internalButton;
    Display display;
    Direction direction;
    Status status;
    Door door;
    int currentFloor;
    public ElevatorCar (){
        currentFloor=0;
        status=Status.IDLE;
        direction=Direction.UP;
        internalButton= new InternalButton();
        display= new Display(direction,currentFloor);


    }
    public void setDisplay(){
        display.setDisplay(currentFloor,direction);
    }
    public void showDisplay(){
        display.showDisplay();
    }
    public void submitInternalRequest(int destinationFloor,Direction direction){
        InternalButton.submitInternalRequest(destinationFloor,direction);
    }

    public boolean moveElevator(int destination, Direction direction){
        status=Status.MOVING;
        if(direction==Direction.UP){
            for(int i=currentFloor;i<=destination;i++){
                currentFloor=i;
                display.setDisplay(i,Direction.UP);
                display.showDisplay();


            }
            status=Status.IDLE;
            door=Door.OPENING;
            return true;
        }

        if(direction==Direction.DOWN){
            for(int i=currentFloor;i>=destination;i--){
                currentFloor=i;
                display.setDisplay(i,Direction.DOWN);


            }
            status=Status.IDLE;
            door=Door.OPENING;
            return true;
        }
        return false;

    }

}
