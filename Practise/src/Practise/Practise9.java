package Practise;

public class Practise9 {
	public static void main(String args[]) {
		Y y = new Y();
		System.out.println(y.statement());
	}
}


class X{
	public Object statement() {
		int r = 2+7;
		return r;
	}
}

class Y extends X{
	@Override
	public String statement() {
		return 2+7+"M";
	}
}