// Copyright (c) 2017 9/8 Tetsuya Hori
// Released under the MIT license
// https://opensource.org/licenses/mit-license.php

package progressBar;

import progressBar.ProgressBar;

public class SimpleProgressBar extends ProgressBar{
	
	protected SimpleProgressBar(long total) {
		super(total);
	}
	
	@Override
	protected void print() {
		final double per = (double)this.cur / this.total * 100;	// %
		final int barNum = (int)(this.cur * 20 / this.total);	// 0-21 bars
		
		// printing
		System.out.print("|");
		
		for(int i = 0; i < barNum; i++) {
			System.out.print("*");
		}
		
		for(int i = barNum; i < 20; i++) {
			System.out.print("-");
		}
		
		System.out.print(String.format("| %5.1f%%", per));
		
	}
	
}
