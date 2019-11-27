package polymorphism;

public class calorie {

	public void cal(int b) {
		// TODO Auto-generated method stub
		double t=b*74;
		double r=4.1868;
		double t1=t*r;
		System.out.printf("%.3f kj of energy generated from %.1f calories",t,t1);
	}

	public void cal(int b1, int j) {
		double t=(b1*74)+(j*26);
		double r=4.1868;
		double t1=t*r;
		System.out.printf("%.3f kj of energy generated from %.1f calories",t,t1);
	}

	public void cal(int b2, int j1, int bu) {
		double t=(b2*74)+(j1*26)+(bu*106);
		double r=4.1868;
		double t1=t*r;
		System.out.printf("%.3f kj of energy generated from %.1f calories",t,t1);
	}

}
