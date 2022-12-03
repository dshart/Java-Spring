package main;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Player player = context.getBean(Player.class);
        Guitar guitar = context.getBean(Guitar.class);

        System.out.println("Guitar player's name: " + player.getName());
        System.out.println("Guitar name is: " + guitar.getName());
        System.out.println("Players' guitar is a: " + player.getGuitar());
    }
}
