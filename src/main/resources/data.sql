insert into barber (name, email, cpf, image, bio, phone, active)
values
    ('João',   'joao@barber.com',   null, 'https://picsum.photos/400/300', 'Especialista em degradê', '51999999999', true),
    ('Marcos', 'marcos@barber.com', null, 'https://picsum.photos/400/300', 'Barba e navalha',          '51988888888', true)
    on conflict (email) do update
                               set
                                   name = excluded.name,
                               cpf = excluded.cpf,
                               image = excluded.image,
                               bio = excluded.bio,
                               phone = excluded.phone,
                               active = excluded.active;
