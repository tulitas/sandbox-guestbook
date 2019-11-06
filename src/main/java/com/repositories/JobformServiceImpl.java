package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import java.util.List;

@Service
public class JobformServiceImpl implements JobformService {
  @Autowired
  private JobformRepository jobformRepository;

  @Override
  @Transactional
  public void addJobForm(JobForm jobForm) {
    jobformRepository.save(jobForm);
    System.out.println(jobForm);


  }

  @Override
  @Transactional
  public List<JobForm> listJobForm() {
    return (List<JobForm>) jobformRepository.findAll();

  }


  @Override
  @Transactional
  public void removeJobForm(long id) {
    System.out.println("delete test 3 Jobform impl");
    jobformRepository.deleteById(id);
  }
}