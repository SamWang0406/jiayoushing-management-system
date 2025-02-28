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

@Entity
@Table(name = "sites")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SQLRestriction("is_deleted = '0'")
public class Sites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 工地的名稱 */
    @Column(nullable = false)
    private String name;

    /** 工地的開始時間 */
    private LocalDate startDate;

    /** 工地的結束時間 */
    private LocalDate endDate;

    @Column(nullable = false)
    private String isDeleted = "0";
}