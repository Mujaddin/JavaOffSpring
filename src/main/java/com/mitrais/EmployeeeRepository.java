package com.mitrais;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource(exported=true)
public interface EmployeeeRepository 
extends PagingAndSortingRepository<Karyawan, Long> 
{
public List<Karyawan> findByLastName(@Param("lastName") String lastName);

}