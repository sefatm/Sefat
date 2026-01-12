
package oop.encapsulation;


public class Student {
    private int id;

    public Student(int id, String name, int age, int season, String ins) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.season = season;
        this.ins = ins;
    }
    private String name;
    private int age;
    private int season;
    private String ins;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", season=" + season + ", ins=" + ins + '}';
    }
    
    
    
}
