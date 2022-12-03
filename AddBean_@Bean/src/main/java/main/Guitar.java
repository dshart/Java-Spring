package main;

public class Guitar {
    private String name;

    public Guitar() {
        System.out.println("Guitar created");
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guitar : " + name;
    }
}
