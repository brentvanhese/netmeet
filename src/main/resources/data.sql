--organisators
INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           1, 'Java Belgium', 'Wij als Java Belgium organiseren netwerkevents voor developers geïntereseerd in de programmeer taal Java. Hopelijk kunnen we jou ontmoeten op 1 van onze events!');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           2, 'Ict Vlaanderen', 'Over heel vlaanderen organiseren wij als Ict Vlaanderen verschillende netwerkevents voor verschillende vakgebieden.');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           3, 'TechBel', 'Ben jij, net zoals wij, gedreven door technologie kom dan zeker eens naar een event van TechBel. Tot snel!!!');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           4, 'Webbel', 'Wij organiseren events hoofdzakelijk voor webdevelopment. Soms ook voor een ander vakgebied. Kijk zeker eens naar onze events onderaan.');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           5, 'CpuMeet', 'Als computers jouw ding zijn, kom dan eens spreken met like minded developers op een netwerkevent van ons. Hopelijk tot snel!');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           6, 'WhoAmI', 'Wij, WhoAmI, organiseren netwerkevent voor verschillende vakgebieden. Kom zeker eens naar een event van ons leer niewe mensen kennen met dezelfde passie.');

--provincie
INSERT INTO Provincie(
    ID, PROVINCIE_NAAM)
VALUES (
        1, 'Oost-Vlaanderen'
       );

INSERT INTO Provincie(
    ID, PROVINCIE_NAAM)
VALUES (
           2, 'West-Vlaanderen'
       );

INSERT INTO Provincie(
    ID, PROVINCIE_NAAM)
VALUES (
           3, 'Antwerpen'
       );

INSERT INTO Provincie(
    ID, PROVINCIE_NAAM)
VALUES (
           4, 'Limburg'
       );

INSERT INTO Provincie(
    ID, PROVINCIE_NAAM)
VALUES (
           5, 'Vlaams-Branbant'
       );

--locatie
INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
       1, 'NH Collection Antwerp Centre', 'Pelikaanstraat', 84, 2018, 'Antwerpen', 110, 3, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2499.2578581152375!2d4.4181303159169385!3d51.2143253399098!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3f703a36f084f%3A0x61ec75128f15234e!2sHotel%20NH%20Collection%20Antwerp%20Centre!5e0!3m2!1snl!2sbe!4v1649664535283!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          2, 'Hotel Serwir', 'Koningin Astridlaan', 57, 9100, 'Sint-Niklaas', 80, 1, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2502.4464105574953!2d4.149478015915336!3d51.1555589441878!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c38e825c1dad85%3A0xd27c7c0c92e392e7!2sHotel%20Serwir!5e0!3m2!1snl!2sbe!4v1649663382002!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          3, 'Wulvendael', 'Wolvendreef', 71, 8500, 'Kortrijk', 40, 2, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2521.0795407290216!2d3.257157515905921!3d50.811164969188326!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c33ad9f0af9b7d%3A0x9ca5da3bead88a43!2sWulvendael!5e0!3m2!1snl!2sbe!4v1649664608370!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          4, 'De Pits Zolder', 'Sterrenwacht', 143, 3550, 'Zolder', 50, 4, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d20091.94912990805!2d5.238259939550779!3d50.98854950000001!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c124a54d67f671%3A0x2ce0d7dda5ae293c!2sHotel-Restaurant%20De%20Pits!5e0!3m2!1snl!2sbe!4v1649664657274!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          5, 'Crowne Plaza Brussels Airport', 'Leonardo Da Vincilaan', 4, 1831, 'Diegem', 250, 5, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2516.780312062707!2d4.4574046159080805!3d50.89077626341972!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3dd01533a8185%3A0x29ab861381b9366d!2sCrowne%20Plaza%20Brussels%20Airport!5e0!3m2!1snl!2sbe!4v1649664691087!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          6, 'Vergadercentrum de Stroming', 'Nationalestraat', 111, 2000, 'Antwerpen', 65, 3, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d11889.178199629707!2d4.373766032688475!3d51.21185711702597!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3f6f172dec3d9%3A0x8a0bba119406121c!2sVergadercentrum%20De%20Stroming!5e0!3m2!1snl!2sbe!4v1649667295874!5m2!1snl!2sbe'
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id, GOOGLE)
VALUES(
          7, 'Velvet', 'Zuidstationstraat', 35, 9000, 'Gent', 120, 1, 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d10032.245988230396!2d3.740362847199417!3d51.051952266411014!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c3713660224faf%3A0xe00ffb898edd21b9!2sVelvet!5e0!3m2!1snl!2sbe!4v1649667556777!5m2!1snl!2sbe'
      );

--vakgebieden

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
       1, 'Java'
      );

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
          2, 'Python'
      );

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
          3, 'Webdesign'
      );

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
          4, 'Databases'
      );

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
          5, 'Spring'
      );

INSERT INTO vakgebied(ID, NAAM_VAKGEBIED)
VALUES(
          6, 'Mobile'
      );

--events
INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Java Antwerp meet', 1, 1, 1, 'Netwerkevent voor Java developers.', '19:00', '1:00', '2022-06-29');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Python meet ', 2, 2, 2, 'Netwerkevent voor Phyton developers.', '20:00', '2:00', '2022-07-03');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Webdesign meet', 3, 3, 3, 'Netwerkevent voor mensen geïnteresseerd in webdesign.', '18:30', '0:45', '2022-06-05');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Databank meet', 4, 4, 2, 'Netwerkevent over databases.', '12:00', '1:00', '2022-06-02');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Java Vlaam-Brabant meet', 1, 5, 1, 'Netwerkevent voor mensen geïnteresseerd in Java', '17:30', '3:00', '2022-05-05');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Spring meet', 5, 6, 6, 'Netwerkevent voor mensen geïnteresseerd in Java Spring', '18:30', '1:30', '2022-06-10');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Meet mobile developers', 6, 7, 4, 'Netwerkevent voor mensen geïnteresseerd in Mobile development', '16:00', '1:00', '2022-05-25');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Python Panda', 2, 4, 5, 'Netwerkevent voor mensen geïnteresseerd in de Panda library voor Python', '20:00', '2:00', '2022-05-13');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'HTML / CSS West-Vlaanderen', 3, 3, 4, 'Netwerkevent voor geïntereseerden in HTML en CSS', '19:00', '2:00', '2022-06-14');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Database security', 4, 2, 2, 'Netwerkevent over security', '19:00', '1:00', '2022-07-06');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          nextval('netwerkevent_seq'), 'Spring Limburg', 5, 4, 3, 'Netwerkevent voor mensen geïnteresseerd in Java Spring', '16:00', '2:30', '2022-06-28');

--user
INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE)
VALUES (nextval('USER_SEQ'), 'admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', 'ROLE_ADMIN');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'vanhesebrent', 'Brent', 'Van Hese', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'JavaBelgium', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 1);

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'IctVlaanderen', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 2);

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'TechBel', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 3);

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'Webbel', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 4);

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'CpuMeet', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 5);

INSERT INTO user(
    ID, USERNAME, PASSWORD, ROLE, organisator_Id)
VALUES(nextval('USER_SEQ'), 'WhoAmI', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_ORGANISATOR', 6);

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Stan', 'Stan', 'Dupp', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Shahid', 'Shahid', 'Brown', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Jolieke', 'Jolieke', 'Burghout', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Ann', 'Chovey', 'Chovey', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Barry', 'Barry', 'Cuda', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Donald', 'Donald', 'Canard', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Michael', 'Michael', 'Souris', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Anita', 'Anita', 'Bath', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO user(
    ID, USERNAME, VOORNAAM, ACHTERNAAM, PASSWORD, ROLE)
VALUES(nextval('USER_SEQ'), 'Fay', 'Fay', 'DaWay', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', 'ROLE_USER');

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (1, 3);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (1, 13);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (1, 15);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (1, 9);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (1, 12);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (2, 4);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (2, 1);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (2, 11);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (2, 10);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 5);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 17);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 15);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 16);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 9);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (3, 14);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (4, 4);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (4, 11);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (4, 13);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (4, 10);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (5, 3);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (5, 9);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (5, 16);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (5, 12);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 8);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 17);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 2);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 15);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 11);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (6, 16);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (7, 6);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (7, 10);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (7, 12);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (7, 17);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (7, 2);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (8, 7);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (8, 13);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (8, 15);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (8, 9);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (8, 12);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (9, 6);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (9, 14);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (9, 15);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (9, 16);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (9, 10);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (10, 4);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (10, 17);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (10, 13);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (10, 15);

INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (11, 5);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (11, 17);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (11, 16);
INSERT INTO NETWERKEVENT_USERS(NETWERKEVENT_ID, USERS_ID) VALUES (11, 2);