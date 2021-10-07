drop database if exists dbclinica;
create database dbclinica;
use dbclinica;

create table empleado(
idEmpleado int not null auto_increment,
codEmpleado int not null,
username varchar(50) not null,
password varchar(50)not null,
tipoEmpleado boolean not null,
turno boolean not null,
primary key (idEmpleado)
);

create table paciente(
idPaciente int not null auto_increment,
codPaciente int not null,
username varchar(50) not null,
password varchar(50) not null,
primary key (idPaciente)
);

create table persona(
idPersona int not null auto_increment,
nombres varchar(50) not null,
apellidos varchar(70) not null,
docIdentidad int(10) not null,
numContacto int(9) null,
primary key (idPersona),
idEmpleado int,
idPaciente int,
constraint fk_empleado_per foreign key (idEmpleado) references empleado(idEmpleado),
constraint fk_paciente_per foreign key (idPaciente) references paciente(idPaciente)
on update cascade on delete cascade
);

create table medicamento(
idMedicamento int not null auto_increment,
codMedicamento int not null,
nombre varchar(50) not null,
laboratorio varchar(50)not null,
costo double default null,
cantidad int not null,
primary key (idMedicamento)
);

create table cama(
idCama int not null auto_increment,
codCama int not null,
categoria boolean,
estado boolean,
precio double default null,
primary key (idCama)
);

create table hospitalizacion(
idHospitalizacion int not null auto_increment,
codHospitalizacion int not null,
fechaEntrada date,
horaEntrada datetime,
fechaSalida date,
horaSalida datetime,
precio double default null,
estado boolean,
primary key (idHospitalizacion),
idPaciente int,
idEmpleado int,
idCama int,
constraint fk_paciente_hosp foreign key (idPaciente) references paciente(idPaciente),
constraint fk_empleado_hosp foreign key (idEmpleado) references empleado(idEmpleado),
constraint fk_cama_hosp foreign key (idCama) references cama(idCama)
on update cascade on delete cascade
);

insert into empleado(codEmpleado,username,password,tipoEmpleado,turno)values(2323,"larr","larr",1,1);
insert into paciente(codPaciente,username,password)values(1232,"Juana","123");
insert into persona(nombres,apellidos,docIdentidad,numContacto,idEmpleado,idPaciente) values 
('Luis', 'Romero', 12345678, 986885844, 1,null),
('Juana', 'La Cubana', 12345678, 986885844, null,1);

