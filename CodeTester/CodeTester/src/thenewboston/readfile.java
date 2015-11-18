package thenewboston;

import java.io.File;
import java.util.Scanner;

public class readfile {
	
	private Scanner x;
	
	public void openFile(){
		try{			//system.out.println("hello");
			x = new Scanner(new File("src/thenewboston/lifexp.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file");
		}
	}

	public void readFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
//			String c = x.next();
			
			System.out.printf("%s %s\n", a,b);
		}
	}
	public void closeFile() {
	}
}
