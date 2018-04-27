package ch.tie.springboottemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.zaxxer.hikari.HikariDataSource;

import ch.tie.spring.AppContext;
import ch.tie.spring.SpringConfiguration;

@SpringBootApplication
@Import({SpringConfiguration.class})
public class TemplateApplication implements ApplicationContextAware {

  public static void main(String[] args) {
    SpringApplication.run(TemplateApplication.class, args);
  }

  @Override
  public void setApplicationContext(ApplicationContext ctx) {
    AppContext.setApplicationContext(ctx);
  }

  @Bean(name = "apiUserDs")
  public HikariDataSource userDataSource(DataSourceProperties properties) {
    return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
  }

  @Bean(name = "apiSchemaDs")
  public HikariDataSource schemaDataSource(DataSourceProperties properties) {
    return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
  }
}
