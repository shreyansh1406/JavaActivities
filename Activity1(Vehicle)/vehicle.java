
public class vehicle {
protected String make;
protected String vehiclenumber;
protected String fueltype;
protected int fuelcapacity;
protected int cc;

public vehicle(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc) {
	super();
	this.make = make;
	this.vehiclenumber = vehiclenumber;
	this.fueltype = fueltype;
	this.fuelcapacity = fuelcapacity;
	this.cc = cc;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getVehiclenumber() {
	return vehiclenumber;
}
public void setVehiclenumber(String vehiclenumber) {
	this.vehiclenumber = vehiclenumber;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
public int getFuelcapacity() {
	return fuelcapacity;
}
public void setFuelcapacity(int fuelcapacity) {
	this.fuelcapacity = fuelcapacity;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}

public void displayDetailInfo()
{
	
}
public void displayMake()
{
	System.out.println("***"+getMake()+"***");
}
public void displayBasicInfo()
{
	System.out.println("****Basic Information***");
	System.out.println("Vehicle number:"+getVehiclenumber());
	System.out.println("Fuel Capacity:"+getFuelcapacity());
	System.out.println("Fuel Type:"+getFueltype());
	System.out.println("Cc:"+getCc());


}
}
