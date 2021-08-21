package week3.day1;

public class Students {
	public void getStudentsInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Id1 "+id);

	}
	public void getStudentsInfo(int id1, String name) {
		// TODO Auto-generated method stub
		System.out.println("Id "+id1);
		System.out.println("Name "+name);

	}
	public void getStudentsInfo(long l, String email) {
		// TODO Auto-generated method stub
		System.out.println("Phone number "+l);
		System.out.println("Email "+email);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentsInfo(1);
		s.getStudentsInfo(23, "Nancy");
		s.getStudentsInfo(999787165465L, "Nancy");

	}

}
