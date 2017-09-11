// Copyright (c) 2017 9/8 Tetsuya Hori
// Released under the MIT license
// https://opensource.org/licenses/mit-license.php

package progressBar;

public abstract class ProgressBar {
	
	protected long total = -1;
	protected long cur = -1;
	
	protected ProgressBar(long total) {
		
		if (total < 1) {
			throw new IllegalArgumentException("invalid total value in progressbar");
		}
		this.total = total;
		
	}
	
	abstract void print();	// printing progressBar here
	
	public boolean click() {
		
		this.cur++;
		this.print();
		
		if (this.cur == this.total) {
			System.out.println("");	// progressBar finalizing
			return false;
		}
		
		System.out.print("\r");	// cursor back
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = 13;
		result = result * 31 + (int) this.total;
		result = result * 31 + (int) this.cur;
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(o == null)
			return false;
		if(!(o instanceof ProgressBar))
			return false;
		
		ProgressBar pb = (ProgressBar) o;
		if(this.total == pb.total && this.cur == pb.cur)
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		return "cur:" + this.cur + " total:" + this.total;
	}
}
