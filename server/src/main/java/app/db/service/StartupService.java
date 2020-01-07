package app.db.service;

import app.db.entity.Dummy;
import app.db.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartupService {

    private DummyRepository dummyRepository;

    @Autowired
    public StartupService(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public void addNewLine(Dummy obj) {
        dummyRepository.save(obj);
    }

    public Dummy getLine(int id) {
        return dummyRepository.getByDummyIdEquals(id);
    }
}
