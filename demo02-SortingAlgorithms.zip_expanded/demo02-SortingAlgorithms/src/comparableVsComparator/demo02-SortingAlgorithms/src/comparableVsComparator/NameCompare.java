package comparableVsComparator;

/**
 * Created on August 21, 2019
 *
 * @author kitty
 * @version 1.0
 * 
 */

import java.util.Comparator;

public class NameCompare implements Comparator<Student>
{
	@Override
	public int compare(Student stud1, Student stud2)
	{
		return stud1.getName().compareTo(stud2.getName());
	}

}
