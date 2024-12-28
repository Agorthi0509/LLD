package Model;

import java.util.PriorityQueue;

public class ElevatorContorller {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorContorller(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);

    }


    public ElevatorContorller(){
        elevatorCar= new ElevatorCar();

    }

    public static boolean submitInternalRequest(int destinationFloor,Direction direction){
        return elevatorCar.moveElevator(destinationFloor,direction);

    }
}
