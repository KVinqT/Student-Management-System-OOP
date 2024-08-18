import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.service.InternationalStudentRegisterService;
import com.example.service.RegularStudentRegisterService;
import com.example.service.StudentRegisterService;

public class Main {
	static BufferedReader inputReader = new BufferedReader((new InputStreamReader(System.in)));
	static StudentRegisterService registerService;
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
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		startRegister();
		registerService.displayStudent();
	}

}
