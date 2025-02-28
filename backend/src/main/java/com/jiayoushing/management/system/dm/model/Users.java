package com.jiayoushing.management.system.dm.model;

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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
@SQLRestriction("is_deleted = '0'")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 使用者的名稱 */
    @Column(nullable = false)
    private String name;

    /** 使用者的信箱 */
    @Column(nullable = false, unique = true)
    private String email;

    /** 使用者的密碼 */
    @Column(nullable = false)
    private String password;

    /** 使用者的電話 */
    private String phone;

    /** 使用者的角色 */
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(nullable = false)
    private String isDeleted = "0";
}
