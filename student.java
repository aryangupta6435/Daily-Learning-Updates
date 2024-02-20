class Student

{
    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("creating object");
    }
    
    public Student(int st1){
        System.out.println("parameterised constructor");
    }

    public void study()
    {
        System.out.println(studentName+" is studying");
    }


    public void showFullDetails()
    {
    System.out.println("My name is" +studentName);
    System.out.println("My id is"+ studentId);
    System.out.println("My city"+ studentCity);
    }
}
