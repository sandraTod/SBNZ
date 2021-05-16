insert into user(id, username, password, name, lastname, role) value (1, "admin", "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi", "admin", "admin", "ADMIN")
insert into user(id, username, password, name, lastname, role) value (2, "pera", "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi", "pera", "peric", "KORISNIK")
insert into user(id, username, password, name, lastname, role) value (3, "mika", "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi", "mika", "mikic", "KORISNIK")
insert into user(id, username, password, name, lastname, role) value (4, "zika", "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi", "zika", "zikic", "ADMIN")


insert into meat(id,name,meat_type) value (1,"belo meso","CHICKEN")
insert into meat(id,name,meat_type) value (2,"batak","CHICKEN")
insert into meat(id,name,meat_type) value (3,"svinjska snicla","PORK")
insert into meat(id,name,meat_type) value (4,"krmenadla","PORK")

insert into sauce(id,name) value (1,"bbq sos")
insert into sauce(id,name) value (2,"tomato sos")
insert into sauce(id,name) value (3,"beli sos")

insert into ingredient(id,name) value(1,"origano")
insert into ingredient(id,name) value(2,"kari")
insert into ingredient(id,name) value(3,"beli luk")
insert into ingredient(id,name) value(4,"bosiljak")

insert into wine(id,name,year,color,wine_sugar) value (1,"sardone",1998,"BELO","SUVO")
insert into wine(id,name,year,color,wine_sugar) value (2,"Merlot",2000,"CRVENO","SUVO")
insert into wine(id,name,year,color,wine_sugar) value (3,"suvignon blanc",2002,"BELO","SLATKO")
insert into wine(id,name,year,color,wine_sugar) value (4,"Cabarnet",2002,"CRVENO","SLATKO")

insert into sauce_ingredient_list(sauce_id,ingredient_list_id) value (1,1)
insert into sauce_ingredient_list(sauce_id,ingredient_list_id) value (1,2)
insert into sauce_ingredient_list(sauce_id,ingredient_list_id) value (2,2)
insert into sauce_ingredient_list(sauce_id,ingredient_list_id) value (2,3)
insert into sauce_ingredient_list(sauce_id,ingredient_list_id) value (3,1)

insert into wine_meat_List(wine_id,meat_list_id) value(1,1)
insert into wine_meat_List(wine_id,meat_list_id) value(1,2)
insert into wine_meat_List(wine_id,meat_list_id) value(2,2)
insert into wine_meat_List(wine_id,meat_list_id) value(2,3)
insert into wine_meat_List(wine_id,meat_list_id) value(3,3)
insert into wine_meat_List(wine_id,meat_list_id) value(3,2)
insert into wine_meat_List(wine_id,meat_list_id) value(3,4)
insert into wine_meat_List(wine_id,meat_list_id) value(4,1)
insert into wine_meat_List(wine_id,meat_list_id) value(4,2)
insert into wine_meat_List(wine_id,meat_list_id) value(4,4)

insert into wine_sauce_list(wine_id,sauce_list_id) value(1,1)
insert into wine_sauce_list(wine_id,sauce_list_id) value(1,3)
insert into wine_sauce_list(wine_id,sauce_list_id) value(2,2)
insert into wine_sauce_list(wine_id,sauce_list_id) value(2,1)
insert into wine_sauce_list(wine_id,sauce_list_id) value(3,1)
insert into wine_sauce_list(wine_id,sauce_list_id) value(3,3)
insert into wine_sauce_list(wine_id,sauce_list_id) value(4,3)

insert into wine_ingredients(wine_id,ingredients_id) value (1,2)
insert into wine_ingredients(wine_id,ingredients_id) value (1,3)
insert into wine_ingredients(wine_id,ingredients_id) value (2,2)
insert into wine_ingredients(wine_id,ingredients_id) value (2,4)
insert into wine_ingredients(wine_id,ingredients_id) value (3,3)
insert into wine_ingredients(wine_id,ingredients_id) value (3,4)
insert into wine_ingredients(wine_id,ingredients_id) value (4,4)



