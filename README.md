##ProgressBar

An progressbar printing class for CUI.

Common codes are in abstract class "ProgressBar".  
Codes concerned with appearance are written in subclass.

Usage:

	ProgressBar pb = new SimpleProgressBar(10);
	// give maximum value
	
	pb.click();
	// first time, it must be like this.
	// |-------------------|   0.0%
	
	pb.click();
	// |**-----------------|  10.0%
	
	while(pb.click());
	// click() returns boolean (false at 100%, else true)