package Reusability;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.testng.annotations.Test;

public class single_mail_id_generator {
	

		   

		
		public static String generate_name() throws Exception{
			BufferedReader br = new BufferedReader(new FileReader("D:\\VASANTH\\neopat\\ai.neopat\\src\\test\\java\\Reusability\\num.txt"));
			String st = "";
			int i=0;
			while((st=br.readLine())!=null) {
				i = Integer.parseInt(st);
			}
			 st = "superman" + i++ + "@examly.in"; 
			 
			 BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\VASANTH\\neopat\\ai.neopat\\src\\test\\java\\Reusability\\num.txt"));
			 bw.write(Integer.toString(i));
			 bw.close();
			 return st;
		}
	}



