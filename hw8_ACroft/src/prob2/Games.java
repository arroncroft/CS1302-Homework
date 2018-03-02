// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 8
// Due:		4/25/16
package prob2;

import java.util.HashMap;
import java.util.TreeMap;

public class Games {
	//getTotals
	private static TreeMap<String,Integer> getTotals(HashMap<String,Integer> game1, HashMap<String,Integer> game2) {
		TreeMap<String,Integer> ret = new TreeMap<String,Integer>();
		for(String key : game1.keySet())
			if(game2.containsKey(key))
				ret.put(key, game1.get(key)+game2.get(key));
		return ret;
	}

	//main method
	public static void main(String[] args){
		HashMap<String,Integer> game1 = new HashMap<>();
		game1.put("Chen", 4);
		game1.put("Allie", 9);
		game1.put("Reece", 4);
		game1.put("Skuye", 6);
		game1.put("Meshell", 6);

		HashMap<String,Integer> game2 = new HashMap<>();
		game2.put("Chen", 8);
		game2.put("Zyrene", 4);
		game2.put("Skuye", 2);
		game2.put("Meshell", 3);

		TreeMap<String,Integer> result = getTotals(game1,game2);
		for(String key : result.keySet()){
			System.out.println("Key="+key+", Value="+result.get(key));
		}
	}
}
