create table tests
(
    test_id          bigint auto_increment
        primary key,
    patient_id       bigint       not null,
    test_template_id bigint       not null,
    status           varchar(20)  not null,
    scan_date        date         null,
    note             varchar(500) null,
    created_at       datetime     not null,
    uploaded_at      datetime     not null
);

