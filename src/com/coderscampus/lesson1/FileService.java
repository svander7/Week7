package com.coderscampus.lesson1;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
// No private or protected interfaces.  Automatically set to public, static and final.

	String standardFileName = "data.txt";
	
	String readLine (File file)throws IOException;
	
	void writeLine(File file, String line) throws IOException ;
}
