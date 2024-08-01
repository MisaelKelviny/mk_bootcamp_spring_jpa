package me.dio.academia.academia_digital.infra;

import com.fasterxml.jackson.databind.SerializationFeature;
import me.dio.academia.academia_digital.infra.deserializer.LocalDateDeserializer;
import me.dio.academia.academia_digital.infra.deserializer.LocalDateTimeDeserializer;
import me.dio.academia.academia_digital.infra.serializer.LocalDateSerializer;
import me.dio.academia.academia_digital.infra.serializer.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {
    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerializer())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer())
                .deserializerByType(LocalDate.class, new LocalDateDeserializer())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer());
    }
}