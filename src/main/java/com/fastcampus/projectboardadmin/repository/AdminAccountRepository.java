package com.fastcampus.projectboardadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcampus.projectboardadmin.domain.AdminAccount;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
