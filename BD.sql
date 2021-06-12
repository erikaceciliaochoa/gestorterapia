
-- BD insert

use proyecto;
select * from usuario;
select * from dialaboral;
select id, des from dialaboral where estatus=0;
select * from dialaboral;
select * from rangohorario;
select * from horariocab order by  id desc;
select * from horariodet;
select * from turno;
select * from seguimiento;
select * from diagnostico;
select * from tratamiento;
select * from paciente;

-- TABLAS AUXILIARES
select * from OCUPACION;
insert into ocupacion(des) values('Comerciante');
insert into ocupacion(des) values('Carpintero');
INSERT INTO ocupacion (des) VALUES('Panadero');
insert into ocupacion(des) values('Médico');
insert into ocupacion(des) values('Abogado');
insert into ocupacion(des) values('Ingeniero');
insert into ocupacion(des) values('Administrador de empresas');
insert into ocupacion(des) values('Estudiante');

select * from paciente;
INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('López',50,'santiagolj@hotmail.com','Soltera/o','2012-01-10','1964-05-05','Santiago','Masculino',4930879,1);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('Cornejo',29,'rocornejo@gmail.com','Soltera/o','2013-07-10','1985-05-10','Romina','Femenino',4641880,7);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('Maggioni',24,'carmenmag@hotmail.com','Soltera/o','2013-01-10','1990-09-20','Carmen Solar','Femenino',4930879,8);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('Acevedo',31,'Yasir@gmail.com','Soltera/o','2014-01-10','1983-05-20','Yasir','Masculino',4641880,7);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('Hernández',19,'mchernandez@hotmail.com','Soltera/o','2014-05-03','1995-01-15','María Cecilia','Femenino',4930879,8);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('González',19,'pao008@gmail.com','Soltera/o','2014-05-03','1995-01-15','Paola','Femenino',4930879,8);

INSERT INTO paciente
(apellido,edad,email,estadoCivil,fechaIngreso,fechaNac,nombre,sexo,telefono,ocupacion_id)
VALUES ('Cabrera Ortíz',19,'pedro_co@gmail.com','Soltera/o','2014-07-02','1987-01-15','Pedro','Masculino','(351)152366555',4);

select * from motivo;
insert into motivo(des) values('Repetición de patrones, errores y hábitos.');
insert into motivo(des) values('Acabo renunciando a mis cosas para complacer al otro.');
insert into motivo(des) values('Explosiones de rabia, llanto que no sé cómo canalizar adecuadamente.');
insert into motivo(des) values('Problemas con el control o falta de control de mi entorno.');
-- relaciones, emociones
insert into motivo(des) values('Dificultad para tomar decisiones.');
insert into motivo(des) values('Aceptación decisiones inducidas por otras personas o por el entorno.');
insert into motivo(des) values('Baja autoestima y falta de aceptación.');
insert into motivo(des) values('No sé por dónde empezar... no tengo claro lo que me pasa.');
insert into motivo(des) values('Problemas de pareja.');
insert into motivo(des) values('Celos.');
insert into motivo(des) values('Insomnio.');
insert into motivo(des) values('Somatizaciones: dolor de cabeza, dolor de espalda, etc.');
insert into motivo(des) values('Abuso Escolar. (Bullying).');
insert into motivo(des) values('Abuso laboral. (Mobbing).');
insert into motivo(des) values('Adicciones.');
insert into motivo(des) values('Problemas laborales.');
insert into motivo(des) values('Dejar de tomar pastillas.');
insert into motivo(des) values('Problemas de concentración.');
insert into motivo(des) values('Manejo del Estrés.');
insert into motivo(des) values('Duelo.');

-- TEST PSICOLÓGICOS
select * from prueba;
insert into prueba(des) values('Test de Eneagrama.');
insert into prueba(des) values('Test de Eneagrama determinar tipo3.');
insert into prueba(des) values('Confeccionar Genograma.');
insert into prueba(des) values('Test de Inteligencia.');
insert into prueba(des) values('Test de Comunicación.');
insert into prueba(des) values('Test de Impulsos.');
insert into prueba(des) values('Test de Relaciones Sociales.');
insert into prueba(des) values('Test de Capacidad de Logro.');
insert into prueba(des) values('Personalidad 5 Factores.');
insert into prueba(des) values('Inteligencia Emocional.');
insert into prueba(des) values('Personalidad 16 Factores.');
insert into prueba(des) values('Test bajo la lluvia.');


select * from diagnostico;
insert into diagnostico(des) values('Trastornos del Espectro Autista.');
insert into diagnostico(des) values('Esquizofrenia.');
insert into diagnostico(des) values('Trastorno Bipolar.');
insert into diagnostico(des) values('Trastorno de pánico.');
insert into diagnostico(des) values('Trastornos de Ansiedad.');
insert into diagnostico(des) values('Trastornos del Espectro Autista.');
insert into diagnostico(des) values('El trastorno obsesivo-compulsivo (TOC)');
insert into diagnostico(des) values('Trastorno de estrés postraumático (TEPT)');
insert into diagnostico(des) values('Trastorno de ansiedad generalizada (TAG)');
insert into diagnostico(des) values('Fobias.');
insert into diagnostico(des) values('Déficit de Atención e Hiperactividad');
insert into diagnostico(des) values('Trastornos de la alimentación');
insert into diagnostico(des) values('Trastornos de la Personalidad.');
insert into diagnostico(des) values('Trastorno de la personalidad antisocial.');
insert into diagnostico(des) values('Trastorno límite de personalidad.');
insert into diagnostico(des) values('Trastornos del estado de ánimo.');


select * from tratamiento;
insert into tratamiento(des) values('Explicación de la neurosis.');
insert into tratamiento(des) values('Método terapéutico.');
insert into tratamiento(des) values('Rasgos de la técnica analítica.');
insert into tratamiento(des) values('Explicación de la neurosis.');
insert into tratamiento(des) values('Método terapéutico.');
/*
insert into tratamiento(des) values('Rasgos de la técnica analítica.
La interpretación.
Actitud no crítica.
Evitación de cualquier tipo de consejo o de directividad.');*/


insert into tratamiento(des) values('Análisis didáctico.');
insert into tratamiento(des) values('Fortaleza del yo  individual.');
insert into tratamiento(des) values('Psicodrama.');
insert into tratamiento(des) values('Enfatizar el aquí y ahora y los elementos emocionales.');
insert into tratamiento(des) values('Evitar las especulaciones e interpretaciones sin fin.');
insert into tratamiento(des) values('Logoterapia.');
insert into tratamiento(des) values('Bioenergética.');
insert into tratamiento(des) values('Análisis transaccional.');
insert into tratamiento(des) values('Terapia con Flores de Bach.');
insert into tratamiento(des) values('Terapia orientada a la reestructuración cognitiva.');
insert into tratamiento(des) values('Terapia orientada a las habilidades de afrontamiento.');
insert into tratamiento(des) values('Terapia orientada a la resolución de problemas.');
insert into tratamiento(des) values('Terapia cognitiva racionalistas (Beck).');
insert into tratamiento(des) values('Terapia cognitiva constructivistas (Kelly).');
insert into tratamiento(des) values('Logoterapia.');
insert into tratamiento(des) values('Bioenergética.');
insert into tratamiento(des) values('Técnicas de relajación.');
insert into tratamiento(des) values('Entrenamiento en asertividad.');
insert into tratamiento(des) values('Revisión de los pensamientos irracionales');
--  y desarrollo de alternativas.
insert into tratamiento(des) values('Ejercicios conductuales.');
insert into tratamiento(des) values('Desensibilización sistemática.');
insert into tratamiento(des) values('Técnicas de exposición.');



select * from dialaboral; -- SON 7, un arreglo string.
insert into dialaboral(id,des,estatus) values(1,'Domingos',1); -- 1
insert into dialaboral(id,des,estatus) values(2,'Lunes',1); -- 2
insert into dialaboral(id,des,estatus) values(3,'Martes',1); -- 3
insert into dialaboral(id,des,estatus) values(4,'Miércoles',0); -- 4
insert into dialaboral(id,des,estatus) values(5,'Jueves',0); -- 5
insert into dialaboral(id,des,estatus) values(6,'Viernes',0); -- 6
insert into dialaboral(id,des,estatus) values(7,'Sábados',1); -- 7


select * from rangohorario; -- Los básicos
insert into rangohorario(horaFin,horaIni) values('10:00','09:00'); -- 1
insert into rangohorario(horaFin,horaIni) values('11:00','10:00'); -- 2
insert into rangohorario(horaFin,horaIni) values('12:00','11:00'); -- 3
insert into rangohorario(horaFin,horaIni) values('16:00','15:00'); -- 4
insert into rangohorario(horaFin,horaIni) values('17:00','16:00'); -- 5
insert into rangohorario(horaFin,horaIni) values('18:00','17:00'); -- 6

select * from usuario;
insert into usuario(pass,usu) values('1234','admin');
insert into usuario(pass,usu) values('1234','erika');


select * from horariocab;
insert into horariocab(diaLaboral_id) values(4); -- Miércoles. horarioCad:1 diaLaboral_id:4
insert into horariocab(diaLaboral_id) values(5); -- Jueves.  horarioCad:1 diaLaboral_id:5

select * from horariodet;
insert into horariodet(horarioCab_id,rangoHorario_id) values(1,1); -- horarioCad:1 rangoHorario_id:1
insert into horariodet(horarioCab_id,rangoHorario_id) values(1,2); -- horarioCad:1 rangoHorario_id:2
insert into horariodet(horarioCab_id,rangoHorario_id) values(1,3); -- horarioCad:1 rangoHorario_id:2

insert into horariodet(horarioCab_id,rangoHorario_id) values(2,2); -- horarioCad:2 rangoHorario_id:2
insert into horariodet(horarioCab_id,rangoHorario_id) values(2,3); -- horarioCad:2 rangoHorario_id:3
insert into horariodet(horarioCab_id,rangoHorario_id) values(2,4); -- horarioCad:2 rangoHorario_id:4

select * from turno;
/*
INSERT INTO turno(descDiagnostico,descMotivo,descTratamiento,estatusAsistio,estatusPago,estatusTurno,
fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,rdoPrueba,diagnostico_id,
horario_id,motivo_id,paciente_id,prueba_id,tratamiento_id)
VALUES
();*/
/*
and estatusAsistio=0 -- EstatusAsistio{ASISTIO, FALTO};
and estatusPago=0 -- EstatusPago{ABONADO, IMPAGO};
and estatusTurno=0 -- EstatusTurno{ACTIVO, INACTIVO};*/

-- Turnos
-- Jueves
-- --------------------------------------------------------2012
 INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2012-01-05','2012-01-02','09:00 a 10:00', '09:00:00',100,'Perdida de un ser querido.',
20,1,1);

 INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2012-01-12','2012-01-05','09:00 a 10:00', '09:00:00',100,'',
3,1,1);

 INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2012-01-19','2012-01-12','09:00 a 10:00', '09:00:00',100,'',
3,1,1);

 INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-01-26','2012-01-19','09:00 a 10:00', '09:00:00',100,'Llego 20 minutos tarde.',
1,1);

 INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2012-02-23','2012-02-02','09:00 a 10:00', '09:00:00',150,'','Eneatipo 8',
1,1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-03-01','2012-02-23','09:00 a 10:00', '09:00:00',150,'',
1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-03-08','2012-03-01','09:00 a 10:00', '09:00:00',150,'',
1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-03-15','2012-03-09','09:00 a 10:00', '09:00:00',150,'Resistencia al cambio.',
1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2012-03-22','2012-03-15','09:00 a 10:00', '09:00:00',150,'',
'Hijo adoptivo. Relaciones familiares conflictivas.',1,1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2012-03-29','2012-03-22','09:00 a 10:00', '09:00:00',150,'',
1,1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-04-04','2012-03-29','09:00 a 10:00', '09:00:00',150,'',
1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2012-04-18','2012-04-10','09:00 a 10:00', '09:00:00',150,'',
1,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(1,1,0,'2012-04-25','2012-04-20','09:00 a 10:00', '09:00:00',150,'',
1,1);
-- --------------------------------------------------------2013

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2013-10-07','2013-10-01','12:00 a 13:00', '09:00:00',170,'',
8,2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-10-14','2013-10-07','12:00 a 13:00', '09:00:00',170,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-10-21','2013-10-14','12:00 a 13:00', '09:00:00',170,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2013-10-28','2013-10-20','12:00 a 13:00', '09:00:00',170,'',
'Eneatipo 4.',2,2,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-11-04','2013-11-01','12:00 a 13:00', '09:00:00',170,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-11-11','2013-11-01','12:00 a 13:00', '09:00:00',170,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-11-18','2013-11-12','12:00 a 13:00', '09:00:00',170,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-11-25','2013-11-19','12:00 a 13:00', '09:00:00',170,'',
2,2);
-- --------------------------------------------------------
INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-01-10','2013-01-05','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2013-01-24','2013-01-20','09:00 a 10:00', '09:00:00',170,'',
'Eneatipo 9.',1,3,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-01-31','2013-01-26','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-02-07','2013-02-07','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2013-02-13','2013-02-07','09:00 a 10:00', '09:00:00',170,'',
1,1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-02-20','2013-02-10','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
diagnostico_id,horario_id,paciente_id)
VALUES
(0,0,0,'2013-02-27','2013-02-20','09:00 a 10:00', '09:00:00',170,'',
12,1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-02-27','2013-02-20','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
diagnostico_id,horario_id,paciente_id)
VALUES
(0,0,0,'2013-03-05','2013-02-28','09:00 a 10:00', '09:00:00',170,'',
12,1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-03-12','2013-03-06','09:00 a 10:00', '09:00:00',170,'',
1,3);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
diagnostico_id,horario_id,paciente_id)
VALUES
(0,0,0,'2013-03-19','2013-03-10','09:00 a 10:00', '09:00:00',170,'',
12,1,3);


INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2013-03-26','2013-03-19','09:00 a 10:00', '09:00:00',170,'',
1,3);
-- --------------------------------------------------------AGREGAR SEGUIMINETO!!
select * from turno;


-- --------------------------------------------------------2014
INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2014-03-14','2014-03-01','16:00 a 17:00', '09:00:00',180,'',
14,2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-03-18','2014-03-14','16:00 a 17:00', '09:00:00',180,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-03-25','2014-03-20','16:00 a 17:00', '09:00:00',180,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2014-04-02','2014-03-26','16:00 a 17:00', '09:00:00',180,'',
18,2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-04-16','2014-04-10','16:00 a 17:00', '09:00:00',180,'',
2,2);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-04-30','2014-04-16','16:00 a 17:00', '09:00:00',180,'',
2,2);

-- ----------------------------------------------------------------

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-01-10','2014-01-05','09:00 a 10:00', '09:00:00',180,'',
1,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
motivo_id,horario_id,paciente_id)
VALUES
(0,0,0,'2014-01-17','2014-01-10','09:00 a 10:00', '09:00:00',180,'',
1,1,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2014-01-24','2014-01-17','12:00 a 13:00', '09:00:00',180,'',
'',2,2,7);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-01-31','2014-01-24','09:00 a 10:00', '09:00:00',180,'',
1,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-02-21','2014-01-31','11:00 a 12:00', '19:00:00',180,'',
2,4);


INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
diagnostico_id,horario_id,paciente_id)
VALUES
(0,0,0,'2014-02-28','2014-02-23','11:00 a 12:00', '13:00:00',180,'',
7,1,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-03-12','2014-03-10','11:00 a 12:00', '19:00:00',180,'',
2,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-03-26','2014-03-20','11:00 a 12:00', '19:00:00',180,'',
2,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-04-15','2014-04-10','11:00 a 12:00', '19:00:00',180,'',
2,4);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-04-19','2014-04-15','11:00 a 12:00', '19:00:00',180,'',
2,4);

-- ----------------------------------------------------------------
INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-05-03','2014-04-15','10:00 a 11:00', '19:00:00',230,'',
2,5);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,0,0,'2014-05-19','2014-05-15','10:00 a 11:00', '19:00:00',230,'',
2,5);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2014-05-26','2014-05-19','11:00 a 12:00', '19:00:00',230,'',
'Eneatipo 2.',2,5,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,1,0,'2014-06-10','2014-05-28','12:00 a 13:00', '19:00:00',230,'',
2,5);

-- ----------------------------------------------------------------
INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(0,0,0,'2014-05-03','2014-04-19','11:00 a 12:00', '19:00:00',230,'',
'Eneatipo 7.',2,6,1);

INSERT INTO turno(estatusAsistio,estatusPago,estatusTurno,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,paciente_id)
VALUES
(0,1,0,'2014-05-19','2014-05-15','12:00 a 13:00', '19:00:00',230,'',
2,6);

select * from turno














-- Turnos con Motivos -- descMotivo
INSERT INTO turno(descMotivo,estatusPago,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
horario_id,motivo_id,paciente_id)
VALUES
('descMotivo',1,'2014-01-10','2014-01-10','09:00 a 10:00', '09:00:00',250,'Observaciones turno',
null,1,1);



-- Turnos con Pruebas
INSERT INTO turno(estatusPago,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,paciente_id,prueba_id)
VALUES
(1,'2014-01-10','2014-01-10','09:00 a 10:00', '09:00:00',250,'Observaciones',
'rdoPrueba',null,1,1);

-- Turnos con Motivo y Prueba
INSERT INTO turno(descMotivo,estatusPago,fecha,fechaSolicitud,hora,horaSolicitud,monto,observaciones,
rdoPrueba,horario_id,motivo_id,paciente_id,prueba_id)
VALUES
('descMotivo',0,'2014-01-10','2014-01-10','09:00 a 10:00', '09:00:00',250,'Observaciones',
'rdoPrueba',null,1,1,1);

-- CONSULTA O SESIÓN

UPDATE turno
SET estatusAsistio=0,estatusPago=0,observaciones='',paciente_id=1
WHERE num=1;

-- CONSULTA O SESIÓN cancelada
UPDATE turno
SET estatusAsistio=1,estatusPago=0,estatusTurno=1,observaciones='',paciente_id=1
WHERE num=1;

-- Consulta o Sesión con Motivos

UPDATE turno
SET descMotivo='',estatusAsistio=0,estatusPago=0,observaciones='',motivo_id=1,paciente_id=1
WHERE num=1;


-- Consulta o Sesión con Pruebas
UPDATE turno
SET estatusAsistio=0,estatusPago=0,observaciones='',rdoPrueba='',paciente_id=1,prueba_id=1
WHERE num=1;

-- Consu. Motivo y Prueba
UPDATE turno
SET descMotivo='',estatusAsistio=0,estatusPago=0,observaciones='',rdoPrueba='',
motivo_id=1,paciente_id=1,prueba_id=1
WHERE num=1;


-- Consulta o Sesión con Tratamientos
UPDATE turno
SET descTratamiento='',estatusAsistio=0,estatusPago=0,observaciones='',
paciente_id=1,tratamiento_id=1
WHERE num=1;

-- Consu. Motivo , Prueba y Tratamientos
UPDATE turno
SET descMotivo='',descTratamiento='',estatusAsistio=0,estatusPago=0,observaciones='',rdoPrueba='',
motivo_id=1,paciente_id=1,prueba_id=1,tratamiento_id=1
WHERE num=1;


-- Consulta o Sesión con Diagnóstico
UPDATE turno
SET descDiagnostico='',estatusAsistio=0,estatusPago=0,observaciones='',
diagnostico_id=1,paciente_id=1
WHERE num=1;

-- Consu. Motivo , Prueba , Tratamientos y Diagnóstico
UPDATE turno
SET descDiagnostico='',descMotivo='',descTratamiento='',estatusAsistio=0,estatusPago=0,
observaciones='',rdoPrueba='',diagnostico_id=1,motivo_id=1,paciente_id=1,prueba_id=1,
tratamiento_id=1
WHERE num=1;



select * from seguimiento;

insert into seguimiento(conclusion,estadoControl,fecha,hora,diagnostico_id,paciente_id) 
values('se hace',1, '2014-06-19','21:17:29',1,1);

insert into seguimiento(conclusion,estadoControl,fecha,hora,diagnostico_id,paciente_id) 
values('se hace',0, '2014-06-19','21:17:29',1,1);










