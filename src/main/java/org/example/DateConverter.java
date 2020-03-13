package org.example;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class DateConverter implements FactoryBean<Date> {

    @Value("${date}")
    private String date;
    @Override
    public Date getObject() throws Exception {
        String d[] = date.split("\\|");
        String format = d[1].trim();
        String date = d[0].trim();
        return new SimpleDateFormat(format).parse(date);
    }

    @Override
    public Class<?> getObjectType() {
        return Date.class;
    }
}
