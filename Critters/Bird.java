import java.awt.Color;

public class Bird extends Critter{
	
	private int numSteps;
	
	public Bird(){
		this.numSteps = 0;
	}
	
	@Override
	public Direction getMove() {
		// TODO Auto-generated method stub
		
		if(this.numSteps < 3){
			this.numSteps++;
			return Direction.NORTH;
		} else if(this.numSteps < 6){
			this.numSteps++;
			return Direction.EAST;
		} else if(this.numSteps < 9){
			this.numSteps++;
			return Direction.SOUTH;
		} else if(this.numSteps < 12){
			this.numSteps++;
			if(this.numSteps == 12){
				this.numSteps = 0;
			}
			return Direction.WEST;
		}
		
		
		return null;
	}

	@Override
	public FoodType getFoodType() {
		// TODO Auto-generated method stub
		return FoodType.GRASS;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.RED;
	}

	@Override
	public Speed getSpeed() {
		// TODO Auto-generated method stub
		return Speed.FAST;
	}
	
	public String toString(){
		if(this.numSteps == 0){
			return "<";
		} else if(this.numSteps < 4){
			return "^"; //change
		} else if(this.numSteps < 7){
			return ">";
		} else if(this.numSteps < 10){
			return "v";//change
		} else{
			return "<";
		}
	}

}
