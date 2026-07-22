class Student {
    int rollNo;
    String Name;
    String dept;
    String section;
    int year;
    Student(int rollNO,String Name,String dept,String section,int year){
        this.rollNo=rollNO;
        this.Name=Name;
        this.dept=dept;
        this.section=section;
        this.year=year;
    }
    void display(){
        System.out.println("rollNo:"+rollNo);
       System.out.println("Name:"+Name);
       System.out.println("dept:"+dept);
       System.out.println("section:"+section);
       System.out.println("year:"+year);
       System.out.println();
    }   
    }
    public class Main{
        public static void main(String[]args){
            Student []Students=new Student[3];
            Student s1=new Student(101,"Ajay","CSE","A",2);
            Students [0]=s1;
            Student s2=new Student(102,"Abi","ECE","B",3);
            Students [1]=s2;
            Student s3=new Student(103,"Arun","EEE","C",4);
            Students [2]=s3;
            for(int i=0;i<Students.length;i++){
                Students[i].display();
            }
        }
            
        }
    
