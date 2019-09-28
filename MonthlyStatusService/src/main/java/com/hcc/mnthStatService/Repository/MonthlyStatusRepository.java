package com.hcc.mnthStatService.Repository;

import org.springframework.data.repository.CrudRepository;

import com.hcc.mnthStatService.Model.MonthStatus;

public interface MonthlyStatusRepository extends CrudRepository<MonthStatus, Long> {

}
