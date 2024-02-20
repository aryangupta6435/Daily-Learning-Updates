public class pattern
{
  public static void main(String args[])
  {
    int row, column, numberOfRows = 6;
    for (row=0; row<numberOfRows; row++)
    {
      for (column=numberOfRows-row; column>1; column--)
      {
        System.out.print(" ");
      }
      for (column=0; column<=row; column++ )
      {
        System.out.print("* ");
      }
      // This is to move the cursor to new line for each row
      System.out.println();
    }
  }
}