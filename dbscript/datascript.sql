/*DATOS TABLA PLATO*/

INSERT INTO dish (dis_name,dis_description,dis_imageurl,dis_price)
VALUES ("Sopa de Mariscos", "Guisado de mariscos frescos", "google.com", 5.2);

INSERT INTO dish (dis_name,dis_description,dis_imageurl,dis_price)
VALUES ("Carne Apanada", "Filete de carne apanada, papas fritas y ensalada", "google.com 2",3.95);

/*DATOS TABLA COCINERO*/

INSERT INTO cook (coo_name,coo_lastname,coo_specialty,coo_description,coo_imageurl)
VALUES ("Elizabeth", "Tamayo", "Chef de Salsas", "Chef experta en preparación de Salsas","google.com");

INSERT INTO cook (coo_name,coo_lastname,coo_specialty,coo_description,coo_imageurl)
VALUES ("Samuel", "Smith", "Chef de Carnes", "Chef experto en preparación de Carnes","google.com");

/*DATOS TABLA COMENTARIO*/

INSERT INTO comment (com_name,com_description,com_imageurl)
VALUES ("Samanta", "Un lugar muy acogedor y profesional para disfrutar de una deliciosa cena.","google.com");

INSERT INTO comment (com_name,com_description,com_imageurl)
VALUES ("Eric", "Uno de los mejores lugares para comer de la ciudad.","google.com");

/*DATOS TABLA RESERVACIÓN*/
/*Para ingresar datos en el campo boo_datetime, se debe respetar el formato ISO 8601: YYYY-MM-DD HH:MM:SS*/

INSERT INTO booking (boo_name,boo_mail,boo_phone,boo_datetime,boo_people,boo_description)
VALUES ("Ellie", "prueba@gmail.com", "0987654321", "2000-01-01 12:13:14", 4, "Mesa para 4 personas");

INSERT INTO booking (boo_name,boo_mail,boo_phone,boo_datetime,boo_people,boo_description)
VALUES ("Cristina", "prueba2@gmail.com", "0123456789", "2010-10-10 20:19:18", 10, "Reservación para 10 personas");