	public static boolean isScrambleDP(String s1, String s2) {
		int len = s1.length();
		if(len != s2.length()){
			return false;
		}
		if(len == 0){
			return true;
		}
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		// canTransform 第一维为子串的长度delta，第二维为s1的起始索引，第三维为s2的起始索引
		// canTransform[k][i][j]表示s1[i...i+k]是否可以由s2[j...j+k]变化得来。
		boolean[][][] canT = new boolean[len][len][len];	
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){	// 如果字符串总长度为1，则取决于唯一的字符是否想到
				canT[0][i][j] = c1[i] == c2[j];
			}
		}
		
		for(int k=2; k<=len; k++){		// 子串的长度
			for(int i=len-k; i>=0; i--){			// s1[i...i+k]
				for(int j=len-k; j>=0; j--){	// s2[j...j+k]
					boolean canTransform = false;
					for(int m=1; m<k; m++){	// 尝试以m为长度分割子串
						// canT[k][i][j]
						canTransform = (canT[m-1][i][j] && canT[k-m-1][i+m][j+m]) ||	// 前前后后匹配
											  (canT[m-1][i][j+k-m] && canT[k-m-1][i+m][j]);	// 前后后前匹配
						if(canTransform){
							break;
						}
					}
					canT[k-1][i][j] = canTransform;
				}
			}
		}
		
		return canT[len-1][0][0];
	}