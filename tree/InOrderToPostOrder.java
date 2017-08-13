package tree;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.util.Date;
import java.time.LocalDate;

public class InOrderToPostOrder {
	public static void main(String[] args) throws IOException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
