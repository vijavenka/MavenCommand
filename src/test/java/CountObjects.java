class Students{
    String name;
    int age;
    static int countObject=0;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        countObject++;
    }
}

public class CountObjects {
    public static void main(String[] args){
        Students student1 = new Students("Vijay", 32);
        Students student4 = new Students("Shan", 19);
        Students student5 = new Students("Varun Dhawan", 49);
        Students student6 = new Students("Vanitha Nagaraj", 23);

        System.out.println("Total count of Objects " + Students.countObject);
    }
}
