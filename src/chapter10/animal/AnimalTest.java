package chapter10.animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Bird("������",3,"������ ��");
		System.out.println(animal1.getKind()+"("+animal1.getAge()+"��) : "+((Bird)animal1).getHabitat());
		((Bird)animal1).fly();
		((Bird)animal1).spreadWing();

	}

}
