package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	public Person() {
		setName("");
		setAge(12);
		setNumberOfPerson(getNumberOfPerson()+1);
	}
	
	public Person(String name) {
		this();
		setName(name);
	}

	public Person(int age, String name) {
		this(name);
		setAge(age);
	}
	
	public static int getPopulation() {
		return getNumberOfPerson();
	}
	
	public void selfIntroduce() {
		System.out.println("내 이름은 "+getName()+"이며, 나이는 "+getAge()+"입니다.");
	}


	public static int getNumberOfPerson() {
		return numberOfPerson;
	}


	public static void setNumberOfPerson(int numberOfPerson) {
		Person.numberOfPerson = numberOfPerson;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
