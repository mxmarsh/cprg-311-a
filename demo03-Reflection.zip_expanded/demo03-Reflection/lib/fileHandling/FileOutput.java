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
   * Default Constructor
   */
  public FileOutput()
  {
  }

  /**
   * User defined constructor to open an output file
   * given the file name as an input.
   *
   * @param String fileName - name of file to open
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
   * @param String fileName - name of file to open
   * @param boolean append - true to open in append mode
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

  // Operational Methods
  /**
   * Print methods for various data types.
   */
  public void print(String a)
  {
    out.print(a);
  }

  public void print(int a)
  {
    out.print(a);
  }

  public void print(double a)
  {
    out.print(a);
  }

  public void print(char a)
  {
    out.print(a);
  }

  public void print(long a)
  {
    out.print(a);
  }

  public void print(Object a)
  {
    out.print(a);
  }

   /**
   * Print line methods for various data types.
   */
  public void println(String a)
  {
    out.println(a);
  }

  public void println(int a)
  {
    out.println(a);
  }

  public void println(double a)
  {
    out.println(a);
  }

  public void println(char a)
  {
    out.println(a);
  }

  public void println(long a)
  {
    out.println(a);
  }

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


