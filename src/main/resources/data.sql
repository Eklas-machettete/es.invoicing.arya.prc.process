DROP TABLE IF EXISTS country_catalog;
DROP TABLE IF EXISTS cif_catalog;
DROP TABLE IF EXISTS conceptos_catalog;
DROP TABLE IF EXISTS empresas_catalog;

CREATE TABLE country_catalog (id SERIAL NOT NULL, pais CHARACTER VARYING(255), siglas CHARACTER VARYING(255), PRIMARY KEY (id));
CREATE TABLE cif_catalog (id SERIAL NOT NULL, cif CHARACTER VARYING(255), nombre CHARACTER VARYING(255), pais CHARACTER VARYING(255), PRIMARY KEY (id));
CREATE TABLE conceptos_catalog (id SERIAL NOT NULL, concepto CHARACTER VARYING(255), casilla CHARACTER VARYING(255), titulo CHARACTER VARYING(255), celda INTEGER NOT NULL, PRIMARY KEY (id));
CREATE TABLE empresas_catalog (id SERIAL NOT NULL, empresa CHARACTER VARYING(255), nif CHARACTER VARYING(255), PRIMARY KEY (id));

INSERT INTO cif_catalog(id, cif, nombre, pais) VALUES 
(1,'244822460','CLEVERBRIDGE AG I','DE'),
(2,'261093044','AFMG TECHNOLOGIES GMBH I','DE'),
(3,'799920359','MEDIA ANALYTICS LIMITED I','GB'),
(5,'659372008','SCOTTISH POWER LTD S','GB'),
(6,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(7,'8513080735','AYESA POLSKA SPO KA Z OGRANICZON ODPOWI S','PL'),
(8,'244822460','CLEVERBRIDGE AG I','DE'),
(9,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(10,'244822460','CLEVERBRIDGE AG I','DE'),
(11,'6977481008','IBERDROLA RENOVABLES ITALIA SPA S','IT'),
(13,'340261106','MAURI PRODUCTS LIMITED S','GB'),
(14,'506442586','IBERDROLA - RENEWABLES PORTUGAL SA S','PT'),
(15,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(16,'007759630B01','MACO CUSTOMS SERVICE NETHERLANDS B.V. A','NL'),
(17,'239975861','DIGIKEY ELECTRONICS A','DE'),
(18,'321342363','SHENZHENSHI FUTIANQU SHANGMAO A','DE'),
(19,'272129022','SHENZHEN CHUNZEHUI ELECTRONIC TECHNOLOGY A','GB'),
(20,'5263267275','COS SUPPLIES & SERVICE LTD A','PL'),
(21,'239975861','DIGIKEY ELECTRONICS A','DE'),
(22,'272129022','SHENZHEN CHUNZEHUI ELECTRONIC TECHNOLOGY I','GB'),
(23,'70879613156','PMDE SHENZHEN ZAHOYANG SHANGMAO YOUXIAN I','FR'),
(24,'239975861','DIGIKEY ELECTRONICS I','DE'),
(25,'814584193','AMAZON EU, S.A.R.L. NIEDERLASSUNG D I','DE'),
(26,'8973230967','AMAZON EU SARL I','IT'),
(27,'272129022','SHENZHEN CHUNZEHUI ELECTRONIC TECHNOLOGY I','GB'),
(28,'299524842','KRAMKE BAUGESELLSCHAFT LIMITED I','GB'),
(29,'299524842','KRAMKE BAUGESELLSCHAFT LIMITED I','GB'),
(30,'244822460','CLEVERBRIDGE AG I','DE'),
(31,'2038940223','ARCODA SOCIETA A RESPONSABILITA LIMITA I','IT'),
(32,'3318271214','DGS S.P.A. I','IT'),
(33,'12988891003','SRL I','IT'),
(34,'26502275','JETBRAINS S.R.O. I','CZ'),
(35,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(36,'3317390288','LYNX S.P.A. S','IT'),
(37,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(38,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(39,'12988891003','SRL S','IT'),
(40,'509670610','IGENMAI, UNIPESSIAL LDA I','PT'),
(41,'133702898','DLUBAL SOFTWARE GMBH I','DE'),
(42,'244822460','CLEVERBRIDGE AG I','DE'),
(43,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(45,'500600643','REPSOL POLIMEROS, S.A. S','PT'),
(46,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(47,'34822229399','SARL CONDECO SOFTWARE SARL I','FR'),
(48,'397000555','REUTERS LTD I','GB'),
(49,'2038940223','ARCODA SOCIETA A RESPONSABILITA LIMITA I','IT'),
(50,'5724831002','ENGINEERING - INGEGNERIA INFORMATICA - S I','IT'),
(51,'9047681003','TOP DRIVER SOC. COOPERATIVA I','IT'),
(52,'10386150154','DS GROUP SPA I','IT'),
(53,'12988891003','SRL I','IT'),
(54,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(55,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(56,'980245974','ENDESA ENERGIA S A SUCURSAL PORTUGAL S','PT'),
(57,'22000460','ENEL ENERGIE SA S','RO'),
(58,'079273580B01','BIOTEC BASICS I','NL'),
(59,'244822460','CLEVERBRIDGE AG I','DE'),
(60,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP I','PL'),
(62,'500600643','REPSOL POLIMEROS, S.A. S','PT'),
(63,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(64,'17448603985','SAS PRIM X TECHNOLOGIES I','FR'),
(65,'384904621','GREY MATTER LTD I','GB'),
(66,'824390132','METERS AND MORE AISBL I','BE'),
(67,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(68,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(69,'6656421002','INDRA ITALIA SPA S','IT'),
(70,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(71,'317270350','AYESA AIR CONTROL GMBH S','DE'),
(72,'079273580B01','BIOTEC BASICS I','NL'),
(73,'244822460','CLEVERBRIDGE AG I','DE'),
(74,'799920359','MEDIA ANALYTICS LIMITED I','GB'),
(75,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(76,'454570209','D2S INTERNATIONAL SRL I','BE'),
(78,'500600643','REPSOL POLIMEROS, S.A. S','PT'),
(79,'244822460','CLEVERBRIDGE AG I','DE'),
(80,'34737997','UIPATH SRL I','RO'),
(81,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(82,'3318271214','DGS S.P.A. I','IT'),
(83,'12988891003','SRL I','IT'),
(84,'783948762','WORLD PROGRAMMING LTD I','GB'),
(85,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(86,'3317390288','LYNX S.P.A. S','IT'),
(87,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(88,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(89,'317270350','AYESA AIR CONTROL GMBH S','DE'),
(90,'244822460','CLEVERBRIDGE AG I','DE'),
(92,'247832876','PAYPRO EUROPE LIMITED I','GB'),
(94,'500600643','REPSOL POLIMEROS, S.A. S','PT'),
(95,'506442586','IBERDROLA - RENEWABLES PORTUGAL SA S','PT'),
(96,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(97,'34822229399','SARL CONDECO SOFTWARE SARL I','FR'),
(98,'8256796U ','MICROSOFT IRELAND OPERATION LIMITED I','IE'),
(99,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(100,'143454214','SAP SE I','DE'),
(101,'284066673','E.CONZEPT UG I','DE'),
(102,'3318271214','DGS S.P.A. I','IT'),
(103,'12988891003','SRL I','IT'),
(104,'130419059','CLOUD SECURITY ALLIANCE (EUROPE) CIC I','GB'),
(105,'164369978','NIGEL FRANK INTERNATIONAL LIMITED I','GB'),
(106,'3414808NH ','NEXT EDUCATION SERVICES LIMITED I','IE'),
(107,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(108,'6656421002','INDRA ITALIA SPA S','IT'),
(109,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(110,'12988891003','SRL S','IT'),
(111,'15416261004','ENEL GLOBAL SERVICES SRL S','IT'),
(112,'317270350','AYESA AIR CONTROL GMBH S','DE'),
(113,'205857986','INKASSO KROMER GMBH I','DE'),
(114,'244822460','CLEVERBRIDGE AG I','DE'),
(116,'500600643','REPSOL POLIMEROS, S.A. S','PT'),
(117,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(118,'244822460','CLEVERBRIDGE AG I','DE'),
(119,'8256796U ','MICROSOFT IRELAND OPERATION LIMITED I','IE'),
(120,'317270350','AYESA AIR CONTROL GMBH S','DE'),
(121,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(122,'244822460','CLEVERBRIDGE AG I','DE'),
(123,'12988891003','SRL I','IT'),
(124,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(125,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(126,'12988891003','SRL S','IT'),
(127,'63497842914','SAS ECOVADIS I','FR'),
(128,'079273580B01','BIOTEC BASICS I','NL'),
(129,'244822460','CLEVERBRIDGE AG I','DE'),
(130,'2917350734','EX.T.IN. S.R.L. I','IT'),
(131,'553526638','EXOVA GROUP (UK) LMITED I','GB'),
(132,'509670610','IGENMAI, UNIPESSIAL LDA I','PT'),
(133,'556515370601','ACHILLEVS INFORMATION AB I','SE'),
(135,'245838579','TEAM VIEWER I','DE'),
(136,'397000555','REUTERS LTD I','GB'),
(137,'317270350','AYESA AIR CONTROL GMBH S','DE'),
(139,'244822460','CLEVERBRIDGE AG I','DE'),
(140,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(141,'143454214','SAP SE I','DE'),
(142,'2038940223','ARCODA SOCIETA A RESPONSABILITA LIMITA I','IT'),
(143,'9047681003','TOP DRIVER SOC. COOPERATIVA I','IT'),
(144,'12988891003','SRL I','IT'),
(145,'727638995','TRIDIUM EUROPE LTD I','GB'),
(146,'6417689V ','TIBCO SOFTWARE (IRELAND) LTD I','IE'),
(147,'6426071C ','DIGITAL RIVER IRELAND LTD I','IE'),
(148,'9700053D ','APPLE DISTRIBUTION INTERNATIONAL LTD I','IE'),
(149,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(150,'3317390288','LYNX S.P.A. S','IT'),
(151,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(152,'12988891003','SRL S','IT'),
(153,'980245974','ENDESA ENERGIA S A SUCURSAL PORTUGAL S','PT'),
(154,'14507322','E-DISTRIBU IE MUNTENIA S.A. S','RO'),
(155,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(156,'817943602B01','MECANOO INTERNATIONAL B.V. I','NL'),
(157,'244822460','CLEVERBRIDGE AG I','DE'),
(158,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(160,'340261106','MAURI PRODUCTS LIMITED S','GB'),
(161,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(162,'817943602B01','MECANOO INTERNATIONAL B.V. I','NL'),
(163,'244822460','CLEVERBRIDGE AG I','DE'),
(164,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(165,'30719913','UNITY TECHNOLOGIES APS I','DK'),
(167,'340261106','MAURI PRODUCTS LIMITED S','GB'),
(168,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(169,'244822460','CLEVERBRIDGE AG I','DE'),
(170,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(171,'12988891003','SRL I','IT'),
(172,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(173,'264786997','THOMAS FUCHS, AIRCRAFT EMGINEERING I','DE'),
(174,'211006534','KEY-SYSTEMS GMBH I','DE'),
(175,'2917350734','EX.T.IN. S.R.L. I','IT'),
(176,'201750846','AUTODESK INC I','GB'),
(177,'247832876','PAYPRO EUROPE LIMITED I','GB'),
(178,'100011803019','PVCASE UAB I','LT'),
(180,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(181,'244822460','CLEVERBRIDGE AG I','DE'),
(182,'8256796U ','MICROSOFT IRELAND OPERATION LIMITED I','IE'),
(183,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(184,'2038940223','ARCODA SOCIETA A RESPONSABILITA LIMITA I','IT'),
(185,'9047681003','TOP DRIVER SOC. COOPERATIVA I','IT'),
(186,'12988891003','SRL I','IT'),
(187,'30499590552','PMDE ENDESA ENERGIA S','FR'),
(188,'6377691008','ENEL ITALIA S.R.L. S','IT'),
(189,'10914660153','IBM ITALIA SPA AYESA ADVANCED TECHNOLOGI S','IT'),
(190,'12988891003','SRL S','IT'),
(191,'244822460','CLEVERBRIDGE AG I','DE'),
(193,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(194,'397000555','REUTERS LTD I','GB'),
(195,'8256796U ','MICROSOFT IRELAND OPERATION LIMITED I','IE'),
(196,'9729353D ','BENTLEY SYSTEMS INTERNATIONAL LIMITED I','IE'),
(197,'12988891003','SRL S','IT'),
(199,'30499590552','PMDE ENDESA ENERGIA I','FR'),
(200,'100003432','UAB RUPTELA A','LT'),
(201,'2038940223','ARCODA SOCIETA A RESPONSABILITA LIMITA I','IT'),
(202,'3318271214','DGS S.P.A. I','IT'),
(203,'12988891003','SRL I','IT'),
(204,'384904621','GREY MATTER LTD I','GB'),
(205,'3438274LH ','IT GOVERNANCE EUROPE LIMITED I','IE'),
(206,'6426071C ','DIGITAL RIVER IRELAND LTD I','IE'),
(207,'12988891003','SRL S','IT'),
(208,'15416261004','ENEL GLOBAL SERVICES SRL S','IT'),
(209,'980245974','ENDESA ENERGIA S A SUCURSAL PORTUGAL S','PT'),
(210,'244822460','CLEVERBRIDGE AG I','DE'),
(211,'799920359','MEDIA ANALYTICS LIMITED I','GB'),
(213,'659372008','SCOTTISH POWER LTD S','GB'),
(214,'1070008409','AYESA INGENIERIA Y ARQUITECTURA, S.A. SP S','PL'),
(215,'8513080735','AYESA POLSKA SPOLKA Z O.O.','PL'),
(216,'1070008409','AYESA ING. Y ARQ., SUC. POLONIA','PL'),
(217,'825676083B01','RobotShop','NL'),
(218,'001281080B64','BIOTEC BASICS','NL'),
(219,'0417827795','ASSORTIS','BE'),
(220,'6760077945','DATACOMP Sp. z o.o.','PL');

INSERT INTO country_catalog (id, pais, siglas) VALUES (1, 'Alemania','DE'),
(2, 'Austria','AT'),
(3, 'B?lgica','BE'),
(4, 'Bulgaria','BG'),
(5, 'Checa Rep?blica','CZ'),
(6, 'Chipre','CY'),
(7, 'Croacia','HR'),
(8, 'Dinamarca','DK'),
(9, 'Slovaquia','SK'),
(10, 'Slovenia','SI'),
(11, 'Estonia','EE'),
(12, 'Finlandia','FI'),
(13, 'Francia','FR'),
(14, 'Grecia','EL'),
(15, 'Hungria','HU'),
(16, 'Irlanda','IE'),
(17, 'Italia','IT'),
(18, 'Letonia','LV'),
(19, 'Lituania','LT'),
(20, 'Luxemburgo','LU'),
(21, 'Malta','MT'),
(22, 'Pa?ses Bajos','NL'),
(23, 'Polonia','PL'),
(24, 'Portugal','PT'),
(25, 'Rumania','RO'),
(26, 'Suecia','SE');


INSERT INTO conceptos_catalog (id, concepto, casilla, titulo, celda) VALUES (1, 'Trabajo','03','DEVENGADO',4),
(2, 'Trabajo','02','RETENCION',3),
(3, 'Trabajo','01','PERCEPTORES',6),
(4, 'Especie','06','DEVENGADO',4),
(5, 'Especie','05','RETENCION',3),
(6, 'Especie','04','PERCEPTORES',6),
(7, 'modelo 216','03','DEVENGADO',4),
(8, 'modelo 216','02','RETENCION',3),
(9, 'modelo 216','01','PERCEPTORES',6),
(10, 'modelo 216 especie','03','DEVENGADO',4),
(11, 'modelo 216 especie','02','RETENCION',3),
(12, 'modelo 216 especie','01','PERCEPTORES',6);

INSERT INTO empresas_catalog (id, empresa, nif) VALUES (1,'0002','A91379875'),
(2,'0003','A41015322'),
(3,'0004','B91708263'),
(4,'0005','A41057480'),
(5,'0007','B41462375'),
(6,'0010','B91105007'),
(7,'0011','A91648410'),
(8,'0016','EUR'),
(9,'0018','B91800011'),
(10,'0020','B91791699'),
(11,'0026','G91809228'),
(12,'0027','A91834036'),
(13,'0032','B41378696'),
(14,'0035','B91853010'),
(15,'0039','B91914028'),
(16,'0040','A65514606'),
(17,'0045','A41132036'),
(18,'0047','B86308202'),
(19,'0049','B86396330'),
(20,'0051','B90030438'),
(21,'0055','B86533247'),
(22,'0069','A90191248'),
(23,'0073','A90199316'),
(24,'0080','A90292806'),
(25,'h002','B91259655'),
(26,'U012','U91644971'),
(27,'U018','U91698787'),
(28,'U021','U91713743'),
(29,'U023','U41564451'),
(30,'U034','U91226241'),
(31,'U045','U91461038'),
(32,'U052','U91751461'),
(33,'U054','U91775080'),
(34,'U058','U91805887'),
(35,'U062','U91828103'),
(36,'U065','U85771541'),
(37,'U066','U65174310'),
(38,'U067',''),
(39,'U069','U91848820'),
(40,'U074','U91869586'),
(41,'U086','U91892695'),
(42,'U087','U91904276'),
(43,'U089',''),
(44,'U090',''),
(45,'U091','U91934810'),
(46,'U093','U91947184'),
(47,'U095',''),
(48,'U099','U91969816'),
(49,'U102','U65761991'),
(50,'U104','U65776163'),
(51,'U147','U90091273'),
(52,'U150','U90122342'),
(53,'U151','U90145319'),
(54,'U152','U90147380'),
(55,'U153','U99420606'),
(56,'U159','U90193962'),
(57,'U160','U90195421'),
(58,'U161','U90212762'),
(59,'U162','U90216953'),
(60,'U163','U66633462'),
(61,'U165','U65396749'),
(62,'U168','U93479707'),
(63,'U169','U90282450'),
(64,'U170','U87631677'),
(65,'U171','U57996712'),
(66,'U172','U90307943'),
(67,'U173','U16509168'),
(68,'U174','U87573614'),
(69,'U178','U90330374'),
(70,'U179','U90337494'),
(71,'U184','U87890489'),
(72,'U185','U67078253'),
(73,'U191','U90360348'),
(74,'U192','U90395286'),
(75,'U194','U90397092'),
(76,'U195','U90412016'),
(77,'U198','U88324744'),
(78,'U199','U90430968'),
(79,'U200','U90425216'),
(80,'U201','U88384607'),
(81,'U202','U90438755'),
(82,'U204','U90441734'),
(83,'U205','U16641748'),
(84,'U206','U88465828'),
(85,'U207',''),
(86,'U208',''),
(87,'U209','U01731355'),
(88,'U210','U01792035'),
(89,'U211',''),
(90,'U213','U01889591'),
(91,'U214','U02716843'),
(92,'U215','U90491366'),
(93,'U218','U02741064'),
(94,'U221','U42789586'),
(95,'U219','U02836583'),
(96,'U217','U42746842'),
(97,'U220','U02983344');
