package com.coderscampus.lesson1;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
// No private or protected interfaces.  Automatically set to public, static and final.
// You can NOT instantiate an interface.
// Interfaces are also automatically abstract.

	String standardFileName = "data.txt";
	
	public abstract String readLine (File file)throws IOException;
	
	public abstract void writeLine(File file, String line) throws IOException ;
}
