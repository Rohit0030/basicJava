package class_and_object;

public class ClassObject {
    String name;
    int page;
    String writerName;
                                                        //(int a) is a parameter
    public void read(int a){
        System.out.println("this is read function "+a);
    }
    public void write(){
        System.out.println("this is write function");
    }

    public static void main(String[] args) {
        ClassObject object=new ClassObject();
        object.read(33);                            // (a: 33) is a parameter declared
        object.write();
    }

    }

