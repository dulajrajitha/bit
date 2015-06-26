SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `bit_project`
--

--
-- Dumping data for table `tims_menu`
--

INSERT INTO `tims_menu` (`id`, `name`, `description`) VALUES
(1, 'Main Menu', 'This is the main menu componet for this whole project');

--
-- Dumping data for table `tims_screen`
--

INSERT INTO `tims_screen` (`id`, `name`, `description`, `class`, `url`) VALUES
(1, 'View Customer', 'This will show all customer details.\r\n', 'viewCustomer', 'viewCustomer'),
(2, 'User', 'This page is showing the details about users', 'viewUsers', 'viewUsers'),
(3, 'Add Supplier', 'This will use to add suppliers.', 'addSupplier', 'addSupplier'),
(4, 'Add User', 'Add new User', 'AddUser', 'AddUser'),
(5, 'Add Invoice', 'used to add new invoice', 'addInvoice', 'addInvoice'),
(6, 'View Invoice', 'view all invoice', 'viewInvoice', 'viewInvoice'),
(7, 'Add Product', 'add new product to the system', 'addProduct', 'addProduct'),
(8, 'View Product', 'view products in the system.', 'viewProduct', 'viewProduct'),
(9, 'Add Product to Brand', 'Add Product to Brand', 'addProductToBrand', 'addProductToBrand'),
(10, 'Add Customer', 'Add Customer', 'addCustomer', 'addCustomer'),
(11, 'View Supplier', 'View Supplier', 'viewSupplier', 'viewSupplier'),
(12, 'Add Brand', 'Add Brand', 'addBrand', 'addBrand'),
(13, 'View Brand', 'View Brand', 'viewBrand', 'viewBrand'),
(14, 'Log out', 'Log out', 'logOut', 'logOut'),
(15, 'Sales', 'View all sales', 'viewSales', 'viewSales'),
(16, 'Percheses', 'View all percheses', 'viewPurcheses', 'viewPurcheses'),
(17, 'Sale Returns', 'View all sale returns', 'viewSalesReturns', 'viewSalesReturns'),
(18, 'Stock Returns', 'View all strock returns', 'viewStockReturns', 'viewStockReturns');

--
-- Dumping data for table `tims_menu_item`
--

INSERT INTO `tims_menu_item` (`id`, `name`, `description`, `screen_id`, `parent_id`, `possition`) VALUES
(2, 'Customer', 'View Customer Details', NULL, NULL, 3),
(3, 'Supplier', 'View Supplier Details ', NULL, NULL, 4),
(4, 'Add Supplier', 'Add new Suppliers to System', 3, 3, 1),
(5, 'Add Customer', 'Add new Customer to System', 10, 2, 1),
(6, 'Customer Details', 'View Customers Details', 1, 2, 2),
(7, 'Supplier Details', 'View Supplier Details', 11, 3, 2),
(8, 'Products', 'Show Products related Details', NULL, NULL, 2),
(9, 'Add Product', 'Add new Product to System', 7, 8, 1),
(10, 'Brands', 'View Brand related Details', NULL, NULL, 5),
(11, 'Add Brand', 'Add new Brand to System', 12, 10, 1),
(12, 'Invoice', 'Show Invoice related Details', NULL, NULL, 1),
(13, 'New Invoice', 'Creat new Invoice', 5, 12, 1),
(15, 'Admin', 'This menu is onlu for admin user purpose.', NULL, NULL, 0),
(16, 'User', 'Show user details', 2, 15, 2),
(18, 'Log out', 'logout from the system', 14, NULL, 10),
(19, 'Add User', 'Add new User', 4, 15, 1),
(20, 'All Invoices', 'View All invoices', 6, 12, 2),
(22, 'View Product', 'view all products', 8, 8, 2),
(23, 'Add Product Brand', 'Add Product Brand', 9, 8, 3),
(24, 'Brands', 'View brands', 13, 10, 2),
(25, 'Sales', 'View all sales', 15, 12, 3),
(26, 'Percheses', 'View all percheses', 16, 12, 4),
(27, 'Sale Returns', 'View all sale returns', 17, 12, 5),
(28, 'Stock Returns', 'View all strock returns', 18, 12, 6);

--
-- Dumping data for table `tims_menu_menu_item`
--

INSERT INTO `tims_menu_menu_item` (`menu_id`, `munu_item_id`) VALUES
(1, 2),
(1, 3),
(1, 8),
(1, 10),
(1, 12),
(1, 15),
(1, 18);
