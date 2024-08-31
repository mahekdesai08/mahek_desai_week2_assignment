package Xenosis_Internship.Assignment2.Q1;

public class person {
     private String name;
    private int age;
    private String profession;
    person(String name,int age,String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public void diplaydetails(){
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
        System.out.println("Profession : "+profession);

    }

    public static void main(String[] args) {
        person p = new person("Mahek Desai",21,"Software Engineer");
        p.diplaydetails();
    }
}
