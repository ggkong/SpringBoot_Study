package me.share.spring_boot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//springBoot 在启动前 会 自动注入数据源 以及spring data jpa 要在启动前将其 忽略
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringBoot1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
