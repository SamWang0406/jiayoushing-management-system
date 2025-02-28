package com.jiayoushing.management.system.dm.model;

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
@Table(name = "daily_record_materials")
@SQLRestriction("is_deleted = '0'")
public class DailyRecordMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 每日紀錄ID */
    private Integer dailyRecordId;

    /** 材料ID */
    private Integer materialId;

    /** 材料的數量 */
    private Integer quantity;

    @Column(nullable = false)
    private String isDeleted = "0";
}
