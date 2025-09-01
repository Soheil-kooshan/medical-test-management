alter table appointments
    change uploaded_at updated_at datetime not null;

alter table appointments
    add constraint appointments_users_user_id_fk
        foreign key (doctor_id) references users (user_id);

