package phoenix.demo.service;

import phoenix.demo.domain.Sample;

import java.util.List;

public interface SampleService {

    void save(Sample sample);

    List<Sample> findAll();
}