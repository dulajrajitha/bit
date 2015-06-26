/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.config;

import TIMS.app.auth.controller.action.AddUserAction;
import TIMS.app.auth.controller.action.LogOutAction;
import TIMS.app.auth.controller.action.ViewUserAction;
import TIMS.customer.controller.action.ViewCustomerAction;
import TIMS.app.core.controller.action.BaseActionInterface;
import TIMS.brand.controller.action.AddBrandAction;
import TIMS.brand.controller.action.ViewBrandAction;
import TIMS.customer.controller.action.AddCustomerAction;
import TIMS.invoice.controller.action.AddInvoiceAction;
import TIMS.invoice.controller.action.ViewInvoiceAction;
import TIMS.sales.controller.action.AddSalesAction;
import TIMS.sales.controller.action.ViewSalesAction;
import TIMS.purches.controller.action.ViewPurchesAction;
import TIMS.product.controller.action.AddProductAction;
import TIMS.product.controller.action.AddProductToBrandAction;
import TIMS.product.controller.action.ViewProductAction;
import TIMS.supplier.controller.action.AddSupplierAction;
import TIMS.supplier.controller.action.ViewSupplierAction;
import TIMS.salesreturn.controller.action.AddSalesReturnAction;
import TIMS.salesreturn.controller.action.ViewSalesReturnAction;
import TIMS.stockreturn.controller.action.ViewStockReturnAction;

import java.util.HashMap;

/**
 *
 * @author Sithara Gunawardana
 */
public class Routes {
    private static Routes routes;
    private HashMap<String, BaseActionInterface> routing = new HashMap<String, BaseActionInterface>();
    

    
    private Routes() {
        this.setDefaultRoutes();
    }
    
    public static Routes getRoutes(){
        if(Routes.routes == null){
            Routes.routes = new Routes();
        }
        return Routes.routes;
    }
    
    public Routes addRoute(String name, BaseActionInterface action){
        this.routing.put(name, action);
        return Routes.getRoutes();
    }
    public BaseActionInterface getRouteAction(String name){
        return this.routing.get(name);
    }

    private void setDefaultRoutes() {
        try{
            this.routing.put("viewCustomer", new ViewCustomerAction());
            this.routing.put("viewUsers", new ViewUserAction());
            this.routing.put("AddUser", new AddUserAction());
            this.routing.put("addSupplier",new AddSupplierAction());
            this.routing.put("addInvoice",new AddInvoiceAction());
            this.routing.put("viewInvoice",new ViewInvoiceAction());
            this.routing.put("addProduct",new AddProductAction());
            this.routing.put("viewProduct",new ViewProductAction());
            this.routing.put("addProductToBrand",new AddProductToBrandAction());
            this.routing.put("addCustomer",new AddCustomerAction());
            this.routing.put("viewSupplier",new ViewSupplierAction());
            this.routing.put("addBrand",new AddBrandAction());
            this.routing.put("viewBrand",new ViewBrandAction());
            this.routing.put("logOut",new LogOutAction());
            this.routing.put("viewSales",new ViewSalesAction());
            this.routing.put("viewPurcheses",new ViewPurchesAction());
            this.routing.put("viewSalesReturns",new ViewSalesReturnAction());
            this.routing.put("viewStockReturns",new ViewStockReturnAction());
            
        }catch(Exception ex){
            System.out.print("Errors------>"+ex);
        }
        
        
    }
    
}
