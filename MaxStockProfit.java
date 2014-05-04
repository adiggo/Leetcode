//basic idea is to track minimum value index. Update minimum value index when a new minimum met

int maxProfit(int[] prices){

	if (prices== null || prices.length == 0){
		return 0;
	}
	int min = Integer.MAX_VALUE;
	
	int diff = 0;
	for (int i = 0; i<prices.length; i++){
		if (prices[i] < min)
			min = prices[i];  //update min each time
		if (diff< prices[i]-min)
			diff = pirces[i]-min;
	}
	return diff;
}
