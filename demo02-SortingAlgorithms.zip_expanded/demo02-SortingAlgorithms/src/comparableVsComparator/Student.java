package comparableVsComparator;

/**
 * Created on August 21, 2019
 *
 * @author kitty
 * @version 1.0
 * 
 */

public class Student implements Comparable<Student>
{
	private String name;
	private int ID;
	private double grade;
	
	public Student(String name, int ID, double grade)
	{
		this.name = name;
		this.ID = ID;
		this.grade = grade;
	}
	
	public String getName()
	{
		return name;
	}

	public int getID()
	{
		return ID;
	}

	public double getGrade()
	{
		return grade;
	}

	@Override
	public int compareTo(Student that)
	{
		if( this.ID > that.ID )
		{
			return 1;
		}
		else if( this.ID < that.ID )
		{
			return -1;
		}
		else // this.ID == that.ID
		{
			return 0;
		}
	}
	
}
