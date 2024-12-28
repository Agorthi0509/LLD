package Model;

public class InternalButton {
     InternalButton InternalButtonDispatcher;
    public static void submitInternalRequest(int destinationFloor, Direction direction) {

        InternalButtonDispatcher.submitInternalRequest(destinationFloor,direction);
    }


}
