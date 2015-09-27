import java.awt.Color;

public class Ant extends Critter{

	private boolean stepsNorth;
	private int numSteps;
	
	public Ant(boolean stepsNorth){
		this.stepsNorth = stepsNorth;
		this.numSteps = 0;
	}
	
	@Override
	public Direction getMove() {
		// TODO Auto-generated method stub
		if(stepsNorth){
			if(this.numSteps % 2 == 0){
				return Direction.NORTH;
			} else {
				return Direction.EAST;
			}
		} else {
			if(this.numSteps % 2 == 0){
				return Direction.SOUTH;
			} else {
				return Direction.WEST;
			}
		}
	}

	@Override
	public FoodType getFoodType() {
		// TODO Auto-generated method stub
		return FoodType.GRASS;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.BLACK;
	}

	@Override
	public Speed getSpeed() {
		// TODO Auto-generated method stub
		return Speed.FAST;
	}
	
	public String toString(){
		return "%";
		
	}

}
