package com.example.bankproject.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Setter
    @Getter
    @Entity
    @Table(name = "product")
    @AllArgsConstructor
    @NoArgsConstructor

    public class Product {
        /**
         * id varchat (40),
         * manager id INT MOT NULL,
         * status INT NOT NULL,
         * currency_code INT NOT NULL,
         * interest_rate INT NOT NULL,
         * limit INT NOT NULL,
         * created_at TIMESTAMP NOT NULL,
         * update_at TIMESTANP NOT NULL
         */

        @Id
        @Column(name="id")
        private  int id;

        @Column(name ="manager_id")//Foreigen key - уточнить
        private int managerID;

        @Column(name = "status")
        private int status;

        @Column(name = "currency_code")
        private int currencyCode;

        @Column(name = "interest_rate")
        private int interestRate;

        @Column(name = "limit")
        private int limit;

        @Column(name="created_at")
        private int createdAt;

        @Column(name ="update_at")
        private int updateAt;

}
