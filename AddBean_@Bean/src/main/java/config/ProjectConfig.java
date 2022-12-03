package config;
import main.Guitar;
import main.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Guitar guitar() {
        Guitar g = new Guitar();
        g.setName("Gibson Les Paul");
        return g;
    }

    @Bean
    public Player player() {
        Player p = new Player();
        p.setName("Slash");
        //use direct wiring
        p.setGuitar(guitar()); //creates bean if not already in context or just returns it if it is
        return p;
    }
}

