 public class Playerclass implements Comparable<Playerclass>{
	 private String name;

	public Playerclass(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Playerclass o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "--"+ name;
	}
	

}
