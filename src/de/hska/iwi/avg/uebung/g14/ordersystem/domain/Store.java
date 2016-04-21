package de.hska.iwi.avg.uebung.g14.ordersystem.domain;

import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Store {
	
	public UUID _orderID;
	
	public String _customerID;
	
	public String _productID;
	
	public int _nrOfItems;
	
	public String _comment;

	public Store(UUID orderID, String customerID, String productID, int nrOfItems, String comment) {
		super();
		_orderID=orderID;
		_customerID=customerID;
		_productID=productID;
		_nrOfItems=nrOfItems;
		_comment=comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_comment == null) ? 0 : _comment.hashCode());
		result = prime * result + ((_customerID == null) ? 0 : _customerID.hashCode());
		result = prime * result + _nrOfItems;
		result = prime * result + ((_productID == null) ? 0 : _productID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (_comment == null) {
			if (other._comment != null)
				return false;
		} else if (!_comment.equals(other._comment))
			return false;
		if (_customerID == null) {
			if (other._customerID != null)
				return false;
		} else if (!_customerID.equals(other._customerID))
			return false;
		if (_nrOfItems != other._nrOfItems)
			return false;
		if (_productID == null) {
			if (other._productID != null)
				return false;
		} else if (!_productID.equals(other._productID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Store [_orderID=" + _orderID + ", _customerID=" + _customerID + ", _productID=" + _productID
				+ ", _nrOfItems=" + _nrOfItems + ", _comment=" + _comment + "]";
	}

}
