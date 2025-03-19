// 16.Create an interface volume with member variable pi and methods readdata () and
// dispvolume (). Create two classes sphere and cylinder to implement this interface.
// Write a Java program to find the volume.

interface volume{
    void readdata();
    void dispvolume();
}

class sphere implements volume{
    float r;
    double vol;
    public void readdata(){
        r=4.3F;
    }
    public void dispvolume(){
        vol=(4/3)*3.14*r*r*r;   
        System.out.println("volume of sphere is "+vol);
    }
}

class cylinder implements volume{
    float r,h;
    double vol;
    public void readdata(){
        r=4.3F;
        h=5.0F;
}
    public void dispvolume(){
        vol=3.14*r*r*h;   
        System.out.println("volume of cylinder is "+vol);
}
}

public class ImplementInterface {
    public static void main(String[] args) {
        volume v;
        sphere s=new sphere();
        v=s;
        v.readdata();
        v.dispvolume();
        
        cylinder c=new cylinder();
        v=c;
        v.readdata();
        v.dispvolume();
        
    }
    
}
