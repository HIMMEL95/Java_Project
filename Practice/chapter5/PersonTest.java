
public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;

		System.out.println("??΄ : " + person.age);
		System.out.println("?΄λ¦?: " + person.name);
		System.out.println("κ²°νΌ ?¬λΆ? : " + person.isMarried);
		System.out.println("???? ? : " + person.numberOfChildren);
	}

}
