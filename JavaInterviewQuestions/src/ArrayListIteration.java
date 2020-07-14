import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {


		ArrayList<String>tvSeries = new ArrayList<String>();
		tvSeries.add("GoT");
		tvSeries.add("MadMan");
		tvSeries.add("Breaking Bad");
		tvSeries.add("Lost");
		tvSeries.add("Dexter");
		
		//1. Using Java 8 with for each loop and lambda expression:
		
		System.out.println("---- Using Lambda Expression--");
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("---- Using  Iterator--");
		
		//2. Using Iterator:
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. Using Iterator and Java 8 lambda and forEachRemaining() Method
		System.out.println("---- Using iterator and Java 8 Lambad and forEachRemaning --");
		
		it = tvSeries.iterator();
		it.forEachRemaining(shows->{
			System.out.println(shows);
		});
		
		//4. Using for each loop: 
		System.out.println("---for each loop--");
		for(String shows: tvSeries) {
			System.out.println(shows);
			
		}
		
		//5. Using for loop with order/index:
		System.out.println("---- Using for loop with order/index--");
		
		for(int i = 0; i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
			
		}
		
		//6. using a listIterator() to traverse in both the directions
		System.out.println("--using a listIterator() to traverse in both the directions--");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while (tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}

		
	}

}
