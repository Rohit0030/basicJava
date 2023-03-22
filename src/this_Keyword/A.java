package this_Keyword;

public class A { // SuperClass ( Parent Class)
    int i=10;
}
class B extends A{ // current class (subClass or Child class)
    int i=20;
    void show(int i)
    {
        System.out.println(this.i);//this keyword is reference variable that refer to the current class object
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.show(30);
    }
}

