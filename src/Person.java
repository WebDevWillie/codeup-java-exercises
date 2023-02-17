
public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName(){
//TODO: return the person's name
     return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person ("will");
        person1.setName("Bill");
        person1.sayHello();
    }

}
