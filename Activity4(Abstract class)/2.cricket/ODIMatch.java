public class ODIMatch extends Match {

	@Override
	float calculateRunRate(float a,float b,float c) {
		float s=50-b;
		float d=c-a;
		return d/s;
	
	}

	@Override
	int calculateBalls(int o2) {
		// TODO Auto-generated method stub
		int o=300;
		int b=o-(o2*6);
		return b;
	}

	@Override
	void display(float req,int balls) {
		
		System.out.println(" runs in "+balls+" balls");
		System.out.println("required runrate:"+req);
		
		
	}
	

}
