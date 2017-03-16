package arraylistandtreeset;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FindBook {
	public static void main(String[] args) {
		sortArraryList();
		sortTreemap();

	}

	public static void sortTreemap() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		LocalTime localTime2 = LocalTime.now();
		Set<Book> treeSet = new TreeSet<Book>();
		treeSet.add(new Book(1, "name1"));
		treeSet.add(new Book(4, "name4"));
		treeSet.add(new Book(3, "name3"));
		treeSet.add(new Book(6, "name6"));
		treeSet.add(new Book(5, "name5"));
		treeSet.add(new Book(2, "name2"));
		treeSet.add(new Book(6, "name6"));
		treeSet.add(new Book(4, "name4"));
		LocalTime localTime3 = LocalTime.now();
		Duration duration1 = Duration.between(localTime2, localTime3);
		System.out.println(gson.toJson(treeSet));
		System.out.println("time complexity: " + duration1.toMillis());
	}

	public static void sortArraryList() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		LocalTime localTime = LocalTime.now();
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(6, "name6"));
		books.add(new Book(1, "name1"));
		books.add(new Book(4, "name4"));
		books.add(new Book(3, "name3"));
		books.add(new Book(6, "name6"));
		books.add(new Book(5, "name5"));
		books.add(new Book(2, "name2"));
		books.add(new Book(6, "name6"));
		System.out.println("before sort: ");
		System.out.println(gson.toJson(books));
		BookComparator bookComparator = new BookComparator();
		books.sort(bookComparator);
		LocalTime localTime1 = LocalTime.now();
		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("after sort: ");
		System.out.println(gson.toJson(books));
		System.out.println("time complexity: " + duration.toMillis());
	}
}
