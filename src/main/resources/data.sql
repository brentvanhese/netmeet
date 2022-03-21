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
    ID, STRAAT, HUIS_NR, POSTCODE, STAD, provincie_Id)
VALUES(
       1, 'straat', 5, 9100, 'Sint-Niklaas', 1
      );

--events
INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          1, 'Java Antwerp meet', 'Java', 3, 1, 1, 'Netwerkevent voor Java', 50, '19:00', '1:00', '2022-03-29');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          2, 'Python meet ', 'Python', 1, 1, 2, 'Netwerkevent voor Phyton', 75, '20:00', '2:00', '2022-04-03');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          3, 'Webdesign meet', 'Webdesign', 2, 1, 3, 'Netwerkevent voor webdesign', 30, '18:30', '0:45', '2022-06-05');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          4, 'Databank meet', 'Databanken', 4, 1, 2, 'Netwerkevent voor databanken', 45, '12:00', '1:00', '2022-04-06');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, MAX_AANWEZIGEN, START_UUR, DUUR, DATUM)
VALUES(
          5, 'Java Vlaam-Brabant meet', 'Java', 5, 1, 1, 'Netwerkevent voor Java', 100, '17:30', '3:00', '2022-05-05');

