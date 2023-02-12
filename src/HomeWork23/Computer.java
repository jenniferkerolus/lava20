package HomeWork23;

public class Computer {
    public void version(){
        System.out.println("A computer have different version");
    }
public void storage(){
    System.out.println("A computer have a hard desk to save all data");
}
public void processor(){
    System.out.println("The processor is CPU ans very important in the hardware");
}
}
class Apple extends Computer{
    @Override
    public void version() {
        System.out.println("Mac is the version of the computer in Apple");
    }

    @Override
    public void storage() {
        System.out.println("Mac have between 256 to 1 tb hard drives");
    }

    @Override
    public void processor() {
        System.out.println("The M2 chip is the lasted Mac processor");
    }

}
class Lenovo extends Computer{
    @Override
    public void version() {
        System.out.println("Lenovo has too many version");
    }

    @Override
    public void storage() {
        System.out.println("Lenovo have between 512 to 2 tb hard drive");
    }

    @Override
    public void processor() {
        System.out.println("Lenovo have intel core between i5 to i9");
    }
}
class HP extends Computer{
    @Override
    public void version() {
        System.out.println("HP 15s is the last version ");
    }

    @Override
    public void storage() {
        System.out.println("HP have between 512 to 2 tb ");
    }

    @Override
    public void processor() {
        System.out.println("Intel i3 is the last processor in the HP new version");
    }
}
class Dell extends Computer{
    @Override
    public void version() {
        System.out.println("Dell XPS 15 is the last version ");
    }

    @Override
    public void processor() {
        System.out.println("Dell have the highest CPU ");
    }


    }