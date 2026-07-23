class mydady{
    void Kaviya(){
        System.out.println("My father is a electrician");
    }
}
class mybrother extends mydady{
    void show(){
        System.out.println("My brother is a rider");
    }
}
class me extends mybrother{
    void Kaviya1(){
     System.out.println("I am a student");   
    }
}
public class Inheritance{
    public static void main (String []args){
        me obj=new me();
        obj.Kaviya();
        mybrother bro= new mybrother();
        bro .show();
        obj.Kaviya1();
    }
}
