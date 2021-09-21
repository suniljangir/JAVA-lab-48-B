class Teacher{
    void teach(){
        System.out.println("Teaching subjects");
    }
}
class Student extends Teacher {
    void listen(){
        System.out.println("Listening to the teachers");
    }
}
class Principal extends Teacher {
    void evaluate(){
        System.out.println("Head of the school");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Principal p = new Principal();
        p.evaluate();
        p.teach();
    }
}
