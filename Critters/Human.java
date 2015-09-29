import java.awt.Color;

public class Human extends Critter {

	private int numSteps;
	private int numStepsX1;
	private int numStepsX2;
	private int stepsRemaining;
	private boolean hasMated;
	private int turnsAfterMating;
	private int turnDirection;
	private boolean clockwise;
	
	public Human(boolean clockwise){
		this.numSteps = 1;
		this.hasMated = false;
		this.turnsAfterMating = 9;
		this.numStepsX1 = 0;
		this.numStepsX2 = 0;
		this.turnDirection = 0;
		this.stepsRemaining = 1;
		this.clockwise = clockwise;
	}
	
	@Override
	public Direction getMove() {
		
		//if human has just mated, stay still for 9 turns
		if(hasMated && this.turnsAfterMating != 0){
			this.turnsAfterMating--;
			return Direction.CENTER;
		}
		
		//otherwise, spiral clockwise/counterclockwise (based on boolean clockwise)
		//       following the fibonacci sequence
		//this code will not be reached if human is waiting after mating
		if(this.stepsRemaining == 0){
			this.numStepsX1 = this.numStepsX2;
			this.numStepsX2 = this.numSteps;
			this.numSteps = this.numStepsX1 + this.numStepsX2;
			this.stepsRemaining = numSteps;
			this.turnDirection++;
			if(this.turnDirection == 4){
				this.turnDirection = 0;
			}
		}
		
		this.stepsRemaining--;
		
		
		if(this.clockwise){
			if(this.turnDirection == 0){
				return Direction.NORTH;
			} else if(this.turnDirection == 1){
				return Direction.EAST;
			} else if(this.turnDirection == 2){
				return Direction.SOUTH;
			} else{
				return Direction.WEST;
			}
		} else{
			if(this.turnDirection == 0){
				return Direction.NORTH;
			} else if(this.turnDirection == 1){
				return Direction.WEST;
			} else if(this.turnDirection == 2){
				return Direction.SOUTH;
			} else{
				return Direction.EAST;
			}
		}
		
	}

	@Override
	public FoodType getFoodType() {
		// TODO Auto-generated method stub
		return FoodType.MEAT;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.PINK;
	}

	@Override
	public Speed getSpeed() {
		// TODO Auto-generated method stub
		return Speed.SLOW;
	}
	
	public String toString(){
		return "H";
	}

}
