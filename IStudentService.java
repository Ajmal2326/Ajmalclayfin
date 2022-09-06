package ServiceLayer;

import UILayer.StudentUI;

public interface IStudentService
{
	public abstract void addStudent(StudentUI student);
	public abstract void deleteStudent();
	public abstract void updateStudent();
	public abstract void displayStudent();
	public abstract void getStudentName();
	public abstract void getStudentId();

}
