package test;


 public interface ParentInterface{
    void parentMethod();
}
interface ChildInterface extends ParentInterface{
    void childMethod();
}
class Main implements ChildInterface{
    public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
    }
    public void childMethod(){
        System.out.println("Child Method-hello Syntax");
    }
    public static void main(String[] args) {
        ChildInterface m=new ChildInterface();
        m.parentMethod();
        m.childMethod();
    }
}

