class mygrandpa{
    void display(){
        System.out.println("My grandfather is a farmer");
    }
}
class child extends mygrandpa{
    void show(){
        System.out.println("My father is a electrician");
    }
}
class me extends child {
    void display1(){
     System.out.println("I am a student");   
    }
}
public class Main{
    public static void main (String []args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display();
    }
}
