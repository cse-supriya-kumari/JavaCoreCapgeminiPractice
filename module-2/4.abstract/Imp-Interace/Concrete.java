import java.lang.Object;
class Concrete extends Object implements Interface {
	Concrete() {
		super();
	}
	@Override
	public void nsm1() {
		System.out.println("non static nsm1 of interface Interface");
	}
	@Override
	public void nsm2() {
		System.out.println("non static nsm2 of interface Interface");
	}

}