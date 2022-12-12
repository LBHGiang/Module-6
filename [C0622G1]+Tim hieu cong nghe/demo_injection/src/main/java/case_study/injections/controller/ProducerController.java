package case_study.injections.controller;

import case_study.injections.model.ProducerDto;
import case_study.injections.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("producers")
public class ProducerController {
    @Autowired
    private IProducerService producerService;

    @GetMapping
    public String getAllProducer(Model model) {
        return "producers";
    }
}
