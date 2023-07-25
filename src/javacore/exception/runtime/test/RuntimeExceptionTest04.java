package javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

	public static void main(String[] args) throws IOException {
		try {
			talvezLanceException();
		}catch(SQLException | FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException{
		
	}
	
	
	
}
