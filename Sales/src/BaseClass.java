import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;

public class BaseClass {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner( System.in);
		ArrayList <Double> list = new ArrayList<>();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		double count =0;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("G:\\WeeklySales.txt"));
		for(int i = 0, x = 1; i <=4; i++, x++){
			System.out.print("Sales data "+(i+1)+" >>");
			double tempDub = (scanner.nextDouble());
			if(tempDub<=-1){
			while(tempDub <= -1){
				System.out.print("INCORRECT VALUE Sales data "+(i+1)+" >>");
				tempDub = (scanner.nextDouble());
			}
			}
				//list.add(tempDub);
			count+=tempDub;
			writer.write("Price of "+ x +" "+ formatter.format(tempDub));	//1
			writer.newLine();
			
		}
		//writer.write("Price of "+list.indexOf(1));	//2
		//writer.newLine();
		//writer.write("Price of "+list.indexOf(2));	//3
		//writer.newLine();
		//writer.write("Price of "+list.indexOf(3));	//4
		//writer.newLine();
		writer.write("Total Price "+formatter.format(count));	//final
		writer.close();

	}

}
