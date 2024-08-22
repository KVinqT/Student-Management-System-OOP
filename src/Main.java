import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Exam;
import com.example.model.Student;
import com.example.service.ExamService;
import com.example.service.InternationalStudentRegisterService;
import com.example.service.RegularStudentRegisterService;
import com.example.service.StudentRegisterService;
import com.example.service.StudentSubjectService;

public class Main {
	static BufferedReader inputReader = new BufferedReader((new InputStreamReader(System.in)));
	static StudentRegisterService registerService;
	static ExamService examService;
	static StudentSubjectService studentSubjectService;
	
	public static void startRegister() throws IOException {
		System.out.println("Is student is regular student ? yes/no: ");
		String isRegularStudent = inputReader.readLine();
		if(isRegularStudent.equalsIgnoreCase("yes")) {
			registerService = new RegularStudentRegisterService();
		} else {
			registerService = new InternationalStudentRegisterService();
		}
		System.out.println("Do you want to register new student again? yes/no: ");
		String reRegister = inputReader.readLine();
		if(reRegister.equalsIgnoreCase("yes")) {
			startRegister();
		}
	}
	
	public static void creatingExam() throws IOException {
		System.out.println("---Exam creation---");
		examService = new ExamService();
		examService.createExam();
		examService.displayExam();
	}
	
	public static void givingMarkOfSubjectToStudent(Student registeredStudent) throws IOException {
		studentSubjectService = new StudentSubjectService();
		//choose subject to give marks to student
		studentSubjectService.giveMarkOfSubjectToStudent(registeredStudent);
		//display student marks
		studentSubjectService.displaySubjectMarkOfStudent(registeredStudent);
		String flag;
		System.out.println("Do you want to register new student for another exam? yes/no: ");
		flag = inputReader.readLine();
		if(flag.equalsIgnoreCase("yes")) {
			Student anotherRegisteredStudent = examService.registerStudentToExam();
			givingMarkOfSubjectToStudent(anotherRegisteredStudent);
		}
	}
	
	public static void getTotalHighestMarkStudentOfTheExam() throws IOException {
		System.out.println("Enter exam name to find the total highest mark of the exam: ");
		String examName = inputReader.readLine();
		Exam exam = examService.getExamByName(examName);
		if(exam == null) {
			System.out.println("Exam is not found !");
			getTotalHighestMarkStudentOfTheExam();
		}
		studentSubjectService.displayTotalHighestMarkOfStudentByExam(examName);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		startRegister();
		registerService.displayStudent();
		creatingExam();
		//can create subject of the exam
		Student registeredStudent = examService.registerStudentToExam();
		givingMarkOfSubjectToStudent(registeredStudent);
		getTotalHighestMarkStudentOfTheExam();
	}

}
