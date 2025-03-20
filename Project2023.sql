
DROP DATABASE IF EXISTS project_db;
CREATE DATABASE project_db;
USE project_db;



CREATE TABLE etaireia(
  AFM char(9) NOT NULL,
  DOY varchar(30) NOT NULL,
  name varchar(35) NOT NULL DEFAULT 'unknown',
  tel varchar(10) DEFAULT 'unknown',
  street varchar(15) DEFAULT 'unknown',
  num int(11) NOT NULL,
  city varchar(45) DEFAULT 'unknown',
  country varchar(15) DEFAULT 'unknown',
  PRIMARY KEY (AFM)
);
INSERT INTO etaireia (AFM, DOY, name, tel, street, num, city, country)
VALUES
  ('874592301', 'DOY123', 'AJK Corporation', '2103890876', 'Panepistimiou', 123, 'Athens', 'Greece'),
  ('625847913', 'DOY987', 'XYZ Ltd.', '2310477555', 'Tsimiski', 456, 'Thesaloniki', 'Greece'),
  ('309485726', 'DOY111', 'BlueSky Enterprises', '2019237773', 'Warner St.', 84, 'London', 'United Kingdom'),
  ('111111110', 'aaa','konna', '6942936261','naupaktou', '32', 'Mesologgi', 'Greece'),
  ('222222220', 'bbb','alex', '6942936262','thessalonikis', '33', 'Paris', 'France'),
  ('333333330','ccc','giannis', '6942936263','lemesou', '34', 'Dubai', 'Emirates'),
  ('123456789','doy_111','zouboulakisSA','2105673896','basilews Alej',39,'Athens','Greece'),
  ('751239864', 'DOY444', 'Sunshine Co.', '18647587', 'Rue de Bois', 101, 'Paris', 'France'),
  ('482976510', 'DOY777', 'Tech Innovators', '3091424730', 'Hausvogteipl.', 112, 'Berlin', 'Germany');

  
CREATE TABLE user (
username varchar(30) DEFAULT 'unknown' NOT NULL,
password varchar(20) NOT NULL,
name varchar(25)  DEFAULT 'unknown',
lastname varchar(35)  DEFAULT 'unknown',
reg_date date NOT NULL,
email varchar(30)  DEFAULT 'unknown',
PRIMARY KEY (username),
INDEX idx_password (password)
);

INSERT INTO user
VALUES
	('georgepap98', 'gpap1998', 'Georgios', 'Papanikolaou', '2019-09-18', 'gpap@gmail.com'),
    ('maryjane12', '12345678', 'Maria', 'Georgiou', '2020-12-02', 'maryjane12@hotmail.com'),
    ('jameshen', 'jamhen84', 'James', 'Henderson', '2017-03-22', 'jamesHenderson@gmail.com'),
    ('choojuan78', 'psswrd123', 'Juan', 'Choo', '2021-11-09', 'juanchoo3@gmail.com'),
    ('albysmth', 'smith1978', 'Albert', 'Smith', '2015-01-15', 'albysmith@gmail.com'),
    ('ElMull12', 'muller876', 'Ellen', 'Muller', '2019-05-30', 'EllenMul@gmail.com'),
    ('StephanosN9', 'stephnine', 'Stephanos', 'Filipou', '2020-10-10', 'staphfil@hotmail.com'),
    ('Gab4unc4', 'auncl44', 'Gabriel', 'Aunclair', '2022-07-05', 'gabriel_aunclair@gmail.com'),
    ('NatNowak','natalno12','Natalia','Nowak','2016-02-17','Natalia.Nowak@gmail.com'),
    ('miguelES','migGarcia','Miguel','Garcia','2020-10-03','miguelgarcES@hotmail.com'),
	('johnD78', '77778888', 'John', 'Doe', '2022-01-05', 'john.doe@gmail.com'),
    ('JSmith09', 'jansmt3', 'Jane', 'Smith', '2018-07-14', 'jane.smith@hotmail.com'),
    ('konmag', 'aaa', 'konstantina', 'magalou', '2017-01-01', 'konmag@gmail.com'),
	('alexvamv', 'bbb', 'alexandros', 'vamvakidis', '2018-01-01', 'alexvamv@gmail.com'),
	('gianniszoub', 'ccc', 'giannis', 'zouboulakis', '2019-01-01', 'gianniszoub@gmail.com'),
	('panagiotakkl', 'ddd', 'panagiota', 'kekelou', '2020-01-01', 'panagiotakkl@gmail.com'),
	('evaktv', 'eee', 'eva', 'katsavou', '2017-01-01', 'evaktv@gmail.com'),
	('venetiaben', 'fff', 'venetia', 'benatou', '2018-01-01', 'venetiaben@gmail.com'),
	('helenant', 'ggg', 'helen', 'antonopoulou', '2019-01-01', 'helenant@gmail.com'),
	('mairalag', 'hhh', 'maira', 'lagoudi', '2020-01-01', 'mairalag@gmail.com'),
	('chrisboo', 'iii', 'chris', 'boo', '2017-01-01', 'chrisboo@gmail.com'),
	('annitapania', 'jjj', 'annita', 'pania', '2018-01-01', 'annitapania@gmail.com'),
	('leonardodi', 'kkk', 'leonardo', 'dikaprio', '1990-01-01', 'leonardodi@gmail.com'),
	('amarildolou', 'lll', 'amarildo', 'louzi', '2023-01-01', 'amarildolou@gmail.com'),
    ('BraveSpirit','23637272','john','papadopoulos','2010-6-7','gshssgdsh@gmail.com'),
    ('Son','3213682','liolis','dimitriou','2015-11-26','rstsy28@gmail.com'),
    ('flylo','1782612781','basilis','zisoulis','2000-9-2','hjc75c@gmail.com'),
    ('moneymaker','267389263','mpampis','karagiannis','2019-8-6','isisipo@gmail.com'),
	('lol','0920920933','stathis','manwlas','2007-9-9','stath6@gmail.com'),
    ('bardos','698666678','lakis','kwstantinou','2018-12-29','akjhst@gmail.com'),
    ('nana','8823632342','mitsos','tentoglou','2017-2-9','llokloks@gmail.com'),
    ('bomber','15263728','aleksandros','aggelatos','2004-1-3','xjisaxjsiu@gmail.com'),
    ('simos','8129127365839','takis','tsitspas','2000-7-23','kokjhtr@gmail.com'),
    ('kalos','625434256','manos','blaxos','2018-2-13','hatxuuhb@gmail.com'),
    ('megalos','9292020376','petros','mantalos','2006-5-18','kasastr@gmail.com'),
    ('raptor','1889182927','nikos','raptis','2009-8-8','ddtjkgyk@gmail.com'),
    ('alex','123','alexan','vamv','2010-09-08','sdasda*gmail.com'),
    ('zoubou','456','gainnis','zoub','2010-09-08','sdasda*gmail.com');
    
CREATE TABLE DataBaseAdmin(
dba_username varchar(30) not null,
dba_password varchar(20) not null,
start_date DATE not null,
end_date DATE null,
primary key (dba_username),
constraint dbausr
foreign key (dba_username) references user(username)
on update cascade on delete cascade,
constraint dbapass
foreign key (dba_password) references user(password)
on update cascade on delete cascade
);
INSERT INTO DataBaseAdmin
VALUES ('alex','123','2020-09-14',null),
		('zoubou','456','2019-06-09',null);

    
CREATE TABLE evaluator(
username varchar(30) DEFAULT 'unknown' NOT NULL,
exp_years tinyint(4) not null,
firm char(9) ,
PRIMARY KEY (username),
CONSTRAINT EVUSRNM
FOREIGN KEY (username) REFERENCES user(username)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT ETAIREIA
FOREIGN KEY (firm) REFERENCES etaireia(AFM)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO evaluator 
VALUES
	('maryjane12','4','625847913'),
    ('jameshen','3','309485726'),
    ('albysmth','4','625847913'),
    ('Gab4unc4','5','874592301'),
    ('miguelES','5','874592301'),
    ('johnD78','1','309485726'),
    ('konmag', '5', '111111110'),
	('alexvamv', '4', '222222220'),
	('gianniszoub', '4', '333333330'),
	('panagiotakkl', '1', '111111110'),
	('evaktv', '2', '222222220'),
	('venetiaben', '3', '333333330'),
    ('BraveSpirit','10','123456789'),
    ('bomber','5','751239864'),
    ('flylo','5','482976510'),
    ('raptor','9','751239864'),
    ('nana','1','123456789'),
    ('Son','8','482976510');
    
    

CREATE TABLE job(
id int(11) NOT NULL,
start_date date ,
salary float NOT NULL,
position varchar(60) DEFAULT 'unknown',
edra varchar(60) DEFAULT 'unknown',
evaluator varchar(30) NOT NULL, 
announce_date datetime ,
submission_date date ,
PRIMARY KEY (id),
CONSTRAINT EVALUATES
FOREIGN KEY (evaluator) REFERENCES evaluator(username)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO job 
VALUES
	('9876543','2016-08-25','1400','Accountant','Greece','maryjane12','2016-06-03 14:36:09','2016-06-04'),
	('123456789','2017-12-03','2300','Mechanical Engineer','Greece','albysmth','2017-11-15 18:02:45','2017-11-18'),
	('87654321','2018-05-14','3300','Data base Administrator','United Kingdom','miguelES','2018-02-10 10:13:23','2018-02-13'),
	('2345678','2019-09-22','2000','Accountant','United Kingdom','Gab4unc4','2019-08-09 12:58:48','2018-08-17'),
	('98765432','2020-11-07','2700','Electrical Engineer','Greece','albysmth','2020-10-15 16:09:35','2020-10-20'),
	('43210987','2021-04-18','3000','C++ Developer','United Kingdom','Gab4unc4','2021-03-29 13:23:52','2021-04-02'),
	('1234567','2022-06-30','2100','Sales Manager','Greece','miguelES', '2022-06-02 10:13:06','2022-06-03'),
	('876543210','2022-01-10','2000','Budget Analyst','Greece','maryjane12', '2021-12-20 09:56:34','2021-12-22'),
    ('1101', '2020-09-01', '3000', 'A', 'Mesologgi','konmag', '2020-08-01 17:11:11', '2020-08-01'),
	('2202', '2021-09-01', '4500', 'B', 'France','alexvamv', '2021-08-01 22:11:11', '2021-08-01'),
	('3303', '2022-10-01', '5000', 'C', 'Dubai','gianniszoub', '2022-09-01 00:11:11', '2022-09-01'),
	('4404', '2019-09-01', '1500', 'D', 'Amsterdam','panagiotakkl', '2019-08-01 20:11:11', '2019-08-01'),
	('5505', '2020-09-01', '1650', 'E', 'Dhaka','evaktv', '2020-08-01 22:10:11', '2020-08-01'),
	('6606', '2020-10-01', '2000', 'F', 'Papua','venetiaben', '2020-09-01 21:20:11', '2020-09-01'),
	('7707', '2021-06-01', '1000', 'G', 'Stockholm','konmag', '2021-05-01 19:12:11', '2021-05-01'),
	('8808', '2020-04-01', '1500', 'H', 'Tokio','alexvamv', '2021-03-01 18:13:15', '2021-03-01'),
    ('672762823','2020-06-7','1200','manager','Athens','raptor','2020-1-5 11:00:00','2020-3-3'),
    ('203749373','2019-08-17','1200','manager','Athens','flylo','2019-7-30 12:00:00','2019-8-2'),
    ('251382255','2015-08-25','3000','hardware engineer','patra','BraveSpirit','2015-4-21 10:00:00','2015-6-9'),
    ('222938743','2017-06-09','4600','explosive materials','kalamata','bomber','2017-4-19 9:00:00','2017-6-1'),
    ('273839388','2022-01-15','800','electrician','Athens','Son','2021-8-19 8:00:00','2022-1-3'),
    ('560059860','2019-10-23','1800','logistics','patra','nana','2019-4-20 7:00:00','2019-7-1'),
	('009893798','2023-08-08','4000','software engineer','Athens','raptor','2023-5-9 6:00:00','2023-7-29'),
    ('382693468','2022-12-11','1230','logistics','Athens','flylo','2022-9-1 5:00:00','2022-11-30');


CREATE TABLE employee(								
username varchar(30) not null,						
bio text ,
sistatikes varchar(35),
certificates varchar(35),
primary key (username),
constraint EMUSRNM
foreign key (username) references user(username)
on delete cascade on update cascade
);

INSERT INTO employee
VALUES
	('georgepap98','Mechanical Engineer','sis.jpg',"Excellence_Certificate.pdf"),
    ('choojuan78','Electrical Engineer','iuuadf.pdf',"Innovation_Mastery.pdf"),
    ('ElMull12','Accountant','sdfsd.pdf',"Leadership_Prodigy.doc"),
    ('StephanosN9','C++ Developer','ssdf.doc',"Star_Performer.jpg"),
    ('NatNowak','Sales Manager','sds1.jpg',"Creative_Genius.docx"),
    ('JSmith09','Data Base Administrator','dsdf.pdf',"Recognition_2023.pdf"),
    ('helenant', 'Science is about knowing, engeneering is about doing', 'computer.jpg','rfer.pdf'),
	('mairalag', 'If you want peace, work for justice','law.jpg', 'gthrsbn.pdf'),
	('chrisboo', 'Wonder is the beginning of wisdom', 'kojon.pdf', 'kerfewjo.pdf'),
	('annitapania', 'Doc', 'koulon.doc', 'vneiuor.pdf'),
	('leonardodi', 'Tour guide', 'klio.pdf', 'neivbeib.pdf'),
	('amarildolou', 'meta', 'beugreari.pdf', 'vneiuvo.pdf'),
    ('lol','','ddsdssssf','sasdada'),
    ('megalos','dasdsdasd','','saddeethh'),
    ('bardos','ynutjtb','ytjbujbtj',''),
    ('moneymaker','','',''),
    ('simos','sjdismsoc','dedded',''),
    ('kalos','','sospiuoiduc','');


CREATE TABLE subject (
    title VARCHAR(36)  NOT NULL,
    descr TINYTEXT NULL,
    belongs_to VARCHAR(36) DEFAULT 'unknown' NULL,
    PRIMARY KEY (title),
    CONSTRAINT SUB
    FOREIGN KEY (belongs_to) REFERENCES subject(title)
    ON DELETE set null ON UPDATE CASCADE
);

INSERT INTO subject 
VALUES 
	('Mathematics I','descr.pdf',NULL),
	('Programming Languages','progl.doc',NULL),
    ('Financial Accounting','finAcc.pdf',NULL), 
    ('Data Bases','dbdescr.pdf',NULL),
    ('Physics','PhysDescr.pdf',NULL),
    ('C++ Programming','c++.doc','Programming Languages'),
    ('Statistics','statsgtk.doc','Mathematics I'),
    ('Big Data Technologies','bdtech.doc','Data Bases'),
    ('vaseis dedomenon', '', 'vaseis dedomenon'),
	('dioikisi', '', 'dioikisi'),
	('philosofia tou nou', '', 'philosofia tou nou'),
	('anatomia', '', 'anatomia'),
	('hlektronika', '', 'hlektronika'),
	('statistiki', '', 'statistiki'),
	('organiki xhmeia', '', 'organiki xhmeia'),
	('pithanotites', '', 'pithanotites'),
    ('math','Discover the beauty of the so called universal language that guides humanity through its sientific journey.','math'),
    ('Art','','Art'),
    ('Astronomy','Learn about the forces that forged earth and its inhabitats at the center of massive stars.','Astronomy'),
    ('geometry','Midis ageometritos eisito.','geometry'),
    ('physical education','','physical education'),
    ('religion','','religion'),
    ('greek','','greek');
    

  

CREATE TABLE requires(
requirement_id int(10) not null auto_increment,
job_id int(11) NOT NULL,
subject_title varchar(36) DEFAULT 'unknown' NOT NULL,
PRIMARY KEY (requirement_id),
CONSTRAINT JOB
FOREIGN KEY (job_id) REFERENCES job(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT SBJCT
FOREIGN KEY (subject_title) REFERENCES subject(title)
ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO requires (job_id, subject_title)
VALUES
    ('9876543', 'Mathematics I'),
    ('123456789', 'Physics'),
    ('1234567', 'Financial Accounting'),
    ('98765432', 'Physics'),
    ('87654321', 'Data Bases'),
    ('43210987', 'C++ Programming'),
    ('876543210', 'Statistics'),
    ('87654321', 'Big Data Technologies'),
    ('1101', 'vaseis dedomenon'),
	('2202', 'dioikisi'),
	('3303', 'philosofia tou nou'),
	('4404', 'anatomia'),
	('5505', 'hlektronika'),
	('6606', 'statistiki'),
	('7707', 'organiki xhmeia'),
	('8808', 'pithanotites'),
    ('672762823','math'),
    ('203749373','Art'),
    ('251382255','Astronomy'),
    ('222938743','physics'),
    ('273839388','geometry'),
    ('560059860','physical education'),
	('009893798','religion'),
    ('382693468','greek');
    
    
    
    
    

CREATE TABLE languages(
candid varchar(30) NOT NULL,
lang set('EN','FR','SP','GE','CH','GR') NULL,
PRIMARY KEY (candid),
CONSTRAINT LNG
FOREIGN KEY (candid) REFERENCES employee(username)
ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO languages
VALUES
	('georgepap98','EN,GR'),
    ('choojuan78','EN,CH'),
    ('ElMull12','EN,GE'),
    ('JSmith09','EN,FR,SP'),
    ('helenant', 'GR'),
	('mairalag', 'FR'),
	('chrisboo', 'GE'),
	('annitapania', 'SP'),
    ('megalos','EN'),
    ('simos','GR'),
    ('bardos','GE'),
    ('lol','SP');
    
    

CREATE TABLE project(
candid varchar(30) NOT NULL,
num tinyint(4) not NULL ,
descr text NULL,
url varchar(60) NOT NULL,
PRIMARY KEY (candid,num),
-- UNIQUE KEY (num),
CONSTRAINT PRJ
FOREIGN KEY (candid) REFERENCES employee(username)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO project (candid,num,descr,url) VALUES
	('georgepap98','1','Thermosys Engineering', 'ThermosysEngineeringHub.com'),
    ('ElMull12','1', 'TaxGenius Systems', 'TaxGeniusSystemsTech.com'),
    ('choojuan78','1', 'ControlSync Innovate', 'ControlSyncInnovateTech.com'),
    ('georgepap98','2', 'AeroDyn Concepts', 'AeroDynConceptsTech.com'),
    ('NatNowak','1', 'GrowthGuru Innovations', 'GrowthGuruInnovations.com'),
    ('StephanosN9','1', 'ProgPulse Solutions', 'ProgPulseSolutionsHub.com'),
    ('choojuan78','2', 'CircuitCraft Innovations', 'CircuitCraftInnovations.com'),
    ('helenant','1', '', 'https://shorturl.at/afyV8'),
	('mairalag','1','', 'https://shorturl.at/ntuxK'),
	('chrisboo','1','', 'https://shorturl.at/j2389'),
	('annitapania','1','', 'https://shorturl.at/pEHRW'),
	('leonardodi','1','', 'https://shorturl.at/erio'),
	('annitapania','2','', 'https://shorturl.at/fxGQ8'),
	('amarildolou','1','', 'https://shorturl.at/5kazou'),
    ('megalos','1', 'Thermosys Engineering', 'ThermosysEngineeringHub.com'),
    ('kalos','1', 'TaxGenius Systems', 'TaxGeniusSystemsTech.com'),
    ('simos','1', 'ControlSync Innovate', 'ControlSyncInnovateTech.com'),
    ('moneymaker','1', 'AeroDyn Concepts', 'AeroDynConceptsTech.com'),
    ('megalos','2', 'GrowthGuru Innovations', 'GrowthGuruInnovations.com'),
    ('kalos','2', 'ProgPulse Solutions', 'ProgPulseSolutionsHub.com'),
    ('simos','2', 'CircuitCraft Innovations', 'CircuitCraftInnovations.com');

    
DELIMITER $
CREATE TRIGGER set_project_number_trigger
BEFORE INSERT ON project
FOR EACH ROW
BEGIN
    DECLARE max_num INT;

    -- Find the maximum num for the given candidate
    SELECT MAX(num) + 1 INTO max_num
    FROM project
    WHERE candid = NEW.candid;

    -- Set the new num value
    SET NEW.num := max_num;
END$

DELIMITER ;
    

CREATE TABLE applies(
cand_usrname varchar(30) DEFAULT 'unknown' NOT NULL,
job_id int(11) NOT NULL,
sub_date DATE NOT NULL,
evaluator1 varchar(30) null default 'unknown',
evaluator2 varchar(30) null default 'unknown',
grade1 tinyint(4) null DEFAULT NULL,
grade2 tinyint(4) null DEFAULT NULL,
averg float(10) DEFAULT '0',
status enum('active', 'completed','canceled') DEFAULT 'active' NOT NULL,
PRIMARY KEY (cand_usrname,job_id,status),
CONSTRAINT CANDNAME
FOREIGN KEY (cand_usrname) REFERENCES employee(username)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT JOBID
FOREIGN KEY (job_id) REFERENCES job(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT EVAL1
FOREIGN KEY (evaluator1) REFERENCES evaluator(username)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT EVAL2
FOREIGN KEY (evaluator2) REFERENCES evaluator(username)
ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO applies (cand_usrname,job_id,sub_date,evaluator1,evaluator2,grade1,grade2,status)
VALUES
('georgepap98', '123456789', '2022-03-15','maryjane12', 'miguelES', 7, 15, 'active'),
('choojuan78', '9876543', '2022-04-20','konmag', 'nana', 11, 2, 'active'),
('ElMull12', '9876543', '2022-05-01','venetiaben', 'BraveSpirit', 13, 16, 'active'),
('ElMull12', '2345678', '2022-06-10','raptor', 'alexvamv', 18, 9, 'active'),
('NatNowak', '1234567', '2022-05-20','flylo', 'gianniszoub', 6, 14, 'canceled'),
('StephanosN9', '43210987', '2022-06-05','bomber', 'evaktv', 17, 3, 'active'),
('helenant', '1101', '2020-08-10','johnD78', 'Son', 12, 10, 'active'),
('mairalag', '2202','2021-09-20','albysmth', 'Gab4unc4', 1, 5,'active'),
('chrisboo', '3303','2022-10-02','maryjane12', 'miguelES', 16, 7,'active'),
('annitapania', '4404','2019-09-25','konmag', 'nana', 4, 8,'active'),
('leonardodi', '5505','2020-09-05','venetiaben', 'BraveSpirit', 5, 19,'active'),
('amarildolou', '6606','2020-10-01','raptor', null, 2, 11,'active'),
('bardos','222938743','2017-05-09','flylo', 'gianniszoub', 15, 13,'active'),
('simos','672762823','2020-06-05','bomber', 'evaktv', 8, 4,'canceled'),
('megalos','382693468','2022-12-03','johnD78', 'Son', 10, 1,'active'),
('lol','560059860','2017-03-12','albysmth', 'Gab4unc4', 14, 18,'active'),
('moneymaker','009893798','2023-07-18','maryjane12', 'miguelES', 9, 6,'active'),
('kalos','203749373','2020-09-30',null,'gianniszoub', 20, 12,'active'),
('kalos', '222938743','2023-04-23','bomber', 'evaktv', 19, 20,'active');




    
    
CREATE TABLE degree(
titlos varchar(150) DEFAULT 'unknown' NOT NULL,
idryma varchar(150) DEFAULT 'unknown' NOT NULL,
bathmida enum('BSc', 'MSc', 'PhD'),
PRIMARY KEY (titlos)
);
INSERT INTO degree
VALUES
	('Computer Enginnering','MIT','MSc'),
    ('Electrical Engineering and Computer Science','Peking University','MSc'),
    ('Mechanical Enginnering','Univercity of Patras','MSc'),
    ('Business Administration','Heidelberg University','BSc'),
    ('Computer Science and Engineering','Aristotle Univercity of Thessaloniki','BSc'),
    ('Logistics and Economic Sciences','University of Warsaw','PhD'),
    ('engineer', 'ceid', 'BSc'),
	('lawyer','Panteios','MSc'),
	('philosopher', 'Aristoteleio Panepistimio', 'PhD'),
	('doctor', 'Panepistimio Thessalias', 'BSc'),
	('guide', 'Panepistimio Peloponisou', 'MSc'),
	('mechanic', 'Mesogeiako Panepistimio', 'PhD'),
    ('computer engineer', 'ekpa', 'BSc'),
	('computer science','Panteios','MSc'),
	('software engineer', 'Aristoteleio Panepistimio', 'PhD'),
	('technician', 'Panepistimio Thessalias', 'BSc'),
	('physisist', 'Panepistimio Peloponisou', 'MSc'),
	('historian', 'Mesogeiako Panepistimio', 'PhD');




CREATE TABLE has_degree(
degr_title varchar(150) DEFAULT 'unknown' NOT NULL,
degr_idryma varchar(150) DEFAULT 'unknown' NOT NULL,
cand_usrname varchar(30) DEFAULT 'unknown' NOT NULL,
etos year(4),
grade float,
PRIMARY KEY (degr_title,degr_idryma,cand_usrname),
CONSTRAINT DEGRTTL
FOREIGN KEY (degr_title) REFERENCES degree(titlos)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT CANDUSRNM
FOREIGN KEY (cand_usrname) REFERENCES employee(username)
ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO has_degree
VALUES
	('Electrical Engineering and Computer Science','Peking University','choojuan78','2010','8.4'),
    ('Mechanical Enginnering','Univercity of Patras','georgepap98','2014','9'),
    ('Logistics and Economic Sciences','University of Warsaw','NatNowak','2016','7.5'),
    ('Computer Enginnering','MIT','JSmith09','2011','6.8'),
    ('engineer', 'ceid', 'helenant', '2027', '9.6'),
	('lawyer','Panteios','mairalag','2026','9.8'),
	('philosopher', 'Aristoteleio Panepistimio', 'chrisboo','2025','10'),
	('doctor', 'Panepistimio Thessalias', 'annitapania', '2030', '9'),
    ('technician', 'ekpa', 'moneymaker', '2027', '9.6'),
	('historian','Panteios','simos','2026','9.8'),
	('physisist', 'Aristoteleio Panepistimio', 'kalos','2025','10'),
	('computer engineer', 'Panepistimio Thessalias', 'megalos', '2030', '9');



create table job_employee(
Job int(10) not null,
Employee varchar(30) not null default 'unknown',
primary key (Job),
constraint JB
foreign key (Job) references job(id) 
on update cascade on delete cascade

);
INSERT INTO job_employee
VALUES 
	('9876543',DEFAULT),
    ('123456789',DEFAULT),
    ('87654321',DEFAULT),
    ('2345678',DEFAULT),
    ('98765432',DEFAULT),
    ('43210987',DEFAULT),
    ('1234567',DEFAULT),
    ('876543210',DEFAULT),
    ('672762823',DEFAULT),
    ('203749373',DEFAULT),
    ('251382255',DEFAULT),
    ('222938743',DEFAULT),
    ('273839388',DEFAULT),
    ('560059860',DEFAULT),
    ('009893798',DEFAULT),
    ('382693468',DEFAULT),
    ('1101',default),
    ('2202',default),
    ('3303',default),
    ('4404',default),
    ('5505',default),
    ('6606',default),
    ('7707',default),
    ('8808',default);

    
    
CREATE TABLE history_applies(
    employee varchar(30),
    job int(10),
    evaluator1 VARCHAR(30),
    evaluator2 VARCHAR(30),
    status ENUM('completed') default 'completed',
    average float(10,1)
    
);
-- Εισαγωγή 60.000 τυχαίων εγγραφών στον πίνακα history_applies
INSERT INTO history_applies (employee, job, evaluator1, evaluator2, status, average)
SELECT 
    e.username AS employee,
    j.id AS job,
    ev1.username AS evaluator1,
    ev2.username AS evaluator2,
    'completed' AS status,
	ROUND(RAND() * 20, 1) AS average -- Χρήση της συνάρτησης ROUND για δύο δεκαδικά ψηφία
FROM 
    employee e,
    job j,
    evaluator ev1,
    evaluator ev2
ORDER BY 
    RAND()
LIMIT 60000;

CREATE TABLE log(
log_id INT AUTO_INCREMENT,
Action enum('Insert', 'Update','Delete'),
Table_name VARCHAR(30) NOT NULL ,
table_row text,
username VARCHAR(30) NOT NULL,
action_datetime DATETIME NOT NULL,
PRIMARY KEY (log_id)
);

	
	




DELIMITER //

/*3.1.3.1*/
CREATE PROCEDURE CheckEvaluationGrade(
    IN evaluator_username VARCHAR(30),
    IN employee_username VARCHAR(30),
    IN job_id INT,
    OUT grade INT 
)
BEGIN
    DECLARE grade_count INT;
	DECLARE eval1 VARCHAR(255);
    DECLARE eval2 VARCHAR(255);
    DECLARE grad1 INT;
    DECLARE grad2 INT;
    
    SELECT COUNT(*), evaluator1, evaluator2, grade1, grade2
	INTO grade_count, eval1, eval2, grad1, grad2
	FROM applies a
	WHERE cand_usrname = employee_username
    AND a.job_id = job_id
    AND (evaluator1 = evaluator_username OR evaluator2 = evaluator_username)
GROUP BY cand_usrname, job_id, evaluator1, evaluator2, grade1, grade2;

    
    IF grade_count is null  THEN
        SET grade = 0;
    ELSE
				CASE
						WHEN eval1 = evaluator_username AND grad1 IS NOT NULL THEN 
						     SET grade = grad1;
						WHEN eval1 = evaluator_username AND grad1 IS NULL THEN 
                             SET grad1 = 0;
                        
							 SET grad1 = grad1 + IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'BSc'), 0) * 1
								+ IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'MSc'), 0) * 2
								+ IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'PhD'), 0) * 3
								+ IFNULL((SELECT COUNT(*) FROM languages l WHERE l.candid = employee_username), 0) * 1
								+ IFNULL((SELECT COUNT(*) FROM project p WHERE p.candid = employee_username), 0) * 1;
                                
							 UPDATE applies 
                             SET grade1 = grad1
                             WHERE cand_usrname = employee_username AND applies.job_id = job_id; 
							 SET grade = grad1;
						WHEN eval2 = evaluator_username AND grad2 IS NOT NULL THEN 
						     SET grade = grad2;
						WHEN eval2 = evaluator_username AND grad2 IS NULL THEN 
	                         SET grad2 = 0;
                        
							 SET grad2 = grad2 + IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'BSc'), 0) * 1 
								+ IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'MSc'), 0) * 2
								+ IFNULL((SELECT COUNT(*) FROM has_degree hd WHERE hd.cand_usrname = employee_username AND hd.degr_title = 'PhD'), 0) * 3
								+ IFNULL((SELECT COUNT(*) FROM languages l WHERE l.candid = employee_username), 0) * 1
								+ IFNULL((SELECT COUNT(*) FROM project p WHERE p.candid = employee_username), 0) * 1;
                             SET grade = grad2;
                             
                             UPDATE applies 
                             SET grade2 = grad2
                             WHERE cand_usrname = employee_username AND applies.job_id = job_id; 
							
                               
					END CASE;
        END IF;
        
             
END //
/*3.1.3.2*/
CREATE PROCEDURE EditApplies(
    IN p_employee_username VARCHAR(30),
    IN p_job_id INT,
    IN p_sub_date DATE,
    IN p_action CHAR(1)
)
BEGIN
    DECLARE evaluator1_username VARCHAR(30);
    DECLARE evaluator2_username VARCHAR(30);
    DECLARE existing_applications INT;
	declare p_status enum('active','canceled');
    DECLARE eval_firm int(10);
    
    -- Check if the application already exists
    SELECT COUNT(*)
    INTO existing_applications
    FROM applies
    WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
    
    
    SELECT status INTO p_status
    FROM applies
    WHERE job_id = p_job_id AND cand_usrname = p_employee_username;
    
    -- Get evaluators for the given job from the same company
    SELECT evaluator1, evaluator2 INTO evaluator1_username, evaluator2_username
    FROM applies
    WHERE job_id = p_job_id AND cand_usrname = p_employee_username;
   	
    IF p_action = 'i' THEN
			IF existing_applications > 0 and p_status = 'active' THEN              
					IF evaluator1_username IS NULL  THEN  
                    SET eval_firm = (SELECT firm FROM evaluator where username = evaluator2_username);
							SET evaluator1_username = (SELECT username FROM evaluator  WHERE firm = eval_firm AND username != evaluator2_username ORDER BY RAND()  LIMIT 1);
							UPDATE applies
							SET evaluator1 = evaluator1_username
							WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
                            SET eval_firm = (SELECT firm FROM evaluator where username = evaluator2_username);
					ELSEIF evaluator2_username IS NULL  THEN
                    SET eval_firm = (SELECT firm FROM evaluator where username = evaluator1_username);
							SET evaluator2_username = (SELECT username FROM evaluator  WHERE firm = eval_firm AND username != evaluator1_username ORDER BY RAND() LIMIT 1);
							UPDATE applies
							SET evaluator2 = evaluator2_username
							WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
					ELSEIF evaluator1_username IS NULL AND evaluator2_username IS NULL THEN
							SET evaluator1_username = (SELECT username FROM evaluator  ORDER BY RAND()  LIMIT 1);
                            SET eval_firm = (SELECT firm FROM evaluator where username = evaluator1_username);
							SET evaluator2_username = (SELECT username FROM evaluator  WHERE firm = eval_firm  AND username != evaluator1_username ORDER BY RAND()  LIMIT 1);
							UPDATE applies
							SET evaluator1 = evaluator1_username,evaluator2 = evaluator2_username
							WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
					ELSE
							SIGNAL SQLSTATE '45000'
							SET MESSAGE_TEXT = 'Application already exists and all evaluator positions are covered';		
					END IF;
				
			ELSE
					SET evaluator1_username = (SELECT username FROM evaluator ORDER BY RAND()  LIMIT 1);
                    SET eval_firm = (SELECT firm FROM evaluator where username = evaluator1_username);
					SET evaluator2_username = (SELECT username FROM evaluator WHERE firm = eval_firm AND username != evaluator1_username ORDER BY RAND()  LIMIT 1);
					INSERT INTO applies (cand_usrname, job_id, sub_date, evaluator1, evaluator2)
					VALUES (p_employee_username, p_job_id, p_sub_date, evaluator1_username, evaluator2_username);
			END IF;
 
    ELSEIF p_action = 'c' THEN
        IF existing_applications > 0 THEN
            IF p_status = 'canceled' THEN
                SIGNAL SQLSTATE '45000'
                SET MESSAGE_TEXT = 'Already canceled application';
            ELSE
                UPDATE applies
                SET status = 'canceled', sub_date = p_sub_date
                WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
               
            END IF;
        ELSE
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Application does not exist';
        END IF;

    ELSEIF p_action = 'a' THEN
        /* Activate a canceled application */
        IF (SELECT COUNT(*) FROM applies WHERE cand_usrname = p_employee_username AND job_id = p_job_id AND status = 'canceled') > 0 THEN
            UPDATE applies
            SET status = 'active'
            WHERE cand_usrname = p_employee_username AND job_id = p_job_id;
        ELSE
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT =  'No canceled application found for the given employee and job.';
        END IF;

    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Invalid action. Please provide \'i\', \'c\', or \'a\' as the action.';
    END IF;
END //


/*3.1.3.3*/
CREATE PROCEDURE apply_evaluation_and_results(IN job int(10))
BEGIN
    -- Declare variables for cursor and other values
    DECLARE done INT DEFAULT FALSE;
    DECLARE cand_usrnm VARCHAR(30);
    DECLARE eval1 VARCHAR(30);
	DECLARE eval2 VARCHAR(30);
    DECLARE grd1 INT(10);
    DECLARE grd2 INT(10);
    DECLARE submission_date DATE;
    DECLARE avg_grade float;
    
	DECLARE winning_employee VARCHAR(30);
    DECLARE winning_eval1 VARCHAR(30);
    DECLARE winning_eval2 VARCHAR(30);
    DECLARE winning_avg_grade float;
    DECLARE winner_sub_date DATE;

    -- Declare cursor for fetching promotion requests
    DECLARE cur_promotions CURSOR FOR
        SELECT
            cand_usrname,
            grade1,
			grade2,
            evaluator1,
            evaluator2,
            sub_date
        FROM
            applies
        WHERE status = 'active' and job_id = job;

    -- Declare continue handler for cursor
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    -- Open the cursor
    OPEN cur_promotions;
    
    
        -- Loop through promotion requests
		promotion_loop: LOOP
        
        
       -- Fetch data from the cursor
			FETCH cur_promotions INTO cand_usrnm,grd1,grd2,eval1,eval2,submission_date;

			-- Check if there are no more rows to process
			IF done THEN
				LEAVE promotion_loop;
			END IF;
            
				call CheckEvaluationGrade(eval1,cand_usrnm,job,grd1);
                call CheckEvaluationGrade(eval2,cand_usrnm,job,grd2);
                
               SET avg_grade = (grd1 + grd2) / 2;
               
            

			IF (avg_grade > (SELECT MAX(averg) FROM applies WHERE job_id = job )) OR (avg_grade = (SELECT MAX(averg) FROM applies WHERE job_id = job ) ) AND submission_date < winner_sub_date THEN
                -- Update the job_employee table with the candidate having the highest average grade for the specific job
					UPDATE job_employee je
					SET Employee = cand_usrnm
					WHERE je.Job = job;
                    
                    
					 
					IF winning_employee IS NOT NULL THEN
						UPDATE history_applies
						SET average = 0
						WHERE history_applies.job = job AND history_applies.employee = winning_employee;
                    END IF;    
					
                    
                    
                    SET winning_employee = cand_usrnm;
					SET winning_eval1 = eval1;
					SET winning_eval2 = eval2;
					SET winning_avg_grade = avg_grade;
                    SET winner_sub_date = submission_date;
                    
                    
                     -- Insert the winner into history_applies
					INSERT INTO history_applies (employee, job, evaluator1, evaluator2,status, average)
					VALUES (winning_employee, job, winning_eval1, winning_eval2,'completed', winning_avg_grade);
                   
				

					
			ELSE 
				INSERT INTO history_applies 
				VALUES (cand_usrnm, job,eval1, eval2,'completed', 0);
			
                
			END IF;
            
            
			UPDATE applies 
            SET averg = avg_grade
            WHERE cand_usrname = cand_usrnm AND job_id = job;
			
		END LOOP;
            
		-- Close the cursor
		CLOSE cur_promotions;
        DELETE FROM applies WHERE job_id = job;
        
    
END //

/*3.1.3.3*/
-- a)
CREATE INDEX idx_average ON history_applies(average)//

CREATE PROCEDURE SearchByGradeRange(IN start_grade FLOAT, IN end_grade FLOAT)
BEGIN
    SELECT employee, job
    FROM history_applies
    WHERE average BETWEEN start_grade AND end_grade;
END //

-- b)
CREATE INDEX idx2_average ON history_applies(evaluator1, evaluator2)//

CREATE PROCEDURE SearchByEvaluator(IN evaluator VARCHAR(255))
BEGIN
    SELECT employee, job
    FROM history_applies
    WHERE evaluator=evaluator1 OR evaluator=evaluator2;
END //

/*3.1.4.2.*/

CREATE TRIGGER AppliesCheck1
BEFORE INSERT ON applies
FOR EACH ROW
BEGIN
DECLARE active_applications INT(4);
DECLARE job_start_date DATE;

SELECT COUNT(*) INTO active_applications
FROM applies
WHERE cand_usrname=NEW.cand_usrname AND status='active';

 IF active_applications >= 3 THEN
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Cannot have more than 3 active applications.';
        END IF;

        -- Get the job's start date
        SELECT start_date INTO job_start_date
        FROM job
        WHERE job.id = NEW.job_id;

        -- Check if it's a new application for a job within 15 days before start_date
        IF  DATEDIFF(job_start_date, NEW.sub_date) < 15 or NEW.sub_date > job_start_date THEN
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'New applications must be submitted no more than 15 days before job`s start date.';
        END IF;

END//

/*3.1.4.3.*/

CREATE TRIGGER AppliesCheck2
BEFORE UPDATE ON applies
FOR EACH ROW
BEGIN
DECLARE job_start_date DATE;
DECLARE c_status enum('active','canceled');

	SELECT new.status INTO c_status
    FROM applies
    WHERE job_id = new.job_id AND cand_usrname = new.cand_usrname;
    
	SELECT start_date INTO job_start_date
    FROM job
    WHERE job.id = NEW.job_id;
    
	-- Check if it's possible to cancel the application
    IF  c_status = 'canceled' AND DATEDIFF(job_start_date, NEW.sub_date) < 10 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Applications can be canceled up to 10 days before job start_date.';
        END IF;

END//

/* 3.1.4.1 */

CREATE TRIGGER jobINSERT_logTrigger 
AFTER INSERT ON job
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Insert','Job' ,new.id,user(),now());

END //

CREATE TRIGGER jobUPDATE_logTrigger 
AFTER UPDATE ON job
FOR EACH ROW 
BEGIN 

	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Update','Job' ,new.id,user(),now());

END //

CREATE TRIGGER jobDELETE_logTrigger 
AFTER DELETE ON job
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Delete','Job' ,old.id,user(),now());

END //




/* Trigger για τον πίνακα user */

CREATE TRIGGER userINSERT_logTrigger 
AFTER INSERT ON user
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Insert','User',new.username,user(),now());

END //

CREATE TRIGGER userUPDATE_logTrigger 
AFTER UPDATE ON user
FOR EACH ROW 
BEGIN 

	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Update','User' ,new.username,user(),now());

END //

CREATE TRIGGER userDELETE_logTrigger 
AFTER DELETE ON user
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Delete','User' ,old.username,user(),now());

END //




/* Trigger για τον πίνακα degree */

CREATE TRIGGER degreeINSERT_logTrigger 
AFTER INSERT ON degree
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Insert','Degree' ,new.titlos,user(),now());

END //

CREATE TRIGGER degreeUPDATE_logTrigger 
AFTER UPDATE ON degree
FOR EACH ROW 
BEGIN 

	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Update','Degree' ,new.titlos,user(),now());

END //

CREATE TRIGGER degreeDELETE_logTrigger 
AFTER DELETE ON degree
FOR EACH ROW 
BEGIN 
	INSERT INTO log (action,table_name ,table_row,username,action_datetime)
    VALUES ('Delete','Degree' ,old.titlos,user(),now());

END //

DELIMITER ;












