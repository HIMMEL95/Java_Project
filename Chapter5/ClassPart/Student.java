package classPart;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id; // studentID�� id �ʱ�ȭ
		studentName = name; // studentName�� name �ʱ�ȭ
		address = "�ּ� ����";
	} // ������ ���� 

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
