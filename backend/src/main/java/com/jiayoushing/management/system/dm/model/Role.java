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

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SQLRestriction("is_deleted = '0'")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 角色的名稱 */
    @Column(nullable = false, unique = true)
    private String roleName;

    @Column(nullable = false)
    private String isDeleted = "0";
}
