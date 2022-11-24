package p266_6_11;

class ReferenceParamEx2 {
	public static void main(String[] args) {

		int[] x = { 10 };
		System.out.println("main() : x " + x[0]);

		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);	//x[0] 변경된 값으로 저장 2
	}

	static void change(int[] x) {	// int[]x 1
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}

}
