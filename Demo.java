public class Demo {
    
    public static void main(String[] args){

        Student st1;
        st1=new Student();


        st1.studentName="RAM";
        st1.studentId=123;
        st1.studentCity="DELHI";

        st1.study();
        st1.showFullDetails();

        Student st2=new Student(12);

        st2.studentName="Shyam";
        st2.studentId=586;
        st2.studentCity="DELHI";


        st2.study();
        st2.showFullDetails();

    }
}
