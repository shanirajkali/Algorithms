package file;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.sql.*;
public class CSVparse {
public static void main(String[] args) throws IOException, Exception {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:9001/mcq","root","8778");
			Statement stmt=con.createStatement();
			BufferedReader br=new BufferedReader(new FileReader("C:/Users/shani/Desktop/db/q18.csv"));
			br.readLine();
			String s=br.readLine();
			System.out.println(s);
			while(!br.equals("")){
				String[] ss=s.split("'");
				s="";
				int j=0;
				while(j<ss.length){
					s=s+ss[j];
					j++;
				}
				String[] sarr=s.split(",");
				String [] s1arr=sarr[0].split(" ");
				int i=0;
				sarr[0]="";
					while(i<s1arr.length){
						if((!s1arr[i].equals("B.O"))&&(!s1arr[i].equals("S.O"))&&(!s1arr[i].equals("H.O"))){
							if(i<s1arr.length-2)
								sarr[0]=sarr[0]+s1arr[i]+" ";
							else sarr[0]=sarr[0]+s1arr[i];
						}
						i++;
					}
					stmt.executeUpdate("insert into address(locale,pin,division,region,circle,tahsil,district,state) values"
							+"('"+sarr[0]+"',"+sarr[1]+",'"
							+sarr[2]+"','"+sarr[3]+"','"+sarr[4]+"','"+sarr[5]+"','"+sarr[6]+"','"+sarr[7]+"');");
					System.out.println(Arrays.toString(sarr));
					s=br.readLine();
			}
		}catch (IOException e) { e.printStackTrace(); System.out.println("chaaaa");}
	}
}
