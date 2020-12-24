package phoenix.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import phoenix.demo.domain.Sample;
import phoenix.demo.service.SampleService;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class SampleApi {

    private final SampleService service;

    @GetMapping("/hello")
    public String hello() {
        service.save(Sample.builder()
                .id("prog-" + System.currentTimeMillis())
                .ldt(LocalDateTime.now())
                .sdt(new Date())
                .build());

        return UUID.randomUUID().toString();
    }

    @GetMapping("/list")
    public List<Sample> list() {
        return service.findAll();
    }
}