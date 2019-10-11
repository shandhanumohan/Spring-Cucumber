package com.sample.test.cucumber;


import com.sample.test.AppConfig;
import io.cucumber.java.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = AppConfig.class)
@AutoConfigureMockMvc
public class CucumberContextConfig {
    @Before
    public void setup_cucumber_spring_context(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
