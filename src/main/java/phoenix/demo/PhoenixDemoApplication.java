package phoenix.demo;

import de.invesdwin.instrument.DynamicInstrumentationLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.TimeZone;

@SpringBootApplication
@ImportResource(locations = "classpath:/META-INF/ctx.spring.weaving.xml")
public class PhoenixDemoApplication {
    public static void main(String[] args) {
//        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));

        DynamicInstrumentationLoader.waitForInitialized();
        DynamicInstrumentationLoader.initLoadTimeWeavingContext();
        SpringApplication.run(PhoenixDemoApplication.class, args);
    }
}