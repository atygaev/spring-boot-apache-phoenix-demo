package phoenix.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import phoenix.demo.domain.Sample;

public interface SampleDao extends JpaRepository<Sample, String> {
}