package PolymorphismConcepts;

import java.util.HashMap;
import java.util.Map;

public class MusicDemo extends MusicDirector {



	public MusicDemo(String name, String movie, int year) {
		super(name, movie, year);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,MusicDirector> musicMap = new HashMap<Integer,MusicDirector>();
		
		MusicDirector DSP = new MusicDirector("Devi","F2",2019);
		MusicDirector ARR = new MusicDirector("Rehman","I",2019);
		MusicDirector RP = new MusicDirector("Ricky","RP",2019 );
		
		musicMap.put(1,DSP);
		musicMap.put(2,ARR);
		musicMap.put(3,RP);
		
		System.out.println("Music Director Details");
		System.out.println("**********************");
		
		for(Map.Entry<Integer,MusicDirector> entry: musicMap.entrySet()) {
			
			int key = entry.getKey();
			MusicDirector md = entry.getValue();
			
			System.out.println(key+"."+md.name+":"+md.movie+":"+md.year);
		}
		
			
	}

}
