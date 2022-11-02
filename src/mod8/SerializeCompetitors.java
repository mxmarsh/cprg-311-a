/**
 * Created on May 10, 2011
 *
 * Project: demo02-SerializationExercise
 */
package mod8;

import java.io.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * ReadWriteCompetitor.java
 *
 * @author dwatson
 * @version 1.0
 *
 *          Class Description:
 */
public class SerializeCompetitors {
	// Constants
	private static final int N = 1000;

	// Attributes
	private static long competitorOutputTime, competitorInputTime, queueOutputTime, queueInputTime;

	public static void serializeCompetitorsToFile() {
		long start, stop;
		start = System.currentTimeMillis();
		Competitor competitor = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/competitors.ser"));

			for (int i = 0; i < N; i++) {
				Location location = new Location("Lindsey Park", "1823 McLeod Trail");
				Event event = new Event("100 meter free style", location);
				competitor = new Competitor("Bob", event, 19);
				oos.writeObject(competitor);
			}
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		competitorOutputTime = stop - start;
	}

	public static void deserializeCompetitorsFromFile() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/competitors.ser"));

			for (int i = 0; i < N; i++) {
				Competitor competitor = (Competitor) ois.readObject();
				System.out.println(competitor);
			}
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		competitorInputTime = stop - start;
	}

	public static void serializeCompetitorQueueToFile() {
		long start, stop;
		start = System.currentTimeMillis();
		Competitor competitor = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/queue.ser"));
			ConcurrentLinkedQueue<Competitor> queue = new ConcurrentLinkedQueue<Competitor>();
			for (int i = 0; i < N; i++) {
				Location location = new Location("Lindsey Park", "1823 McLeod Trail");
				Event event = new Event("100 meter free style", location);
				competitor = new Competitor("Bob", event, 19);
				queue.add(competitor);
			}
			oos.writeObject(queue);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		queueOutputTime = stop - start;
	}

	public static void deserializeCompetitorQueueFromFile() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/queue.ser"));

			@SuppressWarnings("rawtypes")
			ConcurrentLinkedQueue queue = (ConcurrentLinkedQueue) ois.readObject();
			ois.close();

			for (int i = 0; i < N; i++) {
				System.out.println(queue.poll());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		queueInputTime = stop - start;
	}

	public static void printTimes() {
		System.out.println("Time to output competitors individually = " + competitorOutputTime);
		System.out.println("Time to read competitors input file = " + competitorInputTime);
		System.out.println("Time to output competitors queue file = " + queueOutputTime);
		System.out.println("Time to read competitors queue file = " + queueInputTime);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SerializeCompetitors.serializeCompetitorsToFile();
		SerializeCompetitors.deserializeCompetitorsFromFile();
		SerializeCompetitors.serializeCompetitorQueueToFile();
		SerializeCompetitors.deserializeCompetitorQueueFromFile();
		SerializeCompetitors.printTimes();
	}
}
