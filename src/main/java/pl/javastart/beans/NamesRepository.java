package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.javastart.config.DatabaseDatasource;

import java.util.Arrays;
import java.util.List;

@Component
public class NamesRepository {


    private DatabaseDatasource ds;

    @Bean
    @Profile("default")
    public DatabaseDatasource getDefaultDatasource() {
        return (() -> Arrays.asList("KasiaDefault", "BartekDefault"));
    }

    @Autowired
    public NamesRepository(DatabaseDatasource ds) {
        this.ds = ds;
    }

    public List <String> getAll() {
        return ds.getDatabase();
    }
}
