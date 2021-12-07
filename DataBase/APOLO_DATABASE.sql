drop database if exists APOLO;
create database APOLO;
use APOLO;

create table AgenteSeguros(

	Id_Agente int(3) not null auto_increment primary key,
    Nombre_Agente varchar(60) not null,
    Email varchar(60) not null,
    Contra varchar(60) not null,
    Telefono varchar(60),
    Sexo varchar(30),
    Dir_Oficina varchar(60)

);


create table Contacto(

	Id_Contacto int(3) not null auto_increment primary key,
    Id_Agente int(3),
    Nombre_Contacto varchar(60),
    ApellidoP_Contacto varchar(60),
    ApellidoM_Contacto varchar(60),
    Correo varchar(60),
    Direccion varchar(100),
    Telefono varchar(20),
    Edad int(3),
    Sexo varchar(20),
    Estado_Civil varchar(30),
    Polizas_Activas int(3),
    Antecedentes_Financieros varchar(1000),
    Antecedentes_Penales varchar(1000),
    Antecedentes_Medicos varchar(1000),
    foreign key (Id_Agente) references AgenteSeguros (Id_Agente)
    
);

create table Cita(

	Id_Cita int(3) not null auto_increment primary key,
    Id_Contacto int(3),
    Id_Agente int(3),
    Tipo_Cita varchar(50),
    Fecha date,
    Direccion_Cita varchar(100),
    Proposito_Cita varchar(100),
    Notas_Import varchar(200),
    foreign key (Id_Contacto) references Contacto (Id_Contacto),
    foreign key (Id_Agente) references AgenteSeguros (Id_Agente)

);


create table Ventas(

	Id_Poliza int(3) not null auto_increment primary key,
    Id_Contacto int(3),
    Id_Agente int(3),
	Aseguradora varchar(50),
    Fecha_Venta date,
    Tipo_Pago varchar(60),
    Monto_Pago float(3,2),
    foreign key (Id_Contacto) references Contacto (Id_Contacto),
    foreign key (Id_Agente) references AgenteSeguros (Id_Agente)

);


select * from AgenteSeguros;



use APOLO;
drop procedure if exists GuardaAgente;
delimiter **
create procedure GuardaAgente( in nombreAgen varchar(60), in correoAgen varchar(60), in contraAgen varchar(60),in telefonoAgen varchar(60))
begin
 

INSERT INTO AgenteSeguros(Nombre_Agente, Email, Contra, Telefono ) 
values(nombreAgen,correoAgen, contraAgen, telefonoAgen );

end**

use APOLO;
drop procedure if exists ConsultaRegistro;
delimiter **
create procedure ConsultaRegistro( in correoAgen varchar(60), in contraAgen varchar(60))
begin
 
select * from AgenteSeguros where correoAgen = Email and contraAgen = Contra;

end**

use APOLO;
drop procedure if exists ConsultaDatosAgente;
delimiter **
create procedure ConsultaDatosAgente( in correoAgen varchar(60), in contraAgen varchar(60))
begin
 
select * from AgenteSeguros where correoAgen = Email and contraAgen = Contra;

end**



use APOLO;
drop procedure if exists ConsultaContactos;
delimiter **
create procedure ConsultaContactos( in IDAgente int(3))
begin
 
select * from Contacto where IDAgente = Id_Agente; 

end**








drop procedure if exists GuardaContacto;
delimiter **
create procedure GuardaContacto(
in CorreoA nvarchar(40),
in NombreC varchar(30),
in ApellidoPC varchar(30),
in ApellidoMC varchar(30),
in CorreoC varchar(60),
in DireccionC varchar(500), 
in TelefonoC varchar(20), 
in EdadC int(3),
in SexoC varchar(30),
in Estado_CivilC varchar(100),
in PolizasA int(3),
in AntecedentesFinancieros nvarchar(1000), 
in AntecedentesPenales nvarchar(1000), 
in AntecedentesMedicos nvarchar(1000))
begin
declare existe int;
declare existeA int;
declare idA int;
declare mjs nvarchar(50);
declare idper int;
	set idA = (select Id_Agente from AgenteSeguros where Email = CorreoA );
	set existe = (select count(*) from Contacto where correo = CorreoC );
    set existeA = (select count(*) from AgenteSeguros where Email = CorreoA );
	set idper = (select Id_Contacto from Contacto where correo = CorreoC);  
			if(existe = 0)then
				if(existeA > 0)then
					INSERT INTO Contacto(Id_Agente,Nombre_Contacto,ApellidoP_Contacto,ApellidoM_Contacto,Correo,Direccion,Telefono,Edad,Sexo,Estado_Civil,Polizas_Activas,Antecedentes_Financieros,Antecedentes_Penales,Antecedentes_Medicos) 
					values (idA,NombreC,ApellidoPC,ApellidoMC,CorreoC,DireccionC,TelefonoC,EdadC,SexoC,Estado_CivilC,PolizasA,AntecedentesFinancieros,AntecedentesPenales,AntecedentesMedicos);
                    set mjs = 'Persona registrada';
                else
					set mjs = 'El agente no existe en la base';
                end if;
            else 
            set mjs = 'Persona ya registrada';
            end if;
select idper as usuario, mjs as mensaje;
end**
select * from Contacto**
call GuardaContacto('juan&#x40;gmail.com','Rodrigo','Lopez','Lopez','a&#x40;gmail.com','Calle 1',5555555,10,'Masculino','Casado',4,'Nada','Nada','Nada')**

drop procedure if exists ActualizaContacto;
delimiter **
create procedure ActualizaContacto(
in NombreC varchar(30),
in ApellidoPC varchar(30),
in ApellidoMC varchar(30),
in CorreoC varchar(60),
in DireccionC varchar(500), 
in TelefonoC int(10), 
in EdadC int(3),
in SexoC varchar(30),
in Estado_CivilC varchar(100),
in PolizasA int(3),
in AntecedentesFinancieros nvarchar(1000), 
in AntecedentesPenales nvarchar(1000), 
in AntecedentesMedicos nvarchar(1000))
begin
declare existe int;
declare mjs nvarchar(50);
declare idper int;
	set existe = (select count(*) from Contacto where correo = CorreoC );
	set idper = (select Id_Contacto from Contacto where correo = CorreoC); 
			if(existe != 0)then
			update Contacto set  Nombre_Contacto = NombreC, ApellidoP_Contacto = ApellidoPC,ApellidoM_Contacto = ApellidoMC, Edad = EdadC , Sexo = SexoC ,Correo = CorreoC, Direccion= DireccionC, Telefono = TelefonoC, Estado_Civil=Estado_CivilC, Polizas_Activas= PolizasA,Antecedentes_Financieros = AntecedentesFinancieros,Antecedentes_Penales = AntecedentesPenales,Antecedentes_Medicos = AntecedentesMedicos
			where Id_Contacto = idper;
			set mjs = 'Contacto actualizada';
            else
				set mjs ='Contacto no registrado';
            end if;
select idper as usuario, mjs as mensaje;
end**
select * from Contacto**
call ActualizaContacto('Juan','Pedro','Lopez','a&#x40;gmail.com','Calle 1',5555555,10,'Masculino','Casado',4,'Nada','Nada','Nada')**


use WORKINC;
drop procedure if exists EliminaContacto;
delimiter **
create procedure EliminaContacto(
in CorreoC varchar(100))
begin
	declare msj varchar(80);
    declare existe int;
    declare idper int;
	set existe = (select count(*) from Contacto where correo = CorreoC );
	set idper = (select Id_Contacto from Contacto where correo = CorreoC); 
		if(existe = 1)then
			/*elimnar todos los registros de las demas tablas*/
			delete from Contacto where Id_Contacto=idper;
			set msj = 'Persona eliminada';
			select idper as usuario , msj as mensaje, CorreoC as correo ;
		else
			set msj = 'El correo no existe';
			select idper as usuario , msj as mensaje, CorreoC as correo ;
		end if;
end;**