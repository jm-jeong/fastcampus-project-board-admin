package com.fastcampus.projectboardadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcampus.projectboardadmin.domain.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
