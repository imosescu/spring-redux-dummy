package app.db.repository;

import app.db.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {
    Dummy getByDummyIdEquals(int id);
}
