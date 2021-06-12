use hibernateparametros
select * from usuario
select * from producto
select * from usuario_compra
select * from compra

use biblioteca
select * from usuario

use proyecto
select * from usuario
select * from dialaboral
select id, des from dialaboral where estatus=0
select * from dialaboral
select * from rangohorario
select * from horariocab order by  id desc
select * from horariodet
select * from turno
select * from diagnostico
select * from tratamiento
select * from seguimiento
select * from paciente

select * 
from seguimiento s
where paciente_id

SELECT fecha FROM turno
WHERE paciente_id= 1
AND estatusAsistio=1 
AND estatusTurno=0 
AND fecha > CURDATE() ORDER BY fecha DESC LIMIT 1

SELECT count(*) as total FROM prueba WHERE des like 'a'

select t.num nro, concat_ws(', ', p.apellido, p.nombre) paciente, t.fecha fecha, t.hora hora,t.estatusAsistio a ,t.estatusPago pa,t.estatusTurno  tu
from turno t, paciente p 
where t.paciente_id=p.id 
and 

select p.id id, concat_ws(', ', p.apellido, p.nombre) des, p.fechaNac fechaNac, p.edad edad,p.fechaIngreso fechaAlta, p.estadoCivil 
from paciente p, ocupacion o 
where p.ocupacion_id=o.id  
order by 1 ASC LIMIT 2

select p.id id, concat_ws(', ', p.apellido, p.nombre) des, p.fechaNac fechaNac, p.edad edad,p.fechaIngreso fechaAlta from paciente p, ocupacion o where p.ocupacion_id=o.id  order by 1 ASC LIMIT 2

select p.id id, concat_ws(', ', p.apellido, p.nombre) des, p.fechaNac fechaNac, p.edad edad, p.fechaIngreso fechaAlta 
from paciente p, ocupacion o 
where p.ocupacion_id=o.id
order by 1 ASC LIMIT 2

select t.num, concat_ws(', ', p.apellido, p.nombre) paciente, t.fecha, t.hora, estatusAsistio, estatusPago, estatusTurno
from turno t, paciente p
where paciente_id=p.id
and estatusAsistio=0 -- EstatusAsistio{ASISTIO, FALTO};
and estatusPago=0 -- EstatusPago{ABONADO, IMPAGO};
and estatusTurno=0 -- EstatusTurno{ACTIVO, INACTIVO};
order by 1 asc

select *
from turno t
where YEAR(t.fecha) = 2014
and t.estatusAsistio = 0

select *
from turno t
where month(t.fecha) = 6
and YEAR(t.fecha) = 2014
and t.estatusAsistio = 0

-- ÚLTIMO 
SELECT * 
FROM tratamiento
ORDER BY 2 DESC LIMIT 10

-- PRIMER 
SELECT * 
FROM tratamiento
ORDER BY 2 ASC
LIMIT 1 -- LIMIT 10 OFFSET 20 --Equivalent to LIMIT 20, 10

SELECT * 
FROM tratamiento
ORDER BY 2 ASC
LIMIT 1 OFFSET 2 -- Equivalent to LIMIT 20, 10

SELECT * 
FROM ocupacion
ORDER BY 2 ASC
LIMIT 1, 1

select concat_ws(', ', p.apellido, p.nombre) paciente, count(p.id) presente, 4-count(p.id) ausente, round(count(*)/4*100) promedioPre, 100 - round(count(*)/4*100) porcAusente
from turno t, paciente p
where t.paciente_id=p.id
and t.paciente_id=1
and t.estatusAsistio=0
group by concat_ws(', ', p.apellido, p.nombre)
order by 2 desc

select concat_ws(', ', p.apellido, p.nombre) paciente, count(p.id) presente, 2-count(p.id) ausente, round(count(*)/2*100) promedioPre, 100 - round(count(*)/2*100) porcAusente
from turno t, paciente p
where t.paciente_id=p.id
and t.paciente_id=2
and t.estatusAsistio=0
group by concat_ws(', ', p.apellido, p.nombre)
order by 2 desc

select count(t.num) asistio
from turno t, paciente p
where t.paciente_id=p.id
and t.paciente_id=2
and t.estatusAsistio=1

select concat_ws(', ', p.apellido, p.nombre) paciente, count(p.id) ausente round(count(*)/5*100) promedio
from turno t, paciente p
where t.paciente_id=p.id
and t.paciente_id=2
and t.estatusAsistio=1
group by concat_ws(', ', p.apellido, p.nombre)
order by 2 desc

-- consulta detalle
select concat_ws(', ', p.apellido, p.nombre) paciente, count(p.id) cant, round(count(*)/5*100) promedio
from turno t, paciente p
where t.paciente_id=p.id
and t.estatusAsistio=0
group by concat_ws(', ', p.apellido, p.nombre)
order by 2 desc


-- consulta cant asistio 3 gonzales, 1 peralta
select count(t.num) asistio
from turno t, paciente p
where t.paciente_id=p.id
and t.estatusAsistio=0



select m.des motivo, count(m.des) cant, round(count(*)/3*100) promedio
from turno t, motivo m
where t.motivo_id=m.id
group by m.des
order by 2 desc

select count(*) cant
from turno t, motivo m
where t.motivo_id=m.id

select concat_ws(', ', p.apellido, p.nombre) paciente, sum(t.monto) deuda, min(t.fecha) desde , max(t.fecha) hasta
from turno t, paciente p
where t.paciente_id=p.id
and t.estatusAsistio=0
and t.estatusPago=0
group by concat_ws(', ', p.apellido, p.nombre)


select concat_ws(', ', p.apellido, p.nombre) paciente, d.des diagnostico, t.descDiagnostico observaciones, t.fecha
from turno t, diagnostico d, paciente p
where t.diagnostico_id = d.id
and t.paciente_id=p.id
group by concat_ws(', ', p.apellido, p.nombre)

select concat_ws(', ', p.apellido, p.nombre) paciente, t.diagnostico_id, d.des, t.descDiagnostico, s.num, s.conclusion, s.fecha  
from turno t, diagnostico d, paciente p, seguimiento s
where t.diagnostico_id = d.id
and t.paciente_id=p.id
and s.diagnostico_id
and s.paciente_id = p.id

select m.des motivo, count(m.des) cant, round(count(*)/3*100) promedio
from turno t, motivo m
where t.motivo_id=m.id
group by m.des
order by 2 desc

select m.des motivo, count(m.des) cant, concat(round(count(*)/3*100),' ','%') promedio
from turno t, motivo m
where t.motivo_id=m.id
group by m.des
order by 2 desc

select count(*) cant
from turno t, motivo m
where t.motivo_id=m.id

SELECT alumnos.sexo, count(id) as sx, 
( SELECT count(a.sexo)*100/count(alumnos.id)
  FROM alumnos AS a
  WHERE a.sexo=alumnos.sexo
) porcentaje
FROM alumnos 
GROUP BY alumnos.sexo

-- ROUND(AVG(t.num)) '%'

select
if(sexo='M','Hombres','Mujeres') sexo,
count(*) numero,
concat(round(count(*)/t1.total*100),' ','%') promedio
from usuarios,
(select count(*) total from usuarios)t1
group by sexo

-- LISTRAR TODAS LAS PRUEBAS REALIZADAS POR PACIENTE
select concat_ws(', ', p.apellido, p.nombre) paciente, pr.des prueba, count(pr.des) Cant, t.rdoPrueba resultado, t.fecha, t.hora
from turno t, paciente p, prueba pr
WHERE t.paciente_id=p.id
AND t.prueba_id=pr.id
group by concat_ws(', ', p.apellido, p.nombre)

-- LISTRAR CANT DE PRUEBAS REALIZADAS POR PACIENTE
select concat_ws(', ', p.apellido, p.nombre) paciente, pr.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.hora hora, p.edad
from turno t, paciente p, prueba pr
WHERE t.paciente_id=p.id
AND t.prueba_id=pr.id
AND p.edad>=20 AND p.edad<=27
and t.fecha>='2014-06-18' and t.fecha<='2014-06-19'
group by concat_ws(', ', p.apellido, p.nombre), pr.des, t.rdoPrueba, t.fecha, t.hora
order by 1

-- RETORNO EL ODCAB Q TENGA ESE DIA REPETIDO. BORRO TODOS LOS DET DONDE SALGA ESE IDCAB.
-- SI ES ACTUALIZAR DEBO RECUPERAR EL IDCAB  Y CARGAR SOLO LA TABLA det
-- SI ES NUEVO CREA TODO DESDE CERO.

DELETE FROM tabla_relacionada WHERE columna_relacionada IN (registros_seleccionados)
 
-- Borrar del detalle todo lo q tenga el diaLaboral viernes y borrar de la cabecera 
DELETE FROM horarioCab 
WHERE columna_relacionada IN (registros_seleccionados) 

DELETE 
from horariodet 
where horarioCab_id = 5

DELETE 
from horariocab 
where diaLaboral_id = 6 -- 2 4 5 

select *
from horariocab c, dialaboral d
where c.diaLaboral_id = d.id

DELETE
from horariodet d, horariocab c, dialaboral dia, rangohorario rh
where d.horarioCab_id = c.id
and c.diaLaboral_id = dia.id
and d.rangoHorario_id = rh.id
and dia.des like 'Miercoles'
and estatus = 0


select d.horarioCab_id, d.rangoHorario_id RANGOid
from horariodet d, horariocab c, dialaboral dia, rangohorario rh
where d.horarioCab_id = c.id
and c.diaLaboral_id = dia.id
and d.rangoHorario_id = rh.id
and dia.des like 'Viernes'
and estatus = 0
order by 1,2

-- Verificar si existe ese mismo detalle!!
select c.id CABid, c.diaLaboral_id, d.horarioCab_id, d.rangoHorario_id RANGOid
from horariodet d, horariocab c, dialaboral dia, rangohorario rh
where d.horarioCab_id = c.id
and c.diaLaboral_id = dia.id
and d.rangoHorario_id = rh.id
and dia.des like 'Viernes'
and estatus = 0
order by 1,3,4,2


select c.id CABid, d.id DETidAuto, d.rangoHorario_id RANGOid, rh.horaIni, rh.horaFin, c.diaLaboral_id, dia.des DIA, dia.estatus 
from horariodet d, horariocab c, dialaboral dia, rangohorario rh
where d.horarioCab_id = c.id
and c.diaLaboral_id = dia.id
and d.rangoHorario_id = rh.id
and dia.des like 'Miercoles'
and estatus = 0


-- ÚLTIMO TURNO q asistio
SELECT fecha 
FROM turno
WHERE paciente_id=1
AND estatusAsistio=0
AND estatusTurno=0 
ORDER BY fecha DESC LIMIT 1

-- PRIMER TURNO q asistio
SELECT fecha 
FROM turno
WHERE paciente_id=1
AND estatusAsistio=0
AND estatusTurno=0  
ORDER BY fecha ASC LIMIT 1 -- LIMIT 10 OFFSET 20 --Equivalent to LIMIT 20, 10

-- PROXIMO TURNO q NO asistio y es mayor a hoy. si es mayor q hoy debria ser un turno cancelado
SELECT fecha
FROM turno
WHERE paciente_id=1
AND estatusAsistio=0
AND estatusTurno=0
AND fecha > CURDATE() 
ORDER BY fecha DESC LIMIT 1

SELECT monto 
FROM turno 
ORDER BY monto DESC LIMIT 5

select num, fecha, hora, monto, estatusAsistio, estatusPago, estatusTurno
from turno
where paciente_id=1
and estatusAsistio=0 -- EstatusAsistio{ASISTIO, FALTO};
and estatusPago=0 -- EstatusPago{ABONADO, IMPAGO};
and estatusTurno=0 -- EstatusTurno{ACTIVO, INACTIVO};

select s.num nro, s.fecha fecha, d.des diagnostico, s.conclusion, s.estadoControl 
from seguimiento s, diagnostico d, paciente p
where s.diagnostico_id=d.id
and s.paciente_id=p.id
and s.conclusion is not null

select t.tratamiento_id nro, tr.des nombre, t.descTratamiento descripcion, t.fecha fecha
from turno t, tratamiento tr
where t.paciente_id=1
and t.tratamiento_id=tr.id
and t.descTratamiento not like ''

select  d.id nroDiag, d.des diagnostico, t.descDiagnostico descDiagnostico, t.fecha fecha
from turno t, diagnostico d
where t.paciente_id=1
and t.diagnostico_id=d.id

select  d.id nroDiag, d.des diagnostico, t.descDiagnostico descDiagnostico, t.fecha fecha
from turno t, diagnostico d
where t.paciente_id=1
and t.diagnostico_id=d.id
and t.descDiagnostico not like ''

select t.prueba_id nroPrueba, p.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.num nroTurno  
from turno t, prueba p
where t.paciente_id=1
and t.prueba_id=p.id

select t.prueba_id nroPrueba, p.des prueba, t.rdoPrueba resultado, t.fecha fecha, t.num nroTurno  
from turno t, prueba p
where t.paciente_id=1
and t.prueba_id=p.id
and t.rdoPrueba not like ''

select id 
from paciente
where concat_ws(', ', apellido, nombre) like '%max, marano manu%'

select t.fecha fecha, d.des nombre, t.descDiagnostico descripcion
from turno t, diagnostico d, paciente p
where t.diagnostico_id=d.id
and t.paciente_id=p.id
and d.des like 'bipolaridad'
group by t.fecha

select t.num, d.id, d.des, t.descDiagnostico, count(t.num) cant, t.paciente_id, p.nombre, p.apellido
from turno t, diagnostico d, paciente p
where t.diagnostico_id=d.id
and t.paciente_id=p.id
and t.paciente_id=1
group by t.paciente_id, p.nombre, p.apellido, d.id, d.des


select d.des,  count(t.num) cant, concat_ws(', ', p.apellido, p.nombre) paciente
from turno t, diagnostico d, paciente p
where t.diagnostico_id=d.id
and t.paciente_id=p.id
and t.paciente_id=1
group by d.des




select *
from turno t
where t.fecha >= '2014-05-12'
and t.fecha <= '2014-06-26'
and t.estatusAsistio = 0

select paciente_id, fecha
from turno t
where t.fecha >= '2014-05-12' and t.fecha <= '2014-05-26'
group by t.fecha


FROM Turno WHERE t.fecha LIKE '2014-05-12'

select count(*) cant 
from turno t
where t.fecha like '2014-05-12'
and t.hora like '09:00 a 10:00'
group by t.fecha, t.hora

select *
from turno t
where t.fecha like '2014-05-12'
and t.hora like '09:00 a 10:00'
group by t.fecha, t.hora

'%2014-05-12%'

select rh.id as NroRango, rh.horaIni as Inicio, rh.horaFin as Fin, hc.id, hd.horarioCab_id 
from horariocab hc, horariodet hd, dialaboral d, rangohorario rh
where hd.horarioCab_id=hc.id
and hd.rangoHorario_id = rh.id
and hc.diaLaboral_id=d.id
and d.estatus=0
and d.des like 'Miercoles'


select hc.*, d.* 
from horarioCab hc, DiaLaboral d
where dialaboral_id=d.id


select distinct rh.horaIni, rh.horaFin
from HorarioCab hc, HorarioDet hd, DiaLaboral d, RangoHorario rh
where hd.horarioCab_id = hc.id
and hd.rangoHorario_id = rh.id
and hc.diaLaboral_id = d.id
and d.estatus=0
and d.des like 'Viernes'

select d.des dia, d.estatus estado ,rh.horaIni desde, rh.horaFin hasta
from horariocab hc, horariodet hd, dialaboral d, rangohorario rh
where hd.horarioCab_id=hc.id
and hd.rangoHorario_id = rh.id
and hc.diaLaboral_id=d.id

and d.estatus=0
and d.des like 'Miercoles'






