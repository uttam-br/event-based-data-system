package in.uttamrabari.data_service.repositories;

import jakarta.persistence.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

@Entity
@Table
public class SampleTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
