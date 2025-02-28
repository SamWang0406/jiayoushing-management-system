package com.jiayoushing.management.system.dm.model;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "daily_record_users")
@SQLRestriction("is_deleted = '0'")
public class DailyRecordUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 每日紀錄ID */
    private Integer dailyRecordId;

    /** 用戶ID */
    private Integer userId;

    @Column(nullable = false)
    private LocalDate recordDate;

    @Column(nullable = false)
    private String isDeleted = "0";
}
