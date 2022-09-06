package repositryLayer;

import UILayer.StudentUI;

public interface IStudentdao
{
	public abstract void addStudent(StudentUI student);
	public abstract void deleteStudent();
	public abstract void updateStudent();
	public abstract void displayStudent();
	public abstract void getStudentName();
	public abstract void getStudentId();

}
