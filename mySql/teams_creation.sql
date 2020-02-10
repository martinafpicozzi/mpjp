-- create database teams;
use teams;

-- coders
drop table if exists coders;

create table coders(
	coder_id integer
    primary key auto_increment,
    coder_name varchar(25),
    team_id integer 
		references teams(team_id),
	role_id integer
		references roles(role_id)
);

insert into coders (coder_name) values ('Cristina');
insert into coders (coder_name) values ('Lucia');
insert into coders (coder_name) values ('Mery');
insert into coders (coder_name) values ('Ilaria');
insert into coders (coder_name) values ('Rossella');
insert into coders (coder_name) values ('Chiara A');
insert into coders (coder_name) values ('Claudia');
insert into coders (coder_name) values ('Chiara B');
insert into coders (coder_name) values ('Laura');
insert into coders (coder_name) values ('Lucrezia');
insert into coders (coder_name) values ('Giulia');
insert into coders (coder_name) values ('Martina');
insert into coders (coder_name) values ('Noemi');
insert into coders (coder_name) values ('Francesca');

-- preferences
drop table if exists preferences;

create table preferences(
	preference_id integer
    primary key auto_increment,
    coder_id integer
		references roles(role_id),
	role_id integer
		references coders(coder_id),
	pref_value integer
    );
    
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Cristina'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Cristina'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Cristina'), (select role_id from roles where role_name = 'VS'), 3);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Cristina'), (select role_id from roles where role_name = 'CS'), 2);
    
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucia'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucia'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucia'), (select role_id from roles where role_name = 'VS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucia'), (select role_id from roles where role_name = 'CS'), 3);
    
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Mery'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Mery'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Mery'), (select role_id from roles where role_name = 'VS'), 3);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Mery'), (select role_id from roles where role_name = 'CS'), 2);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Ilaria'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Ilaria'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Ilaria'), (select role_id from roles where role_name = 'VS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Ilaria'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Rossella'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Rossella'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Rossella'), (select role_id from roles where role_name = 'VS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Rossella'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara A'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara A'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara A'), (select role_id from roles where role_name = 'VS'), 3);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara A'), (select role_id from roles where role_name = 'CS'), 2);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Claudia'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Claudia'), (select role_id from roles where role_name = 'MS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Claudia'), (select role_id from roles where role_name = 'VS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Claudia'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara B'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara B'), (select role_id from roles where role_name = 'MS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara B'), (select role_id from roles where role_name = 'VS'), 3);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Chiara B'), (select role_id from roles where role_name = 'CS'), 1);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Laura'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Laura'), (select role_id from roles where role_name = 'MS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Laura'), (select role_id from roles where role_name = 'VS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Laura'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucrezia'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucrezia'), (select role_id from roles where role_name = 'MS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucrezia'), (select role_id from roles where role_name = 'VS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Lucrezia'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Giulia'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Giulia'), (select role_id from roles where role_name = 'MS'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Giulia'), (select role_id from roles where role_name = 'VS'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Giulia'), (select role_id from roles where role_name = 'CS'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Martina'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Martina'), (select role_id from roles where role_name = 'TL'), 3);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Martina'), (select role_id from roles where role_name = 'TL'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Martina'), (select role_id from roles where role_name = 'TL'), 1);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Noemi'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Noemi'), (select role_id from roles where role_name = 'TL'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Noemi'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Noemi'), (select role_id from roles where role_name = 'TL'), 3);

insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Francesca'), (select role_id from roles where role_name = 'TL'), 0);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Francesca'), (select role_id from roles where role_name = 'TL'), 2);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Francesca'), (select role_id from roles where role_name = 'TL'), 1);
insert into preferences (coder_id, role_id, pref_value) values ((select coder_id from coders where coder_name = 'Francesca'), (select role_id from roles where role_name = 'TL'), 2);

-- teams
drop table if exists teams;

create table teams(
	team_id integer
    primary key auto_increment,
    team_name varchar(25)
);

insert into teams (team_name) values ('Blue');
insert into teams (team_name) values ('Yellow');
insert into teams (team_name) values ('Green');
insert into teams (team_name) values ('Red');

-- roles
drop table if exists roles;

create table roles(
	role_id integer
    primary key auto_increment,
    role_name varchar(25)
);

insert into roles (role_name) values ('TL');
insert into roles (role_name) values ('MS');
insert into roles (role_name) values ('VS');
insert into roles (role_name) values ('CS');
    