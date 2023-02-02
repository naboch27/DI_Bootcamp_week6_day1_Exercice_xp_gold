/**
 * Student
 */
public class Student {

 private String nom; 
private int age ;
private String cours ;
private char grade ;


    public Student() {
    }

    public Student(String nomStu, int ageStud) {
        nom = nomStu;
        age = ageStud;
        this.setCours(cours);
        this.setGrade(grade);;
    }

    public Student(String nom, int age, String cours, char grade) {
        this.nom = nom;
        this.age = age;
        this.cours = cours;
        this.grade = grade;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCours() {
        return this.cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public char getGrade() {
        return this.grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Student nom(String nom) {
        setNom(nom);
        return this;
    }

    public Student age(int age) {
        setAge(age);
        return this;
    }

    public Student cours(String cours) {
        setCours(cours);
        return this;
    }

    public Student grade(char grade) {
        setGrade(grade);
        return this;
    }

   
   

   
    public String displayStudentInf() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", age='" + getAge() + "'" +
            ", cours='" + getCours() + "'" +
            ", grade='" + getGrade() + "'" +
            "}";
    }


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setNom("mouhamed");
        student1.setAge(20);
        student1.setCours("Francais");
        student1.setGrade('A');

        Student student2 = new Student("mouhamed",20);
        student2.setCours("Francais");
        student2.setGrade('A');

        Student student3 = new Student("mouhamed",20,"Francais",'A');

        System.out.println("Information Student : "+student1.displayStudentInf());

        System.out.println("Information Student : "+student2.displayStudentInf());

        System.out.println("Information Student : "+student3.displayStudentInf());





        
    }

}