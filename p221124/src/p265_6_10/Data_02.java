package p265_6_10;

class Data_02 {
	int x;
}

class ReferenceParmEx {
	public static void main(String[] args) {
		Data_02 d = new Data_02();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change_02(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);
	}

	static void change_02(Data_02 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
