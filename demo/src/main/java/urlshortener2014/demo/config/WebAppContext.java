package urlshortener2014.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableEntityLinks;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableEntityLinks
@ComponentScan(basePackages = {
        "urlshortener2014.demo.web"
})
public class WebAppContext extends WebMvcConfigurerAdapter {

}
