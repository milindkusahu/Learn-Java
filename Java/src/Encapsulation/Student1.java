package Encapsulation;

public class Student1 {
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public String getGfName() {
        return this.gf;
    }

    public void setGfName(String newName) {
        this.gf = newName;
    }

    public Student1(int id, int age, String name, int nos, String gf) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    private void gfChatting() {
        System.out.println(name + " gfChatting");
    }

    public void chatWithGf() {
        gfChatting();
    }
}
