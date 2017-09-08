// Copyright (c) 2017 9/8 Tetsuya Hori
// Released under the MIT license
// https://opensource.org/licenses/mit-license.php

package progressBar;

abstract class ProgressBar {
	
	protected long total = -1;
	protected long cur = -1;
	
	protected ProgressBar(long total) {
		
		if (total < 1) {
			throw new IllegalArgumentException("invalid total value in progressbar");
		}
		this.total = total;
		
	}
	
	abstract void print();	// printing progressBar here
	
	protected boolean click() {
		
		this.cur++;
		this.print();
		
		if (this.cur == this.total) {
			System.out.println("");	// progressBar finalizing
			return false;
		}
		
		System.out.print("\r");	// cursor back
		return true;
	}
}
