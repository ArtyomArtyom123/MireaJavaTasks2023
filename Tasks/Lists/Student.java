public class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age =age;
    }
    @Override
    public String toString(){
        return String.format("Name: %10s, Age: %d",
                name, age);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge(){return age;}
}
