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
    public String updateJob(Long id, Job updatedJob) {

        Job job = jobRepository.findById(id).orElse(null);

        if(job == null) {
            return "Job Not Found";
        }

        job.setTitle(updatedJob.getTitle());
        job.setCompanyName(updatedJob.getCompanyName());
        job.setLocation(updatedJob.getLocation());
        job.setSalary(updatedJob.getSalary());
        job.setDescription(updatedJob.getDescription());

        jobRepository.save(job);

        return "Job Updated Successfully";
    }
    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}