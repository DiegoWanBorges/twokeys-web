INSERT INTO TB_COMPANY(ADDRESS,CITY,DISTRICT,ENABLE,NAME,NUMBER) VALUES('RUA ELIZ REGINA','RIO DAS OSTRAS','JARDIM CAMPOMAR',true,'Twokeys LTDA','102');
INSERT INTO TB_COMPANY(ADDRESS,CITY,DISTRICT,ENABLE,NAME,NUMBER) VALUES('RUA DA LARANJA','NOVA FRIBURGO','SAO GERALDO',true,'FRIBURDOCE LTDA','102');

INSERT INTO tb_user (name,email,password,company_id) VALUES ('Diego Wandrofski Borges','diego@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',1);
INSERT INTO tb_user (name,email,password,company_id) VALUES ('Maciel','maciel@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG',1);

INSERT INTO tb_role (authority) VALUES ('ROLE_MASTER');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);