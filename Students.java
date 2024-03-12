public class Students {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollNumber = 1;
        s1.name = "Ankush";
        s1.marks = 80;

        s2.rollNumber = 2;
        s2.name = "Chandan";
        s2.marks = 85;

        s3.rollNumber = 3;
        s3.name = "Gagan";
        s3.marks = 90;

        Student students [] = new Student[3];
        students[0] =s1;
        students[1] =s2;
        students[2] =s3;

        // for(int i =0;i<students.length;i++)
        // {
        //     System.out.println("Name : "+students[i].name);
        //     System.out.println("Roll Number : "+students[i].rollNumber);
        //     System.out.println("Marks : "+students[i].marks);
        // }

        for (Student s : students) {
            System.out.println("Name : "+s.name);
            System.out.println("Roll Number : "+s.rollNumber);
            System.out.println("Marks : "+s.marks);
        }
    }
}

class Student{
    int rollNumber;
    String name;
    int marks;
}
