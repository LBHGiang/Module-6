package case_study.injections.service;

import case_study.injections.model.ProducerDto;
import case_study.injections.repository.IProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements IProducerService {

    @Autowired
    private IProducerRepository producerRepository;
}
