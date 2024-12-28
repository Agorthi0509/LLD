package Model;

import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorContorller> elevatorContorllerList;

    public void submitInternalRequest(int destinationFloor,Direction direction){
ElevatorContorller.submitInternalRequest(destinationFloor,direction);
    }


}
