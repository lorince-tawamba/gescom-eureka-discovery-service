// Package
package tech.satic.gescom.eurekadiscoveryservice;

// Librairie
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

/**
 * Classe principale de lancement de l'application.
 * @version     1.0.0
 * @since       26/12/2021
 * @author      TAWAMBA KOUAKAM Lorince S.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    /**
     * Methode principale de lancement de l'application.
     * @param       args tableau des arguments fournis sur la ligne de commande.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Methode d'exécution des traitements du microservice.
     * @return       CommandLineRunner : traitement à exécuter.
     * @author      TAWAMBA KOUAKAM Lorince S.
     */
    @Bean
    CommandLineRunner start() {
        return args -> {
            System.out.println("==== GESCOM EUREKA DISCOVERY SERVICE ====");
        };
    }

}
