package de.hska.iwi.avg.uebung.g14.ordersystem.service;

import java.util.UUID;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import de.iwi.hska.avg.uebung.g14.ordersystem.domain.Store;

@WebService
public class StoreService {
	
	
	
	@WebMethod(operationName="storeOrder")
	@WebResult(name="return")
	public String storeOrder(@WebParam(name="customerID") String customerID,@WebParam(name="productId") String productID,@WebParam(name="nrOfItmes") int nrOfItems,@WebParam(name="comment") String comment){
		
		UUID orderIDgenerated = UUID.randomUUID();
		Store store;
		if(orderIDgenerated==null || productID==null || productID.isEmpty() || customerID==null || customerID.isEmpty())
		{
			throw new StoreException();
		}
		else{
		store = new Store(orderIDgenerated, customerID, productID, nrOfItems, comment);
		}
		
		return store.toString();

	}
	
	@WebMethod(operationName="existsProduct")
	@WebResult(name="return")
	public boolean existsProduct(@WebParam(name="productId") String productID)
	{
		if(productID==null && productID.isEmpty())
		{
			return false;
		}
		else{
			return true;
		}
	
	}
	
}
