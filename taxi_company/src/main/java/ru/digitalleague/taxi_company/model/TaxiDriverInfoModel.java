package ru.digitalleague.taxi_company.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class TaxiDriverInfoModel {

    private Long driverId;

    /**
     * Фамилия.
     */
    private String lastName;

    /**
     * Имя.
     */
    private String firstName;

    /**
     * Уровень.
     */
    private int level;

    /**
     * Модель авто (должна быть ENUM).
     */
    private String carModel;

    /**
     * Дата создания.
     */
    private OffsetDateTime createDttm;

    private Long cityId;

    private boolean activeStatus;

    private int numberTips;

    private double rating;

}
