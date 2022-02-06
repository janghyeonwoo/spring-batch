package com.example.springbatch.config;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SampleJobConfig {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;


    @Bean
    public Job simpleJob(){
        Job job = jobBuilderFactory.get("simepleJob")
                .start(simpeStep(null))
                .build();
        return job;
    }

    @Bean
    @JobScope
    public Step simpeStep(@Value("#{jobParameters[requestDates]}") String reqDate){
        Step step = stepBuilderFactory.get("simpleStep")
                .tasklet(new TutorialTasklet(reqDate))
                .build();
        return step;
    }

}
