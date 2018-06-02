INSERT INTO kategorija(nazivKategorija) VALUES ('Programiranje');
INSERT INTO kategorija(nazivKategorija) VALUES ('Računalne mreže');
INSERT INTO kategorija(nazivKategorija) VALUES ('Matematika');
INSERT INTO kategorija(nazivKategorija) VALUES ('Operacijski sustavi');
INSERT INTO kategorija(nazivKategorija) VALUES ('Projektno programiranje');

INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Tko je izmislio C++?",1);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koji tip podatka se koristi za cijele brojeve?",1);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Za što koristimo for petlju?",1);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koju naredbu koristimo za ispis u C jeziku?",1);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koju naredbu koristimo za dobivanje duljine stringa?",1);

INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koju vrstu mreže mora imati korisnik imati da bi obavio online shopping?",2);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koliko slojeva ima OSI model?",2);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koliko slojeva ima TCP/IP model?",2);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Na kojem se sloju događa segmentacija podataka?",2);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Što označava skraćenica WLAN?",2);

INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Kako se zove broj djeljiv samo sa 1 i samim sobom?",3);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Što je 'Ludolfov broj'?",3);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Prosjek prvih 50 brojeva je?",3);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Kolika je nula u googolu?",3);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Kako bi Rimskim brojevima zapisali broj 1344?",3);

INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Tko je izmislio Windows operativni sustav?",4);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Tko je izmislio Mac OS?",4);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Što je 'cmd'?",4);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Kada je početak UNIX vremena?",4);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koji Windows operativni sustav je slijedio nakon Windows XP?",4);

INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koji od ovih je generički SDLC model?",5);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Koje dvije kategorije zahtjeva postoje?",5);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Što predstavlja S u MOSCOW metodi za određivanje prioriteta zahtjeva?",5);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Što označava skraćenica SRS?",5);
INSERT INTO pitanja(tekstPitanja,idKategorija) VALUES ("Sustavi za kontrolu verzija programskog koda mogu se podijeliti na?",5);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES ("Bill Gates",0,1);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Jobs",0,1);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Wozniak",0,1);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Bjarne Stroustrup",1,1);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Linus Torvalds",0,1);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("String",0,3);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Double",0,3);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Float",0,3);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Integer",1,3);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Long",0,3);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Za ponavljanje radnji",0,4);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Za naredbe grananja",0,4);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Za ispis podataka",0,4);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Za pregled varijabli",1,4);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Za unos podataka",0,4);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Scanf",0,5);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("If",0,5);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("System.Out.Println",0,5);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Printf",1,5);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Ispiši",0,5);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("String",0,6);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Malloc",0,6);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("String_Length",0,6);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Len",1,6);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Replace",0,6);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Intranet",0,7);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Arpanet",0,7);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Router",0,7);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Internet",1,7);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("LAN",0,7);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("3",0,8);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("4",0,8);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("5",0,8);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("6",0,8);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("7",1,8);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("1",0,9);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("2",0,9);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("3",0,9);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("4",1,9);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("5",0,9);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Aplikacijskom",0,10);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Mrežnom",0,10);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Podatkovnom",0,10);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Transportnom",1,10);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Fizičkom",0,10);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Wide Local Area Network",0,11);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Wireless Land Area Network",0,11);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Wide Land Area Network",0,11);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Wireless Local Area Network",1,11);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Wireless Local Address Network",0,11);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Cijeli broj",0,12);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Prirodan broj",0,12);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Ludolfov broj",0,12);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Prost broj",1,12);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Razlomak",0,12);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Broj djeljiv sa samim sobom",0,13);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Jako velik broj",0,13);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Zajednički djelitelj",0,13);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Broj PI",1,13);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Zajednički faktor",0,13);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("30",0,14);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("20",0,14);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("25",0,14);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("25.5",1,14);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("50",0,14);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("50",0,15);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("60",0,15);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("90",0,15);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("100",1,15);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("70",0,15);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("MCCXLV",0,16);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("MLLXV",0,16);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("MCCCXLIIV",0,16);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("MCCCXLIV",1,16);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("MCXIIV",0,16);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Jobs",0,17);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Wozniak",0,17);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Linus Torvalds",0,17);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Bill Gates",1,17);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Bjarne Stroustrup",0,17);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Bill Gates",0,18);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Wozniak",0,18);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Linus Torvalds",0,18);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Steve Jobs",1,18);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Bjarne Stroustrup",0,18);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Computer Melody",0,19);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Command line",0,19);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Operativni sustav",0,19);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Command prompt",1,19);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Skraćenica za Control Panel",0,19);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("1.1.1900.",0,20);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("31.12.1899.",0,20);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("1.1.2000.",0,20);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("1.1.1970.",1,20);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("1.1.1950.",0,20);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Windows 7",0,21);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Windows 2000",0,21);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Windows 8",0,21);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Windows Vista",1,21);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Windows NT",0,21);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Agilni razvoj",0,22);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Specifikacija programske podrške",0,22);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Ekstremno programiranje",0,22);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Model vodopada",1,22);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Dekrementalni model",0,22);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Moji i klijentski",0,23);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Klijentski i poslovni",0,23);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Ne postoje 2 vrste",0,23);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Poslovni i korisnički",1,23);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Inženjerski i poslovni",0,23);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Said",0,24);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Solved",0,24);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Solvable",0,24);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Should",1,24);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Shouldn't",0,24);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Serious proposal",0,25);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Supplementary Retirement Scheme",0,25);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Solvable requirements",0,25);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Software requirements specification",1,25);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Something for sale",0,25);

INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Centralizirane i necentralizirane",0,26);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Prave i lažne",0,26);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Javne i privatne",0,26);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Centralizirane i distribuirane",1,26);
INSERT INTO odgovori(tekstOdgovor,is_Tocan,idPitanja) VALUES("Distribuirane i necentralizirane",0,26);