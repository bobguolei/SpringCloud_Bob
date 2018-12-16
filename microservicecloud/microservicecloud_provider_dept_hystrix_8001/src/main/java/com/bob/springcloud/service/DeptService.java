package com.bob.springcloud.service;

import com.bob.springcloud.entities.Dept;
import java.util.List;

public interface DeptService {
  public boolean add(Dept dept);

  public Dept get(Long id);

  public List<Dept> list();
}
