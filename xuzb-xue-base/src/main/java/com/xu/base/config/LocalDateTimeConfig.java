package com.xu.base.config;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.core.JsonGenerator;
/**
 * @Author xuzb
 * @Date 2024/11/6
 * @Version 1.0
 * @Description: 只要你使用 new Date()，
 * 那么前端获取到的就是yyyy-MM-dd HH:mm:ss格式的时间字符串
 */
@Configuration
public class LocalDateTimeConfig {

    /*
     * 序列化内容
     *   Date -> String
     * 服务端返回给客户端内容
     * */
    @Bean
    public JsonSerializer<Date> dateSerializer() {
        return new JsonSerializer<Date>() {
            @Override
            public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = format.format(date);
                jsonGenerator.writeString(formattedDate);
            }
        };
    }

    // 配置
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return builder -> {
            builder.serializerByType(Date.class, dateSerializer());
        };
    }

}