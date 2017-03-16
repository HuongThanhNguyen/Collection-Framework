package arraylistandtreeset;

import java.util.Comparator;

public class Book implements Comparator<Book>, Comparable<Book> {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Book() {
	}

	public int compare(Book o1, Book o2) {
		return o1.id - o2.id;
	}

	public int compareTo(Book o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
