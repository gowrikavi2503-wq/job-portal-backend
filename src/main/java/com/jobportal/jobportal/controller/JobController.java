package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.entity.Job;
import com.jobportal.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/add")
    public String addJob(@RequestBody Job job) {

        return jobService.addJob(job);
    }
    @GetMapping
    public List<Job> getAllJobs() {

        return jobService.getAllJobs();
    }
}