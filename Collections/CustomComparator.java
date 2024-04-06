package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student(20, "Ankush"));
        studentsList.add(new Student(24, "Kunal"));
        studentsList.add(new Student(21, "Chandan"));
        studentsList.add(new Student(25, "Shivam"));
        System.out.println("Students list : " + studentsList);

        // sort the list on the basic of student age

        Comparator<Student> com = ( i, j) -> i.getAge() > j.getAge()?1:-1; // lambda Expression

        Collections.sort(studentsList, com);
        System.out.println("sorted Student list : " + studentsList);
    }
}

class Student implements Comparable<Student> {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        if (this.age < student.age) {
            return 1;
        }
        return -1;
    }
}
