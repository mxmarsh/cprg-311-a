package comparableVsComparator;

/**
 * Created on August 21, 2019
 *
 * @author kitty
 * @version 1.1
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import utilities.KittySort;

public class Driver
{

	public static void main(String[] args)
	{
		ArrayList<Student> studs = new ArrayList<>();
		studs.add(new Student("Kitty", 111, 87.5));
		studs.add(new Student("Maryam", 222, 92.6));
		studs.add(new Student("Aaron", 333, 73.8));
		studs.add(new Student("John", 444, 35.2));
		studs.add(new Student("Nicole", 555, 99.9));

		// using the Comparable compareTo() method of the Student class
		System.out.println("Sort by ID: ");
		Collections.sort(studs);
		for( Student s : studs ) 
		{
			System.out.println("\t" + s.getName() + " " + s.getID() + " " + s.getGrade()); 
		}

		// using the Comparator compare() method of the NameCompare class
		System.out.println("Sort by name: ");
		NameCompare nc = new NameCompare();
		Collections.sort(studs, nc);
		for( Student s : studs ) 
		{
			System.out.println("\t" + s.getName() + " " + s.getID() + " " + s.getGrade()); 
		}

		// using the Comparator compare() method of the GradeCompare class
		System.out.println("Sort by grade: ");
		GradeCompare gc = new GradeCompare();
		Collections.sort(studs, gc);
		for( Student s : studs ) 
		{
			System.out.println("\t" + s.getName() + " " + s.getID() + " " + s.getGrade()); 
		}
		
		// lambdas can be used for Comparator because equals() has a default implementation
		// so we really only need to override compare() i.e. a functional interface
		System.out.println("Sort by name using lambda expressions: ");
		// we don't need to provide the type in the argument list because the compiler
		// can infer object types (thanks javac! :D)
		Collections.sort(studs, (stud1, stud2) -> stud1.getName().compareTo(stud2.getName()));
		for( Student s : studs ) 
		{
			System.out.println("\t" + s.getName() + " " + s.getID() + " " + s.getGrade()); 
		}
		
		// example of sorting using array converted from arraylist
		System.out.println("Sort by ID via Array: ");
		Object[] objArray = studs.toArray();
		Student[] studsArray = Arrays.copyOf(objArray, objArray.length, Student[].class);
		Arrays.sort(studsArray);
		for( int i = 0; i < studsArray.length; i++ )
		{
			System.out.println("\t" + studsArray[i].getName() + " " + studsArray[i].getID() + " " + studsArray[i].getGrade()); 
		}
		
		// example of sorting using a custom sorting algorithm
		System.out.println("Sort by name via Array with my own algorithm: ");
		KittySort.someSort( studsArray, nc );
		for( int i = 0; i < studsArray.length; i++ )
		{
			System.out.println("\t" + studsArray[i].getName() + " " + studsArray[i].getID() + " " + studsArray[i].getGrade()); 
		}
	}

}
