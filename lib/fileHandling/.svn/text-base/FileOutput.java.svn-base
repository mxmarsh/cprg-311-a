package fileHandling;

/**
 * Title:        Package of File Input and Output Classes
 * Description:  Package that contains classes to handle opening file input and output operations.
 * Copyright:    Copyright (c) 2003
 * Company:      SAIT
 * @author Dave Watson
 * @version 1.0
 */

import java.io.*;

public class FileOutput
{
  // Attributes
  private File              file;
  private FileWriter        fw;
  private PrintWriter       out;

  /**
   * User defined constructor to open an output file
   * given a File Object as an input.
   *
   * @param file - File Object to open
   *
   */
  public FileOutput(File file)
  {
	    try
	    {
	      this.file = file;
	      fw = new FileWriter(this.file);
	      out = new PrintWriter(fw);
	    }
	    catch(IOException e)
	    {
	      System.out.println("Could not create output file "+file.getName());
	      System.exit(1);
	    }
  }

  /**
   * User defined constructor to open an output file
   * given the file name as an input.
   *
   * @param fileName - name of file to open
   *
   */
  public FileOutput(String fileName)
  {
	    try
	    {
	      file = new File(fileName);
	      fw = new FileWriter(file);
	      out = new PrintWriter(fw);
	    }
	    catch(IOException e)
	    {
	      System.out.println("Could not create output file "+fileName);
	      System.exit(1);
	    }
  }

  /**
   * User defined constructor to open an output file
   * in append mode given the file name and a boolean
   * value as inputs.
   *
   * @param fileName - name of file to open
   * @param append - boolean true to open in append mode
   *
   */
  public FileOutput(String fileName, boolean append)
  {
	    try
	    {
	      file = new File(fileName);
	      fw = new FileWriter(fileName, append);
	      out = new PrintWriter(fw);
	    }
	    catch(IOException e)
	    {
	      System.out.println("Could not create output file "+fileName);
	      System.exit(1);
	    }
  }
  
  /**
   * User defined constructor to open an output file
   * in append mode given a File Object and a boolean
   * value as inputs.
   *
   * @param file - File Object to open
   * @param append - boolean true to open in append mode
   *
   */
  public FileOutput(File file, boolean append)
  {
	    try
	    {
	      this.file = file;
	      fw = new FileWriter(this.file, append);
	      out = new PrintWriter(fw);
	    }
	    catch(IOException e)
	    {
	      System.out.println("Could not create output file "+file.getName());
	      System.exit(1);
	    }
  }

  // Operational Methods
  
  /**
   * @param a - string value to print to file
   */
  public void print(String a)
  {
    out.print(a);
  }

  /**
   * @param a - int value to print to file
   */
  public void print(int a)
  {
    out.print(a);
  }

  /**
   * @param a - double value to print to file
   */
  public void print(double a)
  {
    out.print(a);
  }

  /**
   * @param a - char value to print to file
   */
  public void print(char a)
  {
    out.print(a);
  }

  /**
   * @param a - long value to print to file
   */
  public void print(long a)
  {
    out.print(a);
  }

  /**
   * @param a - Object value to print to file
   */
  public void print(Object a)
  {
    out.print(a);
  }

  /**
   * @param a - string value to print to file
   */
  public void println(String a)
  {
    out.println(a);
  }

  /**
   * @param a - int value to print to file
   */
  public void println(int a)
  {
    out.println(a);
  }

  /**
   * @param a - double value to print to file
   */
  public void println(double a)
  {
    out.println(a);
  }

  /**
   * @param a - char value to print to file
   */
  public void println(char a)
  {
    out.println(a);
  }

  /**
   * @param a - long value to print to file
   */
  public void println(long a)
  {
    out.println(a);
  }

  /**
   * @param a - Object value to print to file
   */
  public void println(Object a)
  {
    out.println(a);
  }

  /**
   * Method to close the output file.
   */
  public void closeOutputFile()
  {
    out.close();
  }
}


