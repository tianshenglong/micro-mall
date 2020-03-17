package com.mall.user.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Description  DateConfig</p>
 *
 * @author tianshenglong
 * @date 2020/3/16 23:38
 * @return
 */
@Configuration
@Slf4j
public class DateConfig{
    @Bean
    public Converter<String, Date> addNewConvert() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = null;
                try {
                    date = sdf.parse((String) source);
                } catch (ParseException e) {
                    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    try {
                        date = sdf2.parse(source);
                    } catch (ParseException e1) {
                        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            date = sdf3.parse(source);
                        } catch (ParseException e2) {
                            log.error("日期格式转换出错 ", e);
                        }
                    }
                }
                return date;
            }
        };
    }

}
