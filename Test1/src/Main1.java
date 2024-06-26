class A {
	void company(int salary) {
		System.out.println(salary);
	}

	void company(int salary, int bonus) {
		System.out.println(salary + bonus);
	}

	void company(int salary, int bonus, int tax) {
		System.out.println(salary + bonus - tax);
	}
}

class B extends A {
	@Override
	void company(int salary) {
		// TODO Auto-generated method stub
		super.company(salary);
	}

	@Override
	void company(int salary, int bonus) {
		// TODO Auto-generated method stub
		super.company(salary, bonus);
	}

	@Override
	void company(int salary, int bonus, int tax) {
		// TODO Auto-generated method stub
		super.company(salary, bonus, tax);
	}

}

public class Main1 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.company(20000);
		a.company(20000, 1000);
		a.company(20000, 1000, 500);
		b.company(35000);
		b.company(35000, 1500);
		b.company(35000, 1500, 400);
	}

}
