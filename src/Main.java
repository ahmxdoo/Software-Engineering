import java.util.Date;

public class Main {
    public static void main (String[] args ){
        Student student1 = new Student();
        Student student2 = new Student("Alif", "Borg", 1082L, 50.0, new Date(2000,3,2));
        Student student3 = new Student("Yus", "Wurzel", 1083L, 51.9, new Date(2000,4,11));
        Student student4 = new Student("Mako", "Mut", 1084L, 54.4, new Date(2000,11, 22));
        Student student5 = new Student("Elayyo", "Patron", 1085L, 66.7, new Date(1999,9,9));
        Student student6 = new Student("Skinny", "Tj", 1086L, 25.0, new Date(2002, 4, 5));
        Student student7 = new Student("Max", "And", 1087L, 90.9, new Date(1998, 12, 10));
        Student student8 = new Student("Sunny", "Wingman", 1088L, 5.8, new Date( 2012, 2, 8));
        Student student9 = new Student("Benji", "Topg", 1089L, 8.3, new Date(2012, 4, 8));
        Student student10 = new Student("Ahmad", "Dao", 1090L, 88.0, new Date(1999, 11, 8));
    }
}