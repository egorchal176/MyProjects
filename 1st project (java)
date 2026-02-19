class Program{
    public static void main(String[] argc){
        Person user1 = new Person("denis", 34);
        Person user2 = new Person("egor", 20);
        Person user3 = new Person("nastya", 24);

        user1.printInfo();
        user2.printInfo();
        user3.printInfo();

        System.out.println();

        System.out.println("id (user1):");
        System.out.println(user1.getId());

        System.out.println("name (user2):");
        System.out.println(user2.getName());

        System.out.println("age (user3):");
        System.out.println(user3.getAge());
    }
}
class Person{
    private static int count = 0;
    private int id;
    private String name;
    private int age;
    
    Person(String name, int age){
        if (name.isEmpty()) {
            this.name = "name";
            System.out.println("eror: name is empty");
        } else if (name.length() < 2) {
            this.name = "name";
            System.out.println("eror: name length < 2");
        } else if (name.length() > 15) {
            this.name = "name";
            System.out.println("eror: name length > 15");
        } else {
            this.name = name;}

        if (age < 0 || age > 100){
            this.age = 0;
            System.out.println("eror: age is not correct");
        } else{
            this.age = age;}

        this.id = count;
        count++;
    }

    int getId(){return this.id;}
    int getAge(){return this.age;}
    String getName(){return this.name;}
    void printInfo(){
        System.out.printf("id: %d\nname: %s\nage: %d\n", this.id, this.name, this.age);
    }
}
