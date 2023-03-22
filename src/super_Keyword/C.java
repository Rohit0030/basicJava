package super_Keyword;

public class C { // SuperClass ( Parent Class)
    int i=10;
}
 class D extends C { // current class (subClass or Child class)
    int i=20;
    void show(int i)
    {
        System.out.println(super.i);//Super keyword is a reference variable that refer to the immediate Parent class object
    }
    public static void main(String[] args) {
        D obj= new D();
        obj.show(30);
    }
}
