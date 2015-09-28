import java.awt.Color;
import java.util.Random;

public class Lion extends Cat{
	
	private boolean isSleeping;
	private int numSteps;
	private Random r = new Random();
	private int direction;
	private int sleepNum;
	private int turnsUntilAwake;
	
	public Lion(){
		this.isSleeping = false;
		this.numSteps = 0;
		this.direction = 0;
		this.sleepNum = 0;
		this.turnsUntilAwake = r.nextInt(6);
	}
	
	@Override
	public Direction getMove() {
		// TODO Auto-generated method stub
		if(isSleeping){
			this.turnsUntilAwake--;
			this.isSleeping = false;
			return Direction.CENTER;
		} else{
			
			if(this.numSteps == 0){
				this.numSteps++;
				this.direction = r.nextInt(4);
			}
			
			this.numSteps++;
			if(this.numSteps == 5){
				this.numSteps = 0;
			}
			this.sleepNum++;
			
			if(this.sleepNum == 8){
				this.sleepNum = 0;
				this.turnsUntilAwake = r.nextInt(6);
				if(this.turnsUntilAwake != 0){
					this.isSleeping = true;
				}
			}//will tell program that next move the lion will start sleeping
			//unless the random number is 0, then the lion does not sleep
			
			if(this.direction == 0){
				return Direction.NORTH;
			} else if(this.direction == 1){
				return Direction.EAST;
			} else if(this.direction == 2){
				return Direction.SOUTH;
			} else{
				return Direction.WEST;
			}
			

		}//else of isSleeping
		
	}//getMove

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.ORANGE;
	}

	@Override
	public Speed getSpeed() {
		// TODO Auto-generated method stub
		return Speed.SLOW;
	}

	public String toString(){
		if(this.isSleeping){
			return "Z";
		} else{
			return "L";
		}

	}
}
