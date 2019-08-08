package com.qiao.service;

import com.qiao.domain.InstanceStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {
    @Autowired
    private InstanceStatsService instanceStatsService;

    public void listAllStats() {
        System.out.println("instanceStatsService " + instanceStatsService);
        List<InstanceStats> instanceStatsList = instanceStatsService.listAllStatus();
        for (InstanceStats stats : instanceStatsList) {
            System.out.println(stats.getId());
        }
    }
}
