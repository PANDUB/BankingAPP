package com.main.app.config;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Bean
    public DynamoDBMapper dynamoDBMapper()
    {
        AmazonDynamoDB ddbClient = AmazonDynamoDBClientBuilder.standard().
                withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration
                        ("dynamodb.eu-west-2.amazonaws.com","eu-west-2"))
                .withCredentials(new AWSStaticCredentialsProvider
                        (new BasicAWSCredentials("AKIAWSDQI6DYRQQER75G", "xCXn5/yHSbfVJ6y/YMOzm3U8L5h5m/af4zZ+Jutn")))

                .build();
        return new DynamoDBMapper(ddbClient);
    }
}
