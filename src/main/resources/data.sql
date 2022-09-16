INSERT INTO Artist (id, name, country) VALUES (100, 'Ataque 77', 'Argentina');

INSERT INTO Album (id, description, publication, artist_id) VALUES (300, 'Dulce Navidad', 1989, 100);
INSERT INTO Album (id, description, publication, artist_id) VALUES (301, 'El cielo puede esperar', 1990, 100);

INSERT INTO Genre (id, description) VALUES (400, 'punk');
INSERT INTO Genre (id, description) VALUES (401, 'rock');

INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (600, 'Sola en la cancha', 203, 300, 400);
INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (601, 'Gil', 146, 300, 400);
INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (602, 'Hay una bomba en el colegio', 128, 300, 401);

INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (603, 'Tiempo para estar', 183, 301, 400);
INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (604, 'Vuelve a casa', 194, 301, 400);
INSERT INTO Song (id, title, duration, album_id, genre_id) VALUES (605, 'Espadas y serpientes', 268, 301, 401);
