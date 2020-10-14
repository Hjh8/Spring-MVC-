package entity;

public class ParamObj {
    private String name;
    private int age;

    public ParamObj(){
        System.out.println("执行了ParamObj的构造函数");
    }

    public void setName(String name) {
        System.out.println("执行了setName方法");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("执行了setAge方法");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
