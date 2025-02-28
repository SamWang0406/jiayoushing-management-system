package com.jiayoushing.management.system.dm.model;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false)
    private Sites siteId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Materials materialId;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipments equipment;

    private Integer quantity;

    @Column(nullable = false)
    private LocalDate recordDate;

    @Column(nullable = false)
    private String isDeleted = "0";
}
