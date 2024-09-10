CREATE SCHEMA IF NOT EXISTS car_rest_service;

CREATE TABLE IF NOT EXISTS car_rest_service.makes
(
    make_id BIGSERIAL PRIMARY KEY,
    name    VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS car_rest_service.models
(
    model_id BIGSERIAL PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    make_id  BIGINT      NOT NULL,
    FOREIGN KEY (make_id) REFERENCES car_rest_service.makes (make_id)
);

CREATE TABLE IF NOT EXISTS car_rest_service.categories
(
    category_id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS car_rest_service.cars
(
    car_id    BIGSERIAL PRIMARY KEY,
    car_year  BIGINT NOT NULL,
    model_id  BIGSERIAL NOT NULL,
    FOREIGN KEY (model_id) REFERENCES car_rest_service.models (model_id)
);

CREATE TABLE IF NOT EXISTS car_rest_service.cars_categories
(
    car_id      BIGINT NOT NULL,
    category_id BIGINT NOT NULL,
    PRIMARY KEY (car_id, category_id),
    FOREIGN KEY (car_id) REFERENCES car_rest_service.cars (car_id),
    FOREIGN KEY (category_id) REFERENCES car_rest_service.categories (category_id)
);
