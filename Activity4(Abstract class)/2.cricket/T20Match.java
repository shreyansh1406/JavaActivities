public class T20Match extends Match {
	
     
	

	@Override
	float calculateRunRate(float a,float b,float c) {
		float s=20-b;
		float d=c-a;
		return d/s;
	}

	@Override
	int calculateBalls(int o2) {
		int o=120;
		int b=o-(o2*6);
		return b;
	
	}

	@Override
	void display(float req,int balls) {
		System.out.println(" runs in "+balls+" balls");
		System.out.println("required runrate:"+req);
		
	}

}
