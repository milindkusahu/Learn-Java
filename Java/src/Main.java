import Encapsulation.Student1;

void main() {
    /*===== Default Constructor =====*/
//    Encapsulation.Student A = new Encapsulation.Student();
//    A.id = 1;
//    A.age = 14;
//    A.name = "Milind";
//    A.nos = 5;
//
//    System.out.println(A.name);
//    System.out.println(A.age);
//    System.out.println(A.id);
//    System.out.println(A.nos);
//
//    A.bunk();
//    A.study();
//    A.sleep();

    /*===== Parameterised Constructor =====*/
//    Student A = new Student(1, 18, "Rahul", 3);
//
//    System.out.println(A.name);
//    System.out.println(A.age);
//    System.out.println(A.id);
//    System.out.println(A.nos);
//
//    A.bunk();
//    A.study();
//    A.sleep();

    /*===== Copy Constructor =====*/
//    Encapsulation.Student B = new Encapsulation.Student(A);
//
//    System.out.println(B.name);
//    System.out.println(B.age);
//    System.out.println(B.id);
//    System.out.println(B.nos);
//
//    B.bunk();
//    B.study();
//    B.sleep();

    /*===== Object Life Cycle =====*/
//    Object is created -> Object Attr & Behavior is set -> Object is dead

    /*===== Encapsulation =====*/
    Student1 A = new Student1(1, 18, "Rahul", 3, "Anjali");

    System.out.println(A.name);
    System.out.println(A.age);
    System.out.println(A.id);
    System.out.println(A.nos);
    System.out.println(A.getGfName());

    A.setGfName("Manshi");

    System.out.println(A.getGfName());

    A.chatWithGf();
}
