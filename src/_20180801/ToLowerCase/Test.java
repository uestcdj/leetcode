package _20180801.ToLowerCase;

public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.toLowerCase("Hello"));
		Dog[] dogs = new Dog[] {new Dog(),new Dog(),new Dog(),new Dog()};
		for(Dog d : dogs) {
			d.a = 2;
		}
		for(Dog d : dogs) {
			System.out.println(d.a);
		}
	}

}
