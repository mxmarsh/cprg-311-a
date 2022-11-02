package mod8;

import java.io.*;

/**
 * DataExample.java
 *
 * @author dwatson
 * @version 1.0
 * 
 *          Class Definition:
 */
public class DataExample {
	// Constants
	private static final int N = 10000;

	// Attributes
	private static long unBufferedWriteTime, unBufferedReadTime, bufferedWriteTime, bufferedReadTime;

	public static void generateRandomNumberFileUnBuffered() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("res/random.txt"));

			for (int i = 0; i < N; i++) {
				int number = (int) (Math.random() * 255);
				out.writeInt(number);
				System.out.println(i + " = " + number);
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		unBufferedWriteTime = stop - start;

	}

	public static void readIntegerFileInUnBuffered() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			DataInputStream in = new DataInputStream(new FileInputStream("res/random.txt"));

			for (int i = 0; i < N; i++) {
				int value = in.readInt();
				System.out.println(i + " = " + value);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		unBufferedReadTime = stop - start;
	}

	public static void generateRandomNumberFileBuffered() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			DataOutputStream out = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream("res/randombuf.txt")));

			for (int i = 0; i < N; i++) {
				int number = (int) (Math.random() * 255);
				out.writeInt(number);
				System.out.println(i + " = " + number);
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		bufferedWriteTime = stop - start;
	}

	public static void readIntegerFileInBuffered() {
		long start, stop;
		start = System.currentTimeMillis();
		try {
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("res/randombuf.txt")));

			for (int i = 0; i < N; i++) {
				int value = in.readInt();
				System.out.println(i + " = " + value);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stop = System.currentTimeMillis();
		bufferedReadTime = stop - start;
	}

	public static void printRunTimes() {
		System.out.println("Total time for unbuffered output = " + unBufferedWriteTime);
		System.out.println("Total time for unbuffered input = " + unBufferedReadTime);
		System.out.println("Total time for buffered output = " + bufferedWriteTime);
		System.out.println("Total time for buffered input = " + bufferedReadTime);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataExample.generateRandomNumberFileUnBuffered();
		DataExample.readIntegerFileInUnBuffered();
		DataExample.generateRandomNumberFileBuffered();
		DataExample.readIntegerFileInBuffered();
		DataExample.printRunTimes();
	}

}
