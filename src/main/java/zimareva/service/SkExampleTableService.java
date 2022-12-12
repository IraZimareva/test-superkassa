package zimareva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zimareva.repository.SkExampleTableRepository;

@Service
public class SkExampleTableService {
    private final SkExampleTableRepository repository;

    @Autowired
    public SkExampleTableService(SkExampleTableRepository repository) {
        this.repository = repository;
    }
}
