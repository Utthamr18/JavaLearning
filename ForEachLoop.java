class Student
{
    int rollno;
    String name;
    int marks;

}
public class ForEachLoop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 45;
        s1.name = "Arjun";
        s1.marks = 4;

        Student s2 = new Student();
        s2.rollno = 18;
        s2.name = "Krishna";
        s2.marks = 44;

        Student s3 = new Student();
        s3.rollno = 108;
        s3.name = "Siva";
        s3.marks = 100;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
           
        for(Student s :student){
            System.out.println(s.name  +" : "  + s.marks);
        }
    }
}
