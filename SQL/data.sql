INSERT INTO dbo.roles (id,roleName) VALUES (1,N'USER')
INSERT INTO dbo.roles (id,roleName) VALUES (2,N'ADMIN')
INSERT INTO dbo.roles (id,roleName) VALUES (3,N'SYSTEM')
GO
INSERT INTO dbo.users (displayName,username,email,phone,password,active)
VALUES(N'Hồ Quốc Thông','hoquocthong','hoquocthong456@gmail.com',  '0784360899','123', 1)
INSERT INTO dbo.users (displayName,username,email,phone,password,active)
VALUES(N'Hồ Quốc Thông','admin','admin@gmail.com',  '0784360899','123', 2)
GO
INSERT INTO dbo.user_role (id_user,id_role) VALUES (1,1)
INSERT INTO dbo.user_role (id_user,id_role) VALUES (2,2)
GO
--Category
INSERT INTO dbo.categories (name) VALUES (N'Vang Ý')
INSERT INTO dbo.categories (name) VALUES (N'Vang Pháp')
INSERT INTO dbo.categories (name) VALUES (N'Vang Chile')
INSERT INTO dbo.categories (name) VALUES (N'Vang Tây Ban Nha')
INSERT INTO dbo.categories (name) VALUES (N'Vang Mỹ')
INSERT INTO dbo.categories (name) VALUES (N'Rượu Wishky')
--Status Product
INSERT INTO dbo.status_product (name) VALUES (N'Còn hàng')
INSERT INTO dbo.status_product (name) VALUES (N'Hết hàng')
INSERT INTO dbo.status_product (name) VALUES (N'Ngưng sản xuất')

--Supplier
INSERT INTO dbo.supplier (name,address) VALUES (N'Showroom 1',N'B2-08A KĐT Vinhomes Gardenia, Đường Hàm Nghi, P. Cầu Diễn, Nam Từ Liêm, Hà Nội')
INSERT INTO dbo.supplier (name,address) VALUES (N'Showroom 2',N'183 Trung Kính, Yên Hòa, Cầu Giấy, Hà Nội')
INSERT INTO dbo.supplier (name,address) VALUES (N'Showroom 3',N'97, Man Thiện, Hiệp Phú, Quận 9, Thành phố Hồ Chí Minhs')

INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY001',N'Bollato Negroamaro Primitivo IGP Puglia 2014',200, 3500000, 12.5,N'Bollato là sự kết hợp tuyệt vời giữa 2 giống nho chủ đạo của Vùng Puglia đó là Negroamaro và Primitivo',N'Guarini Italia',GETDATE(), 1,1,1, 'https://product.hstatic.net/1000302745/product/1.6__1__971ef87d1b1f4e989f65859903921ac2_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY002',N'100 ESSENZA Primitivo Di Manduria 2012',200, 1500000, 15,N'100 ESSENZA được làm từ gống nho Primitivo đến từ vùng Manduria - miền nam nước Ý.',N'Italia',GETDATE(), 2,1,1, 'https://product.hstatic.net/1000302745/product/1.7__1__d69fb41e420d408faa680bab4de5db0c_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY003',N'125 MALVASIA Del Salento',200, 2500000, 12.5,N'125 Malvasia del Salento ngòn ngọt, nhẹ nhàng, mát lạnh và vô cùng dễ chịu. Thích hợp với các bữa tiệc hải sản.',N'Feudi Salentini S.R.L Italy',GETDATE(), 3,1,1, 'https://product.hstatic.net/1000302745/product/1.8__1__f295ec09255f4c298d3c03da2e683457_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY004',N'125 NEGROAMARO Del Salento',200, 3700000, 12.5,N'125 Negroamaro del Salento là rượu vang đỏ với điểm nhấn màu tím Ruby. Rượu có hương vị hấp dẫn của cà phê hoang dã, vị mận, hoa quả và vani ..',N'Feudi Salentini S.R.L',GETDATE(), 2,1,1, 'https://product.hstatic.net/1000302745/product/1.9__1__275d0224ea7c4ef181ab4a91ab5eeaaa_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY005',N'125 PRIMITIVO Del Salento',200, 1600000, 15,N'125 Primitivo Del Salento có màu đỏ ruby với hương vị mạnh mẽ, hơi cay của lá thuốc lá, mận chín, anh đào, sự mượt mà của vani và ca cao. Đặc biệt rượu giàu tannins.',N'Guarini Italia',GETDATE(), 1,1,1, 'https://product.hstatic.net/1000302745/product/1.9__1__275d0224ea7c4ef181ab4a91ab5eeaaa_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY006',N'A50 Amarone Della Valpolicella 2010',200, 4500000, 13,N'Tuyệt phẩm rượu vang A50 được tạo ra để vinh danh “vua” của vùng trồng nho Verona – Andrea Tinazzi. Chỉ có 3000 chai loại này trên toàn thế giới với bọc nút chai bằng vàng 24k, nhãn bằng len dệt và chữ kí tay của Andrea Tinazzi',N'Tinazzi Italia',GETDATE(), 1,1,1, 'https://product.hstatic.net/1000302745/product/1.10__1__f070948d84974995926fe087f67170a2_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY007',N'Amarone La Bastia 2010 Della Valpolicella DOP Cà De’ Rocchi',200, 2500000, 15,N'Là loại rượu vang hảo hạng được làm từ 3 loai nho đến từ 3 nơi khác nhau: Nero d’Avola-Sicily, Primitivo-Apulia Corvina, Veronese-Veneto của nước Ý. Rượu có màu đỏ sậm, có hương vị pha trộn của cà phê, gỗ sồi và trái cây đầu mùa, vị ngọt của sô cô la, thuốc lá, cherry đen, sô cô la, các loại gia vị ngọt ngào.',N'Tinazzi Italia',GETDATE(), 2,1,1, 'https://product.hstatic.net/1000302745/product/1.11__1__4ed1e42e7f5541d4bd234c8e83b35bf8_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VY008',N'Amatè Rosso Negroamaro Primitivo I.G.T',200, 1500000, 13,N'Amatè Rosso Negroamaro Primitivo I.G.T có hương vị của Quế, Tiêu đen, hoa Đinh Hương…',N'Tinazzi Italia',GETDATE(), 1,1,1, 'https://product.hstatic.net/1000302745/product/1.12__1__0c94fd0b1ddb4e89a9ded1c089139430_large.png')

--VANG PHÁP
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VP001',N'Château Mouton Rothschild Pauillac 2014',200, 22500000, 13,N'Château Mouton Rothschild Pauillac is the most rated wine in the Gran cru classe 1855 category',N'Château Mouton Rothschild - France',GETDATE(), 1,2,1, 'https://product.hstatic.net/1000302745/product/66666_7a031d0b95654f27a165428139489e1a_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VP002',N'Chateau Tour Chapoux Limited Edition Bordeaux 2016',200, 1500000, 13,N'CHATEAU TOUR CHAPOUX LIMITED EDITION BORDEAUX 2016 được làm từ 2 giống nho: Merlot, Cabernet sauvignon có nguồn gốc từ Bordeaux Pháp',N'Tinazzi Italia',GETDATE(), 1,2,1, 'https://product.hstatic.net/1000302745/product/ttttttttttttttttttttttt_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VP003',N'Chateau Les Reuilles Reserve Bordeaux 2016',200, 4500000, 13,N'CHATEAU LES REUILLES RESERVE BORDEAUX 2016 được làm từ 3 giống nho: Merlot, Cabernet sauvignon và Malbec có nguồn gốc từ Bordeaux Pháp',N'Patrick Todesco',GETDATE(), 3,2,1, 'https://product.hstatic.net/1000302745/product/gggggggggggggggggggggggggggg_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VP004',N'Chateau Talaise Bordeaux 2016',200, 4200000, 13,N'CHATEAU TALAISE BORDEAUX 2016 được làm từ 3 giống nho: Merlot, Cabernet sauvignon và Malbec có nguồn gốc từ Bordeaux Pháp',N'Gregory Dalla Longa',GETDATE(), 1,2,1, 'https://product.hstatic.net/1000302745/product/tttttttttttttttttttttt_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VP005',N'Palaise Cabernet Sauvignon 2016',200, 4500000, 13,N'Palaise Cabernet Sauvignon 2016 được làm từ giống nho Cabernet Sauvignon có nguồn gốc từ Bordeau - Pháp',N'Gironde, Pháp',GETDATE(), 1,2,1, 'https://product.hstatic.net/1000302745/product/dddd_large.png')

--VANG CHILE
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC001',N'Cantoalba Carmenere 2015',200, 2750000, 13,N'Rượu vang Cantoalba Carmenere 2015 được chế biến từ giống nho Carmenere. Đây là một giống nho rất thơm ngon được trồng ở nhiều vùng trên thế giới. Chai rượu này tương đối êm dịu, dễ uống. Nó có vị ngọt vừa phải tạo cho người uống cảm giác vừa mới mẻ vừa ấm áp.',N'Vina La Ronciere - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/c55555_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC002',N'Cantoalba Chardonnay 2017',200, 1500000, 15,N'Cantoalba Chardonay có màu vàng rơm, rượu có vị chua vừa phải, hương thơm trái cây nhiệt đới nồng nàn mãnh liệt như chanh dây và mãng cầu tây, nổi bật nhất là mùi hương khoáng chất mang đến cho người thưởng thức một sự tươi mát',N'LA RONCIERE - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/vang-chile-cantoalba-chardonnay_a0eccb8f30f04af6b299854c02d261dc_large.jpg')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC003',N'Chaku Cabernet Sauvignon 2016',200, 200000, 13,N'Chaku Cabernet Sauvignon 2016 được sản xuất từ giống nho Cabernet Sauvignon. Rượu có màu đỏ đậm của Cherry đen, Lý đen, Dâu đen chín mọng hòa quyện cùng hương Tiêu đen, Xì gà và thoảng hương của vanilla hoa violet. Ngoài ra do được ủ trong thùng gỗ sồi nên Chaku Cabernet Sauvignon vô cùng quyến rũ với mùi gỗ tuyết tùng và có sự cân bằng giữa vị chát và vị ngọt trong vòm miệng.',N'Vina La Ronciere - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/s23_24534e46d99c496c8c74c68643ab9651_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC004',N'Indomita Cabernet Sauvignon 2017',200, 5500000, 13,N'Indomita Cabernet Sauvignon được làm từ  giống nho nổi tiếng Cabernet  Sauvignon đến từ thung lũng Maipo - Chi Lê.',N'Indomita - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/i22212_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC005',N'Indomita Chardonnay 2017',200, 1250000, 13,N'Indomita Chardona được làm từ giống nho chardonnay có nguồn gốc từ vùng Burgundy - Pháp',N'Indomita - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/c1111111111111111_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC006',N'Indomita Gran Reserva Cabernet Sauvignon 2016',200, 4500000, 13,N'Indomita  Gran reserva Cabernet Sauvignon được làm từ  giống nho nổi tiếng Cabernet  Sauvignon đến từ thung lũng Maipo - Chi Lê. ',N'Indomita - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/i55555_large.png')
INSERT INTO dbo.products
(code,name,quantity,price,alcohol,description,madein,update_at,id_supplier,id_category,id_status,url_img)
VALUES ('VC007',N'Indomita Premium Duette',200, 4500000, 13,N'Indomita  Premium Duette được làm từ  giống nho nổi tiếng Cabernet  Sauvignon và Carmenere đến từ thung lũng Maipo - Chi Lê. ',N'Indomita - Chile',GETDATE(), 1,3,1, 'https://product.hstatic.net/1000302745/product/d444_large.png')

GO 
INSERT dbo.bill_status (name) VALUES (N'Đã thanh toán')
INSERT dbo.bill_status (name) VALUES (N'Chờ thanh toán')
INSERT dbo.bill_status (name) VALUES (N'Hủy đơn hàng')
GO
INSERT INTO dbo.about (description,img) VALUES (N'Vin Wine mong muốn trở thành nhà nhập khẩu và phân phối hàng đầu các sản phẩm Rượu Vang và đồ uống có cồn khác. Đồng thời phát triển dịch nhà hàng Vin Wine nhằm không gian thưởng thức và trải nghiệm văn hoá rượu vang tại Việt Nam. Định hướng phát triển của công ty là phát triển chuỗi bán lẻ hàng đầu mang thương hiệu Vin Wine rộng khắp nhiều tỉnh thành trên cả nước, là nhà phân phối uy tín, đáng tin cậy nhiều đối tác và các đơn vị bán buôn, bán lẻ khác.',N'https://theme.hstatic.net/1000302745/1000390994/14/slideshow_2.jpg?v=2333' )
INSERT INTO dbo.about (description,img) VALUES (N'Vin Wine mong muốn trở thành nhà nhập khẩu và phân phối hàng đầu các sản phẩm Rượu Vang và đồ uống có cồn khác. Đồng thời phát triển dịch nhà hàng Vin Wine nhằm không gian thưởng thức và trải nghiệm văn hoá rượu vang tại Việt Nam. Định hướng phát triển của công ty là phát triển chuỗi bán lẻ hàng đầu mang thương hiệu Vin Wine rộng khắp nhiều tỉnh thành trên cả nước, là nhà phân phối uy tín, đáng tin cậy nhiều đối tác và các đơn vị bán buôn, bán lẻ khác.',N'https://theme.hstatic.net/1000302745/1000390994/14/slideshow_3.jpg?v=2333' )