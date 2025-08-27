create table expected_ranges
(
    range_id     bigint auto_increment
        primary key,
    expected_min double       not null,
    expected_max double       not null,
    `condition`  varchar(255) null
);


create table patients
(
    patient_id    bigint auto_increment
        primary key,
    first_name    varchar(30)  not null,
    last_name     varchar(50)  not null,
    birth_date    date         not null,
    gender        varchar(10)  not null,
    national_code bigint       not null,
    image_path    varchar(255) null,
    phone_number  varchar(15)  null,
    created_at    datetime     not null
);

create table appointments
(
    appointment_id bigint auto_increment
        primary key,
    patient_id     bigint                       not null,
    doctor_id      bigint                       not null,
    date           datetime                     not null,
    status         varchar(20)                  not null,
    note           varchar(255) charset utf8mb3 null,
    uploaded_at    datetime                     not null,
    created_at     datetime                     not null,
    constraint appointments_patients_patient_id_fk
        foreign key (patient_id) references patients (patient_id)
);

create table permissions
(
    permission_id   int auto_increment
        primary key,
    permission_name varchar(20) not null
);

create table roles
(
    role_id   int auto_increment
        primary key,
    role_name varchar(20) not null
);

create table role_permissions
(
    role_id       int not null,
    permission_id int not null,
    primary key (role_id, permission_id),
    constraint role_permissions_permissions_permission_id_fk
        foreign key (permission_id) references permissions (permission_id),
    constraint role_permissions_roles_role_id_fk
        foreign key (role_id) references roles (role_id)
);

create table test_templates
(
    test_template_id bigint auto_increment
        primary key,
    name             varchar(50)                  not null,
    description      varchar(555) charset utf8mb3 null,
    radiotracer      varchar(50)                  not null,
    protocol         varchar(555)                 null
);

create table test_parameters
(
    test_parameter_id bigint auto_increment
        primary key,
    template_id       bigint      not null,
    name              varchar(20) not null,
    unit              varchar(50) not null,
    expected_range_id bigint      null,
    required          tinyint(1)  not null,
    constraint test_parameters_expected_ranges_range_id_fk
        foreign key (expected_range_id) references expected_ranges (range_id),
    constraint test_parameters_test_templates_test_template_id_fk
        foreign key (template_id) references test_templates (test_template_id)
);

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
    uploaded_at      datetime     not null,
    constraint tests_patients_patient_id_fk
        foreign key (patient_id) references patients (patient_id),
    constraint tests_test_templates_test_template_id_fk
        foreign key (test_template_id) references test_templates (test_template_id)
);

create table test_files
(
    test_file_id bigint auto_increment
        primary key,
    test_id      bigint       not null,
    file_path    varchar(255) not null,
    file_type    varchar(10)  not null,
    uploaded_at  datetime     not null,
    constraint test_files_tests_test_id_fk
        foreign key (test_id) references tests (test_id)
);

create table test_values
(
    test_value_id     bigint auto_increment
        primary key,
    test_id           bigint not null,
    test_parameter_id bigint not null,
    value             double not null,
    constraint test_values_test_parameters_test_parameter_id_fk
        foreign key (test_parameter_id) references test_parameters (test_parameter_id),
    constraint test_values_tests_test_id_fk
        foreign key (test_id) references tests (test_id)
);

create table users
(
    user_id      bigint auto_increment
        primary key,
    user_name    varchar(50)  not null,
    password     varchar(20)  not null,
    first_name   varchar(20)  not null,
    last_name    varchar(30)  not null,
    image_path   varchar(255) null,
    phone_number varchar(15)  null,
    enabled      tinyint(1)   not null,
    created_at   datetime     not null
);

create table password_reset_tokens
(
    id         bigint auto_increment
        primary key,
    user_id    bigint       not null,
    token      varchar(255) not null,
    expires_at timestamp    not null,
    used       tinyint(1)   not null,
    created_at timestamp    not null,
    constraint password_reset_tokens_users_user_id_fk
        foreign key (user_id) references users (user_id)
);

create table reports
(
    report_id        bigint auto_increment
        primary key,
    test_id          bigint       not null,
    report_file_path varchar(255) not null,
    doctor_id        bigint       not null,
    created_at       datetime     not null,
    constraint reports_tests_test_id_fk
        foreign key (test_id) references tests (test_id),
    constraint reports_users_user_id_fk
        foreign key (doctor_id) references users (user_id)
);

create table user_roles
(
    user_id bigint not null,
    role_id int    not null,
    primary key (user_id, role_id),
    constraint user_roles_roles_role_id_fk
        foreign key (role_id) references roles (role_id),
    constraint user_roles_users_user_id_fk
        foreign key (user_id) references users (user_id)
);

