package console;
import java.io.*;
import java.util.Scanner;
import java.io.Console;
public class JLine {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println(os);
	    //Windows
	    if(os.contains("win")){
	        System.out.append("Windows Detected");
	        //set Windows Dos Terminal width 80, height 25
	        Process p = Runtime.getRuntime().exec("mode 80, 25");
	    }
		
}}
