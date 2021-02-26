
public class FourWheelers extends vehicle{
	public FourWheelers(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc,
			String audioSystem, int numberOfDoors) {
		super(make, vehiclenumber, fueltype, fuelcapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	private String audioSystem;
	private int numberOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("\n****Details Information****");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number Of Doors:"+getNumberOfDoors());
		
	}
	
	

}
