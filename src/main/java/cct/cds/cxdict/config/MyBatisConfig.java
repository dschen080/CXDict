package cct.cds.cxdict.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("cct.cds.cxdict.mbg.mapper")
public class MyBatisConfig {
}
