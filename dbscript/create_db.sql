CREATE TABLE dish (
    dis_code INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    dis_name TEXT NOT NULL,
    dis_description TEXT NOT NULL,
    dis_imageurl TEXT NOT NULL,
    dis_price DOUBLE NOT NULL
);

CREATE TABLE cook (
    coo_code INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    coo_name TEXT NOT NULL,
    coo_lastname TEXT NOT NULL,
    coo_specialty TEXT NOT NULL,
    coo_description TEXT NOT NULL,
    coo_imageurl TEXT NOT NULL
);

CREATE TABLE comment (
    com_code INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    com_name TEXT NOT NULL,
    com_description TEXT NOT NULL,
    com_imageurl TEXT NOT NULL
);

CREATE TABLE booking (
    boo_code INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    boo_name TEXT NOT NULL,
    boo_mail TEXT NOT NULL,
    boo_phone TEXT NOT NULL,
    boo_datetime TEXT NOT NULL,
    boo_people INTEGER NOT NULL,
    boo_description TEXT NOT NULL
);