public class Programmer {
    private String name ;
    private int age ;
    private int id ;

    public Programmer(String name, int age, int id) {
        this.name = name;
        this.age = age;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public   void metage ()       {          }

    public   void  metage ( int age )       {
        System.out.println(age +" лет " + getName());
                 }


    @Override
    public String toString() {
        return "Programmer { " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
