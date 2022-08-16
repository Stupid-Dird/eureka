package com.netflix;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DefaultEurekaClientConfig;
import com.netflix.discovery.DiscoveryClient;

public class ApplicationRunner {


    public static void main(String[] args) {
        DefaultEurekaClientConfig defaultEurekaClientConfig = new DefaultEurekaClientConfig();
        DiscoveryClient discoveryClient = new DiscoveryClient((InstanceInfo) null, defaultEurekaClientConfig);
        System.out.println(discoveryClient.getStats());
    }
}
