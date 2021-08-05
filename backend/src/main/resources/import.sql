INSERT INTO TB_COMPANY(ADDRESS,CITY,DISTRICT,ENABLE,NAME,NUMBER) VALUES('RUA ELIZ REGINA','RIO DAS OSTRAS','JARDIM CAMPOMAR',true,'Twokeys LTDA','102');
INSERT INTO TB_COMPANY(ADDRESS,CITY,DISTRICT,ENABLE,NAME,NUMBER) VALUES('RUA DA LARANJA','NOVA FRIBURGO','SAO GERALDO',true,'FRIBURDOCE LTDA','102');

INSERT INTO tb_user (name,email,password,company_id) VALUES ('Diego Wandrofski Borges','diego@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',1);
INSERT INTO tb_user (name,email,password,company_id) VALUES ('Maciel','maciel@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',2);

insert into tb_menu(name)values('COMPRAS');
insert into tb_menu(name)values('VENDAS');

INSERT INTO tb_routine (name,authority,menu_id) VALUES ('Cadastro de Produto','ROLE_CADPRODUTO',1);
INSERT INTO tb_routine (name,authority,menu_id) VALUES ('Cadastro de Cliente','ROLE_CADCLIENTE',2);

INSERT INTO tb_routine_access (user_id, routine_id) VALUES (1, 1);
INSERT INTO tb_routine_access (user_id, routine_id) VALUES (1, 2);
INSERT INTO tb_routine_access (user_id, routine_id) VALUES (2, 2);