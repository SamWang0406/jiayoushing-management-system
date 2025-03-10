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
@Table(name = "daily_records")
@SQLRestriction("is_deleted = '0'")
public class DailyRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 工地ID
     * isOutsourcing = "0"，才會有siteId
     */
    private String siteId;

    /** 是否為外調 */
    private String isOutsourcing = "0";

    /** 外調工地
     * isOutsourcing = "1"，才會有outsourcingSite
     */
    private String outsourcingSite;

    /** 紀錄的使用者 */
    private Integer recordUserId;

    /** 紀錄的日期 */
    @Column(nullable = false)
    private LocalDate recordDate;

    @Column(nullable = false)
    private String isDeleted = "0";
}
