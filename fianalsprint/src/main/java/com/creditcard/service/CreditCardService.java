package com.creditcard.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.creditcard.entities.CreditCard;
import com.creditcard.entities.CustomerCreditCard;
import com.creditcard.entities.User;


public interface CreditCardService {
	

	List<CreditCard> getCreditCardList();

//	ResponseEntity<CreditCard> addCreditCard(CreditCard creditcard);
	
	public CreditCard addCreditCard (CreditCard  creditcard );

//	CreditCard getCreditCardByName(String cardName);

	CreditCard getCreditCardById(Integer creditcardId);

	
	
	
	
	
	CreditCard getCreditCardByType(String cardType);



	void deletecreditcard(Integer cardId);

}









//****************************************************
//import java.util.List;
//import java.util.function.IntPredicate;
//
//import org.springframework.http.ResponseEntity;
//
//import com.creditcard.entities.CreditCard;
//import com.creditcard.entities.CustomerCreditCard;
//
//
//public interface CreditCardService {
//	
//
//	List<CreditCard> getCreditCardList();
//
//	ResponseEntity<CreditCard> addCreditCard(CreditCard creditcard);
//	
//	
//
//	CreditCard getCreditCardByName(String cardName);
//
//	CreditCard getCreditCardById(Integer creditcardId);
//
//	
//
//
//
//
//}
