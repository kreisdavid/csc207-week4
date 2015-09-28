import java.awt.Color;
import java.util.Random;

public class Cat extends Critter{

	private int numSteps;
	private int direction;
	private Random r;
	
	public Cat(){
		this.numSteps = 0;
		this.direction = 0;
		this.r = new Random();
	}
	
	@Override
	public Direction getMove() {
		// TODO Auto-generated method stub
		
		if(this.numSteps == 0){
			this.numSteps++;
			this.direction = r.nextInt(4);
		}
		
		if(this.direction == 0){
			this.numSteps++;
			if(this.numSteps == 5){
				this.numSteps = 0;
			}
			return Direction.NORTH;
		} else if(this.direction == 1){
			this.numSteps++;
			if(this.numSteps == 5){
				this.numSteps = 0;
			}
			return Direction.EAST;
		} else if(this.direction == 2){
			this.numSteps++;
			if(this.numSteps == 5){
				this.numSteps = 0;
			}
			return Direction.SOUTH;
		} else{
			this.numSteps++;
			if(this.numSteps == 5){
				this.numSteps = 0;
			}
			return Direction.WEST;
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
		return Color.MAGENTA;
	}

	@Override
	public Speed getSpeed() {
		// TODO Auto-generated method stub
		return Speed.MEDIUM;
	}

	public String toString(){
		return "c";
	}
	
}
