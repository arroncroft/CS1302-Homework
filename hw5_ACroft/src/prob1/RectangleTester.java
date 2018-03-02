// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 5
// Due:		3/9/16

package prob1;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleTester {
	public static void main(String[] args) throws Exception{
		//data fields
		double width = 0;
		double height = 0;
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		ArrayList<IllegalRectangleException> illegalRectangles = new ArrayList<>();

		File inFile = new File("C:\\Users\\Croft\\Documents\\School\\2016 - Spring\\CS 1302\\"+
				"cs1302_homework\\hw5_ACroft\\src\\prob1\\rectangles.txt");
		Scanner scan = new Scanner(inFile);

		File outFile = new File("C:\\Users\\Croft\\Documents\\School\\2016 - Spring\\CS 1302\\"+
				"cs1302_homework\\hw5_ACroft\\src\\prob1\\illegalRectangles.txt");
		PrintWriter writer = new PrintWriter(outFile);

		//Creates rectangles from scanned values, and adds
		//	them to rectangle arrayList. If they throw an
		//	exception due to illegal area size, they are
		//	added to a separate arrayList.
		while(scan.hasNext()){
			try{
				width = Double.parseDouble(scan.next());
				height = Double.parseDouble(scan.next());
				rectangles.add(new Rectangle(width,height));
			}
			catch(IllegalRectangleException ex){
				illegalRectangles.add(ex);
			}
		}
		//Prints list of illegal rectangles to a file.
		for(IllegalRectangleException r : illegalRectangles){
			writer.println(r);
		}
		scan.close();
		writer.close();
	}
}
