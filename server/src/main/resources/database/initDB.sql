CREATE TABLE IF NOT EXISTS exchange.exchange
(
    id    BIGSERIAL PRIMARY KEY ,
    exchange_from  VARCHAR(200) NOT NULL ,
    exchange_to VARCHAR(254) NOT NULL ,
    exchange_rate int8  NOT NULL
);