package filehandlingCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import java.io.FileWriter;

public class StudentDao {
	
	public void saveStudents(Student[] students) {
		FileWriter out = null;
		try {
			out = new FileWriter("student.csv");
			out.append("Name,");
			out.append("RollNo,");
			out.append("Age\n");
			for(Student stud:students) {
				out.append(stud.getName()+",");
				out.append(stud.getRollno()+",");
				out.append(stud.getAge()+",");
				out.append("\n");
			}
			System.out.println("Done");
		} catch (IOException e) {

			e.printStackTrace();
		}
		finally {
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public Student[] getStudents()
	{
		
		Student[] students=new Student[4];
		
		try
		{
			
			FileReader rd=new FileReader("student.csv");
			BufferedReader brd=new BufferedReader(rd);
			
			brd.readLine();
			String data="";
			int i=0;
			while((data=brd.readLine()) !=null )
			{
				String[] arr=data.split(",");
				//name , age , rollno
				
				String name= arr[0];
				int age=Integer.parseInt(arr[1]);
				int rollNo=Integer.parseInt(arr[2]);
			
			Student student=new Student(name, rollNo, age);	
				
			students[i]=student;
			i++;
			
			}
				
		}
		catch (Exception e) {
	
			e.printStackTrace();
		}
		
		return students;
	}
	
	
	}


