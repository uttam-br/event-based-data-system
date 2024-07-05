package in.uttamrabari.data_service;

import in.uttamrabari.data_service.repositories.SampleTable;
import in.uttamrabari.data_service.repositories.SampleTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DataServiceApplication implements CommandLineRunner {

	@Autowired
	SampleTableRepository sampleTableRepository;

	public static void main(String[] args) {
		SpringApplication.run(DataServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// add records
		Optional<SampleTable> findById = sampleTableRepository.findById(1L);
		if (findById.isPresent()) {
			SampleTable sampleTable = findById.get();
			sampleTable.setName("A-Update");
			sampleTableRepository.save(sampleTable);
		}

		findById = sampleTableRepository.findById(1L);
		if (findById.isPresent()) {
			SampleTable sampleTable = findById.get();
			System.out.println(sampleTable.getName());
		}
	}

}
