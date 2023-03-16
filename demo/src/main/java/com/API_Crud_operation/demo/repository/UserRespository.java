package com.API_Crud_operation.demo.repository;

import com.API_Crud_operation.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author - nitin created on 16 Mar,2023 6:05 pm
 */
public interface UserRespository extends JpaRepository<User, Long> {

}
