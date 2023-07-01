package com.project.wordle.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * This configuration classes is related to Scheduling tasks.
 * <p>
 * This enables detection of @Scheduled annotations on any Spring-managed bean in the container.
 * For example, given a class YearlyVacationDaysServiceImpl:
 *
 * @author Dragan Jovanovic
 * @version 1.0
 * @since 1.0
 **/
@Configuration
@EnableScheduling
public class ScheduledConfig {
}
