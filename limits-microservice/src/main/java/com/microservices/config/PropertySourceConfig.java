package main.java.com.microservices.config;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties("limits-service")
public class PropertySourceConfig {
    private int minimum;
    private int maximum;
    public void setMinimum(int min){
        this.minimum = min;
    }
    public void setMaximum(int max){
        this.maximum = max;
    }
    public int getMinimum(){
        return this.minimum;
    }
    public int getMaximum(){
        return this.maximum;
    }
    
}
