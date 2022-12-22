package Oops;

public class Test {

	public static void main(String[] args) {
		
		StudentNew student1 = new StudentNew();
		student1.setId(1001);
		student1.setFirstName("Bivor");
		student1.setLastName("Kumar");
		student1.setAddress("Ranchi");
		
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getId());
		System.out.println(student1.getAddress());
		
		System.out.println(".............................\n");
		
		StudentNew student2 =new StudentNew();
		student2.setId(1002);
		student2.setFirstName("Ravi");
		student2.setLastName("Ranjan");
		student2.setAddress("Kolkata");
		System.out.println(student2.getFirstName());
		System.out.println(student2.getLastName());
		System.out.println(student2.getId());
		System.out.println(student2.getAddress());
		

	}

}
