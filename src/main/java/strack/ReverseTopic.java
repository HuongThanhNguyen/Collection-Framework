package strack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ReverseTopic {
	public static void main(String[] args) {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();

		List<Topic> topics = Arrays.asList(new Topic("id1", "name1", "discription1"),
				new Topic("id2", "name2", "discription2"), new Topic("id3", "name3", "discription3"),
				new Topic("id4", "name4", "discription4"), new Topic("id5", "name5", "discription5"));
		System.out.println(gson.toJson(topics));

		List<Topic> reverseTopics = new ArrayList<>();
		java.util.Stack<Topic> stack = new java.util.Stack<>();
		for (Topic topic : topics) {
			stack.push(topic);
		}
		int n = stack.size();
		for (int i = 0; i < n; i++) {
			reverseTopics.add(stack.pop());
		}

		System.out.println(gson.toJson(reverseTopics));
	}
}
