package org.mjd.learn.shell;

import org.mjd.learn.model.SimpleParameter;
import org.mjd.learn.repository.ParameterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Configuration
public class Shell {
    private static final Logger log = LoggerFactory.getLogger(Shell.class);

    @Bean
    public CommandLineRunner demo(ParameterRepository paramRepository) {
        return (args) -> {
            // save a few customers
            paramRepository.save(new SimpleParameter("Jack", LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC).toLocalDate()));
            paramRepository.save(new SimpleParameter("Daniel", LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC).toLocalDate()));

            // fetch all customers
            log.info("Parameters found with findAll():");
            log.info("-------------------------------");
            for (SimpleParameter param : paramRepository.findAll()) {
                log.info(param.toString());
            }
            log.info("");
        };
    }
}
