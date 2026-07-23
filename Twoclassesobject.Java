class Student {
    int rollNo;
     String name;
     String dept;
     String section;
      int year;

    Student(int rollNo, String name, String dept, String section, int year) {
          this.rollNo = rollNo;
           this.name = name;
            this.dept = dept;
            this.section = section;
             this.year = year;
    }
}

class Marks {
    int tamil, english, maths, science, social;

    Marks(int tamil, int english, int maths, int science, int social) {
          this.tamil = tamil;
           this.english = english;
          this.maths = maths;
            this.science = science;
            this.social = social;
    }

    int total() {
        return tamil + english + maths + science + social;
    }

    double average() {
        return total() / 5.0;
    }
}

public class Main{
    public static void main(String[] args) {

         Student[] students = new Student[2];
          Marks[] marks = new Marks[2];
          students[0] = new Student(101, "Arun", "ECE", "A", 2);
            marks[0] = new Marks(85, 90, 95, 88, 92);
          students[1] = new Student(102, "Kaviya", "EEE", "B", 3);
          marks[1] = new Marks(95, 80, 85, 77, 79);
            for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No : " + students[i].rollNo);
             System.out.println("Name : " + students[i].name);
              System.out.println("Dept : " + students[i].dept);
               System.out.println("Section : " + students[i].section);
             System.out.println("Year : " + students[i].year);
              System.out.println("Tamil : " + marks[i].tamil);
               System.out.println("English : " + marks[i].english);
                System.out.println("Maths : " + marks[i].maths);
                 System.out.println("Science : " + marks[i].science);
                 System.out.println("Social : " + marks[i].social);
               System.out.println("Total : " + marks[i].total());
                System.out.println("Average : " + marks[i].average());
                 System.out.println();
        }
    }
}
