package comparableVsComparator;

/**
 * Created on August 21, 2019
 *
 * @author kitty
 * @version 1.0
 * 
 */

import java.util.Comparator;

public class GradeCompare implements Comparator<Student>
{

	@Override
	public int compare(Student stud1, Student stud2)
	{
		if( stud1.getGrade() > stud2.getGrade() )
		{
			return 100;
		}
		else if( stud1.getGrade() < stud2.getGrade() )
		{
			return -100;
		}
		else // stud1.getGrade() == stud2.getGrade()
		{
			return 0;
		}
	}

}
