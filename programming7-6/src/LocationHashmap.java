import java.util.HashMap;
import java.util.Scanner;

class Location { 
	String country; 
	int lat, lon; 
	
	public Location(String country, int lat, int lon) { 
		this.country = country; 		//필드 초기화
		this.lat = lat; 
		this.lon = lon; 
	} 
} 
public class LocationHashmap { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		HashMap<String, Location> map = new HashMap<String, Location>(); 
		System.out.println("도시,경도,위도를 입력하세요.");   
		
		for(int i=0 ; i<4 ; i++) {          //
			System.out.print(">> "); 
			String[] str = sc.nextLine().split(", "); 
			int d1 = Integer.parseInt( str[1] ); 
			int d2 = Integer.parseInt( str[2] ); 
			map.put(str[0], new Location(str[0], d1, d2)); 
		} 
		System.out.println("----------------"); 
		for(String key : map.keySet()) { 
			Location loc = map.get(key); 
			System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
		} 
		System.out.println("----------------"); 
		while( true ) { 
			System.out.print("도시이름 >> "); 
			String str = sc.nextLine(); 
			if( str.equals("그만") ) {   //프로그램 중단
				break; 
			} 
			if( map.containsKey(str) ) {   //입력받은 값 출력
				Location loc = map.get(str); 
				System.out.println(loc.country + " " + loc.lat + " " + loc.lon); 
			} 
			else { 
				System.out.println(str + "은(는) 없습니다."); 
			} 
		} 
	} 
} 

