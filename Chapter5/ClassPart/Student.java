public class Student {

	public int studentID;
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
	}

	public Student(int id, String name) {
		studentID = id; // studentID에 id 초기화
		studentName = name; // studentName에 name 초기화
		address = "주소 없음";
	} // 생성자 구현

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}
}
