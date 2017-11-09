package pdfMarger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
//import org.apache.pdfbox.util.PDFMergerUtility;

public class Pdf
{
    public static void main(String args[]) throws IOException
    {
    	
    	PDFMergerUtility ut = new PDFMergerUtility();
    	try {
						/*ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//claim_ppum_september_07_09_2017.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//05-09-2017_RM193.pdf");
*/
			//ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//07-09-2017_Bill_RM1543.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//07-09-2017_RM 159.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//Birth_Certificate_Saeeda_Rahmah.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//PPUM MaternityCard.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//PPUM Discharge Summary.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//Referel_Letter_By_Prof_ Valli.pdf");
			ut.setDestinationFileName("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//claim_total_bill_ppum_september_07_09_2017_159.pdf");
			

			/*//05-09-2017
			//ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//05-09-2017_RM193.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//5-09-2017_RM140.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//PPUM MaternityCard.pdf");
			//ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//PPUM Discharge Summary.pdf");
			ut.addSource("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//Referel_Letter_By_Prof_ Valli.pdf");

			
	    	//ut.setDestinationFileName("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//claim_total_bill_ppum_september_05_09_2017_RM193.pdf");
			ut.setDestinationFileName("C://Users//sadakatul.bari//Desktop//Insurance Claim MyCare//Supporting Doc//September//claim_total_bill_ppum_september_05_09_2017_RM140.pdf");
	    	*/
			ut.mergeDocuments();
	    	System.out.println("PDF Merged Successfully");
	  
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
        }

    

}
