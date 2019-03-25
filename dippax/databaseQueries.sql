CREATE TABLE category (

id IDENTITY,
name VARCHAR(50),
description VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,

CONSTRAINT pk_category_id PRIMARY KEY (id)

);


CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
    email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);	


--adding into category--
INSERT INTO category (name, description,image_url,is_active) VALUES ('BOYS WEARS', 'CHECK OUT THE LATEST FASHION HERE BOYIES!', 'CAT_1.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('GIRLS WEARS', 'CHECK OUT THE LATEST FASHION HERE GIRLIES!', 'CAT_2.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('SHOES', 'CHECK OUT THE LATEST FASHION HERE !', 'CAT_3.png', true);
INSERT INTO category (name, description,image_url,is_active) VALUES ('ACCESSORIES', 'CHECK OUT THE LATEST FASHION HERE !', 'CAT_4.png', true);


--adding into user details--
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Sujith', 'Shivan', 'ADMIN', true, '12345', 'sujithshivanoffi@gmail.com', '8888888888');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Srinivasan ', 'Sriram', 'USER', true, '12345', 'ss@gmail.com', '9999999999');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Anitha', 'S', 'SUPPLIER', true, '12345', 'as@gmail.com', '7777777777');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Shruthi', 'Guru', 'USER', true, '12345', 'shruthiguru12@gmail.com', '7777777777');


--adding into products--
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABC123DEFX', 'Jeans', 'Denim', 'Fashionable And Comfy!', 2000, 5, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDDEF123DEFX', 'Casual Shirts', 'Roadster', 'Casuality and Style!', 1500, 9, true, 1, 3, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDPQR123WGTX', 'Hoodies', 'Rowdy Club', 'Invoke the Rowdy in you!', 2000, 5, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDMNO123PQRX', ' Formals', 'H&M', 'Get the Gentlemen look!', 4000, 3, true, 1, 2, 0, 0 );
INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id, purchases, views)
VALUES ('PRDABCXYZDEFX', 'T-shirts', 'Gucci', 'Make a Style statement as you walk by!', 3000, 5, true, 1, 3, 0, 0 );

