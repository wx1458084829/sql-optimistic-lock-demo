package com.namo.sqloptimisticlockdemo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

@SpringBootTest
class SqlOptimisticLockDemoApplicationTests {
    private static String GLOBAL_PATH = "E://CodeSrc//idea//sql-optimistic-lock-demo//";

    @Test
    void genCode() {
        FastAutoGenerator.create("jdbc:mysql://192.168.99.101:3306/optimistic-lock-demo-db",
                        "root",
                        "root")
                .globalConfig(builder -> {
                    builder.author("namo") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(GLOBAL_PATH+"src//main//java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.namo.sqloptimisticlockdemo") // 设置父包名
//                            .moduleName("src//main//java") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, GLOBAL_PATH+"src//main//resources//mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("product") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
