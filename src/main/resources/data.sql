--organisators
INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           1, 'Java Belgium', 'korte info 1');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           2, 'Ict Vlaanderen', 'korte info 2');

INSERT INTO organisator(
    ID, NAAM, INFO)
VALUES (
           3, 'TechBel', 'korte info 3');

--events
INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, PROVINCIE,
    ADRES, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          1, 'Java Antwerp meet', 'Java', 'Antwerpen', 'straat 1', 1, 'Netwerkevent voor Java', 50, '19:00', '1:00', '2022-03-29');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, PROVINCIE,
    ADRES, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          2, 'Python meet ', 'Python', 'Oost-vlaanderen', 'straat 2', 2, 'Netwerkevent voor Phyton', 75, '20:00', '2:00', '2022-04-03');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, PROVINCIE,
    ADRES, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          3, 'Webdesign meet', 'Webdesign', 'West-Vlaanderen', 'straat 3', 3, 'Netwerkevent voor webdesign', 30, '18:30', '0:45', '2022-06-05');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, PROVINCIE,
    ADRES, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          4, 'Databank meet', 'Databanken', 'Limburg', 'straat 4', 2, 'Netwerkevent voor databanken', 45, '12:00', '1:00', '2022-04-06');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, PROVINCIE,
    ADRES, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          5, 'Java Vlaam-Brabant meet', 'Java', 'Vlaams-Brabant', 'straat 5', 1, 'Netwerkevent voor Java', 100, '17:30', '3:00', '2022-05-05');

