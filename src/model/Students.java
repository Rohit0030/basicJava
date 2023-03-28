package model;

public class Students {

    String name;
    int age;
    String Section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public Students(String name, int age, String section) {
        this.name = name;
        this.age = age;
        Section = section;
    }

}
