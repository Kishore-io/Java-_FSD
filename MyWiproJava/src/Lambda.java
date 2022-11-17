interface Demos{
	void change(String str);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demos d = str -> {
			String[] arr = str.split(" ");
			String res = "";
			for(String string: arr) {
				res += string.charAt(0);
			
			}
			System.out.println(res);
		};
		
		d.change("Indian Railway");
	}

}
