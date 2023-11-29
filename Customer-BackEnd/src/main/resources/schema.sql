
CREATE TABLE IF NOT EXISTS `tbl_customers` (
  `cust_id` int NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `email_office` varchar(50),
  `email_personal` varchar(50),
  `spouse_name` varchar(20),
  `father_name` varchar(20)
);

CREATE TABLE IF NOT EXISTS `tbl_products` (
  `prod_id` int NOT NULL,
  `book_title` varchar(50) NOT NULL,
  `book_price` double,
  `book_quantity` int
);

CREATE TABLE IF NOT EXISTS `tbl_orders` (
  `order_id` int NOT NULL,
  `prod_id` int NOT NULL,
  `cust_id` int NOT NULL
);