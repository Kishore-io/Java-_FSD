package filehandlingCsv;

public class StudentServiceImpl implements StudentService {

	StudentDao dao;
	@Override
	public void saveStudents(Student[] students) {
		// TODO Auto-generated method stub
		dao = new StudentDao();
		dao.saveStudents(students);
		
	}
	public static void main(String[] args)
	{
		Student student1 = new Student("Raju", 1, 5);
		Student student2 = new Student("Bheem", 2, 5);
		Student student3 = new Student("Arjun", 3, 5);
		Student student4 = new Student("Krish", 4, 5);
		
		Student[] students = new Student[4];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		
		StudentService service = new StudentServiceImpl();
		service.saveStudents(students);
		
		Student[] studentsData = service.getStudents();
		
		for(Student student:studentsData) {
			System.out.println(student);
		}
			
	}
	@Override
	public Student[] getStudents() {
		// TODO Auto-generated method stub
		dao = new StudentDao();
		return dao.getStudents();
	}
	
}
