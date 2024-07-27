package edu.hubu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @auther sakura
 * @create 2024-07-27 17:54
 */
@SpringBootApplication
@MapperScan("edu.hubu.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class Main8001
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main8001.class,args);
    }
}

 