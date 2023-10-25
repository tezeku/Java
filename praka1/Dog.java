public class Dog{
    private String name;
    private int age;

    public Dog(String _name, int _age) {
        name = _name;
        age = _age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String _name){
        name = _name;
    }

    public void setAge(int _age){
         age = _age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo(){
        return name+", age "+age;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}

