/**
 * Created on Jan 22, 2008
 *
 * Project: demo5-EmployeeInheritanceExerciseComplete
 */
package employeeManagementApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import employeeDomain.*;


/**
 *	OfficeManager.java
 *
 * @author dwatson
 * @version 1.0
 *
 * Class Description: This class manages employee lists, salary and wage
 * payments for all employees in the company. 
 */
public class OfficeManager
{
	//Attributes
	private ArrayList<Employee>			empList;
	
	//Constructors
	/**
	 * Initializes an empty OfficeManager object with default values for all
	 * attributes.
	 */
	public OfficeManager()
	{
		empList = new ArrayList<Employee>();
		fillEmployeeList();
	}
	
	//Operational Methods
	/**
	 * Method to print the entire employee list using
	 * an iterator.
	 */
	public void printEmployeeList()
	{
		Iterator it = empList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	/**
	 * Method calculates the average salary of all the
	 * employees regardless of the type of employee.
	 * @return the average salary of all employees.
	 */
	public double calculateAverageEmployeeSalary()
	{
		double sum = 0;

		for(int i = 0; i < empList.size(); i++)
		{
			sum += empList.get(i).calcPay();
		}
		return sum / empList.size();
	}
	
	/**
	 * Method searches employee list to find and return the
	 * Wage employee with the highest wage.
	 * @return the employee with the highest wage.
	 */
	public Employee highestSalaryOfWagesEmployees()
	{
		double high = 0;
		Employee highest = null;
		for(int i = 0; i < empList.size(); i++)
		{
			if(empList.get(i) instanceof Wage)
			{
				if(empList.get(i).calcPay() > high)
				{
					highest = empList.get(i);
					high = empList.get(i).calcPay();
				}
			}
		}
		return highest;
	}
	
	/**
	 * Method to find the salaried employee with the
	 * lowest salary and return that employee.
	 * @return the employee with the lowest salary.
	 */
	public Employee lowestSalaryOfSalariedEmployees()
	{
		Employee lowest = null;
		for(int x = 0; x < empList.size(); x++)
		{
			if(empList.get(x) instanceof Salary)
			{
				lowest = empList.get(x);
				break;
			}
		}
		for(int i = 0; i < empList.size(); i++)
		{
			if(empList.get(i) instanceof Salary)
			{
				if(empList.get(i).calcPay() < lowest.calcPay())
				{
					lowest = empList.get(i);
				}
			}
		}
		return lowest;
	}
	
	/**
	 * Method to determine the percentage of each employee
	 * that is part time, wages and salaried. Prints
	 * this information to the console.
	 */
	public void percentageOfEachTypeOfEmployee()
	{
		int salaryCount = 0;
		int wageCount = 0;
		int partTimeCount = 0;
		
		for(int i = 0; i < empList.size(); i++)
		{
			if(empList.get(i) instanceof Salary)
			{
				salaryCount++;
			}
			if(empList.get(i) instanceof Wage)
			{
				wageCount++;
			}
			if(empList.get(i) instanceof PartTime)
			{
				partTimeCount++;
			}
		}
		System.out.println("\n\nSalary = "+
				((double)salaryCount/empList.size())* 100.0);
		System.out.println("Wage = "+
				((double)wageCount/empList.size())* 100.0);
		System.out.println("Part Time = "+
				((double)partTimeCount/empList.size())* 100.0);
	}
	
/********************************PRIVATE METHODS*****************************/
	private void fillEmployeeList()
	{
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader("res/employees.txt"));
			
			String line = fin.readLine();
			
			while(line != null)
			{
				Object o = null;
				StringTokenizer st = new StringTokenizer(line,":");
			
			
				String className = "employeeDomain."+st.nextToken();
				Class cls = Class.forName(className);
				
				if(className.compareTo("employeeDomain.Salary") == 0)
				{
					Class paramTypes[] = new Class[8];
					paramTypes[0] = Integer.TYPE;
					paramTypes[1] = String.class;
					paramTypes[2] = String.class;
					paramTypes[3] = String.class;
					paramTypes[4] = Long.TYPE;
					paramTypes[5] = String.class;
					paramTypes[6] = String.class;
					paramTypes[7] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[8];
					argList[0] = new Integer(Integer.parseInt(st.nextToken()));
					argList[1] = new String(st.nextToken());
					argList[2] = new String(st.nextToken());
					argList[3] = new String(st.nextToken());
					argList[4] = new Long(Long.parseLong(st.nextToken()));
					argList[5] = new String(st.nextToken());
					argList[6] = new String(st.nextToken());
					argList[7] = new Double(Double.parseDouble(st.nextToken()));
					
					o = ct.newInstance(argList);
				}
				else
				{
					Class paramTypes[] = new Class[9];
					paramTypes[0] = Integer.TYPE;
					paramTypes[1] = String.class;
					paramTypes[2] = String.class;
					paramTypes[3] = String.class;
					paramTypes[4] = Long.TYPE;
					paramTypes[5] = String.class;
					paramTypes[6] = String.class;
					paramTypes[7] = Double.TYPE;
					paramTypes[8] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[9];
					argList[0] = new Integer(Integer.parseInt(st.nextToken()));
					argList[1] = new String(st.nextToken());
					argList[2] = new String(st.nextToken());
					argList[3] = new String(st.nextToken());
					argList[4] = new Long(Long.parseLong(st.nextToken()));
					argList[5] = new String(st.nextToken());
					argList[6] = new String(st.nextToken());
					argList[7] = new Double(Double.parseDouble(st.nextToken()));
					argList[8] = new Double(Double.parseDouble(st.nextToken()));
					
					o = ct.newInstance(argList);
				}
				
				empList.add((Employee)o);
		
				line = fin.readLine();
			}		
			fin.close();	
		}	
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
			
			
			/*switch(firstNum)
			{
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					Salary s = new Salary(Integer.parseInt(st.nextToken()),
											st.nextToken(),
											st.nextToken(),
											st.nextToken(),
											Long.parseLong(st.nextToken()),
											st.nextToken(),
											st.nextToken(),
											Double.parseDouble(st.nextToken()));
					empList.add(s);
					break;
				case 5:
				case 6:
				case 7:
					Wage w = new Wage(Integer.parseInt(st.nextToken()),
								st.nextToken(),
								st.nextToken(),
								st.nextToken(),
								Long.parseLong(st.nextToken()),
								st.nextToken(),
								st.nextToken(),
								Double.parseDouble(st.nextToken()),
								Double.parseDouble(st.nextToken()));
					empList.add(w);
					break;
				case 8:
				case 9:
					PartTime pt = new PartTime(Integer.parseInt(st.nextToken()),
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							Long.parseLong(st.nextToken()),
							st.nextToken(),
							st.nextToken(),
							Double.parseDouble(st.nextToken()),
							Double.parseDouble(st.nextToken()));
				empList.add(pt);
				break;
				default:
					System.out.println("No such employee type!!");
			}//end switch statement
*/			
		
		
	}
}
