// Copyright (c) 2017 9/8 Tetsuya Hori
// Released under the MIT license
// https://opensource.org/licenses/mit-license.php

package progressBar;

public class Main {

	public static void main(String[] args) {
		
		ProgressBar pb = new SimpleProgressBar(100);
		
		pb.click();
		
		while(pb.click());
	}

}
