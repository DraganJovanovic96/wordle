package com.project.wordle.config;

import com.project.wordle.mapper.UserGameMapper;
import com.project.wordle.mapper.UserMapper;
import com.project.wordle.mapper.WordMapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This configuration class sets the {@code componentModel} to {@code "spring"}, which enables MapStruct to generate
 * Spring components for mapper interfaces, and the {@code unmappedTargetPolicy} to {@code ReportingPolicy.IGNORE},
 * which instructs MapStruct to ignore any unmapped target properties.
 * It also sets the {@code mappingInheritanceStrategy} to {@code MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG},
 * which allows MapStruct to inherit mapping configurations from parent configuration classes.
 * You can add any additional configuration for MapStruct.
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 */
@Configuration
@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG
)
public class MapStructConfig {
    /**
     * This method creates a bean of userMapper, so it can be used by IoC.
     */
    @Bean
    public UserMapper userMapper() {
        return Mappers.getMapper(UserMapper.class);
    }

    /**
     * This method creates a bean of userGameMapper, so it can be used by IoC.
     */
    @Bean
    public UserGameMapper userGameMapper() {
        return Mappers.getMapper(UserGameMapper.class);
    }

    /**
     * This method creates a bean of wordMapper, so it can be used by IoC.
     */
    @Bean
    public WordMapper wordMapper() {
        return Mappers.getMapper(WordMapper.class);
    }
}
