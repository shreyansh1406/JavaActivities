public abstract class Match {
	private int currentscore;
	private Float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public Float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(Float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	abstract float calculateRunRate(float a,float b,float c);
	abstract int calculateBalls(int o2);
	abstract void display(float reqRunrate,int balls);
	
	

}
