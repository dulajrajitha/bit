--
-- Database: `bit_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `tims_barnd`
--

CREATE TABLE IF NOT EXISTS `tims_barnd` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` text,
  `other` text,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_customer`
--

CREATE TABLE IF NOT EXISTS `tims_customer` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `other_name` varchar(255) DEFAULT NULL,
  `pobox` varchar(64) DEFAULT NULL,
  `street` varchar(128) DEFAULT NULL,
  `city` varchar(128) DEFAULT NULL,
  `type` enum('WHOLESALE','RETAIL') DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  `mobile_no` int(11) DEFAULT NULL,
  `fax` int(11) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_data_group`
--

CREATE TABLE IF NOT EXISTS `tims_data_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `read` tinyint(4) DEFAULT NULL,
  `create` tinyint(4) DEFAULT NULL,
  `update` tinyint(4) DEFAULT NULL,
  `delete` tinyint(4) DEFAULT NULL,
  `self` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_data_group_screen`
--

CREATE TABLE IF NOT EXISTS `tims_data_group_screen` (
  `screen_id` int(11) NOT NULL,
  `data_group_id` int(11) NOT NULL,
  PRIMARY KEY (`screen_id`,`data_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_employee`
--

CREATE TABLE IF NOT EXISTS `tims_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(64) DEFAULT NULL,
  `first_name` varchar(128) DEFAULT NULL,
  `last_name` varchar(128) DEFAULT NULL,
  `other_name` varchar(255) DEFAULT NULL,
  `pobox` varchar(64) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `mobile` varchar(64) DEFAULT NULL,
  `telephone` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_good_recieve_note`
--

CREATE TABLE IF NOT EXISTS `tims_good_recieve_note` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `invoice_no` int(11) DEFAULT NULL,
  `other` text,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_invoice`
--

CREATE TABLE IF NOT EXISTS `tims_invoice` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `type` varchar(64) DEFAULT NULL,
  `vehical_no` varchar(64) DEFAULT NULL,
  `ref_invoice` int(11) DEFAULT NULL,
  `other` varchar(255) DEFAULT NULL,
  `sale_type` varchar(255) DEFAULT NULL,
  `customer_code` int(11) DEFAULT NULL,
  `supplier_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_menu`
--

CREATE TABLE IF NOT EXISTS `tims_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_menu_item`
--

CREATE TABLE IF NOT EXISTS `tims_menu_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `screen_id` int(11) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `possition` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_menu_menu_item`
--

CREATE TABLE IF NOT EXISTS `tims_menu_menu_item` (
  `menu_id` int(11) NOT NULL,
  `munu_item_id` int(11) NOT NULL,
  PRIMARY KEY (`menu_id`,`munu_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_payment`
--

CREATE TABLE IF NOT EXISTS `tims_payment` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `payment_method_code` int(11) DEFAULT NULL,
  `invoice_no` int(11) DEFAULT NULL,
  `amount` decimal(10,0) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_payment_method`
--

CREATE TABLE IF NOT EXISTS `tims_payment_method` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `description` text,
  `definition` text,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_product`
--

CREATE TABLE IF NOT EXISTS `tims_product` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `size` varchar(255) DEFAULT NULL,
  `description` text,
  `product_type_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`),
  KEY `product_ibfk_1` (`product_type_code`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;
-- --------------------------------------------------------

--
-- Table structure for table `tims_product_brand`
--

CREATE TABLE IF NOT EXISTS `tims_product_brand` (
  `product_code` int(11) NOT NULL,
  `brand_code` int(11) NOT NULL,
  `purchase_price` decimal(10,2) DEFAULT NULL,
  `selling_price` decimal(10,2) NOT NULL,
  PRIMARY KEY (`product_code`,`brand_code`),
  KEY `product_brand_ibfk_2` (`brand_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_product_group`
--

CREATE TABLE IF NOT EXISTS `tims_product_group` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_product_product_group`
--

CREATE TABLE IF NOT EXISTS `tims_product_product_group` (
  `product_code` int(11) NOT NULL,
  `product_group_code` int(11) NOT NULL,
  PRIMARY KEY (`product_code`,`product_group_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_product_type`
--

CREATE TABLE IF NOT EXISTS `tims_product_type` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_purches`
--

CREATE TABLE IF NOT EXISTS `tims_purches` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `rate` int(11) DEFAULT NULL,
  `discount` decimal(10,0) DEFAULT NULL,
  `tax` decimal(10,0) DEFAULT NULL,
  `status` varchar(128) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `invoice_no` int(11) DEFAULT NULL,
  `product_code` int(11) DEFAULT NULL,
  `barnd_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_recieved_good`
--

CREATE TABLE IF NOT EXISTS `tims_recieved_good` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `purches_code` int(11) DEFAULT NULL,
  `grn_no` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `note` text,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_sale`
--

CREATE TABLE IF NOT EXISTS `tims_sale` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `rate` float DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `invoice_no` int(11) DEFAULT NULL,
  `product_code` int(11) DEFAULT NULL,
  `discount` decimal(10,0) DEFAULT NULL,
  `barnd_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_sale_return`
--

CREATE TABLE IF NOT EXISTS `tims_sale_return` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `reason` text,
  `qty` int(11) DEFAULT NULL,
  `rate` decimal(10,0) DEFAULT NULL,
  `other` text,
  `invoice_no` int(11) DEFAULT NULL,
  `product_code` int(11) DEFAULT NULL,
  `ref_invoice_no` int(11) DEFAULT NULL,
  `barnd_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_screen`
--

CREATE TABLE IF NOT EXISTS `tims_screen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `class` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_stock_return`
--

CREATE TABLE IF NOT EXISTS `tims_stock_return` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `reason` text,
  `qty` int(11) DEFAULT NULL,
  `rate` decimal(10,0) DEFAULT NULL,
  `other` text,
  `invoice_no` int(11) DEFAULT NULL,
  `ref_invoice_no` int(11) DEFAULT NULL,
  `product_code` int(11) DEFAULT NULL,
  `barnd_code` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_supplier`
--

CREATE TABLE IF NOT EXISTS `tims_supplier` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `other_name` varchar(255) DEFAULT NULL,
  `pobox` varchar(45) DEFAULT NULL,
  `street` varchar(128) DEFAULT NULL,
  `city` varchar(128) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL,
  `mobile_no` int(11) DEFAULT NULL,
  `fax` int(11) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_user`
--

CREATE TABLE IF NOT EXISTS `tims_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_user_role`
--

CREATE TABLE IF NOT EXISTS `tims_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` text,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tims_user_role_data_group`
--

CREATE TABLE IF NOT EXISTS `tims_user_role_data_group` (
  `user_role_id` int(11) NOT NULL,
  `data_group_id` int(11) NOT NULL,
  PRIMARY KEY (`user_role_id`,`data_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_user_role_screen`
--

CREATE TABLE IF NOT EXISTS `tims_user_role_screen` (
  `user_role_id` int(11) NOT NULL,
  `screen_id` int(11) NOT NULL,
  PRIMARY KEY (`user_role_id`,`screen_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tims_user_user_role`
--

CREATE TABLE IF NOT EXISTS `tims_user_user_role` (
  `user_id` int(11) NOT NULL,
  `user_role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tims_data_group_screen`
--
ALTER TABLE `tims_data_group_screen`
  ADD CONSTRAINT `tims_data_group_screen_ibfk_1` FOREIGN KEY (`screen_id`) REFERENCES `tims_screen` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tims_data_group_screen_ibfk_2` FOREIGN KEY (`data_group_id`) REFERENCES `tims_data_group` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tims_good_recieve_note`
--
ALTER TABLE `tims_good_recieve_note`
  ADD CONSTRAINT `good_recieve_note_ibfk_1` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`) ON DELETE CASCADE;

--
-- Constraints for table `tims_invoice`
--
ALTER TABLE `tims_invoice`
  ADD CONSTRAINT `tims_invoice_ibfk_1` FOREIGN KEY (`customer_code`) REFERENCES `tims_customer` (`code`),
  ADD CONSTRAINT `tims_invoice_ibfk_2` FOREIGN KEY (`supplier_code`) REFERENCES `tims_supplier` (`code`);

--
-- Constraints for table `tims_menu_item`
--
ALTER TABLE `tims_menu_item`
  ADD CONSTRAINT `tims_menu_item_ibfk_1` FOREIGN KEY (`screen_id`) REFERENCES `tims_screen` (`id`),
  ADD CONSTRAINT `tims_menu_item_ibfk_2` FOREIGN KEY (`parent_id`) REFERENCES `tims_menu_item` (`id`);

--
-- Constraints for table `tims_menu_menu_item`
--
ALTER TABLE `tims_menu_menu_item`
  ADD CONSTRAINT `tims_menu_menu_item_ibfk_1` FOREIGN KEY (`menu_id`) REFERENCES `tims_menu` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tims_menu_menu_item_ibfk_2` FOREIGN KEY (`munu_item_id`) REFERENCES `tims_menu_item` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tims_payment`
--
ALTER TABLE `tims_payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`payment_method_code`) REFERENCES `tims_payment_method` (`code`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`);

--
-- Constraints for table `tims_product`
--
ALTER TABLE `tims_product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`product_type_code`) REFERENCES `tims_product_type` (`code`);

--
-- Constraints for table `tims_product_brand`
--
ALTER TABLE `tims_product_brand`
  ADD CONSTRAINT `product_brand_ibfk_1` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `product_brand_ibfk_2` FOREIGN KEY (`brand_code`) REFERENCES `tims_barnd` (`code`);

--
-- Constraints for table `tims_product_product_group`
--
ALTER TABLE `tims_product_product_group`
  ADD CONSTRAINT `product_product_group_ibfk_1` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `product_product_group_ibfk_2` FOREIGN KEY (`product_group_code`) REFERENCES `tims_product_group` (`code`);

--
-- Constraints for table `tims_purches`
--
ALTER TABLE `tims_purches`
  ADD CONSTRAINT `purches_ibfk_1` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`) ON DELETE CASCADE,
  ADD CONSTRAINT `purches_ibfk_2` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `purches_ibfk_3` FOREIGN KEY (`barnd_code`) REFERENCES `tims_barnd` (`code`);

--
-- Constraints for table `tims_recieved_good`
--
ALTER TABLE `tims_recieved_good`
  ADD CONSTRAINT `recieved_good_ibfk_1` FOREIGN KEY (`purches_code`) REFERENCES `tims_purches` (`code`),
  ADD CONSTRAINT `recieved_good_ibfk_2` FOREIGN KEY (`grn_no`) REFERENCES `tims_good_recieve_note` (`no`) ON DELETE CASCADE;

--
-- Constraints for table `tims_sale`
--
ALTER TABLE `tims_sale`
  ADD CONSTRAINT `sale_ibfk_1` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`) ON DELETE CASCADE,
  ADD CONSTRAINT `sale_ibfk_2` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `sale_ibfk_3` FOREIGN KEY (`barnd_code`) REFERENCES `tims_barnd` (`code`);

--
-- Constraints for table `tims_sale_return`
--
ALTER TABLE `tims_sale_return`
  ADD CONSTRAINT `sale_return_ibfk_1` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`) ON DELETE CASCADE,
  ADD CONSTRAINT `sale_return_ibfk_2` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `sale_return_ibfk_3` FOREIGN KEY (`ref_invoice_no`) REFERENCES `tims_invoice` (`no`),
  ADD CONSTRAINT `sale_return_ibfk_4` FOREIGN KEY (`barnd_code`) REFERENCES `tims_barnd` (`code`);

--
-- Constraints for table `tims_stock_return`
--
ALTER TABLE `tims_stock_return`
  ADD CONSTRAINT `stock_return_ibfk_1` FOREIGN KEY (`invoice_no`) REFERENCES `tims_invoice` (`no`) ON DELETE CASCADE,
  ADD CONSTRAINT `stock_return_ibfk_2` FOREIGN KEY (`ref_invoice_no`) REFERENCES `tims_invoice` (`no`),
  ADD CONSTRAINT `stock_return_ibfk_3` FOREIGN KEY (`product_code`) REFERENCES `tims_product` (`code`),
  ADD CONSTRAINT `stock_return_ibfk_4` FOREIGN KEY (`barnd_code`) REFERENCES `tims_barnd` (`code`);

--
-- Constraints for table `tims_user`
--
ALTER TABLE `tims_user`
  ADD CONSTRAINT `tims_user_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `tims_employee` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tims_user_role_data_group`
--
ALTER TABLE `tims_user_role_data_group`
  ADD CONSTRAINT `tims_user_role_data_group_ibfk_1` FOREIGN KEY (`user_role_id`) REFERENCES `tims_user_role` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tims_user_role_data_group_ibfk_2` FOREIGN KEY (`data_group_id`) REFERENCES `tims_data_group` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tims_user_role_screen`
--
ALTER TABLE `tims_user_role_screen`
  ADD CONSTRAINT `tims_user_role_screen_ibfk_1` FOREIGN KEY (`user_role_id`) REFERENCES `tims_user_role` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tims_user_role_screen_ibfk_2` FOREIGN KEY (`screen_id`) REFERENCES `tims_screen` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tims_user_user_role`
--
ALTER TABLE `tims_user_user_role`
  ADD CONSTRAINT `tims_user_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tims_user` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tims_user_user_role_ibfk_2` FOREIGN KEY (`user_role_id`) REFERENCES `tims_user_role` (`id`) ON DELETE CASCADE;

