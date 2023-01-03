insert into users (id, username, password) values
(1, 'james', '$2a$12$PhXu.DoelQlz1M43e848GOoTUdlufEQ3XNvnVA1ieABmI1n.XZbsK'),
(2, 'bob', '$2a$12$UmSwFHnp91QcXWkC36k0nuY/lzlTS./9PRcqYAHWv9ZptZQKTNcrS');

insert into authorities (id, name) values
(1, 'read'),
(2, 'write');

insert into users_authorities (user_id, authority_id) values
(1, 1),
(2, 1);