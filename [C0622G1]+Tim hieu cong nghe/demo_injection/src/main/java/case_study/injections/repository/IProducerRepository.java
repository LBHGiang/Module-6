package case_study.injections.repository;

import case_study.injections.model.Producer;
import case_study.injections.model.ProducerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProducerRepository extends JpaRepository<Producer, Integer> {
}
