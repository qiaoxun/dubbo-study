package com.qiao.service;

import com.qiao.domain.InstanceStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StubInstanceStatsService implements InstanceStatsService {
    private ThreadLocal<List<InstanceStats>> listThreadLocal = new ThreadLocal<>();

    private InstanceStatsService instanceStatsService;

    public StubInstanceStatsService(InstanceStatsService instanceStatsService) {
        this.instanceStatsService = instanceStatsService;
    }

    public List<InstanceStats> listAllStatus() {
        System.out.println("==== stub ====");
        List<InstanceStats> cache = listThreadLocal.get();
        if (null != cache && cache.size() > 0) {
            return cache;
        }
        return instanceStatsService.listAllStatus();
    }
}
