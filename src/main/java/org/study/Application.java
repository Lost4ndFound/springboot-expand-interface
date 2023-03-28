package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.study.config.MyApplicationContextInitializer;

/**
 * @author: lsw
 * @date: 2023/3/27 11:57
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.addInitializers(new MyApplicationContextInitializer());
        springApplication.run(args);
    }

}
