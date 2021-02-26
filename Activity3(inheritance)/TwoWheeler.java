public class TwoWheeler extends vehicle {
	private boolean kickStartAvailable;

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public TwoWheeler(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehiclenumber, fueltype, fuelcapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

		public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println("**\nDetails Information:***");
		System.out.println("KickstartAvailable:");
		System.out.println(isKickStartAvailable());
		
		
	}
	
	

}
