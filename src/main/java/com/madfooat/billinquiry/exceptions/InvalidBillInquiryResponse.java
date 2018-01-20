package com.madfooat.billinquiry.exceptions;

import java.util.Date;

public class InvalidBillInquiryResponse extends RuntimeException {
	
	
	
    public InvalidBillInquiryResponse(String erorr) {
		
		super(erorr);
		} 
    
    public InvalidBillInquiryResponse(String errorBillID,Date erorrduedate) {
		
		super("Invalid Date :"+erorrduedate+ " With billID ="+errorBillID+ ",date Should not be future date ");
		} 
    
    
    public InvalidBillInquiryResponse( String errorTag,String errorBillID) {
		
		
		super("Erorr InvalidBillInquiryResponse because "+errorTag+" With billID="+errorBillID);
		}
}

