public class Records {
    public static void main(String[] args) {
        Student s1 = new Student("Ankush", 23);
        System.out.println(s1);
        Student s2 = new Student("Chandan", 22);
        System.out.println(s2);
        Student s5 = new Student("Ankush", 23);

        System.out.println("s1 and s2 are equals : " + s1.equals(s2));
        System.out.println("s1 and s5 are equals : " + s1.equals(s5));
        // both classes have same functionality

        Student1 s3 = new Student1("Ankush", 23);
        System.out.println(s3);
        Student1 s4 = new Student1("Chandan", 22);
        // Student1 s6 = new Student1("", 10);
        System.out.println(s4);
        System.out.println("s3 and s4 are equals : " + s3.equals(s4));

    }
}

record Student1(String name,int age){

    // public Student1(String name, int age){  // canonical constructor 
    //     if (age == 0) {
    //         throw new IllegalArgumentException("id can not be zero");
    //     }else if (name.equals("") || name.equals(null)) {
    //         throw new IllegalArgumentException("name can not be empty or null");
    //     }
    //     this.name = name;
    //     this.age = age;
    // }

    // compact canonical constructor
    
    public Student1 {
        if (age == 0) {
            throw new IllegalArgumentException("id can not be zero");
        }else if (name.equals("") || name.equals(null)) {
            throw new IllegalArgumentException("name can not be empty or null");
        }
    }


 } // same as Student class

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}