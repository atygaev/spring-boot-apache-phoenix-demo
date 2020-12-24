package phoenix.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import phoenix.demo.dao.SampleDao;
import phoenix.demo.domain.Sample;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SampleServiceImpl implements SampleService {

    private final SampleDao dao;

    @Override
    public void save(Sample sample) {
        dao.save(sample);
    }

    @Override
    public List<Sample> findAll() {
        return dao.findAll();
    }
}