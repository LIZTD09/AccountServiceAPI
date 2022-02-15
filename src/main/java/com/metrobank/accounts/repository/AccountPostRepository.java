package com.metrobank.accounts.repository;

import com.metrobank.accounts.entity.AccountPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountPostRepository extends JpaRepository<AccountPost, Integer> {

    AccountPost findById(int id);

}
