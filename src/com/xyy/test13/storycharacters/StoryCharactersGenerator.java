package com.xyy.test13.storycharacters;

import java.util.Iterator;
import java.util.Random;

import com.xyy.tools.Generator;
import static com.xyy.tools.Print.*;


public class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {

	private Class[] types = { Abhor.class, Hulk.class, Ironman.class, ScarletWitch.class, Thanos.class, Ultron.class };
	private static Random rand = new Random(47);
	public StoryCharactersGenerator() {}
	
	private int size = 0;
	public StoryCharactersGenerator(int size) { this.size = size; }
	@Override
	public StoryCharacters next() {
		// TODO Auto-generated method stub
		try {
			return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
	class StoryIterator implements Iterator<StoryCharacters> {
		int count = size;
		public boolean hasNext() { return count > 0; }
		public StoryCharacters next() {
			count--;
			return StoryCharactersGenerator.this.next();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	@Override
	public Iterator<StoryCharacters> iterator() {
		// TODO Auto-generated method stub
		return new StoryIterator();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoryCharactersGenerator gen = new StoryCharactersGenerator();
		for (int i = 0; i < 10; i++) {
			print(gen.next());
		}
		
		for (StoryCharacters storyCharacters : new StoryCharactersGenerator(10)) {
			print(storyCharacters);
		}
	}
}
