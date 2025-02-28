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
@Table(name = "materials")
@NoArgsConstructor
@AllArgsConstructor
@SQLRestriction("is_deleted = '0'")
public class Materials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 材料名稱 */
    @Column(nullable = false)
    private String name;

    /** 材料的單位 */
    @Column(nullable = false)
    private String unit;

    /** 材料的庫存 */
    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private String isDeleted = "0";
}
