class parent{
    void display(){
        System.out.println("This is parent class.");
    }
}
class child extends parent{
    void show(){
  System.out.println("This is a child class."); 
    }
}
public class Main{
    public static void main(String[] args){
        child obj=new child();
        obj.display();
        obj.display();
    }
}
