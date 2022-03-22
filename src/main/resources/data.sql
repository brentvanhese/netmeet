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
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id)
VALUES(
       1, 'NH Collection Antwerp Centre', 'Pelikaanstraat', 84, 2018, 'Antwerpen', 110, 3
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id)
VALUES(
          2, 'Hotel Serwir', 'Koningin Astridlaan', 57, 9100, 'Sint-Niklaas', 80, 1
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id)
VALUES(
          3, 'Wulvendael', 'Wolvendreef', 71, 8500, 'Kortrijk', 40, 2
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id)
VALUES(
          4, 'De Pits Zolder', 'Sterrenwacht', 143, 3550, 'Zolder', 50, 4
      );

INSERT INTO Locatie(
    ID, NAAM, STRAAT, HUIS_NR, POSTCODE, STAD, MAX_AANWEZIGEN, provincie_Id)
VALUES(
          5, 'Crowne Plaza Brussels Airport', 'Leonardo Da Vincilaan', 4, 1831, 'Diegem', 250, 5
      );

--events
INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          1, 'Java Antwerp meet', 'Java', 3, 1, 1, 'Netwerkevent voor Java', '19:00', '1:00', '2022-03-29');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          2, 'Python meet ', 'Python', 1, 2, 2, 'Netwerkevent voor Phyton', '20:00', '2:00', '2022-04-03');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          3, 'Webdesign meet', 'Webdesign', 2, 3, 3, 'Netwerkevent voor webdesign', '18:30', '0:45', '2022-06-05');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          4, 'Databank meet', 'Databanken', 4, 4, 2, 'Netwerkevent voor databanken', '12:00', '1:00', '2022-04-06');

INSERT INTO netwerkevent(
    ID, NAAM_NETWERK_EVENT, VAK_GEBIED, provincie_Id,
    locatie_Id, ORGANISATOR_Id, INFO, START_UUR, DUUR, DATUM)
VALUES(
          5, 'Java Vlaam-Brabant meet', 'Java', 5, 5, 1, 'Netwerkevent voor Java', '17:30', '3:00', '2022-05-05');

