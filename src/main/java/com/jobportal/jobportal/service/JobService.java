package com.jobportal.jobportal.service;

import com.jobportal.jobportal.entity.Job;
import com.jobportal.jobportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public String addJob(Job job) {

        jobRepository.save(job);

        return "Job Added Successfully";
    }
    public List<Job> getAllJobs() {

        return jobRepository.findAll();
    }
}