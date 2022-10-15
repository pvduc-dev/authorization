package pvduc.dev.authorization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/WEB-INF/view/build/static/");
        registry.addResourceHandler("/*.js")
                .addResourceLocations("/WEB-INF/view/build/");
        registry.addResourceHandler("/*.json")
                .addResourceLocations("/WEB-INF/view/build/");
        registry.addResourceHandler("/*.ico")
                .addResourceLocations("/WEB-INF/view/build/");
        registry.addResourceHandler("/index.html")
                .addResourceLocations("/WEB-INF/view/build/index.html");
    }
}
