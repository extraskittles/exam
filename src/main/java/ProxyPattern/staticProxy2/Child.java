package ProxyPattern.staticProxy2;

public class Child {
    private String name;
    public Child(){
    }
    public Child(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+"吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
