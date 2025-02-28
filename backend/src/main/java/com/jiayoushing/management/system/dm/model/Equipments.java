package com.jiayoushing.management.system.dm.model;

import org.hibernate.annotations.SQLRestriction;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "equipments")
@SQLRestriction("is_deleted = '0'")
public class Equipments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 機具的名稱 */
    @Column(nullable = false, length = 100)
    private String name;

    /** 機具的型號 */
    @Column(length = 100)
    private String model;

    /** 機具的狀態 */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.AVAILABLE;

    public enum Status {
        AVAILABLE, IN_USE, MAINTENANCE
    }

    @Column(nullable = false)
    private String isDeleted = "0";
}
