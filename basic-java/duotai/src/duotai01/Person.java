package duotai01;

public class Person {
    private String name;
    private String passWord;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }
    public void show(){
        System.out.println(name+","+passWord);
    }
}
