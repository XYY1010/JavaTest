package com.xyy.test13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import com.xyy.test13.storycharacters.StoryCharacters;
import com.xyy.test13.storycharacters.StoryCharactersGenerator;
import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

public class Exercise1513 {

	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	
	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			list.add(gen.next());
		}
		return list;
	}
	
	public static <T> Queue<T> fill (Queue<T> queue, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			queue.offer(gen.next());
		}
		return queue;
	}
	
	public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			set.add(gen.next());
		}
		return set;
	}
	
	public static <T> LinkedList<T> fill(LinkedList<T> lList, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			lList.add(gen.next());
		}
		return lList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Coffee> list = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for (Coffee coffee : list) {
			print(coffee);
		}
		Queue<Integer> queue = fill(new LinkedList<Integer>(), new Fibonacci(), 18);
		for (Integer integer : queue) {
			printnb(integer + " ");
		}
		print();
		Set<StoryCharacters> ss = fill(new HashSet<StoryCharacters>(), new StoryCharactersGenerator(), 16);
		for (StoryCharacters storyCharacters : ss) {
			print(storyCharacters);
		}
		LinkedList<Integer> lli = fill(new LinkedList<Integer>(), new Fibonacci(), 19);
		for (Integer integer : lli) {
			printnb(integer + " ");
		}
	}

}
